
package siakad.prodi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the siakad.prodi package. 
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

    private final static QName _GetProdi_QNAME = new QName("http://prodi.siakad/", "getProdi");
    private final static QName _AddProdi_QNAME = new QName("http://prodi.siakad/", "addProdi");
    private final static QName _DelProdi_QNAME = new QName("http://prodi.siakad/", "delProdi");
    private final static QName _AddProdiResponse_QNAME = new QName("http://prodi.siakad/", "addProdiResponse");
    private final static QName _GetProdiResponse_QNAME = new QName("http://prodi.siakad/", "getProdiResponse");
    private final static QName _TampilProdiResponse_QNAME = new QName("http://prodi.siakad/", "tampilProdiResponse");
    private final static QName _EditProdi_QNAME = new QName("http://prodi.siakad/", "editProdi");
    private final static QName _TampilProdi_QNAME = new QName("http://prodi.siakad/", "tampilProdi");
    private final static QName _EditProdiResponse_QNAME = new QName("http://prodi.siakad/", "editProdiResponse");
    private final static QName _DelProdiResponse_QNAME = new QName("http://prodi.siakad/", "delProdiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: siakad.prodi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProdi }
     * 
     */
    public GetProdi createGetProdi() {
        return new GetProdi();
    }

    /**
     * Create an instance of {@link AddProdi }
     * 
     */
    public AddProdi createAddProdi() {
        return new AddProdi();
    }

    /**
     * Create an instance of {@link DelProdi }
     * 
     */
    public DelProdi createDelProdi() {
        return new DelProdi();
    }

    /**
     * Create an instance of {@link AddProdiResponse }
     * 
     */
    public AddProdiResponse createAddProdiResponse() {
        return new AddProdiResponse();
    }

    /**
     * Create an instance of {@link GetProdiResponse }
     * 
     */
    public GetProdiResponse createGetProdiResponse() {
        return new GetProdiResponse();
    }

    /**
     * Create an instance of {@link TampilProdiResponse }
     * 
     */
    public TampilProdiResponse createTampilProdiResponse() {
        return new TampilProdiResponse();
    }

    /**
     * Create an instance of {@link EditProdi }
     * 
     */
    public EditProdi createEditProdi() {
        return new EditProdi();
    }

    /**
     * Create an instance of {@link TampilProdi }
     * 
     */
    public TampilProdi createTampilProdi() {
        return new TampilProdi();
    }

    /**
     * Create an instance of {@link EditProdiResponse }
     * 
     */
    public EditProdiResponse createEditProdiResponse() {
        return new EditProdiResponse();
    }

    /**
     * Create an instance of {@link DelProdiResponse }
     * 
     */
    public DelProdiResponse createDelProdiResponse() {
        return new DelProdiResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProdi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prodi.siakad/", name = "getProdi")
    public JAXBElement<GetProdi> createGetProdi(GetProdi value) {
        return new JAXBElement<GetProdi>(_GetProdi_QNAME, GetProdi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProdi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prodi.siakad/", name = "addProdi")
    public JAXBElement<AddProdi> createAddProdi(AddProdi value) {
        return new JAXBElement<AddProdi>(_AddProdi_QNAME, AddProdi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelProdi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prodi.siakad/", name = "delProdi")
    public JAXBElement<DelProdi> createDelProdi(DelProdi value) {
        return new JAXBElement<DelProdi>(_DelProdi_QNAME, DelProdi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProdiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prodi.siakad/", name = "addProdiResponse")
    public JAXBElement<AddProdiResponse> createAddProdiResponse(AddProdiResponse value) {
        return new JAXBElement<AddProdiResponse>(_AddProdiResponse_QNAME, AddProdiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProdiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prodi.siakad/", name = "getProdiResponse")
    public JAXBElement<GetProdiResponse> createGetProdiResponse(GetProdiResponse value) {
        return new JAXBElement<GetProdiResponse>(_GetProdiResponse_QNAME, GetProdiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TampilProdiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prodi.siakad/", name = "tampilProdiResponse")
    public JAXBElement<TampilProdiResponse> createTampilProdiResponse(TampilProdiResponse value) {
        return new JAXBElement<TampilProdiResponse>(_TampilProdiResponse_QNAME, TampilProdiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditProdi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prodi.siakad/", name = "editProdi")
    public JAXBElement<EditProdi> createEditProdi(EditProdi value) {
        return new JAXBElement<EditProdi>(_EditProdi_QNAME, EditProdi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TampilProdi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prodi.siakad/", name = "tampilProdi")
    public JAXBElement<TampilProdi> createTampilProdi(TampilProdi value) {
        return new JAXBElement<TampilProdi>(_TampilProdi_QNAME, TampilProdi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditProdiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prodi.siakad/", name = "editProdiResponse")
    public JAXBElement<EditProdiResponse> createEditProdiResponse(EditProdiResponse value) {
        return new JAXBElement<EditProdiResponse>(_EditProdiResponse_QNAME, EditProdiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelProdiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prodi.siakad/", name = "delProdiResponse")
    public JAXBElement<DelProdiResponse> createDelProdiResponse(DelProdiResponse value) {
        return new JAXBElement<DelProdiResponse>(_DelProdiResponse_QNAME, DelProdiResponse.class, null, value);
    }

}
