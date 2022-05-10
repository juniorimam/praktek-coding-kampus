
package siakad.kelas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getKelas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getKelas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_kelas_kuliah" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getKelas", propOrder = {
    "idKelasKuliah"
})
public class GetKelas {

    @XmlElement(name = "id_kelas_kuliah")
    protected int idKelasKuliah;

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

}
