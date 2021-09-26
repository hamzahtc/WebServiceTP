
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateLivre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateLivre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="livre" type="{http://webservices/}livre" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateLivre", propOrder = {
    "livre"
})
public class UpdateLivre {

    protected Livre livre;

    /**
     * Obtient la valeur de la propriété livre.
     * 
     * @return
     *     possible object is
     *     {@link Livre }
     *     
     */
    public Livre getLivre() {
        return livre;
    }

    /**
     * Définit la valeur de la propriété livre.
     * 
     * @param value
     *     allowed object is
     *     {@link Livre }
     *     
     */
    public void setLivre(Livre value) {
        this.livre = value;
    }

}
