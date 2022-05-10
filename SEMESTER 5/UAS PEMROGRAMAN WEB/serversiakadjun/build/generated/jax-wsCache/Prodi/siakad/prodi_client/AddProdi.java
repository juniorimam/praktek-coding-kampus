
package siakad.prodi_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addProdi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addProdi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kode_prodi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nama_prodi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "addProdi", propOrder = {
    "kodeProdi",
    "namaProdi",
    "akreditasi",
    "noSkProdi"
})
public class AddProdi {

    @XmlElement(name = "kode_prodi")
    protected int kodeProdi;
    @XmlElement(name = "nama_prodi")
    protected String namaProdi;
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
