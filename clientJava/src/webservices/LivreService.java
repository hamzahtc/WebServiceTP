
package webservices;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LivreService", targetNamespace = "http://webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LivreService {


    /**
     * 
     * @return
     *     returns java.util.List<webservices.Livre>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLivres", targetNamespace = "http://webservices/", className = "webservices.GetLivres")
    @ResponseWrapper(localName = "getLivresResponse", targetNamespace = "http://webservices/", className = "webservices.GetLivresResponse")
    @Action(input = "http://webservices/LivreService/getLivresRequest", output = "http://webservices/LivreService/getLivresResponse")
    public List<Livre> getLivres();

    /**
     * 
     * @param livre
     */
    @WebMethod
    @RequestWrapper(localName = "updateLivre", targetNamespace = "http://webservices/", className = "webservices.UpdateLivre")
    @ResponseWrapper(localName = "updateLivreResponse", targetNamespace = "http://webservices/", className = "webservices.UpdateLivreResponse")
    @Action(input = "http://webservices/LivreService/updateLivreRequest", output = "http://webservices/LivreService/updateLivreResponse")
    public void updateLivre(
        @WebParam(name = "livre", targetNamespace = "")
        Livre livre);

    /**
     * 
     * @param livre
     */
    @WebMethod
    @RequestWrapper(localName = "addLivre", targetNamespace = "http://webservices/", className = "webservices.AddLivre")
    @ResponseWrapper(localName = "addLivreResponse", targetNamespace = "http://webservices/", className = "webservices.AddLivreResponse")
    @Action(input = "http://webservices/LivreService/addLivreRequest", output = "http://webservices/LivreService/addLivreResponse")
    public void addLivre(
        @WebParam(name = "livre", targetNamespace = "")
        Livre livre);

    /**
     * 
     * @param titre
     * @param id
     * @param auteur
     * @return
     *     returns webservices.Livre
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLivre", targetNamespace = "http://webservices/", className = "webservices.GetLivre")
    @ResponseWrapper(localName = "getLivreResponse", targetNamespace = "http://webservices/", className = "webservices.GetLivreResponse")
    @Action(input = "http://webservices/LivreService/getLivreRequest", output = "http://webservices/LivreService/getLivreResponse")
    public Livre getLivre(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "titre", targetNamespace = "")
        String titre,
        @WebParam(name = "auteur", targetNamespace = "")
        String auteur);

    /**
     * 
     * @param id
     */
    @WebMethod
    @RequestWrapper(localName = "deleteLivre", targetNamespace = "http://webservices/", className = "webservices.DeleteLivre")
    @ResponseWrapper(localName = "deleteLivreResponse", targetNamespace = "http://webservices/", className = "webservices.DeleteLivreResponse")
    @Action(input = "http://webservices/LivreService/deleteLivreRequest", output = "http://webservices/LivreService/deleteLivreResponse")
    public void deleteLivre(
        @WebParam(name = "id", targetNamespace = "")
        String id);

}