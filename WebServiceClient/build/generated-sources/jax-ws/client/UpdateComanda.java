
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateComanda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateComanda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionNumeClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionPrenumeClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionNumeDestinatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionPrenumeDestinatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenumeClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stradaClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numarClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blocClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scaraClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apartamentClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orasClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="judetClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeDestinatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenumeDestinatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stradaDestinatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numarDestinatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blocDestinatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scaraDestinatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apartamentDestinatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orasDestinatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="judetDestinatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="continut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prioritate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="volum" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="stare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateComanda", propOrder = {
    "sessionNumeClient",
    "sessionPrenumeClient",
    "sessionNumeDestinatar",
    "sessionPrenumeDestinatar",
    "sessionId",
    "numeClient",
    "prenumeClient",
    "stradaClient",
    "numarClient",
    "blocClient",
    "scaraClient",
    "apartamentClient",
    "orasClient",
    "judetClient",
    "email",
    "telefon",
    "numeDestinatar",
    "prenumeDestinatar",
    "stradaDestinatar",
    "numarDestinatar",
    "blocDestinatar",
    "scaraDestinatar",
    "apartamentDestinatar",
    "orasDestinatar",
    "judetDestinatar",
    "continut",
    "prioritate",
    "volum",
    "stare"
})
public class UpdateComanda {

    protected String sessionNumeClient;
    protected String sessionPrenumeClient;
    protected String sessionNumeDestinatar;
    protected String sessionPrenumeDestinatar;
    protected int sessionId;
    protected String numeClient;
    protected String prenumeClient;
    protected String stradaClient;
    protected String numarClient;
    protected String blocClient;
    protected String scaraClient;
    protected String apartamentClient;
    protected String orasClient;
    protected String judetClient;
    protected String email;
    protected String telefon;
    protected String numeDestinatar;
    protected String prenumeDestinatar;
    protected String stradaDestinatar;
    protected String numarDestinatar;
    protected String blocDestinatar;
    protected String scaraDestinatar;
    protected String apartamentDestinatar;
    protected String orasDestinatar;
    protected String judetDestinatar;
    protected String continut;
    protected int prioritate;
    protected float volum;
    protected String stare;

    /**
     * Gets the value of the sessionNumeClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionNumeClient() {
        return sessionNumeClient;
    }

    /**
     * Sets the value of the sessionNumeClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionNumeClient(String value) {
        this.sessionNumeClient = value;
    }

    /**
     * Gets the value of the sessionPrenumeClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionPrenumeClient() {
        return sessionPrenumeClient;
    }

    /**
     * Sets the value of the sessionPrenumeClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionPrenumeClient(String value) {
        this.sessionPrenumeClient = value;
    }

    /**
     * Gets the value of the sessionNumeDestinatar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionNumeDestinatar() {
        return sessionNumeDestinatar;
    }

    /**
     * Sets the value of the sessionNumeDestinatar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionNumeDestinatar(String value) {
        this.sessionNumeDestinatar = value;
    }

    /**
     * Gets the value of the sessionPrenumeDestinatar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionPrenumeDestinatar() {
        return sessionPrenumeDestinatar;
    }

    /**
     * Sets the value of the sessionPrenumeDestinatar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionPrenumeDestinatar(String value) {
        this.sessionPrenumeDestinatar = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     */
    public int getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     */
    public void setSessionId(int value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the numeClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeClient() {
        return numeClient;
    }

    /**
     * Sets the value of the numeClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeClient(String value) {
        this.numeClient = value;
    }

    /**
     * Gets the value of the prenumeClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenumeClient() {
        return prenumeClient;
    }

    /**
     * Sets the value of the prenumeClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenumeClient(String value) {
        this.prenumeClient = value;
    }

    /**
     * Gets the value of the stradaClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStradaClient() {
        return stradaClient;
    }

    /**
     * Sets the value of the stradaClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStradaClient(String value) {
        this.stradaClient = value;
    }

    /**
     * Gets the value of the numarClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumarClient() {
        return numarClient;
    }

    /**
     * Sets the value of the numarClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumarClient(String value) {
        this.numarClient = value;
    }

    /**
     * Gets the value of the blocClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlocClient() {
        return blocClient;
    }

    /**
     * Sets the value of the blocClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlocClient(String value) {
        this.blocClient = value;
    }

    /**
     * Gets the value of the scaraClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaraClient() {
        return scaraClient;
    }

    /**
     * Sets the value of the scaraClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaraClient(String value) {
        this.scaraClient = value;
    }

    /**
     * Gets the value of the apartamentClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartamentClient() {
        return apartamentClient;
    }

    /**
     * Sets the value of the apartamentClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartamentClient(String value) {
        this.apartamentClient = value;
    }

    /**
     * Gets the value of the orasClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrasClient() {
        return orasClient;
    }

    /**
     * Sets the value of the orasClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrasClient(String value) {
        this.orasClient = value;
    }

    /**
     * Gets the value of the judetClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJudetClient() {
        return judetClient;
    }

    /**
     * Sets the value of the judetClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJudetClient(String value) {
        this.judetClient = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the numeDestinatar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeDestinatar() {
        return numeDestinatar;
    }

    /**
     * Sets the value of the numeDestinatar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeDestinatar(String value) {
        this.numeDestinatar = value;
    }

    /**
     * Gets the value of the prenumeDestinatar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenumeDestinatar() {
        return prenumeDestinatar;
    }

    /**
     * Sets the value of the prenumeDestinatar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenumeDestinatar(String value) {
        this.prenumeDestinatar = value;
    }

    /**
     * Gets the value of the stradaDestinatar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStradaDestinatar() {
        return stradaDestinatar;
    }

    /**
     * Sets the value of the stradaDestinatar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStradaDestinatar(String value) {
        this.stradaDestinatar = value;
    }

    /**
     * Gets the value of the numarDestinatar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumarDestinatar() {
        return numarDestinatar;
    }

    /**
     * Sets the value of the numarDestinatar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumarDestinatar(String value) {
        this.numarDestinatar = value;
    }

    /**
     * Gets the value of the blocDestinatar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlocDestinatar() {
        return blocDestinatar;
    }

    /**
     * Sets the value of the blocDestinatar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlocDestinatar(String value) {
        this.blocDestinatar = value;
    }

    /**
     * Gets the value of the scaraDestinatar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaraDestinatar() {
        return scaraDestinatar;
    }

    /**
     * Sets the value of the scaraDestinatar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaraDestinatar(String value) {
        this.scaraDestinatar = value;
    }

    /**
     * Gets the value of the apartamentDestinatar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartamentDestinatar() {
        return apartamentDestinatar;
    }

    /**
     * Sets the value of the apartamentDestinatar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartamentDestinatar(String value) {
        this.apartamentDestinatar = value;
    }

    /**
     * Gets the value of the orasDestinatar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrasDestinatar() {
        return orasDestinatar;
    }

    /**
     * Sets the value of the orasDestinatar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrasDestinatar(String value) {
        this.orasDestinatar = value;
    }

    /**
     * Gets the value of the judetDestinatar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJudetDestinatar() {
        return judetDestinatar;
    }

    /**
     * Sets the value of the judetDestinatar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJudetDestinatar(String value) {
        this.judetDestinatar = value;
    }

    /**
     * Gets the value of the continut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinut() {
        return continut;
    }

    /**
     * Sets the value of the continut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinut(String value) {
        this.continut = value;
    }

    /**
     * Gets the value of the prioritate property.
     * 
     */
    public int getPrioritate() {
        return prioritate;
    }

    /**
     * Sets the value of the prioritate property.
     * 
     */
    public void setPrioritate(int value) {
        this.prioritate = value;
    }

    /**
     * Gets the value of the volum property.
     * 
     */
    public float getVolum() {
        return volum;
    }

    /**
     * Sets the value of the volum property.
     * 
     */
    public void setVolum(float value) {
        this.volum = value;
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

}
