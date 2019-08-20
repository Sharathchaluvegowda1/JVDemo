
package abi.sbs.codedvaluelist.cvl_doc_func_cd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVL_DOC_FUNC_CD.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVL_DOC_FUNC_CD"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cancellation"/&gt;
 *     &lt;enumeration value="New"/&gt;
 *     &lt;enumeration value="Modification"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CVL_DOC_FUNC_CD", namespace = "http://abi/sbs/CodedValueList/CVL_DOC_FUNC_CD")
@XmlEnum
public enum CVLDOCFUNCCD {

    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Modification")
    MODIFICATION("Modification");
    private final String value;

    CVLDOCFUNCCD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CVLDOCFUNCCD fromValue(String v) {
        for (CVLDOCFUNCCD c: CVLDOCFUNCCD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
