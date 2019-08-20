
package abi.sbs.doc.exportrequestresponse;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import abi.im.integrationmanager.IntegrationManagerRequestType;


/**
 * <p>Java class for ExportRequestHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportRequestHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocCode" type="{http://abi/sbs/doc/exportRequestResponse}DOC_CD"/&gt;
 *         &lt;element name="Department" type="{http://abi/sbs/doc/exportRequestResponse}DOC_DEPT_CD"/&gt;
 *         &lt;element name="DocID" type="{http://abi/sbs/doc/exportRequestResponse}DOC_ID" minOccurs="0"/&gt;
 *         &lt;element name="DocVersion" type="{http://abi/sbs/doc/exportRequestResponse}DOC_VERS_NO" minOccurs="0"/&gt;
 *         &lt;element name="ExportECMAttachments" type="{http://abi/sbs/doc/exportRequestResponse}DOC_ACTION_FL"/&gt;
 *         &lt;element name="IntegrationManager" type="{http://abi/im/IntegrationManager}IntegrationManagerRequestType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportRequestHeader", propOrder = {
    "docCode",
    "department",
    "docID",
    "docVersion",
    "exportECMAttachments",
    "integrationManager"
})
public class ExportRequestHeader {

    @XmlElement(name = "DocCode", required = true)
    protected String docCode;
    @XmlElement(name = "Department", required = true)
    protected String department;
    @XmlElement(name = "DocID")
    protected String docID;
    @XmlElement(name = "DocVersion")
    protected BigInteger docVersion;
    @XmlElement(name = "ExportECMAttachments", defaultValue = "false")
    protected boolean exportECMAttachments;
    @XmlElement(name = "IntegrationManager")
    protected IntegrationManagerRequestType integrationManager;

    /**
     * Gets the value of the docCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocCode() {
        return docCode;
    }

    /**
     * Sets the value of the docCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocCode(String value) {
        this.docCode = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the docID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocID() {
        return docID;
    }

    /**
     * Sets the value of the docID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocID(String value) {
        this.docID = value;
    }

    /**
     * Gets the value of the docVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocVersion() {
        return docVersion;
    }

    /**
     * Sets the value of the docVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocVersion(BigInteger value) {
        this.docVersion = value;
    }

    /**
     * Gets the value of the exportECMAttachments property.
     * 
     */
    public boolean isExportECMAttachments() {
        return exportECMAttachments;
    }

    /**
     * Sets the value of the exportECMAttachments property.
     * 
     */
    public void setExportECMAttachments(boolean value) {
        this.exportECMAttachments = value;
    }

    /**
     * Gets the value of the integrationManager property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationManagerRequestType }
     *     
     */
    public IntegrationManagerRequestType getIntegrationManager() {
        return integrationManager;
    }

    /**
     * Sets the value of the integrationManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationManagerRequestType }
     *     
     */
    public void setIntegrationManager(IntegrationManagerRequestType value) {
        this.integrationManager = value;
    }

}
