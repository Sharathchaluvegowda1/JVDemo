
package abi.sbs.codedvaluelist.cvl_doc_sta_cd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVL_DOC_STA_CD.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVL_DOC_STA_CD"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ready"/&gt;
 *     &lt;enumeration value="Submitted"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *     &lt;enumeration value="Held"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CVL_DOC_STA_CD", namespace = "http://abi/sbs/CodedValueList/CVL_DOC_STA_CD")
@XmlEnum
public enum CVLDOCSTACD {

    @XmlEnumValue("Ready")
    READY("Ready"),
    @XmlEnumValue("Submitted")
    SUBMITTED("Submitted"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Held")
    HELD("Held");
    private final String value;

    CVLDOCSTACD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CVLDOCSTACD fromValue(String v) {
        for (CVLDOCSTACD c: CVLDOCSTACD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
