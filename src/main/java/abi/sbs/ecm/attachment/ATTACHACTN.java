
package abi.sbs.ecm.attachment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATTACH_ACTN.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATTACH_ACTN"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Import"/&gt;
 *     &lt;enumeration value="Remove"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATTACH_ACTN")
@XmlEnum
public enum ATTACHACTN {

    @XmlEnumValue("Import")
    IMPORT("Import"),
    @XmlEnumValue("Remove")
    REMOVE("Remove");
    private final String value;

    ATTACHACTN(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ATTACHACTN fromValue(String v) {
        for (ATTACHACTN c: ATTACHACTN.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
