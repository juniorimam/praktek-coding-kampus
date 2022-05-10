
package siakad.nilai;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the siakad.nilai package. 
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

    private final static QName _TampilNilaiResponse_QNAME = new QName("http://nilai.siakad/", "tampilNilaiResponse");
    private final static QName _TampilNilai_QNAME = new QName("http://nilai.siakad/", "tampilNilai");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: siakad.nilai
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TampilNilai }
     * 
     */
    public TampilNilai createTampilNilai() {
        return new TampilNilai();
    }

    /**
     * Create an instance of {@link TampilNilaiResponse }
     * 
     */
    public TampilNilaiResponse createTampilNilaiResponse() {
        return new TampilNilaiResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TampilNilaiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nilai.siakad/", name = "tampilNilaiResponse")
    public JAXBElement<TampilNilaiResponse> createTampilNilaiResponse(TampilNilaiResponse value) {
        return new JAXBElement<TampilNilaiResponse>(_TampilNilaiResponse_QNAME, TampilNilaiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TampilNilai }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nilai.siakad/", name = "tampilNilai")
    public JAXBElement<TampilNilai> createTampilNilai(TampilNilai value) {
        return new JAXBElement<TampilNilai>(_TampilNilai_QNAME, TampilNilai.class, null, value);
    }

}
