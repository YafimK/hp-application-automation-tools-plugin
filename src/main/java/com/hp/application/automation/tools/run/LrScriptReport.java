package com.hp.application.automation.tools.run;


import com.hp.application.automation.tools.results.parser.testngxml.TestngResults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Report")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ver",
        "tmZone",
        "General"
})
public class LrScriptReport {
    @XmlAttribute(name = "ver")
    protected String ver;
    @XmlAttribute(name = "tmZone")
    protected String tmZone;
    @XmlElement(name = "General")
    private c_General General;

    public c_General getcGeneral() {
        return this.General;
    }

    public void setcGeneral(c_General General) {
        this.General = General;
    }

    /**
     * Gets the value of the duration property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVer() {
        return ver;
    }

    /**
     * Sets the value of the duration property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVer(String ver) {
        this.ver = ver;
    }


    /**
     * Gets the value of the duration property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTmZone() {
        return tmZone;
    }

    /**
     * Sets the value of the duration property.
     *
     * @param tmZone allowed object is
     *              {@link String }
     */
    public void setTmZone(String tmZone) {
        this.tmZone = tmZone;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "productName",
            "productVer",
            "os",
            "host",
            "DocLocation",
            "Doc"
    })
    public static class c_General {

        @XmlAttribute(name = "productName")
        private String productName;
        @XmlAttribute(name = "productVer")
        private String productVer;
        @XmlAttribute(name = "host")
        private String host;
        @XmlAttribute(name = "os")
        private String os;
        @XmlElement(name = "DocLocation")
        private String DocLocation;
//        @XmlElement(name = "Doc")
//        private c_Doc Doc;
//
//        public c_Doc getDoc() {
//            return Doc;
//        }
//
//        public void setDoc(c_Doc doc) {
//            this.Doc = doc;
//        }

        public c_General() {
        }

        public String getProductVer() {
            return productVer;
        }

        public void setProductVer(String productVer) {
            this.productVer = productVer;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getOs() {
            return os;
        }

        public void setOs(String os) {
            this.os = os;
        }

        public String getDocLocation() {
            return DocLocation;
        }

        public void setDocLocation(String docLocation) {
            DocLocation = docLocation;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }



//        @XmlAccessorType(XmlAccessType.FIELD)
//        @XmlType(name = "", propOrder = {
//                "DName",
//                "Res",
//                "Action",
//                "NodeArgs",
//                "DocLocation",
//                "Doc"
//        })
//        public static class c_Doc{
//
//        }
    }

}



