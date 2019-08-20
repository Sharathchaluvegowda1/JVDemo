
package abi.sbs.doc.financial.jv_importdocument;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImportResponse" type="{http://abi/sbs/doc/financial/JV_importDocument}ImportResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseList", propOrder = {
    "importResponse"
})
public class ResponseList {

    @XmlElement(name = "ImportResponse")
    protected List<ImportResponse> importResponse;

    /**
     * Gets the value of the importResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportResponse }
     * 
     * 
     */
    public List<ImportResponse> getImportResponse() {
        if (importResponse == null) {
            importResponse = new ArrayList<ImportResponse>();
        }
        return this.importResponse;
    }

}
