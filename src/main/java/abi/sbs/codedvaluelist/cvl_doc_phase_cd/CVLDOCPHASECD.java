
package abi.sbs.codedvaluelist.cvl_doc_phase_cd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVL_DOC_PHASE_CD.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVL_DOC_PHASE_CD"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Conflict Draft"/&gt;
 *     &lt;enumeration value="Draft"/&gt;
 *     &lt;enumeration value="Historical (Final)"/&gt;
 *     &lt;enumeration value="Final"/&gt;
 *     &lt;enumeration value="No Phase"/&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Template"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CVL_DOC_PHASE_CD", namespace = "http://abi/sbs/CodedValueList/CVL_DOC_PHASE_CD")
@XmlEnum
public enum CVLDOCPHASECD {

    @XmlEnumValue("Conflict Draft")
    CONFLICT_DRAFT("Conflict Draft"),
    @XmlEnumValue("Draft")
    DRAFT("Draft"),
    @XmlEnumValue("Historical (Final)")
    HISTORICAL_FINAL("Historical (Final)"),
    @XmlEnumValue("Final")
    FINAL("Final"),
    @XmlEnumValue("No Phase")
    NO_PHASE("No Phase"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Template")
    TEMPLATE("Template");
    private final String value;

    CVLDOCPHASECD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CVLDOCPHASECD fromValue(String v) {
        for (CVLDOCPHASECD c: CVLDOCPHASECD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
