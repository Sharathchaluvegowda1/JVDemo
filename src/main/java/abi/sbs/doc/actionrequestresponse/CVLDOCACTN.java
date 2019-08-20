
package abi.sbs.doc.actionrequestresponse;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVL_DOC_ACTN.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVL_DOC_ACTN"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Activate"/&gt;
 *     &lt;enumeration value="Deactivate"/&gt;
 *     &lt;enumeration value="Archive"/&gt;
 *     &lt;enumeration value="Unarchive"/&gt;
 *     &lt;enumeration value="Edit"/&gt;
 *     &lt;enumeration value="Export"/&gt;
 *     &lt;enumeration value="Discard"/&gt;
 *     &lt;enumeration value="Discard Latest"/&gt;
 *     &lt;enumeration value="Import Latest"/&gt;
 *     &lt;enumeration value="Import"/&gt;
 *     &lt;enumeration value="Validate"/&gt;
 *     &lt;enumeration value="Submit"/&gt;
 *     &lt;enumeration value="Mark Document as Ready"/&gt;
 *     &lt;enumeration value="Mark Document as Held"/&gt;
 *     &lt;enumeration value="Import ECM Attachments"/&gt;
 *     &lt;enumeration value="Export ECM Attachments"/&gt;
 *     &lt;enumeration value="Other Action"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CVL_DOC_ACTN")
@XmlEnum
public enum CVLDOCACTN {

    @XmlEnumValue("Activate")
    ACTIVATE("Activate"),
    @XmlEnumValue("Deactivate")
    DEACTIVATE("Deactivate"),
    @XmlEnumValue("Archive")
    ARCHIVE("Archive"),
    @XmlEnumValue("Unarchive")
    UNARCHIVE("Unarchive"),
    @XmlEnumValue("Edit")
    EDIT("Edit"),
    @XmlEnumValue("Export")
    EXPORT("Export"),
    @XmlEnumValue("Discard")
    DISCARD("Discard"),
    @XmlEnumValue("Discard Latest")
    DISCARD_LATEST("Discard Latest"),
    @XmlEnumValue("Import Latest")
    IMPORT_LATEST("Import Latest"),
    @XmlEnumValue("Import")
    IMPORT("Import"),
    @XmlEnumValue("Validate")
    VALIDATE("Validate"),
    @XmlEnumValue("Submit")
    SUBMIT("Submit"),
    @XmlEnumValue("Mark Document as Ready")
    MARK_DOCUMENT_AS_READY("Mark Document as Ready"),
    @XmlEnumValue("Mark Document as Held")
    MARK_DOCUMENT_AS_HELD("Mark Document as Held"),
    @XmlEnumValue("Import ECM Attachments")
    IMPORT_ECM_ATTACHMENTS("Import ECM Attachments"),
    @XmlEnumValue("Export ECM Attachments")
    EXPORT_ECM_ATTACHMENTS("Export ECM Attachments"),
    @XmlEnumValue("Other Action")
    OTHER_ACTION("Other Action");
    private final String value;

    CVLDOCACTN(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CVLDOCACTN fromValue(String v) {
        for (CVLDOCACTN c: CVLDOCACTN.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
