
package recombee.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per addRating complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="addRating">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addRating", propOrder = {
    "user",
    "appId",
    "rating"
})
public class AddRating {

    protected String user;
    protected long appId;
    protected double rating;

    /**
     * Recupera il valore della proprietà user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Imposta il valore della proprietà user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Recupera il valore della proprietà appId.
     * 
     */
    public long getAppId() {
        return appId;
    }

    /**
     * Imposta il valore della proprietà appId.
     * 
     */
    public void setAppId(long value) {
        this.appId = value;
    }

    /**
     * Recupera il valore della proprietà rating.
     * 
     */
    public double getRating() {
        return rating;
    }

    /**
     * Imposta il valore della proprietà rating.
     * 
     */
    public void setRating(double value) {
        this.rating = value;
    }

}
