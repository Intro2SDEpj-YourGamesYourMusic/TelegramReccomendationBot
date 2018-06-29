
package project.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per deleteSongResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="deleteSongResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="int" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteSongResponse", propOrder = {
    "_int"
})
public class DeleteSongResponse {

    @XmlElement(name = "int")
    protected int _int;

    /**
     * Recupera il valore della proprietà int.
     * 
     */
    public int getInt() {
        return _int;
    }

    /**
     * Imposta il valore della proprietà int.
     * 
     */
    public void setInt(int value) {
        this._int = value;
    }

}
