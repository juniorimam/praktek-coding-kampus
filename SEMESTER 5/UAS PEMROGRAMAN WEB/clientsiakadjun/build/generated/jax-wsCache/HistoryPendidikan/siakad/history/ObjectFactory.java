
package siakad.history;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the siakad.history package. 
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

    private final static QName _GetDetailMhsPendResponse_QNAME = new QName("http://history.siakad/", "getDetailMhsPendResponse");
    private final static QName _GetHistoryPendResponse_QNAME = new QName("http://history.siakad/", "getHistoryPendResponse");
    private final static QName _AddHistoryPendidikanResponse_QNAME = new QName("http://history.siakad/", "addHistoryPendidikanResponse");
    private final static QName _AddHistoryPendidikan_QNAME = new QName("http://history.siakad/", "addHistoryPendidikan");
    private final static QName _GetHistoryPend_QNAME = new QName("http://history.siakad/", "getHistoryPend");
    private final static QName _GetDetailMhsPend_QNAME = new QName("http://history.siakad/", "getDetailMhsPend");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: siakad.history
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDetailMhsPend }
     * 
     */
    public GetDetailMhsPend createGetDetailMhsPend() {
        return new GetDetailMhsPend();
    }

    /**
     * Create an instance of {@link AddHistoryPendidikanResponse }
     * 
     */
    public AddHistoryPendidikanResponse createAddHistoryPendidikanResponse() {
        return new AddHistoryPendidikanResponse();
    }

    /**
     * Create an instance of {@link AddHistoryPendidikan }
     * 
     */
    public AddHistoryPendidikan createAddHistoryPendidikan() {
        return new AddHistoryPendidikan();
    }

    /**
     * Create an instance of {@link GetHistoryPend }
     * 
     */
    public GetHistoryPend createGetHistoryPend() {
        return new GetHistoryPend();
    }

    /**
     * Create an instance of {@link GetDetailMhsPendResponse }
     * 
     */
    public GetDetailMhsPendResponse createGetDetailMhsPendResponse() {
        return new GetDetailMhsPendResponse();
    }

    /**
     * Create an instance of {@link GetHistoryPendResponse }
     * 
     */
    public GetHistoryPendResponse createGetHistoryPendResponse() {
        return new GetHistoryPendResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailMhsPendResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://history.siakad/", name = "getDetailMhsPendResponse")
    public JAXBElement<GetDetailMhsPendResponse> createGetDetailMhsPendResponse(GetDetailMhsPendResponse value) {
        return new JAXBElement<GetDetailMhsPendResponse>(_GetDetailMhsPendResponse_QNAME, GetDetailMhsPendResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoryPendResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://history.siakad/", name = "getHistoryPendResponse")
    public JAXBElement<GetHistoryPendResponse> createGetHistoryPendResponse(GetHistoryPendResponse value) {
        return new JAXBElement<GetHistoryPendResponse>(_GetHistoryPendResponse_QNAME, GetHistoryPendResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHistoryPendidikanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://history.siakad/", name = "addHistoryPendidikanResponse")
    public JAXBElement<AddHistoryPendidikanResponse> createAddHistoryPendidikanResponse(AddHistoryPendidikanResponse value) {
        return new JAXBElement<AddHistoryPendidikanResponse>(_AddHistoryPendidikanResponse_QNAME, AddHistoryPendidikanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHistoryPendidikan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://history.siakad/", name = "addHistoryPendidikan")
    public JAXBElement<AddHistoryPendidikan> createAddHistoryPendidikan(AddHistoryPendidikan value) {
        return new JAXBElement<AddHistoryPendidikan>(_AddHistoryPendidikan_QNAME, AddHistoryPendidikan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoryPend }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://history.siakad/", name = "getHistoryPend")
    public JAXBElement<GetHistoryPend> createGetHistoryPend(GetHistoryPend value) {
        return new JAXBElement<GetHistoryPend>(_GetHistoryPend_QNAME, GetHistoryPend.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailMhsPend }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://history.siakad/", name = "getDetailMhsPend")
    public JAXBElement<GetDetailMhsPend> createGetDetailMhsPend(GetDetailMhsPend value) {
        return new JAXBElement<GetDetailMhsPend>(_GetDetailMhsPend_QNAME, GetDetailMhsPend.class, null, value);
    }

}
