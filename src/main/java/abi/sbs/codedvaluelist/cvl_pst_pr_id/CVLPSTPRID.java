
package abi.sbs.codedvaluelist.cvl_pst_pr_id;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVL_PST_PR_ID.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVL_PST_PR_ID"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="J"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CVL_PST_PR_ID", namespace = "http://abi/sbs/CodedValueList/CVL_PST_PR_ID")
@XmlEnum
public enum CVLPSTPRID {

    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H,
    I,
    J,
    K,
    L,
    M,
    N,
    O,
    P;

    public String value() {
        return name();
    }

    public static CVLPSTPRID fromValue(String v) {
        return valueOf(v);
    }

}
