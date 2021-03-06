//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.04 at 02:15:11 PM WET 
//

package pt.com.broker.jsbridge.configuration;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settings">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bridge">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="root-dir" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="default-broker">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="host" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="channels">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="channel" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="topic" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="allow-subscription" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="allow-publication" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="broker-host" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="broker-port" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="downstream-filter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="upstream-filter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "settings", "channels" })
@XmlRootElement(name = "bridge-configuration")
public class BridgeConfiguration
{

	@XmlElement(required = true)
	protected BridgeConfiguration.Settings settings;
	@XmlElement(required = true)
	protected BridgeConfiguration.Channels channels;

	/**
	 * Gets the value of the settings property.
	 * 
	 * @return possible object is {@link BridgeConfiguration.Settings }
	 * 
	 */
	public BridgeConfiguration.Settings getSettings()
	{
		return settings;
	}

	/**
	 * Sets the value of the settings property.
	 * 
	 * @param value
	 *            allowed object is {@link BridgeConfiguration.Settings }
	 * 
	 */
	public void setSettings(BridgeConfiguration.Settings value)
	{
		this.settings = value;
	}

	/**
	 * Gets the value of the channels property.
	 * 
	 * @return possible object is {@link BridgeConfiguration.Channels }
	 * 
	 */
	public BridgeConfiguration.Channels getChannels()
	{
		return channels;
	}

	/**
	 * Sets the value of the channels property.
	 * 
	 * @param value
	 *            allowed object is {@link BridgeConfiguration.Channels }
	 * 
	 */
	public void setChannels(BridgeConfiguration.Channels value)
	{
		this.channels = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="channel" maxOccurs="unbounded">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                 &lt;attribute name="topic" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                 &lt;attribute name="allow-subscription" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
	 *                 &lt;attribute name="allow-publication" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
	 *                 &lt;attribute name="broker-host" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                 &lt;attribute name="broker-port" type="{http://www.w3.org/2001/XMLSchema}int" />
	 *                 &lt;attribute name="downstream-filter" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                 &lt;attribute name="upstream-filter" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "channel" })
	public static class Channels
	{

		@XmlElement(required = true)
		protected List<BridgeConfiguration.Channels.Channel> channel;

		/**
		 * Gets the value of the channel property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the channel property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getChannel().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link BridgeConfiguration.Channels.Channel }
		 * 
		 * 
		 */
		public List<BridgeConfiguration.Channels.Channel> getChannel()
		{
			if (channel == null)
			{
				channel = new ArrayList<BridgeConfiguration.Channels.Channel>();
			}
			return this.channel;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *       &lt;attribute name="topic" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *       &lt;attribute name="allow-subscription" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
		 *       &lt;attribute name="allow-publication" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
		 *       &lt;attribute name="broker-host" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *       &lt;attribute name="broker-port" type="{http://www.w3.org/2001/XMLSchema}int" />
		 *       &lt;attribute name="downstream-filter" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *       &lt;attribute name="upstream-filter" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		public static class Channel
		{

			@XmlAttribute(required = true)
			protected String name;
			@XmlAttribute(required = true)
			protected String topic;
			@XmlAttribute(name = "allow-subscription", required = true)
			protected boolean allowSubscription;
			@XmlAttribute(name = "allow-publication", required = true)
			protected boolean allowPublication;
			@XmlAttribute(name = "broker-host")
			protected String brokerHost;
			@XmlAttribute(name = "broker-port")
			protected Integer brokerPort;
			@XmlAttribute(name = "downstream-filter")
			protected String downstreamFilter;
			@XmlAttribute(name = "upstream-filter")
			protected String upstreamFilter;

			/**
			 * Gets the value of the name property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getName()
			{
				return name;
			}

			/**
			 * Sets the value of the name property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setName(String value)
			{
				this.name = value;
			}

			/**
			 * Gets the value of the topic property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getTopic()
			{
				return topic;
			}

			/**
			 * Sets the value of the topic property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setTopic(String value)
			{
				this.topic = value;
			}

			/**
			 * Gets the value of the allowSubscription property.
			 * 
			 */
			public boolean isAllowSubscription()
			{
				return allowSubscription;
			}

			/**
			 * Sets the value of the allowSubscription property.
			 * 
			 */
			public void setAllowSubscription(boolean value)
			{
				this.allowSubscription = value;
			}

			/**
			 * Gets the value of the allowPublication property.
			 * 
			 */
			public boolean isAllowPublication()
			{
				return allowPublication;
			}

			/**
			 * Sets the value of the allowPublication property.
			 * 
			 */
			public void setAllowPublication(boolean value)
			{
				this.allowPublication = value;
			}

			/**
			 * Gets the value of the brokerHost property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getBrokerHost()
			{
				return brokerHost;
			}

			/**
			 * Sets the value of the brokerHost property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setBrokerHost(String value)
			{
				this.brokerHost = value;
			}

			/**
			 * Gets the value of the brokerPort property.
			 * 
			 * @return possible object is {@link Integer }
			 * 
			 */
			public Integer getBrokerPort()
			{
				return brokerPort;
			}

			/**
			 * Sets the value of the brokerPort property.
			 * 
			 * @param value
			 *            allowed object is {@link Integer }
			 * 
			 */
			public void setBrokerPort(Integer value)
			{
				this.brokerPort = value;
			}

			/**
			 * Gets the value of the downstreamFilter property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDownstreamFilter()
			{
				return downstreamFilter;
			}

			/**
			 * Sets the value of the downstreamFilter property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDownstreamFilter(String value)
			{
				this.downstreamFilter = value;
			}

			/**
			 * Gets the value of the upstreamFilter property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getUpstreamFilter()
			{
				return upstreamFilter;
			}

			/**
			 * Sets the value of the upstreamFilter property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setUpstreamFilter(String value)
			{
				this.upstreamFilter = value;
			}

		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="bridge">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
	 *                 &lt;attribute name="root-dir" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="default-broker">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;attribute name="host" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                 &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "bridge", "defaultBroker" })
	public static class Settings
	{

		@XmlElement(required = true)
		protected BridgeConfiguration.Settings.Bridge bridge;
		@XmlElement(name = "default-broker", required = true)
		protected BridgeConfiguration.Settings.DefaultBroker defaultBroker;

		/**
		 * Gets the value of the bridge property.
		 * 
		 * @return possible object is {@link BridgeConfiguration.Settings.Bridge }
		 * 
		 */
		public BridgeConfiguration.Settings.Bridge getBridge()
		{
			return bridge;
		}

		/**
		 * Sets the value of the bridge property.
		 * 
		 * @param value
		 *            allowed object is {@link BridgeConfiguration.Settings.Bridge }
		 * 
		 */
		public void setBridge(BridgeConfiguration.Settings.Bridge value)
		{
			this.bridge = value;
		}

		/**
		 * Gets the value of the defaultBroker property.
		 * 
		 * @return possible object is {@link BridgeConfiguration.Settings.DefaultBroker }
		 * 
		 */
		public BridgeConfiguration.Settings.DefaultBroker getDefaultBroker()
		{
			return defaultBroker;
		}

		/**
		 * Sets the value of the defaultBroker property.
		 * 
		 * @param value
		 *            allowed object is {@link BridgeConfiguration.Settings.DefaultBroker }
		 * 
		 */
		public void setDefaultBroker(BridgeConfiguration.Settings.DefaultBroker value)
		{
			this.defaultBroker = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
		 *       &lt;attribute name="root-dir" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		public static class Bridge
		{

			@XmlAttribute(required = true)
			protected int port;
			@XmlAttribute(name = "root-dir", required = true)
			protected String rootDir;

			/**
			 * Gets the value of the port property.
			 * 
			 */
			public int getPort()
			{
				return port;
			}

			/**
			 * Sets the value of the port property.
			 * 
			 */
			public void setPort(int value)
			{
				this.port = value;
			}

			/**
			 * Gets the value of the rootDir property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getRootDir()
			{
				return rootDir;
			}

			/**
			 * Sets the value of the rootDir property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setRootDir(String value)
			{
				this.rootDir = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;attribute name="host" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *       &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		public static class DefaultBroker
		{

			@XmlAttribute(required = true)
			protected String host;
			@XmlAttribute(required = true)
			protected int port;

			/**
			 * Gets the value of the host property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHost()
			{
				return host;
			}

			/**
			 * Sets the value of the host property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHost(String value)
			{
				this.host = value;
			}

			/**
			 * Gets the value of the port property.
			 * 
			 */
			public int getPort()
			{
				return port;
			}

			/**
			 * Sets the value of the port property.
			 * 
			 */
			public void setPort(int value)
			{
				this.port = value;
			}

		}

	}

}
