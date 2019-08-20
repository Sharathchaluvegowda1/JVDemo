
package abi.sbs.codedvaluelist.cvl_authdi_ind;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVL_AUTHDI_IND.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVL_AUTHDI_IND"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Authorization"/&gt;
 *     &lt;enumeration value="Debt Instrument"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CVL_AUTHDI_IND", namespace = "http://abi/sbs/CodedValueList/CVL_AUTHDI_IND")
@XmlEnum
public enum CVLAUTHDIIND {

    @XmlEnumValue("Authorization")
    AUTHORIZATION("Authorization"),
    @XmlEnumValue("Debt Instrument")
    DEBT_INSTRUMENT("Debt Instrument");
    private final String value;

    CVLAUTHDIIND(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CVLAUTHDIIND fromValue(String v) {
        for (CVLAUTHDIIND c: CVLAUTHDIIND.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
