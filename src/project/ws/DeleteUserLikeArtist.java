
package project.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per deleteUserLikeArtist complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="deleteUserLikeArtist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://ws.project/}user" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://ws.project/}artist" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteUserLikeArtist", propOrder = {
    "arg0",
    "arg1"
})
public class DeleteUserLikeArtist {

    protected User arg0;
    protected Artist arg1;

    /**
     * Recupera il valore della proprieta arg0.
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
     * Imposta il valore della proprieta arg0.
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
     * Recupera il valore della proprieta arg1.
     * 
     * @return
     *     possible object is
     *     {@link Artist }
     *     
     */
    public Artist getArg1() {
        return arg1;
    }

    /**
     * Imposta il valore della proprieta arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link Artist }
     *     
     */
    public void setArg1(Artist value) {
        this.arg1 = value;
    }

}
