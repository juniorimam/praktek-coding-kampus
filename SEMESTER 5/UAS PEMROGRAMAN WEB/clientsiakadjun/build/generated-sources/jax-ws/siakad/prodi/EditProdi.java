
package siakad.prodi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editProdi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editProdi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kode_prodi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nama_prodi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jenjang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="akreditasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="no_sk_prodi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editProdi", propOrder = {
    "kodeProdi",
    "namaProdi",
    "jenjang",
    "akreditasi",
    "noSkProdi"
})
public class EditProdi {

    @XmlElement(name = "kode_prodi")
    protected int kodeProdi;
    @XmlElement(name = "nama_prodi")
    protected String namaProdi;
    protected String jenjang;
    protected String akreditasi;
    @XmlElement(name = "no_sk_prodi")
    protected String noSkProdi;

    /**
     * Gets the value of the kodeProdi property.
     * 
     */
    public int getKodeProdi() {
        return kodeProdi;
    }

    /**
     * Sets the value of the kodeProdi property.
     * 
     */
    public void setKodeProdi(int value) {
        this.kodeProdi = value;
    }

    /**
     * Gets the value of the namaProdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaProdi() {
        return namaProdi;
    }

    /**
     * Sets the value of the namaProdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaProdi(String value) {
        this.namaProdi = value;
    }

    /**
     * Gets the value of the jenjang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJenjang() {
        return jenjang;
    }

    /**
     * Sets the value of the jenjang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJenjang(String value) {
        this.jenjang = value;
    }

    /**
     * Gets the value of the akreditasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkreditasi() {
        return akreditasi;
    }

    /**
     * Sets the value of the akreditasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkreditasi(String value) {
        this.akreditasi = value;
    }

    /**
     * Gets the value of the noSkProdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSkProdi() {
        return noSkProdi;
    }

    /**
     * Sets the value of the noSkProdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSkProdi(String value) {
        this.noSkProdi = value;
    }

}
