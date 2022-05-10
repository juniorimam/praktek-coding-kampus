
package siakad.kelas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editKelas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editKelas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_kelas_kuliah" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kode_prodi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="semester" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kode_matakuliah" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nama_kelas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dosen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jumlah_peserta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editKelas", propOrder = {
    "idKelasKuliah",
    "kodeProdi",
    "semester",
    "kodeMatakuliah",
    "namaKelas",
    "dosen",
    "jumlahPeserta"
})
public class EditKelas {

    @XmlElement(name = "id_kelas_kuliah")
    protected int idKelasKuliah;
    @XmlElement(name = "kode_prodi")
    protected int kodeProdi;
    protected String semester;
    @XmlElement(name = "kode_matakuliah")
    protected int kodeMatakuliah;
    @XmlElement(name = "nama_kelas")
    protected String namaKelas;
    protected String dosen;
    @XmlElement(name = "jumlah_peserta")
    protected int jumlahPeserta;

    /**
     * Gets the value of the idKelasKuliah property.
     * 
     */
    public int getIdKelasKuliah() {
        return idKelasKuliah;
    }

    /**
     * Sets the value of the idKelasKuliah property.
     * 
     */
    public void setIdKelasKuliah(int value) {
        this.idKelasKuliah = value;
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
     * Gets the value of the semester property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemester() {
        return semester;
    }

    /**
     * Sets the value of the semester property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemester(String value) {
        this.semester = value;
    }

    /**
     * Gets the value of the kodeMatakuliah property.
     * 
     */
    public int getKodeMatakuliah() {
        return kodeMatakuliah;
    }

    /**
     * Sets the value of the kodeMatakuliah property.
     * 
     */
    public void setKodeMatakuliah(int value) {
        this.kodeMatakuliah = value;
    }

    /**
     * Gets the value of the namaKelas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaKelas() {
        return namaKelas;
    }

    /**
     * Sets the value of the namaKelas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaKelas(String value) {
        this.namaKelas = value;
    }

    /**
     * Gets the value of the dosen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosen() {
        return dosen;
    }

    /**
     * Sets the value of the dosen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosen(String value) {
        this.dosen = value;
    }

    /**
     * Gets the value of the jumlahPeserta property.
     * 
     */
    public int getJumlahPeserta() {
        return jumlahPeserta;
    }

    /**
     * Sets the value of the jumlahPeserta property.
     * 
     */
    public void setJumlahPeserta(int value) {
        this.jumlahPeserta = value;
    }

}
