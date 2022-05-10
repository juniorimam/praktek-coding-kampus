
package siakad.mahasiswa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editMahasiswa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editMahasiswa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nik" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nim" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kode_prodi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="angkatan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempat_lahir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tanggal_lahir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jenis_kelamin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nama_ibu_kandung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nisn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="npwp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kewarganegaraan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jalan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dusun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kelurahan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kecamatan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodepos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="telepon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editMahasiswa", propOrder = {
    "nik",
    "nim",
    "kodeProdi",
    "angkatan",
    "nama",
    "tempatLahir",
    "tanggalLahir",
    "jenisKelamin",
    "agama",
    "namaIbuKandung",
    "nisn",
    "npwp",
    "kewarganegaraan",
    "jalan",
    "dusun",
    "rt",
    "rw",
    "kelurahan",
    "kecamatan",
    "kodepos",
    "telepon",
    "hp",
    "email"
})
public class EditMahasiswa {

    protected int nik;
    protected int nim;
    @XmlElement(name = "kode_prodi")
    protected int kodeProdi;
    protected int angkatan;
    protected String nama;
    @XmlElement(name = "tempat_lahir")
    protected String tempatLahir;
    @XmlElement(name = "tanggal_lahir")
    protected String tanggalLahir;
    @XmlElement(name = "jenis_kelamin")
    protected String jenisKelamin;
    protected String agama;
    @XmlElement(name = "nama_ibu_kandung")
    protected String namaIbuKandung;
    protected int nisn;
    protected int npwp;
    protected String kewarganegaraan;
    protected String jalan;
    protected String dusun;
    protected String rt;
    protected String rw;
    protected String kelurahan;
    protected String kecamatan;
    protected int kodepos;
    protected String telepon;
    protected String hp;
    protected String email;

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
     * Gets the value of the angkatan property.
     * 
     */
    public int getAngkatan() {
        return angkatan;
    }

    /**
     * Sets the value of the angkatan property.
     * 
     */
    public void setAngkatan(int value) {
        this.angkatan = value;
    }

    /**
     * Gets the value of the nama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNama() {
        return nama;
    }

    /**
     * Sets the value of the nama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNama(String value) {
        this.nama = value;
    }

    /**
     * Gets the value of the tempatLahir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempatLahir() {
        return tempatLahir;
    }

    /**
     * Sets the value of the tempatLahir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempatLahir(String value) {
        this.tempatLahir = value;
    }

    /**
     * Gets the value of the tanggalLahir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * Sets the value of the tanggalLahir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalLahir(String value) {
        this.tanggalLahir = value;
    }

    /**
     * Gets the value of the jenisKelamin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * Sets the value of the jenisKelamin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJenisKelamin(String value) {
        this.jenisKelamin = value;
    }

    /**
     * Gets the value of the agama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgama() {
        return agama;
    }

    /**
     * Sets the value of the agama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgama(String value) {
        this.agama = value;
    }

    /**
     * Gets the value of the namaIbuKandung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaIbuKandung() {
        return namaIbuKandung;
    }

    /**
     * Sets the value of the namaIbuKandung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaIbuKandung(String value) {
        this.namaIbuKandung = value;
    }

    /**
     * Gets the value of the nisn property.
     * 
     */
    public int getNisn() {
        return nisn;
    }

    /**
     * Sets the value of the nisn property.
     * 
     */
    public void setNisn(int value) {
        this.nisn = value;
    }

    /**
     * Gets the value of the npwp property.
     * 
     */
    public int getNpwp() {
        return npwp;
    }

    /**
     * Sets the value of the npwp property.
     * 
     */
    public void setNpwp(int value) {
        this.npwp = value;
    }

    /**
     * Gets the value of the kewarganegaraan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    /**
     * Sets the value of the kewarganegaraan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKewarganegaraan(String value) {
        this.kewarganegaraan = value;
    }

    /**
     * Gets the value of the jalan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJalan() {
        return jalan;
    }

    /**
     * Sets the value of the jalan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJalan(String value) {
        this.jalan = value;
    }

    /**
     * Gets the value of the dusun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDusun() {
        return dusun;
    }

    /**
     * Sets the value of the dusun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDusun(String value) {
        this.dusun = value;
    }

    /**
     * Gets the value of the rt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRt() {
        return rt;
    }

    /**
     * Sets the value of the rt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRt(String value) {
        this.rt = value;
    }

    /**
     * Gets the value of the rw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRw() {
        return rw;
    }

    /**
     * Sets the value of the rw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRw(String value) {
        this.rw = value;
    }

    /**
     * Gets the value of the kelurahan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKelurahan() {
        return kelurahan;
    }

    /**
     * Sets the value of the kelurahan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKelurahan(String value) {
        this.kelurahan = value;
    }

    /**
     * Gets the value of the kecamatan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKecamatan() {
        return kecamatan;
    }

    /**
     * Sets the value of the kecamatan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKecamatan(String value) {
        this.kecamatan = value;
    }

    /**
     * Gets the value of the kodepos property.
     * 
     */
    public int getKodepos() {
        return kodepos;
    }

    /**
     * Sets the value of the kodepos property.
     * 
     */
    public void setKodepos(int value) {
        this.kodepos = value;
    }

    /**
     * Gets the value of the telepon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelepon() {
        return telepon;
    }

    /**
     * Sets the value of the telepon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelepon(String value) {
        this.telepon = value;
    }

    /**
     * Gets the value of the hp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHp() {
        return hp;
    }

    /**
     * Sets the value of the hp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHp(String value) {
        this.hp = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
