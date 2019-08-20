
package abi.sbs.codedvaluelist.cvl_tin_typ;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVL_TIN_TYP.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVL_TIN_TYP"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EIN"/&gt;
 *     &lt;enumeration value="SSN/ITIN/ATIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CVL_TIN_TYP", namespace = "http://abi/sbs/CodedValueList/CVL_TIN_TYP")
@XmlEnum
public enum CVLTINTYP {

    EIN("EIN"),
    @XmlEnumValue("SSN/ITIN/ATIN")
    SSN_ITIN_ATIN("SSN/ITIN/ATIN");
    private final String value;

    CVLTINTYP(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CVLTINTYP fromValue(String v) {
        for (CVLTINTYP c: CVLTINTYP.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
