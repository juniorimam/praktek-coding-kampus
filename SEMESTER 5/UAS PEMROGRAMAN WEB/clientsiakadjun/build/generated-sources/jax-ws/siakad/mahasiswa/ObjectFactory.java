
package siakad.mahasiswa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the siakad.mahasiswa package. 
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

    private final static QName _GetDetailMhsResponse_QNAME = new QName("http://mahasiswa.siakad/", "getDetailMhsResponse");
    private final static QName _GetDetailMhs_QNAME = new QName("http://mahasiswa.siakad/", "getDetailMhs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: siakad.mahasiswa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDetailMhs }
     * 
     */
    public GetDetailMhs createGetDetailMhs() {
        return new GetDetailMhs();
    }

    /**
     * Create an instance of {@link GetDetailMhsResponse }
     * 
     */
    public GetDetailMhsResponse createGetDetailMhsResponse() {
        return new GetDetailMhsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailMhsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.siakad/", name = "getDetailMhsResponse")
    public JAXBElement<GetDetailMhsResponse> createGetDetailMhsResponse(GetDetailMhsResponse value) {
        return new JAXBElement<GetDetailMhsResponse>(_GetDetailMhsResponse_QNAME, GetDetailMhsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailMhs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.siakad/", name = "getDetailMhs")
    public JAXBElement<GetDetailMhs> createGetDetailMhs(GetDetailMhs value) {
        return new JAXBElement<GetDetailMhs>(_GetDetailMhs_QNAME, GetDetailMhs.class, null, value);
    }

}
