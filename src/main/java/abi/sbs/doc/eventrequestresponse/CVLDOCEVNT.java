
package abi.sbs.doc.eventrequestresponse;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVL_DOC_EVNT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVL_DOC_EVNT"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Phase Change"/&gt;
 *     &lt;enumeration value="Status Change"/&gt;
 *     &lt;enumeration value="Other Event"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CVL_DOC_EVNT")
@XmlEnum
public enum CVLDOCEVNT {

    @XmlEnumValue("Phase Change")
    PHASE_CHANGE("Phase Change"),
    @XmlEnumValue("Status Change")
    STATUS_CHANGE("Status Change"),
    @XmlEnumValue("Other Event")
    OTHER_EVENT("Other Event");
    private final String value;

    CVLDOCEVNT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CVLDOCEVNT fromValue(String v) {
        for (CVLDOCEVNT c: CVLDOCEVNT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
