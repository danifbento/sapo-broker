//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.08.27 at 12:20:38 PM WEST 
//


package pt.com.broker.bayeuxbridge.configuration;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pt.com.broker.bayeuxbridge.configuration package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pt.com.broker.bayeuxbridge.configuration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Settings.Bridge }
     * 
     */
    public Settings.Bridge createSettingsBridge() {
        return new Settings.Bridge();
    }

    /**
     * Create an instance of {@link Mappings.MappingSet.Mapping }
     * 
     */
    public Mappings.MappingSet.Mapping createMappingsMappingSetMapping() {
        return new Mappings.MappingSet.Mapping();
    }

    /**
     * Create an instance of {@link Settings }
     * 
     */
    public Settings createSettings() {
        return new Settings();
    }

    /**
     * Create an instance of {@link BridgeConfiguration }
     * 
     */
    public BridgeConfiguration createBridgeConfiguration() {
        return new BridgeConfiguration();
    }

    /**
     * Create an instance of {@link Clouds.Cloud }
     * 
     */
    public Clouds.Cloud createCloudsCloud() {
        return new Clouds.Cloud();
    }

    /**
     * Create an instance of {@link Clouds }
     * 
     */
    public Clouds createClouds() {
        return new Clouds();
    }

    /**
     * Create an instance of {@link Mappings.MappingSet }
     * 
     */
    public Mappings.MappingSet createMappingsMappingSet() {
        return new Mappings.MappingSet();
    }

    /**
     * Create an instance of {@link Mappings }
     * 
     */
    public Mappings createMappings() {
        return new Mappings();
    }

    /**
     * Create an instance of {@link Clouds.Cloud.Agent }
     * 
     */
    public Clouds.Cloud.Agent createCloudsCloudAgent() {
        return new Clouds.Cloud.Agent();
    }

}
