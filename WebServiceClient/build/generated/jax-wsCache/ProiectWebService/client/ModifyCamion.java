
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyCamion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyCamion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idnou" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volumnou" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="starenoua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyCamion", propOrder = {
    "id",
    "idnou",
    "volumnou",
    "starenoua"
})
public class ModifyCamion {

    protected String id;
    protected String idnou;
    protected Float volumnou;
    protected String starenoua;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idnou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdnou() {
        return idnou;
    }

    /**
     * Sets the value of the idnou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdnou(String value) {
        this.idnou = value;
    }

    /**
     * Gets the value of the volumnou property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVolumnou() {
        return volumnou;
    }

    /**
     * Sets the value of the volumnou property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVolumnou(Float value) {
        this.volumnou = value;
    }

    /**
     * Gets the value of the starenoua property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarenoua() {
        return starenoua;
    }

    /**
     * Sets the value of the starenoua property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarenoua(String value) {
        this.starenoua = value;
    }

}
