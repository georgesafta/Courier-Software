
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lista complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lista">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="judet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lista", propOrder = {
    "judet"
})
public class Lista {

    protected String judet;

    /**
     * Gets the value of the judet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJudet() {
        return judet;
    }

    /**
     * Sets the value of the judet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJudet(String value) {
        this.judet = value;
    }

}
