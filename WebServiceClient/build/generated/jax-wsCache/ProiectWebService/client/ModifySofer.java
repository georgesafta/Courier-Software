
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifySofer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifySofer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numenou" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenumenou" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "modifySofer", propOrder = {
    "nume",
    "prenume",
    "stare",
    "numenou",
    "prenumenou",
    "starenoua"
})
public class ModifySofer {

    protected String nume;
    protected String prenume;
    protected String stare;
    protected String numenou;
    protected String prenumenou;
    protected String starenoua;

    /**
     * Gets the value of the nume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNume() {
        return nume;
    }

    /**
     * Sets the value of the nume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNume(String value) {
        this.nume = value;
    }

    /**
     * Gets the value of the prenume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenume() {
        return prenume;
    }

    /**
     * Sets the value of the prenume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenume(String value) {
        this.prenume = value;
    }

    /**
     * Gets the value of the stare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStare() {
        return stare;
    }

    /**
     * Sets the value of the stare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStare(String value) {
        this.stare = value;
    }

    /**
     * Gets the value of the numenou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumenou() {
        return numenou;
    }

    /**
     * Sets the value of the numenou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumenou(String value) {
        this.numenou = value;
    }

    /**
     * Gets the value of the prenumenou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenumenou() {
        return prenumenou;
    }

    /**
     * Sets the value of the prenumenou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenumenou(String value) {
        this.prenumenou = value;
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
