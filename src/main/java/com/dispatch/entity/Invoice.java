package com.dispatch.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
 
 

@Entity	
public class Invoice extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	 
	private String supplierGstin;
	private String supplierLegalName;
	private String supplierTradingName;
	private String supplierCity;
	private String supplierAddress1;
	private String supplierAddress2;
	private String supplierState;
	private String supplierPincode;
	private String supplierPhone;
	private String supplierEmail;
	
	private String billingName;
	private String billingTradeName;
	private String billingPOS;
	private String billingGstin;
	private String billingAddress1;
	private String billingAddress2;
	private String billingCity;
	private String billingState;
	
	private String shippingtoName;
	private String shippingtoTradeName;
	private String shippingtoGstin;
	private String shippingtoAddress1;
	private String shippingtoAddress2;
	private String shippingtoPlace;
	private String shippingtoState;
	private String shippingtoStateCode;
	private String shippingtoPincode;
	private String shippingBillDate;
	private String shippingBillNo;
	
	private String ewbTransporterId;
	private String ewbTransMode;
	private String ewbTransDistance;
	private String ewbTransporterName;
	private String ewbTransDocNo;
	private String ewbTransDocDt;
	private String ewbSubSupplyType;
	private String vehType;
	private String ewbVehicleNo;
	
	private String payeeName;
	private String payerFinancialAccount;
	private String modeOfPayment;
	private String financialInstitutionBranch;
	private String paymentTerms;
	private String paymentInstruction;
	private String creditTransfer;
	private String creditDays;
	private String paidAmount;
	private String amountDueForPayment;
	
	private String invoiceSubtypeCode;
	private String invoiceNum;
	private String invoiceDate;
	private String plant;
	
	private String productType;
	private String invoiceTypeCode;
	private String ecomGSTIN;
	
	private String companyName;
	private String companyAddress1;
	private String companyAddress2;
	private String companyCity;
	private String companyState;
	private String companyPincode;
	
	private String portCode;
	private String currencyCode;
	private String cntCode;
	private String refClm;
	
	private String remarks;
	private String preceedingInvoiceNumber;
	private String invoiceDocumentReference;
	private String receiptAdviceReferenceNo;
	private String receiptAdviceReferenceDt;
	private String contractReference;
	private String projectReference;
	private String refNum;
	private String refDate;
	
	private String totalInvoiceValue;
	private String orderType;
	private String manitouOrderNo;
	private String insuranceNo;
	private String insuranceCompany;
	private String packingListNo;
	private String isService;
	private String orderDate;
	
	@OneToMany(targetEntity=InvoiceItemDetails.class,cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="invoice_id")
	private List<InvoiceItemDetails> items;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	 
	public String getSupplierLegalName() {
		return supplierLegalName;
	}

	public void setSupplierLegalName(String supplierLegalName) {
		this.supplierLegalName = supplierLegalName;
	}

	public String getSupplierTradingName() {
		return supplierTradingName;
	}

	public void setSupplierTradingName(String supplierTradingName) {
		this.supplierTradingName = supplierTradingName;
	}

	public String getSupplierCity() {
		return supplierCity;
	}

	public void setSupplierCity(String supplierCity) {
		this.supplierCity = supplierCity;
	}

	public String getSupplierAddress1() {
		return supplierAddress1;
	}

	public void setSupplierAddress1(String supplierAddress1) {
		this.supplierAddress1 = supplierAddress1;
	}

	public String getSupplierAddress2() {
		return supplierAddress2;
	}

	public void setSupplierAddress2(String supplierAddress2) {
		this.supplierAddress2 = supplierAddress2;
	}

	public String getSupplierState() {
		return supplierState;
	}

	public void setSupplierState(String supplierState) {
		this.supplierState = supplierState;
	}

	public String getSupplierPincode() {
		return supplierPincode;
	}

	public void setSupplierPincode(String supplierPincode) {
		this.supplierPincode = supplierPincode;
	}

	public String getSupplierPhone() {
		return supplierPhone;
	}

	public void setSupplierPhone(String supplierPhone) {
		this.supplierPhone = supplierPhone;
	}

	public String getSupplierEmail() {
		return supplierEmail;
	}

	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}

	public String getBillingName() {
		return billingName;
	}

	public void setBillingName(String billingName) {
		this.billingName = billingName;
	}

	public String getBillingTradeName() {
		return billingTradeName;
	}

	public void setBillingTradeName(String billingTradeName) {
		this.billingTradeName = billingTradeName;
	}

	public String getBillingPOS() {
		return billingPOS;
	}

	public void setBillingPOS(String billingPOS) {
		this.billingPOS = billingPOS;
	}

	 
	public String getBillingAddress1() {
		return billingAddress1;
	}

	public void setBillingAddress1(String billingAddress1) {
		this.billingAddress1 = billingAddress1;
	}

	public String getBillingAddress2() {
		return billingAddress2;
	}

	public void setBillingAddress2(String billingAddress2) {
		this.billingAddress2 = billingAddress2;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	public String getBillingState() {
		return billingState;
	}

	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}

	public String getShippingtoName() {
		return shippingtoName;
	}

	public void setShippingtoName(String shippingtoName) {
		this.shippingtoName = shippingtoName;
	}

	public String getShippingtoTradeName() {
		return shippingtoTradeName;
	}

	public void setShippingtoTradeName(String shippingtoTradeName) {
		this.shippingtoTradeName = shippingtoTradeName;
	}

 
	public String getShippingtoAddress1() {
		return shippingtoAddress1;
	}

	public void setShippingtoAddress1(String shippingtoAddress1) {
		this.shippingtoAddress1 = shippingtoAddress1;
	}

	public String getShippingtoAddress2() {
		return shippingtoAddress2;
	}

	public void setShippingtoAddress2(String shippingtoAddress2) {
		this.shippingtoAddress2 = shippingtoAddress2;
	}

	public String getShippingtoPlace() {
		return shippingtoPlace;
	}

	public void setShippingtoPlace(String shippingtoPlace) {
		this.shippingtoPlace = shippingtoPlace;
	}

	public String getShippingtoState() {
		return shippingtoState;
	}

	public void setShippingtoState(String shippingtoState) {
		this.shippingtoState = shippingtoState;
	}

	public String getShippingtoPincode() {
		return shippingtoPincode;
	}

	public void setShippingtoPincode(String shippingtoPincode) {
		this.shippingtoPincode = shippingtoPincode;
	}

	public String getShippingBillDate() {
		return shippingBillDate;
	}

	public void setShippingBillDate(String shippingBillDate) {
		this.shippingBillDate = shippingBillDate;
	}

	public String getShippingBillNo() {
		return shippingBillNo;
	}

	public void setShippingBillNo(String shippingBillNo) {
		this.shippingBillNo = shippingBillNo;
	}

	public String getEwbTransporterId() {
		return ewbTransporterId;
	}

	public void setEwbTransporterId(String ewbTransporterId) {
		this.ewbTransporterId = ewbTransporterId;
	}

	public String getEwbTransMode() {
		return ewbTransMode;
	}

	public void setEwbTransMode(String ewbTransMode) {
		this.ewbTransMode = ewbTransMode;
	}

 
	public String getEwbTransporterName() {
		return ewbTransporterName;
	}

	public void setEwbTransporterName(String ewbTransporterName) {
		this.ewbTransporterName = ewbTransporterName;
	}

 
	public String getEwbTransDocDt() {
		return ewbTransDocDt;
	}

	public void setEwbTransDocDt(String ewbTransDocDt) {
		this.ewbTransDocDt = ewbTransDocDt;
	}

	public String getEwbSubSupplyType() {
		return ewbSubSupplyType;
	}

	public void setEwbSubSupplyType(String ewbSubSupplyType) {
		this.ewbSubSupplyType = ewbSubSupplyType;
	}

	public String getVehType() {
		return vehType;
	}

	public void setVehType(String vehType) {
		this.vehType = vehType;
	}

	public String getEwbVehicleNo() {
		return ewbVehicleNo;
	}

	public void setEwbVehicleNo(String ewbVehicleNo) {
		this.ewbVehicleNo = ewbVehicleNo;
	}

	
	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayerFinancialAccount() {
		return payerFinancialAccount;
	}

	public void setPayerFinancialAccount(String payerFinancialAccount) {
		this.payerFinancialAccount = payerFinancialAccount;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public String getFinancialInstitutionBranch() {
		return financialInstitutionBranch;
	}

	public void setFinancialInstitutionBranch(String financialInstitutionBranch) {
		this.financialInstitutionBranch = financialInstitutionBranch;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getPaymentInstruction() {
		return paymentInstruction;
	}

	public void setPaymentInstruction(String paymentInstruction) {
		this.paymentInstruction = paymentInstruction;
	}

	public String getCreditTransfer() {
		return creditTransfer;
	}

	public void setCreditTransfer(String creditTransfer) {
		this.creditTransfer = creditTransfer;
	}

	public String getCreditDays() {
		return creditDays;
	}

	public void setCreditDays(String creditDays) {
		this.creditDays = creditDays;
	}

	public String getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getAmountDueForPayment() {
		return amountDueForPayment;
	}

	public void setAmountDueForPayment(String amountDueForPayment) {
		this.amountDueForPayment = amountDueForPayment;
	}

	public String getInvoiceSubtypeCode() {
		return invoiceSubtypeCode;
	}

	public void setInvoiceSubtypeCode(String invoiceSubtypeCode) {
		this.invoiceSubtypeCode = invoiceSubtypeCode;
	}

	public String getInvoiceNum() {
		return invoiceNum;
	}

	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getPlant() {
		return plant;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getInvoiceTypeCode() {
		return invoiceTypeCode;
	}

	public void setInvoiceTypeCode(String invoiceTypeCode) {
		this.invoiceTypeCode = invoiceTypeCode;
	}

	public String getEcomGSTIN() {
		return ecomGSTIN;
	}

	public void setEcomGSTIN(String ecomGSTIN) {
		this.ecomGSTIN = ecomGSTIN;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress1() {
		return companyAddress1;
	}

	public void setCompanyAddress1(String companyAddress1) {
		this.companyAddress1 = companyAddress1;
	}

	public String getCompanyAddress2() {
		return companyAddress2;
	}

	public void setCompanyAddress2(String companyAddress2) {
		this.companyAddress2 = companyAddress2;
	}

	public String getCompanyCity() {
		return companyCity;
	}

	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}

	public String getCompanyState() {
		return companyState;
	}

	public void setCompanyState(String companyState) {
		this.companyState = companyState;
	}

	public String getCompanyPincode() {
		return companyPincode;
	}

	public void setCompanyPincode(String companyPincode) {
		this.companyPincode = companyPincode;
	}

	public String getPortCode() {
		return portCode;
	}

	public void setPortCode(String portCode) {
		this.portCode = portCode;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCntCode() {
		return cntCode;
	}

	public void setCntCode(String cntCode) {
		this.cntCode = cntCode;
	}

	public String getRefClm() {
		return refClm;
	}

	public void setRefClm(String refClm) {
		this.refClm = refClm;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getPreceedingInvoiceNumber() {
		return preceedingInvoiceNumber;
	}

	public void setPreceedingInvoiceNumber(String preceedingInvoiceNumber) {
		this.preceedingInvoiceNumber = preceedingInvoiceNumber;
	}

	public String getInvoiceDocumentReference() {
		return invoiceDocumentReference;
	}

	public void setInvoiceDocumentReference(String invoiceDocumentReference) {
		this.invoiceDocumentReference = invoiceDocumentReference;
	}

	public String getReceiptAdviceReferenceNo() {
		return receiptAdviceReferenceNo;
	}

	public void setReceiptAdviceReferenceNo(String receiptAdviceReferenceNo) {
		this.receiptAdviceReferenceNo = receiptAdviceReferenceNo;
	}

	public String getReceiptAdviceReferenceDt() {
		return receiptAdviceReferenceDt;
	}

	public void setReceiptAdviceReferenceDt(String receiptAdviceReferenceDt) {
		this.receiptAdviceReferenceDt = receiptAdviceReferenceDt;
	}

	public String getContractReference() {
		return contractReference;
	}

	public void setContractReference(String contractReference) {
		this.contractReference = contractReference;
	}

	public String getProjectReference() {
		return projectReference;
	}

	public void setProjectReference(String projectReference) {
		this.projectReference = projectReference;
	}

	public String getRefNum() {
		return refNum;
	}

	public void setRefNum(String refNum) {
		this.refNum = refNum;
	}

	public String getRefDate() {
		return refDate;
	}

	public void setRefDate(String refDate) {
		this.refDate = refDate;
	}

	public String getTotalInvoiceValue() {
		return totalInvoiceValue;
	}

	public void setTotalInvoiceValue(String totalInvoiceValue) {
		this.totalInvoiceValue = totalInvoiceValue;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getManitouOrderNo() {
		return manitouOrderNo;
	}

	public void setManitouOrderNo(String manitouOrderNo) {
		this.manitouOrderNo = manitouOrderNo;
	}

	public String getInsuranceNo() {
		return insuranceNo;
	}

	public void setInsuranceNo(String insuranceNo) {
		this.insuranceNo = insuranceNo;
	}

	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	public String getPackingListNo() {
		return packingListNo;
	}

	public void setPackingListNo(String packingListNo) {
		this.packingListNo = packingListNo;
	}

	public String getIsService() {
		return isService;
	}

	public void setIsService(String isService) {
		this.isService = isService;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public List<InvoiceItemDetails> getItems() {
		return items;
	}

	public void setItems(List<InvoiceItemDetails> items) {
		this.items = items;
	}

	public String getSupplierGstin() {
		return supplierGstin;
	}

	public void setSupplierGstin(String supplierGstin) {
		this.supplierGstin = supplierGstin;
	}

	public String getBillingGstin() {
		return billingGstin;
	}

	public void setBillingGstin(String billingGstin) {
		this.billingGstin = billingGstin;
	}

	public String getShippingtoGstin() {
		return shippingtoGstin;
	}

	public void setShippingtoGstin(String shippingtoGstin) {
		this.shippingtoGstin = shippingtoGstin;
	}

	public String getShippingtoStateCode() {
		return shippingtoStateCode;
	}

	public void setShippingtoStateCode(String shippingtoStateCode) {
		this.shippingtoStateCode = shippingtoStateCode;
	}

	public String getEwbTransDistance() {
		return ewbTransDistance;
	}

	public void setEwbTransDistance(String ewbTransDistance) {
		this.ewbTransDistance = ewbTransDistance;
	}

	public String getEwbTransDocNo() {
		return ewbTransDocNo;
	}

	public void setEwbTransDocNo(String ewbTransDocNo) {
		this.ewbTransDocNo = ewbTransDocNo;
	}

	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Invoice(Long id, String supplierGstin, String supplierLegalName, String supplierTradingName,
			String supplierCity, String supplierAddress1, String supplierAddress2, String supplierState,
			String supplierPincode, String supplierPhone, String supplierEmail, String billingName,
			String billingTradeName, String billingPOS, String billingGstin, String billingAddress1,
			String billingAddress2, String billingCity, String billingState, String shippingtoName,
			String shippingtoTradeName, String shippingtoGstin, String shippingtoAddress1, String shippingtoAddress2,
			String shippingtoPlace, String shippingtoState, String shippingtoStateCode, String shippingtoPincode,
			String shippingBillDate, String shippingBillNo, String ewbTransporterId, String ewbTransMode,
			String ewbTransDistance, String ewbTransporterName, String ewbTransDocNo, String ewbTransDocDt,
			String ewbSubSupplyType, String vehType, String ewbVehicleNo,String payeeName,
			String payerFinancialAccount, String modeOfPayment, String financialInstitutionBranch, String paymentTerms,
			String paymentInstruction, String creditTransfer, String creditDays, String paidAmount,
			String amountDueForPayment, String invoiceSubtypeCode, String invoiceNum, String invoiceDate, String plant,
			String productType, String invoiceTypeCode, String ecomGSTIN, String companyName, String companyAddress1,
			String companyAddress2, String companyCity, String companyState, String companyPincode, String portCode,
			String currencyCode, String cntCode, String refClm, String remarks, String preceedingInvoiceNumber,
			String invoiceDocumentReference, String receiptAdviceReferenceNo, String receiptAdviceReferenceDt,
			String contractReference, String projectReference, String refNum, String refDate, String totalInvoiceValue,
			String orderType, String manitouOrderNo, String insuranceNo, String insuranceCompany, String packingListNo,
			String isService, String orderDate, List<InvoiceItemDetails> items) {
		super();
		this.id = id;
		this.supplierGstin = supplierGstin;
		this.supplierLegalName = supplierLegalName;
		this.supplierTradingName = supplierTradingName;
		this.supplierCity = supplierCity;
		this.supplierAddress1 = supplierAddress1;
		this.supplierAddress2 = supplierAddress2;
		this.supplierState = supplierState;
		this.supplierPincode = supplierPincode;
		this.supplierPhone = supplierPhone;
		this.supplierEmail = supplierEmail;
		this.billingName = billingName;
		this.billingTradeName = billingTradeName;
		this.billingPOS = billingPOS;
		this.billingGstin = billingGstin;
		this.billingAddress1 = billingAddress1;
		this.billingAddress2 = billingAddress2;
		this.billingCity = billingCity;
		this.billingState = billingState;
		this.shippingtoName = shippingtoName;
		this.shippingtoTradeName = shippingtoTradeName;
		this.shippingtoGstin = shippingtoGstin;
		this.shippingtoAddress1 = shippingtoAddress1;
		this.shippingtoAddress2 = shippingtoAddress2;
		this.shippingtoPlace = shippingtoPlace;
		this.shippingtoState = shippingtoState;
		this.shippingtoStateCode = shippingtoStateCode;
		this.shippingtoPincode = shippingtoPincode;
		this.shippingBillDate = shippingBillDate;
		this.shippingBillNo = shippingBillNo;
		this.ewbTransporterId = ewbTransporterId;
		this.ewbTransMode = ewbTransMode;
		this.ewbTransDistance = ewbTransDistance;
		this.ewbTransporterName = ewbTransporterName;
		this.ewbTransDocNo = ewbTransDocNo;
		this.ewbTransDocDt = ewbTransDocDt;
		this.ewbSubSupplyType = ewbSubSupplyType;
		this.vehType = vehType;
		this.ewbVehicleNo = ewbVehicleNo;
		this.payeeName = payeeName;
		this.payerFinancialAccount = payerFinancialAccount;
		this.modeOfPayment = modeOfPayment;
		this.financialInstitutionBranch = financialInstitutionBranch;
		this.paymentTerms = paymentTerms;
		this.paymentInstruction = paymentInstruction;
		this.creditTransfer = creditTransfer;
		this.creditDays = creditDays;
		this.paidAmount = paidAmount;
		this.amountDueForPayment = amountDueForPayment;
		this.invoiceSubtypeCode = invoiceSubtypeCode;
		this.invoiceNum = invoiceNum;
		this.invoiceDate = invoiceDate;
		this.plant = plant;
		this.productType = productType;
		this.invoiceTypeCode = invoiceTypeCode;
		this.ecomGSTIN = ecomGSTIN;
		this.companyName = companyName;
		this.companyAddress1 = companyAddress1;
		this.companyAddress2 = companyAddress2;
		this.companyCity = companyCity;
		this.companyState = companyState;
		this.companyPincode = companyPincode;
		this.portCode = portCode;
		this.currencyCode = currencyCode;
		this.cntCode = cntCode;
		this.refClm = refClm;
		this.remarks = remarks;
		this.preceedingInvoiceNumber = preceedingInvoiceNumber;
		this.invoiceDocumentReference = invoiceDocumentReference;
		this.receiptAdviceReferenceNo = receiptAdviceReferenceNo;
		this.receiptAdviceReferenceDt = receiptAdviceReferenceDt;
		this.contractReference = contractReference;
		this.projectReference = projectReference;
		this.refNum = refNum;
		this.refDate = refDate;
		this.totalInvoiceValue = totalInvoiceValue;
		this.orderType = orderType;
		this.manitouOrderNo = manitouOrderNo;
		this.insuranceNo = insuranceNo;
		this.insuranceCompany = insuranceCompany;
		this.packingListNo = packingListNo;
		this.isService = isService;
		this.orderDate = orderDate;
		this.items = items;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", supplierGstin=" + supplierGstin + ", supplierLegalName=" + supplierLegalName
				+ ", supplierTradingName=" + supplierTradingName + ", supplierCity=" + supplierCity
				+ ", supplierAddress1=" + supplierAddress1 + ", supplierAddress2=" + supplierAddress2
				+ ", supplierState=" + supplierState + ", supplierPincode=" + supplierPincode + ", supplierPhone="
				+ supplierPhone + ", supplierEmail=" + supplierEmail + ", billingName=" + billingName
				+ ", billingTradeName=" + billingTradeName + ", billingPOS=" + billingPOS + ", billingGstin="
				+ billingGstin + ", billingAddress1=" + billingAddress1 + ", billingAddress2=" + billingAddress2
				+ ", billingCity=" + billingCity + ", billingState=" + billingState + ", shippingtoName="
				+ shippingtoName + ", shippingtoTradeName=" + shippingtoTradeName + ", shippingtoGstin="
				+ shippingtoGstin + ", shippingtoAddress1=" + shippingtoAddress1 + ", shippingtoAddress2="
				+ shippingtoAddress2 + ", shippingtoPlace=" + shippingtoPlace + ", shippingtoState=" + shippingtoState
				+ ", shippingtoStateCode=" + shippingtoStateCode + ", shippingtoPincode=" + shippingtoPincode
				+ ", shippingBillDate=" + shippingBillDate + ", shippingBillNo=" + shippingBillNo
				+ ", ewbTransporterId=" + ewbTransporterId + ", ewbTransMode=" + ewbTransMode + ", ewbTransDistance="
				+ ewbTransDistance + ", ewbTransporterName=" + ewbTransporterName + ", ewbTransDocNo=" + ewbTransDocNo
				+ ", ewbTransDocDt=" + ewbTransDocDt + ", ewbSubSupplyType=" + ewbSubSupplyType + ", vehType=" + vehType
				+ ", ewbVehicleNo=" + ewbVehicleNo +   ", payeeName=" + payeeName
				+ ", payerFinancialAccount=" + payerFinancialAccount + ", modeOfPayment=" + modeOfPayment
				+ ", financialInstitutionBranch=" + financialInstitutionBranch + ", paymentTerms=" + paymentTerms
				+ ", paymentInstruction=" + paymentInstruction + ", creditTransfer=" + creditTransfer + ", creditDays="
				+ creditDays + ", paidAmount=" + paidAmount + ", amountDueForPayment=" + amountDueForPayment
				+ ", invoiceSubtypeCode=" + invoiceSubtypeCode + ", invoiceNum=" + invoiceNum + ", invoiceDate="
				+ invoiceDate + ", plant=" + plant + ", productType=" + productType + ", invoiceTypeCode="
				+ invoiceTypeCode + ", ecomGSTIN=" + ecomGSTIN + ", companyName=" + companyName + ", companyAddress1="
				+ companyAddress1 + ", companyAddress2=" + companyAddress2 + ", companyCity=" + companyCity
				+ ", companyState=" + companyState + ", companyPincode=" + companyPincode + ", portCode=" + portCode
				+ ", currencyCode=" + currencyCode + ", cntCode=" + cntCode + ", refClm=" + refClm + ", remarks="
				+ remarks + ", preceedingInvoiceNumber=" + preceedingInvoiceNumber + ", invoiceDocumentReference="
				+ invoiceDocumentReference + ", receiptAdviceReferenceNo=" + receiptAdviceReferenceNo
				+ ", receiptAdviceReferenceDt=" + receiptAdviceReferenceDt + ", contractReference=" + contractReference
				+ ", projectReference=" + projectReference + ", refNum=" + refNum + ", refDate=" + refDate
				+ ", totalInvoiceValue=" + totalInvoiceValue + ", orderType=" + orderType + ", manitouOrderNo="
				+ manitouOrderNo + ", insuranceNo=" + insuranceNo + ", insuranceCompany=" + insuranceCompany
				+ ", packingListNo=" + packingListNo + ", isService=" + isService + ", orderDate=" + orderDate
				+ ", items=" + items + "]";
	}

	 
	
	
}
