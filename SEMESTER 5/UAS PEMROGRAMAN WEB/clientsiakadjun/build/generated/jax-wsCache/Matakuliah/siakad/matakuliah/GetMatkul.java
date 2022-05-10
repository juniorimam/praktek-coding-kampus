
package siakad.matakuliah;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMatkul complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMatkul">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kode_matakuliah" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMatkul", propOrder = {
    "kodeMatakuliah"
})
public class GetMatkul {

    @XmlElement(name = "kode_matakuliah")
    protected int kodeMatakuliah;

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

}
