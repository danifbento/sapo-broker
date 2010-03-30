package pt.com.gcs.messaging.serialization;

import java.io.ObjectInputStream;

import org.caudexorigo.io.UnsynchronizedByteArrayInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt.com.gcs.messaging.BDBMessage;
import pt.com.gcs.messaging.InternalMessage;

public class MessageMarshaller
{
	private static Logger log = LoggerFactory.getLogger(MessageMarshaller.class);

	public static BDBMessage unmarshallBDBMessage(byte[] data) throws Throwable
	{
		ObjectInputStream oIn;
		oIn = new ObjectInputStream(new UnsynchronizedByteArrayInputStream(data));

		short version = oIn.readShort();

		if (version == 2)
		{
			return new BDBMessageMarshallerV2().unmarshall(data);
		}
		else if (version == 1)
		{
			return new BDBMessageMarshallerV1().unmarshall(data);
		}
		else
		{
			throw new RuntimeException("Can't deserialize version: " + version);
		}

	}

	public static byte[] marshallBDBMessage(BDBMessage message) throws Throwable
	{
		return new BDBMessageMarshallerV2().marshall(message);
	}

	public static InternalMessage unmarshallInternalMessage(byte[] data) throws Throwable
	{
		return new InternalMessageMarshallerV1().unmarshall(data);
	}

//	public static byte[] marshallInternalMessage(InternalMessage internalMessage) throws Throwable
//	{
//		if (internalMessage.getVersion() == 1)
//		{
//			return new InternalMessageMarshallerV1().marshall(internalMessage);
//		}
//
//		return null;
//	}
//
//	public static void marshallInternalMessage(InternalMessage internalMessage, ObjectOutputStream objectOutupStream) throws Throwable
//	{
//		if (internalMessage.getVersion() == 1)
//		{
//			new InternalMessageMarshallerV1().marshall(internalMessage, objectOutupStream);
//		}
//	}

	public static InternalMessage unmarshallInternalMessage(ObjectInputStream inputStream, short versionHint) throws Throwable
	{
		if (versionHint == 1)
		{
			return new InternalMessageMarshallerV1().unmarshall(inputStream);
		}
		return null;
	}

	public static InternalMessage unmarshallInternalMessage(ObjectInputStream inputStream) throws Throwable
	{
		return new InternalMessageMarshallerV1().unmarshall(inputStream);
	}

}
