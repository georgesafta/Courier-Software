
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for selectClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="selectClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectClient", propOrder = {
    "nume",
    "prenume"
})
public class SelectClient {

    protected String nume;
    protected String prenume;

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

}
