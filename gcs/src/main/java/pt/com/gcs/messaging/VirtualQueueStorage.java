package pt.com.gcs.messaging;

import com.sleepycat.bind.tuple.StringBinding;
import com.sleepycat.je.*;
import org.caudexorigo.ErrorAnalyser;
import org.caudexorigo.Shutdown;
import org.caudexorigo.cryto.MD5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pt.com.broker.types.CriticalErrors;

import java.util.ArrayList;

/**
 * VirtualQueueStorage stores virtual queue messages persistently.
 * 
 * 
 */

public class VirtualQueueStorage
{
	private static Logger log = LoggerFactory.getLogger(BDBStorage.class);

	private static final VirtualQueueStorage instance = new VirtualQueueStorage();

	private Environment env;

	private Database vqStorage;

	private String dbName;

	private VirtualQueueStorage()
	{
		try
		{
			env = BDBEnviroment.get();
			dbName = MD5.getHashString("VirtualQueueStorage");

			DatabaseConfig dbConfig = new DatabaseConfig();
			dbConfig.setTransactional(true);
			dbConfig.setAllowCreate(true);
			dbConfig.setSortedDuplicates(false);
			vqStorage = env.openDatabase(null, dbName, dbConfig);

			log.info("VirtualQueueStorage is ready.");
		}
		catch (Throwable t)
		{
			Throwable rt = ErrorAnalyser.findRootCause(t);
			log.error(rt.getMessage(), rt);
			Shutdown.now();
		}
	}

	private void i_saveVirtualQueue(String queueName)
	{
		try
		{
			DatabaseEntry key = new DatabaseEntry();
			DatabaseEntry data = new DatabaseEntry();

			StringBinding.stringToEntry(queueName, key);
			StringBinding.stringToEntry(queueName, data);

			Transaction txn = env.beginTransaction(null, null);
			vqStorage.put(txn, key, data);
			txn.commitSync();
		}
		catch (Throwable t)
		{
			Throwable rt = ErrorAnalyser.findRootCause(t);
			CriticalErrors.exitIfCritical(rt);
			log.error(rt.getMessage(), rt);
		}
	}

	private void i_deleteVirtualQueue(String queueName)
	{
		try
		{
			DatabaseEntry key = new DatabaseEntry();

			StringBinding.stringToEntry(queueName, key);

			Transaction txn = env.beginTransaction(null, null);
			vqStorage.delete(txn, key);
			txn.commitSync();
		}
		catch (Throwable t)
		{
			Throwable rt = ErrorAnalyser.findRootCause(t);
			CriticalErrors.exitIfCritical(rt);
			log.error(rt.getMessage(), rt);
		}
	}

	protected synchronized static void saveVirtualQueue(String queueName)
	{
		instance.i_saveVirtualQueue(queueName);
	}

	protected static void deleteVirtualQueue(String queueName)
	{
		instance.i_deleteVirtualQueue(queueName);
	}

	protected String[] i_getVirtualQueueNames()
	{
		Cursor cursor = null;
		try
		{
			ArrayList<String> lst = new ArrayList<String>();

			cursor = vqStorage.openCursor(null, null);

			DatabaseEntry key = new DatabaseEntry();
			DatabaseEntry data = new DatabaseEntry();

			while (cursor.getNext(key, data, null) == OperationStatus.SUCCESS)
			{

				String qname = StringBinding.entryToString(data);
				lst.add(qname);
			}

			return lst.toArray(new String[lst.size()]);
		}
		catch (Throwable t)
		{
			Throwable rt = ErrorAnalyser.findRootCause(t);
			CriticalErrors.exitIfCritical(rt);
			log.error(rt.getMessage(), rt);
			return new String[0];
		}
		finally
		{
			if (cursor != null)
			{
				try
				{
					cursor.close();
				}
				catch (Throwable t)
				{
					Throwable rt = ErrorAnalyser.findRootCause(t);
					CriticalErrors.exitIfCritical(rt);
					log.error(rt.getMessage(), rt);
				}
			}
		}
	}

	protected static String[] getVirtualQueueNames()
	{
		return instance.i_getVirtualQueueNames();
	}
}
