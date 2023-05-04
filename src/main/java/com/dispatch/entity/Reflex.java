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
import javax.persistence.Table;

@Entity
@Table(name="REFLEX")
public class Reflex extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String dispatchNo;
	
	private String companyName;
	private String companyAddress1;
	private String companyAddress2;
	private String companyCity;
	private String companyState;
	private String companyPincode;
	
	
	private String billingName;
	private String billingTradeName;
	private String billingPOS;
	private String billingGSTIN;
	private String billingAddress1;
	private String billingAddress2;
	private String billingCity;
	private String billingState;
	
	private String shippingtoName;
	private String shippingtoTradeName;
	private String shippingtoGSTIN;
	private String shippingtoAddress1;
	private String shippingtoAddress2;
	private String shippingtoPlace;
	private String shippingtoState;
	private String shippingtoPincode;
	private String shippingBillDate;
	private String shippingBillNo;
	
	private String supplierGSTIN;
	private String supplierLegalName;
	private String supplierTradingName;
	private String supplierCity;
	private String supplierAddress1;
	private String supplierAddress2;
	private String supplierState;
	private String supplierPincode;
	private String supplierPhone;
	private String supplierEmail;
	
	private String deliveryNo; 
	private String deliveryDate;
	private String deliveryLocation;
	private String reasonOfTransport;
	private String transportationBy;
	private String carrierNo;
	private String preparationNr;
	 
	@OneToMany(targetEntity=ParcelDetails.class,cascade=CascadeType.ALL, fetch=FetchType.EAGER)
//	@JoinTable(name="reflex_parcel")
	@JoinColumn(name="reflex_id")
	private List<ParcelDetails> parcelDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDispatchNo() {
		return dispatchNo;
	}

	public void setDispatchNo(String dispatchNo) {
		this.dispatchNo = dispatchNo;
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

	public String getBillingGSTIN() {
		return billingGSTIN;
	}

	public void setBillingGSTIN(String billingGSTIN) {
		this.billingGSTIN = billingGSTIN;
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

	public String getShippingtoGSTIN() {
		return shippingtoGSTIN;
	}

	public void setShippingtoGSTIN(String shippingtoGSTIN) {
		this.shippingtoGSTIN = shippingtoGSTIN;
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

	public String getSupplierGSTIN() {
		return supplierGSTIN;
	}

	public void setSupplierGSTIN(String supplierGSTIN) {
		this.supplierGSTIN = supplierGSTIN;
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

	public String getDeliveryNo() {
		return deliveryNo;
	}

	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryLocation() {
		return deliveryLocation;
	}

	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}

	public String getReasonOfTransport() {
		return reasonOfTransport;
	}

	public void setReasonOfTransport(String reasonOfTransport) {
		this.reasonOfTransport = reasonOfTransport;
	}

	public String getTransportationBy() {
		return transportationBy;
	}

	public void setTransportationBy(String transportationBy) {
		this.transportationBy = transportationBy;
	}

	public String getCarrierNo() {
		return carrierNo;
	}

	public void setCarrierNo(String carrierNo) {
		this.carrierNo = carrierNo;
	}

	public String getPreparationNr() {
		return preparationNr;
	}

	public void setPreparationNr(String preparationNr) {
		this.preparationNr = preparationNr;
	}

	public List<ParcelDetails> getParcelDetails() {
		return parcelDetails;
	}

	public void setParcelDetails(List<ParcelDetails> parcelDetails) {
		this.parcelDetails = parcelDetails;
	}

	public Reflex(Long id, String dispatchNo, String companyName, String companyAddress1, String companyAddress2,
			String companyCity, String companyState, String companyPincode, String billingName, String billingTradeName,
			String billingPOS, String billingGSTIN, String billingAddress1, String billingAddress2, String billingCity,
			String billingState, String shippingtoName, String shippingtoTradeName, String shippingtoGSTIN,
			String shippingtoAddress1, String shippingtoAddress2, String shippingtoPlace, String shippingtoState,
			String shippingtoPincode, String shippingBillDate, String shippingBillNo, String supplierGSTIN,
			String supplierLegalName, String supplierTradingName, String supplierCity, String supplierAddress1,
			String supplierAddress2, String supplierState, String supplierPincode, String supplierPhone,
			String supplierEmail, String deliveryNo, String deliveryDate, String deliveryLocation,
			String reasonOfTransport, String transportationBy, String carrierNo, String preparationNr,
			List<ParcelDetails> parcelDetails) {
		super();
		this.id = id;
		this.dispatchNo = dispatchNo;
		this.companyName = companyName;
		this.companyAddress1 = companyAddress1;
		this.companyAddress2 = companyAddress2;
		this.companyCity = companyCity;
		this.companyState = companyState;
		this.companyPincode = companyPincode;
		this.billingName = billingName;
		this.billingTradeName = billingTradeName;
		this.billingPOS = billingPOS;
		this.billingGSTIN = billingGSTIN;
		this.billingAddress1 = billingAddress1;
		this.billingAddress2 = billingAddress2;
		this.billingCity = billingCity;
		this.billingState = billingState;
		this.shippingtoName = shippingtoName;
		this.shippingtoTradeName = shippingtoTradeName;
		this.shippingtoGSTIN = shippingtoGSTIN;
		this.shippingtoAddress1 = shippingtoAddress1;
		this.shippingtoAddress2 = shippingtoAddress2;
		this.shippingtoPlace = shippingtoPlace;
		this.shippingtoState = shippingtoState;
		this.shippingtoPincode = shippingtoPincode;
		this.shippingBillDate = shippingBillDate;
		this.shippingBillNo = shippingBillNo;
		this.supplierGSTIN = supplierGSTIN;
		this.supplierLegalName = supplierLegalName;
		this.supplierTradingName = supplierTradingName;
		this.supplierCity = supplierCity;
		this.supplierAddress1 = supplierAddress1;
		this.supplierAddress2 = supplierAddress2;
		this.supplierState = supplierState;
		this.supplierPincode = supplierPincode;
		this.supplierPhone = supplierPhone;
		this.supplierEmail = supplierEmail;
		this.deliveryNo = deliveryNo;
		this.deliveryDate = deliveryDate;
		this.deliveryLocation = deliveryLocation;
		this.reasonOfTransport = reasonOfTransport;
		this.transportationBy = transportationBy;
		this.carrierNo = carrierNo;
		this.preparationNr = preparationNr;
		this.parcelDetails = parcelDetails;
	}

	public Reflex() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Reflex [id=" + id + ", dispatchNo=" + dispatchNo + ", companyName=" + companyName + ", companyAddress1="
				+ companyAddress1 + ", companyAddress2=" + companyAddress2 + ", companyCity=" + companyCity
				+ ", companyState=" + companyState + ", companyPincode=" + companyPincode + ", billingName="
				+ billingName + ", billingTradeName=" + billingTradeName + ", billingPOS=" + billingPOS
				+ ", billingGSTIN=" + billingGSTIN + ", billingAddress1=" + billingAddress1 + ", billingAddress2="
				+ billingAddress2 + ", billingCity=" + billingCity + ", billingState=" + billingState
				+ ", shippingtoName=" + shippingtoName + ", shippingtoTradeName=" + shippingtoTradeName
				+ ", shippingtoGSTIN=" + shippingtoGSTIN + ", shippingtoAddress1=" + shippingtoAddress1
				+ ", shippingtoAddress2=" + shippingtoAddress2 + ", shippingtoPlace=" + shippingtoPlace
				+ ", shippingtoState=" + shippingtoState + ", shippingtoPincode=" + shippingtoPincode
				+ ", shippingBillDate=" + shippingBillDate + ", shippingBillNo=" + shippingBillNo + ", supplierGSTIN="
				+ supplierGSTIN + ", supplierLegalName=" + supplierLegalName + ", supplierTradingName="
				+ supplierTradingName + ", supplierCity=" + supplierCity + ", supplierAddress1=" + supplierAddress1
				+ ", supplierAddress2=" + supplierAddress2 + ", supplierState=" + supplierState + ", supplierPincode="
				+ supplierPincode + ", supplierPhone=" + supplierPhone + ", supplierEmail=" + supplierEmail
				+ ", deliveryNo=" + deliveryNo + ", deliveryDate=" + deliveryDate + ", deliveryLocation="
				+ deliveryLocation + ", reasonOfTransport=" + reasonOfTransport + ", transportationBy="
				+ transportationBy + ", carrierNo=" + carrierNo + ", preparationNr=" + preparationNr
				+ ", parcelDetails=" + parcelDetails + "]";
	}
	
	
}
