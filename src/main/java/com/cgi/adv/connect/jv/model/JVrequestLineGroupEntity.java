package com.cgi.adv.connect.jv.model;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class JVrequestLineGroupEntity  {
  
  @ApiModelProperty(value = "")
  private Date transactionCreationDate = null;

  @ApiModelProperty(value = "")
  private String eventType = null;


@XmlType(name="PostingPairEnum")
@XmlEnum(String.class)
public enum PostingPairEnum {

@XmlEnumValue("A") A(String.valueOf("A")), @XmlEnumValue("B") B(String.valueOf("B")), @XmlEnumValue("C") C(String.valueOf("C")), @XmlEnumValue("D") D(String.valueOf("D")), @XmlEnumValue("E") E(String.valueOf("E")), @XmlEnumValue("F") F(String.valueOf("F")), @XmlEnumValue("G") G(String.valueOf("G")), @XmlEnumValue("H") H(String.valueOf("H")), @XmlEnumValue("I") I(String.valueOf("I")), @XmlEnumValue("J") J(String.valueOf("J")), @XmlEnumValue("K") K(String.valueOf("K")), @XmlEnumValue("L") L(String.valueOf("L")), @XmlEnumValue("M") M(String.valueOf("M")), @XmlEnumValue("N") N(String.valueOf("N")), @XmlEnumValue("O") O(String.valueOf("O")), @XmlEnumValue("P") P(String.valueOf("P"));


    private String value;

    PostingPairEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PostingPairEnum fromValue(String v) {
        for (PostingPairEnum b : PostingPairEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private PostingPairEnum postingPair = null;

  @ApiModelProperty(value = "")
  private Long referenceType = null;

  @ApiModelProperty(value = "")
  private Integer referencedLineOpenAmount = null;

  @ApiModelProperty(value = "")
  private String referencedTransactionCode = null;

  @ApiModelProperty(value = "")
  private String referencedTransactionDepartment = null;

  @ApiModelProperty(value = "")
  private String referencedTransactionID = null;

  @ApiModelProperty(value = "")
  private Long referencedTransactionVersion = null;

  @ApiModelProperty(value = "")
  private Long referencedVendorLine = null;

  @ApiModelProperty(value = "")
  private Long referencedCommodityLine = null;

  @ApiModelProperty(value = "")
  private Long referencedAccountingLine = null;

  @ApiModelProperty(value = "")
  private Long refAmendment = null;

  @ApiModelProperty(value = "")
  private String vendorCustomer = null;

  @ApiModelProperty(value = "")
  private String aliasOrDBA = null;

  @ApiModelProperty(value = "")
  private String addressLine1 = null;

  @ApiModelProperty(value = "")
  private String addressLine2 = null;

  @ApiModelProperty(value = "")
  private String city = null;

  @ApiModelProperty(value = "")
  private String state = null;

  @ApiModelProperty(value = "")
  private String zip = null;

  @ApiModelProperty(value = "")
  private String country = null;

  @ApiModelProperty(value = "")
  private String vendorContactPhone = null;

  @ApiModelProperty(value = "")
  private String vendorContactPhoneExtension = null;

  @ApiModelProperty(value = "")
  private String fax = null;

  @ApiModelProperty(value = "")
  private String faxExtension = null;

  @ApiModelProperty(value = "")
  private String vendorContactEmail = null;

  @ApiModelProperty(value = "")
  private String vendorContactName = null;

  @ApiModelProperty(value = "")
  private String lineGroupDescription = null;

  @ApiModelProperty(value = "")
  private Long performanceUnits = null;

  @ApiModelProperty(value = "")
  private String unitOfMeasure = null;

  @ApiModelProperty(value = "")
  private Long transactionLineGroupLineNumber = null;

  @ApiModelProperty(value = "")
  private Long transactionChildMaximumLineNumber = null;

  @ApiModelProperty(value = "")
  private Long lineGroup = null;

  @ApiModelProperty(value = "")
  private String fund = null;

  @ApiModelProperty(value = "")
  private String subFund = null;

  @ApiModelProperty(value = "")
  private String department = null;

  @ApiModelProperty(value = "")
  private String unit = null;

  @ApiModelProperty(value = "")
  private String subUnit = null;

  @ApiModelProperty(value = "")
  private String apprUnit = null;

  @ApiModelProperty(value = "")
  private String location = null;

  @ApiModelProperty(value = "")
  private String subLocation = null;

  @ApiModelProperty(value = "")
  private String county1 = null;

  @ApiModelProperty(value = "")
  private String activity = null;

  @ApiModelProperty(value = "")
  private String subActivity = null;

  @ApiModelProperty(value = "")
  private String function = null;

  @ApiModelProperty(value = "")
  private String subFunction = null;

  @ApiModelProperty(value = "")
  private String object = null;

  @ApiModelProperty(value = "")
  private String subObject = null;

  @ApiModelProperty(value = "")
  private String revenue = null;

  @ApiModelProperty(value = "")
  private String subRevenue = null;

  @ApiModelProperty(value = "")
  private String bsa = null;

  @ApiModelProperty(value = "")
  private String subBSA = null;

  @ApiModelProperty(value = "")
  private String obsa = null;

  @ApiModelProperty(value = "")
  private String subOBSA = null;

  @ApiModelProperty(value = "")
  private String deptObject = null;

  @ApiModelProperty(value = "")
  private String deptRevenue = null;

  @ApiModelProperty(value = "")
  private String internalFund = null;

  @ApiModelProperty(value = "")
  private String internalSubFund = null;

  @ApiModelProperty(value = "")
  private String internalDept = null;

  @ApiModelProperty(value = "")
  private String reporting = null;

  @ApiModelProperty(value = "")
  private String subReporting = null;

  @ApiModelProperty(value = "")
  private String task = null;

  @ApiModelProperty(value = "")
  private String subTask = null;

  @ApiModelProperty(value = "")
  private String taskOrder = null;

  @ApiModelProperty(value = "")
  private String program = null;

  @ApiModelProperty(value = "")
  private String phase = null;

  @ApiModelProperty(value = "")
  private String programPeriod = null;

  @ApiModelProperty(value = "")
  private String addressCode = null;

  @ApiModelProperty(value = "")
  private String vendorContactID = null;

  @ApiModelProperty(value = "")
  private String taxpayerID = null;

  @ApiModelProperty(value = "")
  private String debtID = null;

  @ApiModelProperty(value = "")
  private String authorizationDebtInstrument = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<JVrequestAccountingEntity> jvrequestAccountingEntity = null;
 /**
   * Get transactionCreationDate
   * @return transactionCreationDate
  **/
  @JsonProperty("transactionCreationDate")
  public Date getTransactionCreationDate() {
    return transactionCreationDate;
  }

  public void setTransactionCreationDate(Date transactionCreationDate) {
    this.transactionCreationDate = transactionCreationDate;
  }

  public JVrequestLineGroupEntity transactionCreationDate(Date transactionCreationDate) {
    this.transactionCreationDate = transactionCreationDate;
    return this;
  }

 /**
   * Get eventType
   * @return eventType
  **/
  @JsonProperty("eventType")
 @Size(max=4)  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public JVrequestLineGroupEntity eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

 /**
   * Get postingPair
   * @return postingPair
  **/
  @JsonProperty("postingPair")
  public String getPostingPair() {
    if (postingPair == null) {
      return null;
    }
    return postingPair.value();
  }

  public void setPostingPair(PostingPairEnum postingPair) {
    this.postingPair = postingPair;
  }

  public JVrequestLineGroupEntity postingPair(PostingPairEnum postingPair) {
    this.postingPair = postingPair;
    return this;
  }

 /**
   * Get referenceType
   * @return referenceType
  **/
  @JsonProperty("referenceType")
  public Long getReferenceType() {
    return referenceType;
  }

  public void setReferenceType(Long referenceType) {
    this.referenceType = referenceType;
  }

  public JVrequestLineGroupEntity referenceType(Long referenceType) {
    this.referenceType = referenceType;
    return this;
  }

 /**
   * Get referencedLineOpenAmount
   * @return referencedLineOpenAmount
  **/
  @JsonProperty("referencedLineOpenAmount")
  public Integer getReferencedLineOpenAmount() {
    return referencedLineOpenAmount;
  }

  public void setReferencedLineOpenAmount(Integer referencedLineOpenAmount) {
    this.referencedLineOpenAmount = referencedLineOpenAmount;
  }

  public JVrequestLineGroupEntity referencedLineOpenAmount(Integer referencedLineOpenAmount) {
    this.referencedLineOpenAmount = referencedLineOpenAmount;
    return this;
  }

 /**
   * Get referencedTransactionCode
   * @return referencedTransactionCode
  **/
  @JsonProperty("referencedTransactionCode")
  public String getReferencedTransactionCode() {
    return referencedTransactionCode;
  }

  public void setReferencedTransactionCode(String referencedTransactionCode) {
    this.referencedTransactionCode = referencedTransactionCode;
  }

  public JVrequestLineGroupEntity referencedTransactionCode(String referencedTransactionCode) {
    this.referencedTransactionCode = referencedTransactionCode;
    return this;
  }

 /**
   * Get referencedTransactionDepartment
   * @return referencedTransactionDepartment
  **/
  @JsonProperty("referencedTransactionDepartment")
  public String getReferencedTransactionDepartment() {
    return referencedTransactionDepartment;
  }

  public void setReferencedTransactionDepartment(String referencedTransactionDepartment) {
    this.referencedTransactionDepartment = referencedTransactionDepartment;
  }

  public JVrequestLineGroupEntity referencedTransactionDepartment(String referencedTransactionDepartment) {
    this.referencedTransactionDepartment = referencedTransactionDepartment;
    return this;
  }

 /**
   * Get referencedTransactionID
   * @return referencedTransactionID
  **/
  @JsonProperty("referencedTransactionID")
  public String getReferencedTransactionID() {
    return referencedTransactionID;
  }

  public void setReferencedTransactionID(String referencedTransactionID) {
    this.referencedTransactionID = referencedTransactionID;
  }

  public JVrequestLineGroupEntity referencedTransactionID(String referencedTransactionID) {
    this.referencedTransactionID = referencedTransactionID;
    return this;
  }

 /**
   * Get referencedTransactionVersion
   * @return referencedTransactionVersion
  **/
  @JsonProperty("referencedTransactionVersion")
  public Long getReferencedTransactionVersion() {
    return referencedTransactionVersion;
  }

  public void setReferencedTransactionVersion(Long referencedTransactionVersion) {
    this.referencedTransactionVersion = referencedTransactionVersion;
  }

  public JVrequestLineGroupEntity referencedTransactionVersion(Long referencedTransactionVersion) {
    this.referencedTransactionVersion = referencedTransactionVersion;
    return this;
  }

 /**
   * Get referencedVendorLine
   * @return referencedVendorLine
  **/
  @JsonProperty("referencedVendorLine")
  public Long getReferencedVendorLine() {
    return referencedVendorLine;
  }

  public void setReferencedVendorLine(Long referencedVendorLine) {
    this.referencedVendorLine = referencedVendorLine;
  }

  public JVrequestLineGroupEntity referencedVendorLine(Long referencedVendorLine) {
    this.referencedVendorLine = referencedVendorLine;
    return this;
  }

 /**
   * Get referencedCommodityLine
   * @return referencedCommodityLine
  **/
  @JsonProperty("referencedCommodityLine")
  public Long getReferencedCommodityLine() {
    return referencedCommodityLine;
  }

  public void setReferencedCommodityLine(Long referencedCommodityLine) {
    this.referencedCommodityLine = referencedCommodityLine;
  }

  public JVrequestLineGroupEntity referencedCommodityLine(Long referencedCommodityLine) {
    this.referencedCommodityLine = referencedCommodityLine;
    return this;
  }

 /**
   * Get referencedAccountingLine
   * @return referencedAccountingLine
  **/
  @JsonProperty("referencedAccountingLine")
  public Long getReferencedAccountingLine() {
    return referencedAccountingLine;
  }

  public void setReferencedAccountingLine(Long referencedAccountingLine) {
    this.referencedAccountingLine = referencedAccountingLine;
  }

  public JVrequestLineGroupEntity referencedAccountingLine(Long referencedAccountingLine) {
    this.referencedAccountingLine = referencedAccountingLine;
    return this;
  }

 /**
   * Get refAmendment
   * @return refAmendment
  **/
  @JsonProperty("refAmendment")
  public Long getRefAmendment() {
    return refAmendment;
  }

  public void setRefAmendment(Long refAmendment) {
    this.refAmendment = refAmendment;
  }

  public JVrequestLineGroupEntity refAmendment(Long refAmendment) {
    this.refAmendment = refAmendment;
    return this;
  }

 /**
   * Get vendorCustomer
   * @return vendorCustomer
  **/
  @JsonProperty("vendorCustomer")
 @Size(max=20)  public String getVendorCustomer() {
    return vendorCustomer;
  }

  public void setVendorCustomer(String vendorCustomer) {
    this.vendorCustomer = vendorCustomer;
  }

  public JVrequestLineGroupEntity vendorCustomer(String vendorCustomer) {
    this.vendorCustomer = vendorCustomer;
    return this;
  }

 /**
   * Get aliasOrDBA
   * @return aliasOrDBA
  **/
  @JsonProperty("aliasOrDBA")
 @Size(max=20)  public String getAliasOrDBA() {
    return aliasOrDBA;
  }

  public void setAliasOrDBA(String aliasOrDBA) {
    this.aliasOrDBA = aliasOrDBA;
  }

  public JVrequestLineGroupEntity aliasOrDBA(String aliasOrDBA) {
    this.aliasOrDBA = aliasOrDBA;
    return this;
  }

 /**
   * Get addressLine1
   * @return addressLine1
  **/
  @JsonProperty("addressLine1")
 @Size(max=100)  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public JVrequestLineGroupEntity addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

 /**
   * Get addressLine2
   * @return addressLine2
  **/
  @JsonProperty("addressLine2")
 @Size(max=100)  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public JVrequestLineGroupEntity addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

 /**
   * Get city
   * @return city
  **/
  @JsonProperty("city")
 @Size(max=60)  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public JVrequestLineGroupEntity city(String city) {
    this.city = city;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
 @Size(max=2)  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public JVrequestLineGroupEntity state(String state) {
    this.state = state;
    return this;
  }

 /**
   * Get zip
   * @return zip
  **/
  @JsonProperty("zip")
 @Size(max=10)  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public JVrequestLineGroupEntity zip(String zip) {
    this.zip = zip;
    return this;
  }

 /**
   * Get country
   * @return country
  **/
  @JsonProperty("country")
 @Size(max=3)  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public JVrequestLineGroupEntity country(String country) {
    this.country = country;
    return this;
  }

 /**
   * Get vendorContactPhone
   * @return vendorContactPhone
  **/
  @JsonProperty("vendorContactPhone")
 @Size(max=12)  public String getVendorContactPhone() {
    return vendorContactPhone;
  }

  public void setVendorContactPhone(String vendorContactPhone) {
    this.vendorContactPhone = vendorContactPhone;
  }

  public JVrequestLineGroupEntity vendorContactPhone(String vendorContactPhone) {
    this.vendorContactPhone = vendorContactPhone;
    return this;
  }

 /**
   * Get vendorContactPhoneExtension
   * @return vendorContactPhoneExtension
  **/
  @JsonProperty("vendorContactPhoneExtension")
  public String getVendorContactPhoneExtension() {
    return vendorContactPhoneExtension;
  }

  public void setVendorContactPhoneExtension(String vendorContactPhoneExtension) {
    this.vendorContactPhoneExtension = vendorContactPhoneExtension;
  }

  public JVrequestLineGroupEntity vendorContactPhoneExtension(String vendorContactPhoneExtension) {
    this.vendorContactPhoneExtension = vendorContactPhoneExtension;
    return this;
  }

 /**
   * Get fax
   * @return fax
  **/
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public JVrequestLineGroupEntity fax(String fax) {
    this.fax = fax;
    return this;
  }

 /**
   * Get faxExtension
   * @return faxExtension
  **/
  @JsonProperty("faxExtension")
  public String getFaxExtension() {
    return faxExtension;
  }

  public void setFaxExtension(String faxExtension) {
    this.faxExtension = faxExtension;
  }

  public JVrequestLineGroupEntity faxExtension(String faxExtension) {
    this.faxExtension = faxExtension;
    return this;
  }

 /**
   * Get vendorContactEmail
   * @return vendorContactEmail
  **/
  @JsonProperty("vendorContactEmail")
 @Size(max=100)  public String getVendorContactEmail() {
    return vendorContactEmail;
  }

  public void setVendorContactEmail(String vendorContactEmail) {
    this.vendorContactEmail = vendorContactEmail;
  }

  public JVrequestLineGroupEntity vendorContactEmail(String vendorContactEmail) {
    this.vendorContactEmail = vendorContactEmail;
    return this;
  }

 /**
   * Get vendorContactName
   * @return vendorContactName
  **/
  @JsonProperty("vendorContactName")
 @Size(max=60)  public String getVendorContactName() {
    return vendorContactName;
  }

  public void setVendorContactName(String vendorContactName) {
    this.vendorContactName = vendorContactName;
  }

  public JVrequestLineGroupEntity vendorContactName(String vendorContactName) {
    this.vendorContactName = vendorContactName;
    return this;
  }

 /**
   * Get lineGroupDescription
   * @return lineGroupDescription
  **/
  @JsonProperty("lineGroupDescription")
  public String getLineGroupDescription() {
    return lineGroupDescription;
  }

  public void setLineGroupDescription(String lineGroupDescription) {
    this.lineGroupDescription = lineGroupDescription;
  }

  public JVrequestLineGroupEntity lineGroupDescription(String lineGroupDescription) {
    this.lineGroupDescription = lineGroupDescription;
    return this;
  }

 /**
   * Get performanceUnits
   * @return performanceUnits
  **/
  @JsonProperty("performanceUnits")
  public Long getPerformanceUnits() {
    return performanceUnits;
  }

  public void setPerformanceUnits(Long performanceUnits) {
    this.performanceUnits = performanceUnits;
  }

  public JVrequestLineGroupEntity performanceUnits(Long performanceUnits) {
    this.performanceUnits = performanceUnits;
    return this;
  }

 /**
   * Get unitOfMeasure
   * @return unitOfMeasure
  **/
  @JsonProperty("unitOfMeasure")
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public JVrequestLineGroupEntity unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

 /**
   * Get transactionLineGroupLineNumber
   * @return transactionLineGroupLineNumber
  **/
  @JsonProperty("transactionLineGroupLineNumber")
  public Long getTransactionLineGroupLineNumber() {
    return transactionLineGroupLineNumber;
  }

  public void setTransactionLineGroupLineNumber(Long transactionLineGroupLineNumber) {
    this.transactionLineGroupLineNumber = transactionLineGroupLineNumber;
  }

  public JVrequestLineGroupEntity transactionLineGroupLineNumber(Long transactionLineGroupLineNumber) {
    this.transactionLineGroupLineNumber = transactionLineGroupLineNumber;
    return this;
  }

 /**
   * Get transactionChildMaximumLineNumber
   * @return transactionChildMaximumLineNumber
  **/
  @JsonProperty("transactionChildMaximumLineNumber")
  public Long getTransactionChildMaximumLineNumber() {
    return transactionChildMaximumLineNumber;
  }

  public void setTransactionChildMaximumLineNumber(Long transactionChildMaximumLineNumber) {
    this.transactionChildMaximumLineNumber = transactionChildMaximumLineNumber;
  }

  public JVrequestLineGroupEntity transactionChildMaximumLineNumber(Long transactionChildMaximumLineNumber) {
    this.transactionChildMaximumLineNumber = transactionChildMaximumLineNumber;
    return this;
  }

 /**
   * Get lineGroup
   * @return lineGroup
  **/
  @JsonProperty("lineGroup")
  public Long getLineGroup() {
    return lineGroup;
  }

  public void setLineGroup(Long lineGroup) {
    this.lineGroup = lineGroup;
  }

  public JVrequestLineGroupEntity lineGroup(Long lineGroup) {
    this.lineGroup = lineGroup;
    return this;
  }

 /**
   * Get fund
   * @return fund
  **/
  @JsonProperty("fund")
 @Size(max=4)  public String getFund() {
    return fund;
  }

  public void setFund(String fund) {
    this.fund = fund;
  }

  public JVrequestLineGroupEntity fund(String fund) {
    this.fund = fund;
    return this;
  }

 /**
   * Get subFund
   * @return subFund
  **/
  @JsonProperty("subFund")
 @Size(max=4)  public String getSubFund() {
    return subFund;
  }

  public void setSubFund(String subFund) {
    this.subFund = subFund;
  }

  public JVrequestLineGroupEntity subFund(String subFund) {
    this.subFund = subFund;
    return this;
  }

 /**
   * Get department
   * @return department
  **/
  @JsonProperty("department")
 @Size(max=4)  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public JVrequestLineGroupEntity department(String department) {
    this.department = department;
    return this;
  }

 /**
   * Get unit
   * @return unit
  **/
  @JsonProperty("unit")
 @Size(max=4)  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public JVrequestLineGroupEntity unit(String unit) {
    this.unit = unit;
    return this;
  }

 /**
   * Get subUnit
   * @return subUnit
  **/
  @JsonProperty("subUnit")
 @Size(max=4)  public String getSubUnit() {
    return subUnit;
  }

  public void setSubUnit(String subUnit) {
    this.subUnit = subUnit;
  }

  public JVrequestLineGroupEntity subUnit(String subUnit) {
    this.subUnit = subUnit;
    return this;
  }

 /**
   * Get apprUnit
   * @return apprUnit
  **/
  @JsonProperty("apprUnit")
 @Size(max=9)  public String getApprUnit() {
    return apprUnit;
  }

  public void setApprUnit(String apprUnit) {
    this.apprUnit = apprUnit;
  }

  public JVrequestLineGroupEntity apprUnit(String apprUnit) {
    this.apprUnit = apprUnit;
    return this;
  }

 /**
   * Get location
   * @return location
  **/
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public JVrequestLineGroupEntity location(String location) {
    this.location = location;
    return this;
  }

 /**
   * Get subLocation
   * @return subLocation
  **/
  @JsonProperty("subLocation")
  public String getSubLocation() {
    return subLocation;
  }

  public void setSubLocation(String subLocation) {
    this.subLocation = subLocation;
  }

  public JVrequestLineGroupEntity subLocation(String subLocation) {
    this.subLocation = subLocation;
    return this;
  }

 /**
   * Get county1
   * @return county1
  **/
  @JsonProperty("county1")
  public String getCounty1() {
    return county1;
  }

  public void setCounty1(String county1) {
    this.county1 = county1;
  }

  public JVrequestLineGroupEntity county1(String county1) {
    this.county1 = county1;
    return this;
  }

 /**
   * Get activity
   * @return activity
  **/
  @JsonProperty("activity")
 @Size(max=4)  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }

  public JVrequestLineGroupEntity activity(String activity) {
    this.activity = activity;
    return this;
  }

 /**
   * Get subActivity
   * @return subActivity
  **/
  @JsonProperty("subActivity")
  public String getSubActivity() {
    return subActivity;
  }

  public void setSubActivity(String subActivity) {
    this.subActivity = subActivity;
  }

  public JVrequestLineGroupEntity subActivity(String subActivity) {
    this.subActivity = subActivity;
    return this;
  }

 /**
   * Get function
   * @return function
  **/
  @JsonProperty("function")
  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }

  public JVrequestLineGroupEntity function(String function) {
    this.function = function;
    return this;
  }

 /**
   * Get subFunction
   * @return subFunction
  **/
  @JsonProperty("subFunction")
  public String getSubFunction() {
    return subFunction;
  }

  public void setSubFunction(String subFunction) {
    this.subFunction = subFunction;
  }

  public JVrequestLineGroupEntity subFunction(String subFunction) {
    this.subFunction = subFunction;
    return this;
  }

 /**
   * Get object
   * @return object
  **/
  @JsonProperty("object")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public JVrequestLineGroupEntity object(String object) {
    this.object = object;
    return this;
  }

 /**
   * Get subObject
   * @return subObject
  **/
  @JsonProperty("subObject")
  public String getSubObject() {
    return subObject;
  }

  public void setSubObject(String subObject) {
    this.subObject = subObject;
  }

  public JVrequestLineGroupEntity subObject(String subObject) {
    this.subObject = subObject;
    return this;
  }

 /**
   * Get revenue
   * @return revenue
  **/
  @JsonProperty("revenue")
  public String getRevenue() {
    return revenue;
  }

  public void setRevenue(String revenue) {
    this.revenue = revenue;
  }

  public JVrequestLineGroupEntity revenue(String revenue) {
    this.revenue = revenue;
    return this;
  }

 /**
   * Get subRevenue
   * @return subRevenue
  **/
  @JsonProperty("subRevenue")
  public String getSubRevenue() {
    return subRevenue;
  }

  public void setSubRevenue(String subRevenue) {
    this.subRevenue = subRevenue;
  }

  public JVrequestLineGroupEntity subRevenue(String subRevenue) {
    this.subRevenue = subRevenue;
    return this;
  }

 /**
   * Get bsa
   * @return bsa
  **/
  @JsonProperty("bsa")
  public String getBsa() {
    return bsa;
  }

  public void setBsa(String bsa) {
    this.bsa = bsa;
  }

  public JVrequestLineGroupEntity bsa(String bsa) {
    this.bsa = bsa;
    return this;
  }

 /**
   * Get subBSA
   * @return subBSA
  **/
  @JsonProperty("subBSA")
  public String getSubBSA() {
    return subBSA;
  }

  public void setSubBSA(String subBSA) {
    this.subBSA = subBSA;
  }

  public JVrequestLineGroupEntity subBSA(String subBSA) {
    this.subBSA = subBSA;
    return this;
  }

 /**
   * Get obsa
   * @return obsa
  **/
  @JsonProperty("obsa")
  public String getObsa() {
    return obsa;
  }

  public void setObsa(String obsa) {
    this.obsa = obsa;
  }

  public JVrequestLineGroupEntity obsa(String obsa) {
    this.obsa = obsa;
    return this;
  }

 /**
   * Get subOBSA
   * @return subOBSA
  **/
  @JsonProperty("subOBSA")
  public String getSubOBSA() {
    return subOBSA;
  }

  public void setSubOBSA(String subOBSA) {
    this.subOBSA = subOBSA;
  }

  public JVrequestLineGroupEntity subOBSA(String subOBSA) {
    this.subOBSA = subOBSA;
    return this;
  }

 /**
   * Get deptObject
   * @return deptObject
  **/
  @JsonProperty("deptObject")
  public String getDeptObject() {
    return deptObject;
  }

  public void setDeptObject(String deptObject) {
    this.deptObject = deptObject;
  }

  public JVrequestLineGroupEntity deptObject(String deptObject) {
    this.deptObject = deptObject;
    return this;
  }

 /**
   * Get deptRevenue
   * @return deptRevenue
  **/
  @JsonProperty("deptRevenue")
  public String getDeptRevenue() {
    return deptRevenue;
  }

  public void setDeptRevenue(String deptRevenue) {
    this.deptRevenue = deptRevenue;
  }

  public JVrequestLineGroupEntity deptRevenue(String deptRevenue) {
    this.deptRevenue = deptRevenue;
    return this;
  }

 /**
   * Get internalFund
   * @return internalFund
  **/
  @JsonProperty("internalFund")
  public String getInternalFund() {
    return internalFund;
  }

  public void setInternalFund(String internalFund) {
    this.internalFund = internalFund;
  }

  public JVrequestLineGroupEntity internalFund(String internalFund) {
    this.internalFund = internalFund;
    return this;
  }

 /**
   * Get internalSubFund
   * @return internalSubFund
  **/
  @JsonProperty("internalSubFund")
  public String getInternalSubFund() {
    return internalSubFund;
  }

  public void setInternalSubFund(String internalSubFund) {
    this.internalSubFund = internalSubFund;
  }

  public JVrequestLineGroupEntity internalSubFund(String internalSubFund) {
    this.internalSubFund = internalSubFund;
    return this;
  }

 /**
   * Get internalDept
   * @return internalDept
  **/
  @JsonProperty("internalDept")
  public String getInternalDept() {
    return internalDept;
  }

  public void setInternalDept(String internalDept) {
    this.internalDept = internalDept;
  }

  public JVrequestLineGroupEntity internalDept(String internalDept) {
    this.internalDept = internalDept;
    return this;
  }

 /**
   * Get reporting
   * @return reporting
  **/
  @JsonProperty("reporting")
  public String getReporting() {
    return reporting;
  }

  public void setReporting(String reporting) {
    this.reporting = reporting;
  }

  public JVrequestLineGroupEntity reporting(String reporting) {
    this.reporting = reporting;
    return this;
  }

 /**
   * Get subReporting
   * @return subReporting
  **/
  @JsonProperty("subReporting")
  public String getSubReporting() {
    return subReporting;
  }

  public void setSubReporting(String subReporting) {
    this.subReporting = subReporting;
  }

  public JVrequestLineGroupEntity subReporting(String subReporting) {
    this.subReporting = subReporting;
    return this;
  }

 /**
   * Get task
   * @return task
  **/
  @JsonProperty("task")
  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public JVrequestLineGroupEntity task(String task) {
    this.task = task;
    return this;
  }

 /**
   * Get subTask
   * @return subTask
  **/
  @JsonProperty("subTask")
  public String getSubTask() {
    return subTask;
  }

  public void setSubTask(String subTask) {
    this.subTask = subTask;
  }

  public JVrequestLineGroupEntity subTask(String subTask) {
    this.subTask = subTask;
    return this;
  }

 /**
   * Get taskOrder
   * @return taskOrder
  **/
  @JsonProperty("taskOrder")
  public String getTaskOrder() {
    return taskOrder;
  }

  public void setTaskOrder(String taskOrder) {
    this.taskOrder = taskOrder;
  }

  public JVrequestLineGroupEntity taskOrder(String taskOrder) {
    this.taskOrder = taskOrder;
    return this;
  }

 /**
   * Get program
   * @return program
  **/
  @JsonProperty("program")
  public String getProgram() {
    return program;
  }

  public void setProgram(String program) {
    this.program = program;
  }

  public JVrequestLineGroupEntity program(String program) {
    this.program = program;
    return this;
  }

 /**
   * Get phase
   * @return phase
  **/
  @JsonProperty("phase")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public JVrequestLineGroupEntity phase(String phase) {
    this.phase = phase;
    return this;
  }

 /**
   * Get programPeriod
   * @return programPeriod
  **/
  @JsonProperty("programPeriod")
  public String getProgramPeriod() {
    return programPeriod;
  }

  public void setProgramPeriod(String programPeriod) {
    this.programPeriod = programPeriod;
  }

  public JVrequestLineGroupEntity programPeriod(String programPeriod) {
    this.programPeriod = programPeriod;
    return this;
  }

 /**
   * Get addressCode
   * @return addressCode
  **/
  @JsonProperty("addressCode")
 @Size(max=20)  public String getAddressCode() {
    return addressCode;
  }

  public void setAddressCode(String addressCode) {
    this.addressCode = addressCode;
  }

  public JVrequestLineGroupEntity addressCode(String addressCode) {
    this.addressCode = addressCode;
    return this;
  }

 /**
   * Get vendorContactID
   * @return vendorContactID
  **/
  @JsonProperty("vendorContactID")
 @Size(max=20)  public String getVendorContactID() {
    return vendorContactID;
  }

  public void setVendorContactID(String vendorContactID) {
    this.vendorContactID = vendorContactID;
  }

  public JVrequestLineGroupEntity vendorContactID(String vendorContactID) {
    this.vendorContactID = vendorContactID;
    return this;
  }

 /**
   * Get taxpayerID
   * @return taxpayerID
  **/
  @JsonProperty("taxpayerID")
 @Size(max=1)  public String getTaxpayerID() {
    return taxpayerID;
  }

  public void setTaxpayerID(String taxpayerID) {
    this.taxpayerID = taxpayerID;
  }

  public JVrequestLineGroupEntity taxpayerID(String taxpayerID) {
    this.taxpayerID = taxpayerID;
    return this;
  }

 /**
   * Get debtID
   * @return debtID
  **/
  @JsonProperty("debtID")
  public String getDebtID() {
    return debtID;
  }

  public void setDebtID(String debtID) {
    this.debtID = debtID;
  }

  public JVrequestLineGroupEntity debtID(String debtID) {
    this.debtID = debtID;
    return this;
  }

 /**
   * Get authorizationDebtInstrument
   * @return authorizationDebtInstrument
  **/
  @JsonProperty("authorizationDebtInstrument")
 @Size(max=1)  public String getAuthorizationDebtInstrument() {
    return authorizationDebtInstrument;
  }

  public void setAuthorizationDebtInstrument(String authorizationDebtInstrument) {
    this.authorizationDebtInstrument = authorizationDebtInstrument;
  }

  public JVrequestLineGroupEntity authorizationDebtInstrument(String authorizationDebtInstrument) {
    this.authorizationDebtInstrument = authorizationDebtInstrument;
    return this;
  }

 /**
   * Get jvrequestAccountingEntity
   * @return jvrequestAccountingEntity
  **/
  @JsonProperty("JVrequestAccountingEntity")
  public List<JVrequestAccountingEntity> getJvrequestAccountingEntity() {
    return jvrequestAccountingEntity;
  }

  public void setJvrequestAccountingEntity(List<JVrequestAccountingEntity> jvrequestAccountingEntity) {
    this.jvrequestAccountingEntity = jvrequestAccountingEntity;
  }

  public JVrequestLineGroupEntity jvrequestAccountingEntity(List<JVrequestAccountingEntity> jvrequestAccountingEntity) {
    this.jvrequestAccountingEntity = jvrequestAccountingEntity;
    return this;
  }

  public JVrequestLineGroupEntity addJvrequestAccountingEntityItem(JVrequestAccountingEntity jvrequestAccountingEntityItem) {
    this.jvrequestAccountingEntity.add(jvrequestAccountingEntityItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JVrequestLineGroupEntity {\n");
    
    sb.append("    transactionCreationDate: ").append(toIndentedString(transactionCreationDate)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    postingPair: ").append(toIndentedString(postingPair)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    referencedLineOpenAmount: ").append(toIndentedString(referencedLineOpenAmount)).append("\n");
    sb.append("    referencedTransactionCode: ").append(toIndentedString(referencedTransactionCode)).append("\n");
    sb.append("    referencedTransactionDepartment: ").append(toIndentedString(referencedTransactionDepartment)).append("\n");
    sb.append("    referencedTransactionID: ").append(toIndentedString(referencedTransactionID)).append("\n");
    sb.append("    referencedTransactionVersion: ").append(toIndentedString(referencedTransactionVersion)).append("\n");
    sb.append("    referencedVendorLine: ").append(toIndentedString(referencedVendorLine)).append("\n");
    sb.append("    referencedCommodityLine: ").append(toIndentedString(referencedCommodityLine)).append("\n");
    sb.append("    referencedAccountingLine: ").append(toIndentedString(referencedAccountingLine)).append("\n");
    sb.append("    refAmendment: ").append(toIndentedString(refAmendment)).append("\n");
    sb.append("    vendorCustomer: ").append(toIndentedString(vendorCustomer)).append("\n");
    sb.append("    aliasOrDBA: ").append(toIndentedString(aliasOrDBA)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    vendorContactPhone: ").append(toIndentedString(vendorContactPhone)).append("\n");
    sb.append("    vendorContactPhoneExtension: ").append(toIndentedString(vendorContactPhoneExtension)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    faxExtension: ").append(toIndentedString(faxExtension)).append("\n");
    sb.append("    vendorContactEmail: ").append(toIndentedString(vendorContactEmail)).append("\n");
    sb.append("    vendorContactName: ").append(toIndentedString(vendorContactName)).append("\n");
    sb.append("    lineGroupDescription: ").append(toIndentedString(lineGroupDescription)).append("\n");
    sb.append("    performanceUnits: ").append(toIndentedString(performanceUnits)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    transactionLineGroupLineNumber: ").append(toIndentedString(transactionLineGroupLineNumber)).append("\n");
    sb.append("    transactionChildMaximumLineNumber: ").append(toIndentedString(transactionChildMaximumLineNumber)).append("\n");
    sb.append("    lineGroup: ").append(toIndentedString(lineGroup)).append("\n");
    sb.append("    fund: ").append(toIndentedString(fund)).append("\n");
    sb.append("    subFund: ").append(toIndentedString(subFund)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    subUnit: ").append(toIndentedString(subUnit)).append("\n");
    sb.append("    apprUnit: ").append(toIndentedString(apprUnit)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    subLocation: ").append(toIndentedString(subLocation)).append("\n");
    sb.append("    county1: ").append(toIndentedString(county1)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    subActivity: ").append(toIndentedString(subActivity)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    subFunction: ").append(toIndentedString(subFunction)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    subObject: ").append(toIndentedString(subObject)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    subRevenue: ").append(toIndentedString(subRevenue)).append("\n");
    sb.append("    bsa: ").append(toIndentedString(bsa)).append("\n");
    sb.append("    subBSA: ").append(toIndentedString(subBSA)).append("\n");
    sb.append("    obsa: ").append(toIndentedString(obsa)).append("\n");
    sb.append("    subOBSA: ").append(toIndentedString(subOBSA)).append("\n");
    sb.append("    deptObject: ").append(toIndentedString(deptObject)).append("\n");
    sb.append("    deptRevenue: ").append(toIndentedString(deptRevenue)).append("\n");
    sb.append("    internalFund: ").append(toIndentedString(internalFund)).append("\n");
    sb.append("    internalSubFund: ").append(toIndentedString(internalSubFund)).append("\n");
    sb.append("    internalDept: ").append(toIndentedString(internalDept)).append("\n");
    sb.append("    reporting: ").append(toIndentedString(reporting)).append("\n");
    sb.append("    subReporting: ").append(toIndentedString(subReporting)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    subTask: ").append(toIndentedString(subTask)).append("\n");
    sb.append("    taskOrder: ").append(toIndentedString(taskOrder)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    programPeriod: ").append(toIndentedString(programPeriod)).append("\n");
    sb.append("    addressCode: ").append(toIndentedString(addressCode)).append("\n");
    sb.append("    vendorContactID: ").append(toIndentedString(vendorContactID)).append("\n");
    sb.append("    taxpayerID: ").append(toIndentedString(taxpayerID)).append("\n");
    sb.append("    debtID: ").append(toIndentedString(debtID)).append("\n");
    sb.append("    authorizationDebtInstrument: ").append(toIndentedString(authorizationDebtInstrument)).append("\n");
    sb.append("    jvrequestAccountingEntity: ").append(toIndentedString(jvrequestAccountingEntity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

