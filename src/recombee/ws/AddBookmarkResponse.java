
package recombee.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per addBookmarkResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="addBookmarkResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addBookmarkResponse", propOrder = {
    "result"
})
public class AddBookmarkResponse {

    protected boolean result;

    /**
     * Recupera il valore della proprietÓ result.
     * 
     */
    public boolean isResult() {
        return result;
    }

    /**
     * Imposta il valore della proprietÓ result.
     * 
     */
    public void setResult(boolean value) {
        this.result = value;
    }

}
