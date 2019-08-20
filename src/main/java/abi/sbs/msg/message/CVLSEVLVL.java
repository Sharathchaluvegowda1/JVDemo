
package abi.sbs.msg.message;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVL_SEV_LVL.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVL_SEV_LVL"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Information"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Severe"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CVL_SEV_LVL")
@XmlEnum
public enum CVLSEVLVL {

    @XmlEnumValue("Information")
    INFORMATION("Information"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Severe")
    SEVERE("Severe");
    private final String value;

    CVLSEVLVL(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CVLSEVLVL fromValue(String v) {
        for (CVLSEVLVL c: CVLSEVLVL.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
