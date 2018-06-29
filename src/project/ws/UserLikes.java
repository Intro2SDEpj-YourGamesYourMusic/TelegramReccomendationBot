
package project.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per userLikes complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="userLikes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="artist" type="{http://ws.project/}artist" minOccurs="0"/>
 *         &lt;element name="idRelation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="song" type="{http://ws.project/}song" minOccurs="0"/>
 *         &lt;element name="user" type="{http://ws.project/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userLikes", propOrder = {
    "artist",
    "idRelation",
    "rating",
    "song",
    "user"
})
public class UserLikes {

    protected Artist artist;
    protected int idRelation;
    protected boolean rating;
    protected Song song;
    protected User user;

    /**
     * Recupera il valore della proprietà artist.
     * 
     * @return
     *     possible object is
     *     {@link Artist }
     *     
     */
    public Artist getArtist() {
        return artist;
    }

    /**
     * Imposta il valore della proprietà artist.
     * 
     * @param value
     *     allowed object is
     *     {@link Artist }
     *     
     */
    public void setArtist(Artist value) {
        this.artist = value;
    }

    /**
     * Recupera il valore della proprietà idRelation.
     * 
     */
    public int getIdRelation() {
        return idRelation;
    }

    /**
     * Imposta il valore della proprietà idRelation.
     * 
     */
    public void setIdRelation(int value) {
        this.idRelation = value;
    }

    /**
     * Recupera il valore della proprietà rating.
     * 
     */
    public boolean isRating() {
        return rating;
    }

    /**
     * Imposta il valore della proprietà rating.
     * 
     */
    public void setRating(boolean value) {
        this.rating = value;
    }

    /**
     * Recupera il valore della proprietà song.
     * 
     * @return
     *     possible object is
     *     {@link Song }
     *     
     */
    public Song getSong() {
        return song;
    }

    /**
     * Imposta il valore della proprietà song.
     * 
     * @param value
     *     allowed object is
     *     {@link Song }
     *     
     */
    public void setSong(Song value) {
        this.song = value;
    }

    /**
     * Recupera il valore della proprietà user.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Imposta il valore della proprietà user.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}
