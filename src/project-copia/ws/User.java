
package project.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per user complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chatId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_likes" type="{http://ws.project/}userLikes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "chatId",
    "id",
    "userLikes"
})
public class User {

    protected String chatId;
    protected String id;
    @XmlElement(name = "user_likes", nillable = true)
    protected List<UserLikes> userLikes;

    /**
     * Recupera il valore della proprietà chatId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChatId() {
        return chatId;
    }

    /**
     * Imposta il valore della proprietà chatId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChatId(String value) {
        this.chatId = value;
    }

    /**
     * Recupera il valore della proprietà id.
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
     * Imposta il valore della proprietà id.
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
     * Gets the value of the userLikes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userLikes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserLikes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserLikes }
     * 
     * 
     */
    public List<UserLikes> getUserLikes() {
        if (userLikes == null) {
            userLikes = new ArrayList<UserLikes>();
        }
        return this.userLikes;
    }

}
