
package project.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getSongByIdResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getSongByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="song" type="{http://ws.project/}song" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSongByIdResponse", propOrder = {
    "song"
})
public class GetSongByIdResponse {

    protected Song song;

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

}
