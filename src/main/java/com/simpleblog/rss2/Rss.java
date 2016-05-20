
package com.simpleblog.rss2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channel">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pubDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="lastBuildDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="docs" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   &lt;element name="generator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="managingEditor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="webMaster" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="pubDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                           &lt;/sequence>
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
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "channel"
})
@XmlRootElement(name = "rss")
public class Rss {

    @XmlElement(required = true)
    protected Rss.Channel channel;
    @XmlAttribute(name = "version")
    protected Float version;

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link Rss.Channel }
     *     
     */
    public Rss.Channel getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rss.Channel }
     *     
     */
    public void setChannel(Rss.Channel value) {
        this.channel = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVersion(Float value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pubDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="lastBuildDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="docs" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *         &lt;element name="generator" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="managingEditor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="webMaster" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="pubDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
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
    @XmlType(name = "", propOrder = {
        "title",
        "link",
        "description",
        "language",
        "pubDate",
        "lastBuildDate",
        "docs",
        "generator",
        "managingEditor",
        "webMaster",
        "item"
    })
    public static class Channel {

        @XmlElement(required = true)
        protected String title;
        @XmlElement(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String link;
        @XmlElement(required = true)
        protected String description;
        @XmlElement(required = true)
        protected String language;
        @XmlElement(required = true)
        protected String pubDate;
        @XmlElement(required = true)
        protected String lastBuildDate;
        @XmlElement(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String docs;
        @XmlElement(required = true)
        protected String generator;
        @XmlElement(required = true)
        protected String managingEditor;
        @XmlElement(required = true)
        protected String webMaster;
        protected List<Rss.Channel.Item> item;

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the link property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLink() {
            return link;
        }

        /**
         * Sets the value of the link property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLink(String value) {
            this.link = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Gets the value of the pubDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPubDate() {
            return pubDate;
        }

        /**
         * Sets the value of the pubDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPubDate(String value) {
            this.pubDate = value;
        }

        /**
         * Gets the value of the lastBuildDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastBuildDate() {
            return lastBuildDate;
        }

        /**
         * Sets the value of the lastBuildDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastBuildDate(String value) {
            this.lastBuildDate = value;
        }

        /**
         * Gets the value of the docs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocs() {
            return docs;
        }

        /**
         * Sets the value of the docs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocs(String value) {
            this.docs = value;
        }

        /**
         * Gets the value of the generator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGenerator() {
            return generator;
        }

        /**
         * Sets the value of the generator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGenerator(String value) {
            this.generator = value;
        }

        /**
         * Gets the value of the managingEditor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getManagingEditor() {
            return managingEditor;
        }

        /**
         * Sets the value of the managingEditor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setManagingEditor(String value) {
            this.managingEditor = value;
        }

        /**
         * Gets the value of the webMaster property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebMaster() {
            return webMaster;
        }

        /**
         * Sets the value of the webMaster property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebMaster(String value) {
            this.webMaster = value;
        }

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rss.Channel.Item }
         * 
         * 
         */
        public List<Rss.Channel.Item> getItem() {
            if (item == null) {
                item = new ArrayList<Rss.Channel.Item>();
            }
            return this.item;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="pubDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "title",
            "link",
            "description",
            "pubDate",
            "guid"
        })
        public static class Item {

            protected String title;
            @XmlSchemaType(name = "anyURI")
            protected String link;
            @XmlElement(required = true)
            protected String description;
            @XmlElement(required = true)
            protected String pubDate;
            @XmlElement(required = true)
            @XmlSchemaType(name = "anyURI")
            protected String guid;

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the link property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLink() {
                return link;
            }

            /**
             * Sets the value of the link property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLink(String value) {
                this.link = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the pubDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPubDate() {
                return pubDate;
            }

            /**
             * Sets the value of the pubDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPubDate(String value) {
                this.pubDate = value;
            }

            /**
             * Gets the value of the guid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuid() {
                return guid;
            }

            /**
             * Sets the value of the guid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuid(String value) {
                this.guid = value;
            }

        }

    }

}
