
package siakad.matakuliah;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addMatkul complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addMatkul">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kode_matakuliah" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nama_matakuliah" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kode_prodi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jenis_matakuliah" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bobot_matakuliah" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bobot_teori" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bobot_praktikum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMatkul", propOrder = {
    "kodeMatakuliah",
    "namaMatakuliah",
    "kodeProdi",
    "jenisMatakuliah",
    "bobotMatakuliah",
    "bobotTeori",
    "bobotPraktikum"
})
public class AddMatkul {

    @XmlElement(name = "kode_matakuliah")
    protected int kodeMatakuliah;
    @XmlElement(name = "nama_matakuliah")
    protected String namaMatakuliah;
    @XmlElement(name = "kode_prodi")
    protected int kodeProdi;
    @XmlElement(name = "jenis_matakuliah")
    protected String jenisMatakuliah;
    @XmlElement(name = "bobot_matakuliah")
    protected int bobotMatakuliah;
    @XmlElement(name = "bobot_teori")
    protected int bobotTeori;
    @XmlElement(name = "bobot_praktikum")
    protected int bobotPraktikum;

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
     * Gets the value of the namaMatakuliah property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaMatakuliah() {
        return namaMatakuliah;
    }

    /**
     * Sets the value of the namaMatakuliah property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaMatakuliah(String value) {
        this.namaMatakuliah = value;
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
     * Gets the value of the jenisMatakuliah property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJenisMatakuliah() {
        return jenisMatakuliah;
    }

    /**
     * Sets the value of the jenisMatakuliah property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJenisMatakuliah(String value) {
        this.jenisMatakuliah = value;
    }

    /**
     * Gets the value of the bobotMatakuliah property.
     * 
     */
    public int getBobotMatakuliah() {
        return bobotMatakuliah;
    }

    /**
     * Sets the value of the bobotMatakuliah property.
     * 
     */
    public void setBobotMatakuliah(int value) {
        this.bobotMatakuliah = value;
    }

    /**
     * Gets the value of the bobotTeori property.
     * 
     */
    public int getBobotTeori() {
        return bobotTeori;
    }

    /**
     * Sets the value of the bobotTeori property.
     * 
     */
    public void setBobotTeori(int value) {
        this.bobotTeori = value;
    }

    /**
     * Gets the value of the bobotPraktikum property.
     * 
     */
    public int getBobotPraktikum() {
        return bobotPraktikum;
    }

    /**
     * Sets the value of the bobotPraktikum property.
     * 
     */
    public void setBobotPraktikum(int value) {
        this.bobotPraktikum = value;
    }

}
