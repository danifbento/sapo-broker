package pt.com.broker.codec.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Publish")
public class Publish
{
    @XmlAttribute(name = "action-id")
	public String actionId;

    @XmlElement(name = "BrokerMessage")
	public BrokerMessage brokerMessage;

	public Publish()
	{
		brokerMessage = new BrokerMessage();
	}
}
