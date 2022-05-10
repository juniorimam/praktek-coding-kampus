
package siakad.history;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addHistoryPendidikan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addHistoryPendidikan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nim" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nik" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kode_prodi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jenis_pendaftaran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jalur_pendaftaran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tanggal_masuk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perguruan_tinggi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addHistoryPendidikan", propOrder = {
    "nim",
    "nik",
    "kodeProdi",
    "jenisPendaftaran",
    "jalurPendaftaran",
    "tanggalMasuk",
    "perguruanTinggi"
})
public class AddHistoryPendidikan {

    protected int nim;
    protected int nik;
    @XmlElement(name = "kode_prodi")
    protected int kodeProdi;
    @XmlElement(name = "jenis_pendaftaran")
    protected String jenisPendaftaran;
    @XmlElement(name = "jalur_pendaftaran")
    protected String jalurPendaftaran;
    @XmlElement(name = "tanggal_masuk")
    protected String tanggalMasuk;
    @XmlElement(name = "perguruan_tinggi")
    protected String perguruanTinggi;

    /**
     * Gets the value of the nim property.
     * 
     */
    public int getNim() {
        return nim;
    }

    /**
     * Sets the value of the nim property.
     * 
     */
    public void setNim(int value) {
        this.nim = value;
    }

    /**
     * Gets the value of the nik property.
     * 
     */
    public int getNik() {
        return nik;
    }

    /**
     * Sets the value of the nik property.
     * 
     */
    public void setNik(int value) {
        this.nik = value;
    }

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
     * Gets the value of the jenisPendaftaran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJenisPendaftaran() {
        return jenisPendaftaran;
    }

    /**
     * Sets the value of the jenisPendaftaran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJenisPendaftaran(String value) {
        this.jenisPendaftaran = value;
    }

    /**
     * Gets the value of the jalurPendaftaran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJalurPendaftaran() {
        return jalurPendaftaran;
    }

    /**
     * Sets the value of the jalurPendaftaran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJalurPendaftaran(String value) {
        this.jalurPendaftaran = value;
    }

    /**
     * Gets the value of the tanggalMasuk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalMasuk() {
        return tanggalMasuk;
    }

    /**
     * Sets the value of the tanggalMasuk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalMasuk(String value) {
        this.tanggalMasuk = value;
    }

    /**
     * Gets the value of the perguruanTinggi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerguruanTinggi() {
        return perguruanTinggi;
    }

    /**
     * Sets the value of the perguruanTinggi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerguruanTinggi(String value) {
        this.perguruanTinggi = value;
    }

}
