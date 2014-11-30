
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for traseu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="traseu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idcamion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "traseu", propOrder = {
    "idcamion",
    "judet"
})
public class Traseu {

    protected String idcamion;
    protected String judet;

    /**
     * Gets the value of the idcamion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcamion() {
        return idcamion;
    }

    /**
     * Sets the value of the idcamion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcamion(String value) {
        this.idcamion = value;
    }

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
