package com.cgi.adv.connect.jv.model;

import java.util.Date;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class JVrequestAccountingEntity  {
  
  @ApiModelProperty(value = "")
  private Integer accountingLine = null;

  @ApiModelProperty(value = "")
  private Date transactionCreationDate = null;

  @ApiModelProperty(value = "")
  private Integer budgetFY = null;

  @ApiModelProperty(value = "")
  private Integer fiscalYear = null;

  @ApiModelProperty(value = "")
  private String period = null;

  @ApiModelProperty(value = "")
  private Integer fiscalQuarter = null;

  @ApiModelProperty(value = "")
  private Integer creditAmount = null;

  @ApiModelProperty(value = "")
  private String accountingTemplate = null;

  @ApiModelProperty(value = "")
  private Integer lineFunction = null;

  @ApiModelProperty(value = "")
  private String referencedTransactionCode = null;

  @ApiModelProperty(value = "")
  private String referencedTransactionDepartment = null;

  @ApiModelProperty(value = "")
  private String referencedTransactionID = null;

  @ApiModelProperty(value = "")
  private Integer referencedVendorLine = null;

  @ApiModelProperty(value = "")
  private Long referencedCommodityLine = null;

  @ApiModelProperty(value = "")
  private Integer referencedAccountingLine = null;

  @ApiModelProperty(value = "")
  private String vendorOrCustomer = null;

  @ApiModelProperty(value = "")
  private Integer debitAmount = null;

  @ApiModelProperty(value = "")
  private String fund = null;

  @ApiModelProperty(value = "")
  private String subFund = null;

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
  private String governmentBranch = null;

  @ApiModelProperty(value = "")
  private String cabinet = null;

  @ApiModelProperty(value = "")
  private String department = null;

  @ApiModelProperty(value = "")
  private String division = null;

  @ApiModelProperty(value = "")
  private String group = null;

  @ApiModelProperty(value = "")
  private String section = null;

  @ApiModelProperty(value = "")
  private String district = null;

  @ApiModelProperty(value = "")
  private String bureau = null;

  @ApiModelProperty(value = "")
  private String unit = null;

  @ApiModelProperty(value = "")
  private String apprUnit = null;

  @ApiModelProperty(value = "")
  private String location = null;

  @ApiModelProperty(value = "")
  private String subLocation = null;

  @ApiModelProperty(value = "")
  private String county = null;

  @ApiModelProperty(value = "")
  private String activity = null;

  @ApiModelProperty(value = "")
  private String subActivity = null;

  @ApiModelProperty(value = "")
  private String function = null;

  @ApiModelProperty(value = "")
  private String subFunction = null;

  @ApiModelProperty(value = "")
  private String reporting = null;

  @ApiModelProperty(value = "")
  private String subReporting = null;

  @ApiModelProperty(value = "")
  private String deptObject = null;

  @ApiModelProperty(value = "")
  private String deptRevenue = null;

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
  private String fundingProfile = null;

  @ApiModelProperty(value = "")
  private String performanceUnitOfMeasure = null;

  @ApiModelProperty(value = "")
  private String lineDescription = null;

  @ApiModelProperty(value = "")
  private String postingCode = null;

  @ApiModelProperty(value = "")
  private String internalFund = null;

  @ApiModelProperty(value = "")
  private String internalSubFund = null;

  @ApiModelProperty(value = "")
  private String internalDept = null;

  @ApiModelProperty(value = "")
  private Integer lineGroupLineNumber = null;

  @ApiModelProperty(value = "")
  private String subUnit = null;

  @ApiModelProperty(value = "")
  private String bank = null;

  @ApiModelProperty(value = "")
  private String fundingPriority = null;

  @ApiModelProperty(value = "")
  private String fundingLine = null;

  @ApiModelProperty(value = "")
  private Long accountingClassification = null;

  @ApiModelProperty(value = "")
  private Integer quantity = null;

  @ApiModelProperty(value = "")
  private String humanResourceMeasure = null;

  @ApiModelProperty(value = "")
  private Boolean batchLoaded = null;

  @ApiModelProperty(value = "")
  private String debtID = null;

  @ApiModelProperty(value = "")
  private String authorizationDebtInstrument = null;
 /**
   * Get accountingLine
   * @return accountingLine
  **/
  @JsonProperty("accountingLine")
  public Integer getAccountingLine() {
    return accountingLine;
  }

  public void setAccountingLine(Integer accountingLine) {
    this.accountingLine = accountingLine;
  }

  public JVrequestAccountingEntity accountingLine(Integer accountingLine) {
    this.accountingLine = accountingLine;
    return this;
  }

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

  public JVrequestAccountingEntity transactionCreationDate(Date transactionCreationDate) {
    this.transactionCreationDate = transactionCreationDate;
    return this;
  }

 /**
   * Get budgetFY
   * @return budgetFY
  **/
  @JsonProperty("budgetFY")
  public Integer getBudgetFY() {
    return budgetFY;
  }

  public void setBudgetFY(Integer budgetFY) {
    this.budgetFY = budgetFY;
  }

  public JVrequestAccountingEntity budgetFY(Integer budgetFY) {
    this.budgetFY = budgetFY;
    return this;
  }

 /**
   * Get fiscalYear
   * @return fiscalYear
  **/
  @JsonProperty("fiscalYear")
  public Integer getFiscalYear() {
    return fiscalYear;
  }

  public void setFiscalYear(Integer fiscalYear) {
    this.fiscalYear = fiscalYear;
  }

  public JVrequestAccountingEntity fiscalYear(Integer fiscalYear) {
    this.fiscalYear = fiscalYear;
    return this;
  }

 /**
   * Get period
   * @return period
  **/
  @JsonProperty("period")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public JVrequestAccountingEntity period(String period) {
    this.period = period;
    return this;
  }

 /**
   * Get fiscalQuarter
   * @return fiscalQuarter
  **/
  @JsonProperty("fiscalQuarter")
  public Integer getFiscalQuarter() {
    return fiscalQuarter;
  }

  public void setFiscalQuarter(Integer fiscalQuarter) {
    this.fiscalQuarter = fiscalQuarter;
  }

  public JVrequestAccountingEntity fiscalQuarter(Integer fiscalQuarter) {
    this.fiscalQuarter = fiscalQuarter;
    return this;
  }

 /**
   * Get creditAmount
   * @return creditAmount
  **/
  @JsonProperty("creditAmount")
  public Integer getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(Integer creditAmount) {
    this.creditAmount = creditAmount;
  }

  public JVrequestAccountingEntity creditAmount(Integer creditAmount) {
    this.creditAmount = creditAmount;
    return this;
  }

 /**
   * Get accountingTemplate
   * @return accountingTemplate
  **/
  @JsonProperty("accountingTemplate")
  public String getAccountingTemplate() {
    return accountingTemplate;
  }

  public void setAccountingTemplate(String accountingTemplate) {
    this.accountingTemplate = accountingTemplate;
  }

  public JVrequestAccountingEntity accountingTemplate(String accountingTemplate) {
    this.accountingTemplate = accountingTemplate;
    return this;
  }

 /**
   * Get lineFunction
   * @return lineFunction
  **/
  @JsonProperty("lineFunction")
  public Integer getLineFunction() {
    return lineFunction;
  }

  public void setLineFunction(Integer lineFunction) {
    this.lineFunction = lineFunction;
  }

  public JVrequestAccountingEntity lineFunction(Integer lineFunction) {
    this.lineFunction = lineFunction;
    return this;
  }

 /**
   * Get referencedTransactionCode
   * @return referencedTransactionCode
  **/
  @JsonProperty("referencedTransactionCode")
 @Size(max=3)  public String getReferencedTransactionCode() {
    return referencedTransactionCode;
  }

  public void setReferencedTransactionCode(String referencedTransactionCode) {
    this.referencedTransactionCode = referencedTransactionCode;
  }

  public JVrequestAccountingEntity referencedTransactionCode(String referencedTransactionCode) {
    this.referencedTransactionCode = referencedTransactionCode;
    return this;
  }

 /**
   * Get referencedTransactionDepartment
   * @return referencedTransactionDepartment
  **/
  @JsonProperty("referencedTransactionDepartment")
 @Size(max=3)  public String getReferencedTransactionDepartment() {
    return referencedTransactionDepartment;
  }

  public void setReferencedTransactionDepartment(String referencedTransactionDepartment) {
    this.referencedTransactionDepartment = referencedTransactionDepartment;
  }

  public JVrequestAccountingEntity referencedTransactionDepartment(String referencedTransactionDepartment) {
    this.referencedTransactionDepartment = referencedTransactionDepartment;
    return this;
  }

 /**
   * Get referencedTransactionID
   * @return referencedTransactionID
  **/
  @JsonProperty("referencedTransactionID")
 @Size(max=20)  public String getReferencedTransactionID() {
    return referencedTransactionID;
  }

  public void setReferencedTransactionID(String referencedTransactionID) {
    this.referencedTransactionID = referencedTransactionID;
  }

  public JVrequestAccountingEntity referencedTransactionID(String referencedTransactionID) {
    this.referencedTransactionID = referencedTransactionID;
    return this;
  }

 /**
   * Get referencedVendorLine
   * @return referencedVendorLine
  **/
  @JsonProperty("referencedVendorLine")
  public Integer getReferencedVendorLine() {
    return referencedVendorLine;
  }

  public void setReferencedVendorLine(Integer referencedVendorLine) {
    this.referencedVendorLine = referencedVendorLine;
  }

  public JVrequestAccountingEntity referencedVendorLine(Integer referencedVendorLine) {
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

  public JVrequestAccountingEntity referencedCommodityLine(Long referencedCommodityLine) {
    this.referencedCommodityLine = referencedCommodityLine;
    return this;
  }

 /**
   * Get referencedAccountingLine
   * @return referencedAccountingLine
  **/
  @JsonProperty("referencedAccountingLine")
  public Integer getReferencedAccountingLine() {
    return referencedAccountingLine;
  }

  public void setReferencedAccountingLine(Integer referencedAccountingLine) {
    this.referencedAccountingLine = referencedAccountingLine;
  }

  public JVrequestAccountingEntity referencedAccountingLine(Integer referencedAccountingLine) {
    this.referencedAccountingLine = referencedAccountingLine;
    return this;
  }

 /**
   * Get vendorOrCustomer
   * @return vendorOrCustomer
  **/
  @JsonProperty("vendorOrCustomer")
 @Size(max=1)  public String getVendorOrCustomer() {
    return vendorOrCustomer;
  }

  public void setVendorOrCustomer(String vendorOrCustomer) {
    this.vendorOrCustomer = vendorOrCustomer;
  }

  public JVrequestAccountingEntity vendorOrCustomer(String vendorOrCustomer) {
    this.vendorOrCustomer = vendorOrCustomer;
    return this;
  }

 /**
   * Get debitAmount
   * @return debitAmount
  **/
  @JsonProperty("debitAmount")
  public Integer getDebitAmount() {
    return debitAmount;
  }

  public void setDebitAmount(Integer debitAmount) {
    this.debitAmount = debitAmount;
  }

  public JVrequestAccountingEntity debitAmount(Integer debitAmount) {
    this.debitAmount = debitAmount;
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

  public JVrequestAccountingEntity fund(String fund) {
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

  public JVrequestAccountingEntity subFund(String subFund) {
    this.subFund = subFund;
    return this;
  }

 /**
   * Get object
   * @return object
  **/
  @JsonProperty("object")
 @Size(max=4)  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public JVrequestAccountingEntity object(String object) {
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

  public JVrequestAccountingEntity subObject(String subObject) {
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

  public JVrequestAccountingEntity revenue(String revenue) {
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

  public JVrequestAccountingEntity subRevenue(String subRevenue) {
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

  public JVrequestAccountingEntity bsa(String bsa) {
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

  public JVrequestAccountingEntity subBSA(String subBSA) {
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

  public JVrequestAccountingEntity obsa(String obsa) {
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

  public JVrequestAccountingEntity subOBSA(String subOBSA) {
    this.subOBSA = subOBSA;
    return this;
  }

 /**
   * Get governmentBranch
   * @return governmentBranch
  **/
  @JsonProperty("governmentBranch")
 @Size(max=4)  public String getGovernmentBranch() {
    return governmentBranch;
  }

  public void setGovernmentBranch(String governmentBranch) {
    this.governmentBranch = governmentBranch;
  }

  public JVrequestAccountingEntity governmentBranch(String governmentBranch) {
    this.governmentBranch = governmentBranch;
    return this;
  }

 /**
   * Get cabinet
   * @return cabinet
  **/
  @JsonProperty("cabinet")
 @Size(max=4)  public String getCabinet() {
    return cabinet;
  }

  public void setCabinet(String cabinet) {
    this.cabinet = cabinet;
  }

  public JVrequestAccountingEntity cabinet(String cabinet) {
    this.cabinet = cabinet;
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

  public JVrequestAccountingEntity department(String department) {
    this.department = department;
    return this;
  }

 /**
   * Get division
   * @return division
  **/
  @JsonProperty("division")
  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public JVrequestAccountingEntity division(String division) {
    this.division = division;
    return this;
  }

 /**
   * Get group
   * @return group
  **/
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public JVrequestAccountingEntity group(String group) {
    this.group = group;
    return this;
  }

 /**
   * Get section
   * @return section
  **/
  @JsonProperty("section")
  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public JVrequestAccountingEntity section(String section) {
    this.section = section;
    return this;
  }

 /**
   * Get district
   * @return district
  **/
  @JsonProperty("district")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public JVrequestAccountingEntity district(String district) {
    this.district = district;
    return this;
  }

 /**
   * Get bureau
   * @return bureau
  **/
  @JsonProperty("bureau")
  public String getBureau() {
    return bureau;
  }

  public void setBureau(String bureau) {
    this.bureau = bureau;
  }

  public JVrequestAccountingEntity bureau(String bureau) {
    this.bureau = bureau;
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

  public JVrequestAccountingEntity unit(String unit) {
    this.unit = unit;
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

  public JVrequestAccountingEntity apprUnit(String apprUnit) {
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

  public JVrequestAccountingEntity location(String location) {
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

  public JVrequestAccountingEntity subLocation(String subLocation) {
    this.subLocation = subLocation;
    return this;
  }

 /**
   * Get county
   * @return county
  **/
  @JsonProperty("county")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public JVrequestAccountingEntity county(String county) {
    this.county = county;
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

  public JVrequestAccountingEntity activity(String activity) {
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

  public JVrequestAccountingEntity subActivity(String subActivity) {
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

  public JVrequestAccountingEntity function(String function) {
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

  public JVrequestAccountingEntity subFunction(String subFunction) {
    this.subFunction = subFunction;
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

  public JVrequestAccountingEntity reporting(String reporting) {
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

  public JVrequestAccountingEntity subReporting(String subReporting) {
    this.subReporting = subReporting;
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

  public JVrequestAccountingEntity deptObject(String deptObject) {
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

  public JVrequestAccountingEntity deptRevenue(String deptRevenue) {
    this.deptRevenue = deptRevenue;
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

  public JVrequestAccountingEntity task(String task) {
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

  public JVrequestAccountingEntity subTask(String subTask) {
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

  public JVrequestAccountingEntity taskOrder(String taskOrder) {
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

  public JVrequestAccountingEntity program(String program) {
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

  public JVrequestAccountingEntity phase(String phase) {
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

  public JVrequestAccountingEntity programPeriod(String programPeriod) {
    this.programPeriod = programPeriod;
    return this;
  }

 /**
   * Get fundingProfile
   * @return fundingProfile
  **/
  @JsonProperty("fundingProfile")
  public String getFundingProfile() {
    return fundingProfile;
  }

  public void setFundingProfile(String fundingProfile) {
    this.fundingProfile = fundingProfile;
  }

  public JVrequestAccountingEntity fundingProfile(String fundingProfile) {
    this.fundingProfile = fundingProfile;
    return this;
  }

 /**
   * Get performanceUnitOfMeasure
   * @return performanceUnitOfMeasure
  **/
  @JsonProperty("performanceUnitOfMeasure")
  public String getPerformanceUnitOfMeasure() {
    return performanceUnitOfMeasure;
  }

  public void setPerformanceUnitOfMeasure(String performanceUnitOfMeasure) {
    this.performanceUnitOfMeasure = performanceUnitOfMeasure;
  }

  public JVrequestAccountingEntity performanceUnitOfMeasure(String performanceUnitOfMeasure) {
    this.performanceUnitOfMeasure = performanceUnitOfMeasure;
    return this;
  }

 /**
   * Get lineDescription
   * @return lineDescription
  **/
  @JsonProperty("lineDescription")
 @Size(max=100)  public String getLineDescription() {
    return lineDescription;
  }

  public void setLineDescription(String lineDescription) {
    this.lineDescription = lineDescription;
  }

  public JVrequestAccountingEntity lineDescription(String lineDescription) {
    this.lineDescription = lineDescription;
    return this;
  }

 /**
   * Get postingCode
   * @return postingCode
  **/
  @JsonProperty("postingCode")
 @Size(max=4)  public String getPostingCode() {
    return postingCode;
  }

  public void setPostingCode(String postingCode) {
    this.postingCode = postingCode;
  }

  public JVrequestAccountingEntity postingCode(String postingCode) {
    this.postingCode = postingCode;
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

  public JVrequestAccountingEntity internalFund(String internalFund) {
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

  public JVrequestAccountingEntity internalSubFund(String internalSubFund) {
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

  public JVrequestAccountingEntity internalDept(String internalDept) {
    this.internalDept = internalDept;
    return this;
  }

 /**
   * Get lineGroupLineNumber
   * @return lineGroupLineNumber
  **/
  @JsonProperty("lineGroupLineNumber")
  public Integer getLineGroupLineNumber() {
    return lineGroupLineNumber;
  }

  public void setLineGroupLineNumber(Integer lineGroupLineNumber) {
    this.lineGroupLineNumber = lineGroupLineNumber;
  }

  public JVrequestAccountingEntity lineGroupLineNumber(Integer lineGroupLineNumber) {
    this.lineGroupLineNumber = lineGroupLineNumber;
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

  public JVrequestAccountingEntity subUnit(String subUnit) {
    this.subUnit = subUnit;
    return this;
  }

 /**
   * Get bank
   * @return bank
  **/
  @JsonProperty("bank")
  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public JVrequestAccountingEntity bank(String bank) {
    this.bank = bank;
    return this;
  }

 /**
   * Get fundingPriority
   * @return fundingPriority
  **/
  @JsonProperty("fundingPriority")
  public String getFundingPriority() {
    return fundingPriority;
  }

  public void setFundingPriority(String fundingPriority) {
    this.fundingPriority = fundingPriority;
  }

  public JVrequestAccountingEntity fundingPriority(String fundingPriority) {
    this.fundingPriority = fundingPriority;
    return this;
  }

 /**
   * Get fundingLine
   * @return fundingLine
  **/
  @JsonProperty("fundingLine")
  public String getFundingLine() {
    return fundingLine;
  }

  public void setFundingLine(String fundingLine) {
    this.fundingLine = fundingLine;
  }

  public JVrequestAccountingEntity fundingLine(String fundingLine) {
    this.fundingLine = fundingLine;
    return this;
  }

 /**
   * Get accountingClassification
   * @return accountingClassification
  **/
  @JsonProperty("accountingClassification")
  public Long getAccountingClassification() {
    return accountingClassification;
  }

  public void setAccountingClassification(Long accountingClassification) {
    this.accountingClassification = accountingClassification;
  }

  public JVrequestAccountingEntity accountingClassification(Long accountingClassification) {
    this.accountingClassification = accountingClassification;
    return this;
  }

 /**
   * Get quantity
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public JVrequestAccountingEntity quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * Get humanResourceMeasure
   * @return humanResourceMeasure
  **/
  @JsonProperty("humanResourceMeasure")
  public String getHumanResourceMeasure() {
    return humanResourceMeasure;
  }

  public void setHumanResourceMeasure(String humanResourceMeasure) {
    this.humanResourceMeasure = humanResourceMeasure;
  }

  public JVrequestAccountingEntity humanResourceMeasure(String humanResourceMeasure) {
    this.humanResourceMeasure = humanResourceMeasure;
    return this;
  }

 /**
   * Get batchLoaded
   * @return batchLoaded
  **/
  @JsonProperty("batchLoaded")
  public Boolean isBatchLoaded() {
    return batchLoaded;
  }

  public void setBatchLoaded(Boolean batchLoaded) {
    this.batchLoaded = batchLoaded;
  }

  public JVrequestAccountingEntity batchLoaded(Boolean batchLoaded) {
    this.batchLoaded = batchLoaded;
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

  public JVrequestAccountingEntity debtID(String debtID) {
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

  public JVrequestAccountingEntity authorizationDebtInstrument(String authorizationDebtInstrument) {
    this.authorizationDebtInstrument = authorizationDebtInstrument;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JVrequestAccountingEntity {\n");
    
    sb.append("    accountingLine: ").append(toIndentedString(accountingLine)).append("\n");
    sb.append("    transactionCreationDate: ").append(toIndentedString(transactionCreationDate)).append("\n");
    sb.append("    budgetFY: ").append(toIndentedString(budgetFY)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    fiscalQuarter: ").append(toIndentedString(fiscalQuarter)).append("\n");
    sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
    sb.append("    accountingTemplate: ").append(toIndentedString(accountingTemplate)).append("\n");
    sb.append("    lineFunction: ").append(toIndentedString(lineFunction)).append("\n");
    sb.append("    referencedTransactionCode: ").append(toIndentedString(referencedTransactionCode)).append("\n");
    sb.append("    referencedTransactionDepartment: ").append(toIndentedString(referencedTransactionDepartment)).append("\n");
    sb.append("    referencedTransactionID: ").append(toIndentedString(referencedTransactionID)).append("\n");
    sb.append("    referencedVendorLine: ").append(toIndentedString(referencedVendorLine)).append("\n");
    sb.append("    referencedCommodityLine: ").append(toIndentedString(referencedCommodityLine)).append("\n");
    sb.append("    referencedAccountingLine: ").append(toIndentedString(referencedAccountingLine)).append("\n");
    sb.append("    vendorOrCustomer: ").append(toIndentedString(vendorOrCustomer)).append("\n");
    sb.append("    debitAmount: ").append(toIndentedString(debitAmount)).append("\n");
    sb.append("    fund: ").append(toIndentedString(fund)).append("\n");
    sb.append("    subFund: ").append(toIndentedString(subFund)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    subObject: ").append(toIndentedString(subObject)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    subRevenue: ").append(toIndentedString(subRevenue)).append("\n");
    sb.append("    bsa: ").append(toIndentedString(bsa)).append("\n");
    sb.append("    subBSA: ").append(toIndentedString(subBSA)).append("\n");
    sb.append("    obsa: ").append(toIndentedString(obsa)).append("\n");
    sb.append("    subOBSA: ").append(toIndentedString(subOBSA)).append("\n");
    sb.append("    governmentBranch: ").append(toIndentedString(governmentBranch)).append("\n");
    sb.append("    cabinet: ").append(toIndentedString(cabinet)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    bureau: ").append(toIndentedString(bureau)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    apprUnit: ").append(toIndentedString(apprUnit)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    subLocation: ").append(toIndentedString(subLocation)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    subActivity: ").append(toIndentedString(subActivity)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    subFunction: ").append(toIndentedString(subFunction)).append("\n");
    sb.append("    reporting: ").append(toIndentedString(reporting)).append("\n");
    sb.append("    subReporting: ").append(toIndentedString(subReporting)).append("\n");
    sb.append("    deptObject: ").append(toIndentedString(deptObject)).append("\n");
    sb.append("    deptRevenue: ").append(toIndentedString(deptRevenue)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    subTask: ").append(toIndentedString(subTask)).append("\n");
    sb.append("    taskOrder: ").append(toIndentedString(taskOrder)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    programPeriod: ").append(toIndentedString(programPeriod)).append("\n");
    sb.append("    fundingProfile: ").append(toIndentedString(fundingProfile)).append("\n");
    sb.append("    performanceUnitOfMeasure: ").append(toIndentedString(performanceUnitOfMeasure)).append("\n");
    sb.append("    lineDescription: ").append(toIndentedString(lineDescription)).append("\n");
    sb.append("    postingCode: ").append(toIndentedString(postingCode)).append("\n");
    sb.append("    internalFund: ").append(toIndentedString(internalFund)).append("\n");
    sb.append("    internalSubFund: ").append(toIndentedString(internalSubFund)).append("\n");
    sb.append("    internalDept: ").append(toIndentedString(internalDept)).append("\n");
    sb.append("    lineGroupLineNumber: ").append(toIndentedString(lineGroupLineNumber)).append("\n");
    sb.append("    subUnit: ").append(toIndentedString(subUnit)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    fundingPriority: ").append(toIndentedString(fundingPriority)).append("\n");
    sb.append("    fundingLine: ").append(toIndentedString(fundingLine)).append("\n");
    sb.append("    accountingClassification: ").append(toIndentedString(accountingClassification)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    humanResourceMeasure: ").append(toIndentedString(humanResourceMeasure)).append("\n");
    sb.append("    batchLoaded: ").append(toIndentedString(batchLoaded)).append("\n");
    sb.append("    debtID: ").append(toIndentedString(debtID)).append("\n");
    sb.append("    authorizationDebtInstrument: ").append(toIndentedString(authorizationDebtInstrument)).append("\n");
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

