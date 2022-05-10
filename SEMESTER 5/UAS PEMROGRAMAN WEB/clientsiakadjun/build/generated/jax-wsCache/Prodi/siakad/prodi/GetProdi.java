
package siakad.prodi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProdi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProdi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kode_prodi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProdi", propOrder = {
    "kodeProdi"
})
public class GetProdi {

    @XmlElement(name = "kode_prodi")
    protected int kodeProdi;

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

}
