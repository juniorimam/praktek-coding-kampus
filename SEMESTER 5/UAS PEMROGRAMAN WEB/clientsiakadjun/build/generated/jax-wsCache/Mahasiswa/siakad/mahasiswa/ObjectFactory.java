
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

    private final static QName _AddMahasiswa_QNAME = new QName("http://mahasiswa.siakad/", "addMahasiswa");
    private final static QName _DelMahasiswa_QNAME = new QName("http://mahasiswa.siakad/", "delMahasiswa");
    private final static QName _TampilMahasiswaResponse_QNAME = new QName("http://mahasiswa.siakad/", "tampilMahasiswaResponse");
    private final static QName _TampilMahasiswa_QNAME = new QName("http://mahasiswa.siakad/", "tampilMahasiswa");
    private final static QName _DelMahasiswaResponse_QNAME = new QName("http://mahasiswa.siakad/", "delMahasiswaResponse");
    private final static QName _EditMahasiswaResponse_QNAME = new QName("http://mahasiswa.siakad/", "editMahasiswaResponse");
    private final static QName _AddMahasiswaResponse_QNAME = new QName("http://mahasiswa.siakad/", "addMahasiswaResponse");
    private final static QName _EditMahasiswa_QNAME = new QName("http://mahasiswa.siakad/", "editMahasiswa");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: siakad.mahasiswa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddMahasiswaResponse }
     * 
     */
    public AddMahasiswaResponse createAddMahasiswaResponse() {
        return new AddMahasiswaResponse();
    }

    /**
     * Create an instance of {@link EditMahasiswa }
     * 
     */
    public EditMahasiswa createEditMahasiswa() {
        return new EditMahasiswa();
    }

    /**
     * Create an instance of {@link AddMahasiswa }
     * 
     */
    public AddMahasiswa createAddMahasiswa() {
        return new AddMahasiswa();
    }

    /**
     * Create an instance of {@link DelMahasiswa }
     * 
     */
    public DelMahasiswa createDelMahasiswa() {
        return new DelMahasiswa();
    }

    /**
     * Create an instance of {@link TampilMahasiswaResponse }
     * 
     */
    public TampilMahasiswaResponse createTampilMahasiswaResponse() {
        return new TampilMahasiswaResponse();
    }

    /**
     * Create an instance of {@link TampilMahasiswa }
     * 
     */
    public TampilMahasiswa createTampilMahasiswa() {
        return new TampilMahasiswa();
    }

    /**
     * Create an instance of {@link DelMahasiswaResponse }
     * 
     */
    public DelMahasiswaResponse createDelMahasiswaResponse() {
        return new DelMahasiswaResponse();
    }

    /**
     * Create an instance of {@link EditMahasiswaResponse }
     * 
     */
    public EditMahasiswaResponse createEditMahasiswaResponse() {
        return new EditMahasiswaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMahasiswa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.siakad/", name = "addMahasiswa")
    public JAXBElement<AddMahasiswa> createAddMahasiswa(AddMahasiswa value) {
        return new JAXBElement<AddMahasiswa>(_AddMahasiswa_QNAME, AddMahasiswa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelMahasiswa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.siakad/", name = "delMahasiswa")
    public JAXBElement<DelMahasiswa> createDelMahasiswa(DelMahasiswa value) {
        return new JAXBElement<DelMahasiswa>(_DelMahasiswa_QNAME, DelMahasiswa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TampilMahasiswaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.siakad/", name = "tampilMahasiswaResponse")
    public JAXBElement<TampilMahasiswaResponse> createTampilMahasiswaResponse(TampilMahasiswaResponse value) {
        return new JAXBElement<TampilMahasiswaResponse>(_TampilMahasiswaResponse_QNAME, TampilMahasiswaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TampilMahasiswa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.siakad/", name = "tampilMahasiswa")
    public JAXBElement<TampilMahasiswa> createTampilMahasiswa(TampilMahasiswa value) {
        return new JAXBElement<TampilMahasiswa>(_TampilMahasiswa_QNAME, TampilMahasiswa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelMahasiswaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.siakad/", name = "delMahasiswaResponse")
    public JAXBElement<DelMahasiswaResponse> createDelMahasiswaResponse(DelMahasiswaResponse value) {
        return new JAXBElement<DelMahasiswaResponse>(_DelMahasiswaResponse_QNAME, DelMahasiswaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditMahasiswaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.siakad/", name = "editMahasiswaResponse")
    public JAXBElement<EditMahasiswaResponse> createEditMahasiswaResponse(EditMahasiswaResponse value) {
        return new JAXBElement<EditMahasiswaResponse>(_EditMahasiswaResponse_QNAME, EditMahasiswaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMahasiswaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.siakad/", name = "addMahasiswaResponse")
    public JAXBElement<AddMahasiswaResponse> createAddMahasiswaResponse(AddMahasiswaResponse value) {
        return new JAXBElement<AddMahasiswaResponse>(_AddMahasiswaResponse_QNAME, AddMahasiswaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditMahasiswa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.siakad/", name = "editMahasiswa")
    public JAXBElement<EditMahasiswa> createEditMahasiswa(EditMahasiswa value) {
        return new JAXBElement<EditMahasiswa>(_EditMahasiswa_QNAME, EditMahasiswa.class, null, value);
    }

}
