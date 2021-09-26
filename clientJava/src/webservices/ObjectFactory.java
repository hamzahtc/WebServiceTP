
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Auteur_QNAME = new QName("http://webservices/", "auteur");
    private final static QName _Livre_QNAME = new QName("http://webservices/", "livre");
    private final static QName _AddLivre_QNAME = new QName("http://webservices/", "addLivre");
    private final static QName _AddLivreResponse_QNAME = new QName("http://webservices/", "addLivreResponse");
    private final static QName _GetLivres_QNAME = new QName("http://webservices/", "getLivres");
    private final static QName _GetLivre_QNAME = new QName("http://webservices/", "getLivre");
    private final static QName _GetLivresResponse_QNAME = new QName("http://webservices/", "getLivresResponse");
    private final static QName _GetLivreResponse_QNAME = new QName("http://webservices/", "getLivreResponse");
    private final static QName _UpdateLivreResponse_QNAME = new QName("http://webservices/", "updateLivreResponse");
    private final static QName _UpdateLivre_QNAME = new QName("http://webservices/", "updateLivre");
    private final static QName _DeleteLivre_QNAME = new QName("http://webservices/", "deleteLivre");
    private final static QName _DeleteLivreResponse_QNAME = new QName("http://webservices/", "deleteLivreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteLivre }
     * 
     */
    public DeleteLivre createDeleteLivre() {
        return new DeleteLivre();
    }

    /**
     * Create an instance of {@link DeleteLivreResponse }
     * 
     */
    public DeleteLivreResponse createDeleteLivreResponse() {
        return new DeleteLivreResponse();
    }

    /**
     * Create an instance of {@link UpdateLivre }
     * 
     */
    public UpdateLivre createUpdateLivre() {
        return new UpdateLivre();
    }

    /**
     * Create an instance of {@link GetLivreResponse }
     * 
     */
    public GetLivreResponse createGetLivreResponse() {
        return new GetLivreResponse();
    }

    /**
     * Create an instance of {@link UpdateLivreResponse }
     * 
     */
    public UpdateLivreResponse createUpdateLivreResponse() {
        return new UpdateLivreResponse();
    }

    /**
     * Create an instance of {@link GetLivre }
     * 
     */
    public GetLivre createGetLivre() {
        return new GetLivre();
    }

    /**
     * Create an instance of {@link GetLivresResponse }
     * 
     */
    public GetLivresResponse createGetLivresResponse() {
        return new GetLivresResponse();
    }

    /**
     * Create an instance of {@link AddLivreResponse }
     * 
     */
    public AddLivreResponse createAddLivreResponse() {
        return new AddLivreResponse();
    }

    /**
     * Create an instance of {@link GetLivres }
     * 
     */
    public GetLivres createGetLivres() {
        return new GetLivres();
    }

    /**
     * Create an instance of {@link AddLivre }
     * 
     */
    public AddLivre createAddLivre() {
        return new AddLivre();
    }

    /**
     * Create an instance of {@link Auteur }
     * 
     */
    public Auteur createAuteur() {
        return new Auteur();
    }

    /**
     * Create an instance of {@link Livre }
     * 
     */
    public Livre createLivre() {
        return new Livre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "auteur")
    public JAXBElement<Auteur> createAuteur(Auteur value) {
        return new JAXBElement<Auteur>(_Auteur_QNAME, Auteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Livre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "livre")
    public JAXBElement<Livre> createLivre(Livre value) {
        return new JAXBElement<Livre>(_Livre_QNAME, Livre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "addLivre")
    public JAXBElement<AddLivre> createAddLivre(AddLivre value) {
        return new JAXBElement<AddLivre>(_AddLivre_QNAME, AddLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "addLivreResponse")
    public JAXBElement<AddLivreResponse> createAddLivreResponse(AddLivreResponse value) {
        return new JAXBElement<AddLivreResponse>(_AddLivreResponse_QNAME, AddLivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getLivres")
    public JAXBElement<GetLivres> createGetLivres(GetLivres value) {
        return new JAXBElement<GetLivres>(_GetLivres_QNAME, GetLivres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getLivre")
    public JAXBElement<GetLivre> createGetLivre(GetLivre value) {
        return new JAXBElement<GetLivre>(_GetLivre_QNAME, GetLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getLivresResponse")
    public JAXBElement<GetLivresResponse> createGetLivresResponse(GetLivresResponse value) {
        return new JAXBElement<GetLivresResponse>(_GetLivresResponse_QNAME, GetLivresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getLivreResponse")
    public JAXBElement<GetLivreResponse> createGetLivreResponse(GetLivreResponse value) {
        return new JAXBElement<GetLivreResponse>(_GetLivreResponse_QNAME, GetLivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "updateLivreResponse")
    public JAXBElement<UpdateLivreResponse> createUpdateLivreResponse(UpdateLivreResponse value) {
        return new JAXBElement<UpdateLivreResponse>(_UpdateLivreResponse_QNAME, UpdateLivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "updateLivre")
    public JAXBElement<UpdateLivre> createUpdateLivre(UpdateLivre value) {
        return new JAXBElement<UpdateLivre>(_UpdateLivre_QNAME, UpdateLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "deleteLivre")
    public JAXBElement<DeleteLivre> createDeleteLivre(DeleteLivre value) {
        return new JAXBElement<DeleteLivre>(_DeleteLivre_QNAME, DeleteLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "deleteLivreResponse")
    public JAXBElement<DeleteLivreResponse> createDeleteLivreResponse(DeleteLivreResponse value) {
        return new JAXBElement<DeleteLivreResponse>(_DeleteLivreResponse_QNAME, DeleteLivreResponse.class, null, value);
    }

}
