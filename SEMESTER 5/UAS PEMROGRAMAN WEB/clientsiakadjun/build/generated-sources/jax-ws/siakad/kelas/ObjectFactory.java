
package siakad.kelas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the siakad.kelas package. 
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

    private final static QName _DelKelas_QNAME = new QName("http://kelas.siakad/", "delKelas");
    private final static QName _EditKelasResponse_QNAME = new QName("http://kelas.siakad/", "editKelasResponse");
    private final static QName _GetKelas_QNAME = new QName("http://kelas.siakad/", "getKelas");
    private final static QName _DelKelasResponse_QNAME = new QName("http://kelas.siakad/", "delKelasResponse");
    private final static QName _EditKelas_QNAME = new QName("http://kelas.siakad/", "editKelas");
    private final static QName _AddKelasResponse_QNAME = new QName("http://kelas.siakad/", "addKelasResponse");
    private final static QName _GetKelasResponse_QNAME = new QName("http://kelas.siakad/", "getKelasResponse");
    private final static QName _AddKelas_QNAME = new QName("http://kelas.siakad/", "addKelas");
    private final static QName _TampilKelas_QNAME = new QName("http://kelas.siakad/", "tampilKelas");
    private final static QName _TampilKelasResponse_QNAME = new QName("http://kelas.siakad/", "tampilKelasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: siakad.kelas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddKelasResponse }
     * 
     */
    public AddKelasResponse createAddKelasResponse() {
        return new AddKelasResponse();
    }

    /**
     * Create an instance of {@link TampilKelas }
     * 
     */
    public TampilKelas createTampilKelas() {
        return new TampilKelas();
    }

    /**
     * Create an instance of {@link TampilKelasResponse }
     * 
     */
    public TampilKelasResponse createTampilKelasResponse() {
        return new TampilKelasResponse();
    }

    /**
     * Create an instance of {@link AddKelas }
     * 
     */
    public AddKelas createAddKelas() {
        return new AddKelas();
    }

    /**
     * Create an instance of {@link GetKelasResponse }
     * 
     */
    public GetKelasResponse createGetKelasResponse() {
        return new GetKelasResponse();
    }

    /**
     * Create an instance of {@link EditKelas }
     * 
     */
    public EditKelas createEditKelas() {
        return new EditKelas();
    }

    /**
     * Create an instance of {@link DelKelasResponse }
     * 
     */
    public DelKelasResponse createDelKelasResponse() {
        return new DelKelasResponse();
    }

    /**
     * Create an instance of {@link DelKelas }
     * 
     */
    public DelKelas createDelKelas() {
        return new DelKelas();
    }

    /**
     * Create an instance of {@link EditKelasResponse }
     * 
     */
    public EditKelasResponse createEditKelasResponse() {
        return new EditKelasResponse();
    }

    /**
     * Create an instance of {@link GetKelas }
     * 
     */
    public GetKelas createGetKelas() {
        return new GetKelas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelKelas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kelas.siakad/", name = "delKelas")
    public JAXBElement<DelKelas> createDelKelas(DelKelas value) {
        return new JAXBElement<DelKelas>(_DelKelas_QNAME, DelKelas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditKelasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kelas.siakad/", name = "editKelasResponse")
    public JAXBElement<EditKelasResponse> createEditKelasResponse(EditKelasResponse value) {
        return new JAXBElement<EditKelasResponse>(_EditKelasResponse_QNAME, EditKelasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKelas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kelas.siakad/", name = "getKelas")
    public JAXBElement<GetKelas> createGetKelas(GetKelas value) {
        return new JAXBElement<GetKelas>(_GetKelas_QNAME, GetKelas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelKelasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kelas.siakad/", name = "delKelasResponse")
    public JAXBElement<DelKelasResponse> createDelKelasResponse(DelKelasResponse value) {
        return new JAXBElement<DelKelasResponse>(_DelKelasResponse_QNAME, DelKelasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditKelas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kelas.siakad/", name = "editKelas")
    public JAXBElement<EditKelas> createEditKelas(EditKelas value) {
        return new JAXBElement<EditKelas>(_EditKelas_QNAME, EditKelas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddKelasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kelas.siakad/", name = "addKelasResponse")
    public JAXBElement<AddKelasResponse> createAddKelasResponse(AddKelasResponse value) {
        return new JAXBElement<AddKelasResponse>(_AddKelasResponse_QNAME, AddKelasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKelasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kelas.siakad/", name = "getKelasResponse")
    public JAXBElement<GetKelasResponse> createGetKelasResponse(GetKelasResponse value) {
        return new JAXBElement<GetKelasResponse>(_GetKelasResponse_QNAME, GetKelasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddKelas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kelas.siakad/", name = "addKelas")
    public JAXBElement<AddKelas> createAddKelas(AddKelas value) {
        return new JAXBElement<AddKelas>(_AddKelas_QNAME, AddKelas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TampilKelas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kelas.siakad/", name = "tampilKelas")
    public JAXBElement<TampilKelas> createTampilKelas(TampilKelas value) {
        return new JAXBElement<TampilKelas>(_TampilKelas_QNAME, TampilKelas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TampilKelasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kelas.siakad/", name = "tampilKelasResponse")
    public JAXBElement<TampilKelasResponse> createTampilKelasResponse(TampilKelasResponse value) {
        return new JAXBElement<TampilKelasResponse>(_TampilKelasResponse_QNAME, TampilKelasResponse.class, null, value);
    }

}
