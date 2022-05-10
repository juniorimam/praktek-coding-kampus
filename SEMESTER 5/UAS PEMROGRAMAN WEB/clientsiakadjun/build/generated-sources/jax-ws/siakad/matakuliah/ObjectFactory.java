
package siakad.matakuliah;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the siakad.matakuliah package. 
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

    private final static QName _AddMatkul_QNAME = new QName("http://matakuliah.siakad/", "addMatkul");
    private final static QName _DelMatkulResponse_QNAME = new QName("http://matakuliah.siakad/", "delMatkulResponse");
    private final static QName _EditMatkulResponse_QNAME = new QName("http://matakuliah.siakad/", "editMatkulResponse");
    private final static QName _CariMatkulResponse_QNAME = new QName("http://matakuliah.siakad/", "cariMatkulResponse");
    private final static QName _TampilMatkul_QNAME = new QName("http://matakuliah.siakad/", "tampilMatkul");
    private final static QName _TampilMatkulResponse_QNAME = new QName("http://matakuliah.siakad/", "tampilMatkulResponse");
    private final static QName _CariMatkul_QNAME = new QName("http://matakuliah.siakad/", "cariMatkul");
    private final static QName _GetMatkul_QNAME = new QName("http://matakuliah.siakad/", "getMatkul");
    private final static QName _AddMatkulResponse_QNAME = new QName("http://matakuliah.siakad/", "addMatkulResponse");
    private final static QName _GetMatkulResponse_QNAME = new QName("http://matakuliah.siakad/", "getMatkulResponse");
    private final static QName _DelMatkul_QNAME = new QName("http://matakuliah.siakad/", "delMatkul");
    private final static QName _EditMatkul_QNAME = new QName("http://matakuliah.siakad/", "editMatkul");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: siakad.matakuliah
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CariMatkulResponse }
     * 
     */
    public CariMatkulResponse createCariMatkulResponse() {
        return new CariMatkulResponse();
    }

    /**
     * Create an instance of {@link AddMatkul }
     * 
     */
    public AddMatkul createAddMatkul() {
        return new AddMatkul();
    }

    /**
     * Create an instance of {@link DelMatkulResponse }
     * 
     */
    public DelMatkulResponse createDelMatkulResponse() {
        return new DelMatkulResponse();
    }

    /**
     * Create an instance of {@link EditMatkulResponse }
     * 
     */
    public EditMatkulResponse createEditMatkulResponse() {
        return new EditMatkulResponse();
    }

    /**
     * Create an instance of {@link DelMatkul }
     * 
     */
    public DelMatkul createDelMatkul() {
        return new DelMatkul();
    }

    /**
     * Create an instance of {@link EditMatkul }
     * 
     */
    public EditMatkul createEditMatkul() {
        return new EditMatkul();
    }

    /**
     * Create an instance of {@link AddMatkulResponse }
     * 
     */
    public AddMatkulResponse createAddMatkulResponse() {
        return new AddMatkulResponse();
    }

    /**
     * Create an instance of {@link GetMatkulResponse }
     * 
     */
    public GetMatkulResponse createGetMatkulResponse() {
        return new GetMatkulResponse();
    }

    /**
     * Create an instance of {@link CariMatkul }
     * 
     */
    public CariMatkul createCariMatkul() {
        return new CariMatkul();
    }

    /**
     * Create an instance of {@link GetMatkul }
     * 
     */
    public GetMatkul createGetMatkul() {
        return new GetMatkul();
    }

    /**
     * Create an instance of {@link TampilMatkul }
     * 
     */
    public TampilMatkul createTampilMatkul() {
        return new TampilMatkul();
    }

    /**
     * Create an instance of {@link TampilMatkulResponse }
     * 
     */
    public TampilMatkulResponse createTampilMatkulResponse() {
        return new TampilMatkulResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMatkul }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matakuliah.siakad/", name = "addMatkul")
    public JAXBElement<AddMatkul> createAddMatkul(AddMatkul value) {
        return new JAXBElement<AddMatkul>(_AddMatkul_QNAME, AddMatkul.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelMatkulResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matakuliah.siakad/", name = "delMatkulResponse")
    public JAXBElement<DelMatkulResponse> createDelMatkulResponse(DelMatkulResponse value) {
        return new JAXBElement<DelMatkulResponse>(_DelMatkulResponse_QNAME, DelMatkulResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditMatkulResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matakuliah.siakad/", name = "editMatkulResponse")
    public JAXBElement<EditMatkulResponse> createEditMatkulResponse(EditMatkulResponse value) {
        return new JAXBElement<EditMatkulResponse>(_EditMatkulResponse_QNAME, EditMatkulResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CariMatkulResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matakuliah.siakad/", name = "cariMatkulResponse")
    public JAXBElement<CariMatkulResponse> createCariMatkulResponse(CariMatkulResponse value) {
        return new JAXBElement<CariMatkulResponse>(_CariMatkulResponse_QNAME, CariMatkulResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TampilMatkul }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matakuliah.siakad/", name = "tampilMatkul")
    public JAXBElement<TampilMatkul> createTampilMatkul(TampilMatkul value) {
        return new JAXBElement<TampilMatkul>(_TampilMatkul_QNAME, TampilMatkul.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TampilMatkulResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matakuliah.siakad/", name = "tampilMatkulResponse")
    public JAXBElement<TampilMatkulResponse> createTampilMatkulResponse(TampilMatkulResponse value) {
        return new JAXBElement<TampilMatkulResponse>(_TampilMatkulResponse_QNAME, TampilMatkulResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CariMatkul }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matakuliah.siakad/", name = "cariMatkul")
    public JAXBElement<CariMatkul> createCariMatkul(CariMatkul value) {
        return new JAXBElement<CariMatkul>(_CariMatkul_QNAME, CariMatkul.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMatkul }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matakuliah.siakad/", name = "getMatkul")
    public JAXBElement<GetMatkul> createGetMatkul(GetMatkul value) {
        return new JAXBElement<GetMatkul>(_GetMatkul_QNAME, GetMatkul.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMatkulResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matakuliah.siakad/", name = "addMatkulResponse")
    public JAXBElement<AddMatkulResponse> createAddMatkulResponse(AddMatkulResponse value) {
        return new JAXBElement<AddMatkulResponse>(_AddMatkulResponse_QNAME, AddMatkulResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMatkulResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matakuliah.siakad/", name = "getMatkulResponse")
    public JAXBElement<GetMatkulResponse> createGetMatkulResponse(GetMatkulResponse value) {
        return new JAXBElement<GetMatkulResponse>(_GetMatkulResponse_QNAME, GetMatkulResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelMatkul }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matakuliah.siakad/", name = "delMatkul")
    public JAXBElement<DelMatkul> createDelMatkul(DelMatkul value) {
        return new JAXBElement<DelMatkul>(_DelMatkul_QNAME, DelMatkul.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditMatkul }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matakuliah.siakad/", name = "editMatkul")
    public JAXBElement<EditMatkul> createEditMatkul(EditMatkul value) {
        return new JAXBElement<EditMatkul>(_EditMatkul_QNAME, EditMatkul.class, null, value);
    }

}
