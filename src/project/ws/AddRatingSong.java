
package project.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per addRatingSong complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="addRatingSong">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://ws.project/}user" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://ws.project/}song" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addRatingSong", propOrder = {
    "arg0",
    "arg1",
    "arg2"
})
public class AddRatingSong {

    protected User arg0;
    protected Song arg1;
    protected boolean arg2;

    /**
     * Recupera il valore della proprietà arg0.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della proprietà arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setArg0(User value) {
        this.arg0 = value;
    }

    /**
     * Recupera il valore della proprietà arg1.
     * 
     * @return
     *     possible object is
     *     {@link Song }
     *     
     */
    public Song getArg1() {
        return arg1;
    }

    /**
     * Imposta il valore della proprietà arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link Song }
     *     
     */
    public void setArg1(Song value) {
        this.arg1 = value;
    }

    /**
     * Recupera il valore della proprietà arg2.
     * 
     */
    public boolean isArg2() {
        return arg2;
    }

    /**
     * Imposta il valore della proprietà arg2.
     * 
     */
    public void setArg2(boolean value) {
        this.arg2 = value;
    }

}
