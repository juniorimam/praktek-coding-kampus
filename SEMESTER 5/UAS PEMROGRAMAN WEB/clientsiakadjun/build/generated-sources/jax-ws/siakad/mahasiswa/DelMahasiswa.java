
package siakad.mahasiswa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delMahasiswa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delMahasiswa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nik" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delMahasiswa", propOrder = {
    "nik"
})
public class DelMahasiswa {

    protected int nik;

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

}
