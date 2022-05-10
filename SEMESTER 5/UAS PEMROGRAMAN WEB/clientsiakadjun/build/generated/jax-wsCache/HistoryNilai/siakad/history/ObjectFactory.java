
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

    private final static QName _GetHistoryNilaiResponse_QNAME = new QName("http://history.siakad/", "getHistoryNilaiResponse");
    private final static QName _GetDetailMhsNilaiResponse_QNAME = new QName("http://history.siakad/", "getDetailMhsNilaiResponse");
    private final static QName _GetDetailMhsNilai_QNAME = new QName("http://history.siakad/", "getDetailMhsNilai");
    private final static QName _GetHistoryNilai_QNAME = new QName("http://history.siakad/", "getHistoryNilai");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: siakad.history
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHistoryNilai }
     * 
     */
    public GetHistoryNilai createGetHistoryNilai() {
        return new GetHistoryNilai();
    }

    /**
     * Create an instance of {@link GetDetailMhsNilai }
     * 
     */
    public GetDetailMhsNilai createGetDetailMhsNilai() {
        return new GetDetailMhsNilai();
    }

    /**
     * Create an instance of {@link GetHistoryNilaiResponse }
     * 
     */
    public GetHistoryNilaiResponse createGetHistoryNilaiResponse() {
        return new GetHistoryNilaiResponse();
    }

    /**
     * Create an instance of {@link GetDetailMhsNilaiResponse }
     * 
     */
    public GetDetailMhsNilaiResponse createGetDetailMhsNilaiResponse() {
        return new GetDetailMhsNilaiResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoryNilaiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://history.siakad/", name = "getHistoryNilaiResponse")
    public JAXBElement<GetHistoryNilaiResponse> createGetHistoryNilaiResponse(GetHistoryNilaiResponse value) {
        return new JAXBElement<GetHistoryNilaiResponse>(_GetHistoryNilaiResponse_QNAME, GetHistoryNilaiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailMhsNilaiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://history.siakad/", name = "getDetailMhsNilaiResponse")
    public JAXBElement<GetDetailMhsNilaiResponse> createGetDetailMhsNilaiResponse(GetDetailMhsNilaiResponse value) {
        return new JAXBElement<GetDetailMhsNilaiResponse>(_GetDetailMhsNilaiResponse_QNAME, GetDetailMhsNilaiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailMhsNilai }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://history.siakad/", name = "getDetailMhsNilai")
    public JAXBElement<GetDetailMhsNilai> createGetDetailMhsNilai(GetDetailMhsNilai value) {
        return new JAXBElement<GetDetailMhsNilai>(_GetDetailMhsNilai_QNAME, GetDetailMhsNilai.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoryNilai }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://history.siakad/", name = "getHistoryNilai")
    public JAXBElement<GetHistoryNilai> createGetHistoryNilai(GetHistoryNilai value) {
        return new JAXBElement<GetHistoryNilai>(_GetHistoryNilai_QNAME, GetHistoryNilai.class, null, value);
    }

}
