package com.dispatch.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INVOICE_ITEMDETAILS")
public class InvoiceItemDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String siNo;
	private String itemDescription;
	private String hsnCode;
	private String batchName;
	private String barcode;
	private String quantity;
	private String freeQty;
	private String uqc;
	private String rate;
	private String itemTotal;
	private String ordlineref;
	private String originCountry;
	private String prdSino;
	private String chessisNo;
	private String machineNo;
	
	
	public String getSiNo() {
		return siNo;
	}
	public void setSiNo(String siNo) {
		this.siNo = siNo;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getHsnCode() {
		return hsnCode;
	}
	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getFreeQty() {
		return freeQty;
	}
	public void setFreeQty(String freeQty) {
		this.freeQty = freeQty;
	}
	public String getUqc() {
		return uqc;
	}
	public void setUqc(String uqc) {
		this.uqc = uqc;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getItemTotal() {
		return itemTotal;
	}
	public void setItemTotal(String itemTotal) {
		this.itemTotal = itemTotal;
	}
	public String getOrdlineref() {
		return ordlineref;
	}
	public void setOrdlineref(String ordlineref) {
		this.ordlineref = ordlineref;
	}
	public String getOriginCountry() {
		return originCountry;
	}
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}
	public String getPrdSino() {
		return prdSino;
	}
	public void setPrdSino(String prdSino) {
		this.prdSino = prdSino;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getChessisNo() {
		return chessisNo;
	}
	public void setChessisNo(String chessisNo) {
		this.chessisNo = chessisNo;
	}
	public String getMachineNo() {
		return machineNo;
	}
	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}
	public InvoiceItemDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InvoiceItemDetails(Long id, String siNo, String itemDescription, String hsnCode, String batchName, String barcode,
			String quantity, String freeQty, String uqc, String rate, String itemTotal, String ordlineref,
			String originCountry, String prdSino, String chessisNo, String machineNo) {
		super();
		this.id = id;
		this.siNo = siNo;
		this.itemDescription = itemDescription;
		this.hsnCode = hsnCode;
		this.batchName = batchName;
		this.barcode = barcode;
		this.quantity = quantity;
		this.freeQty = freeQty;
		this.uqc = uqc;
		this.rate = rate;
		this.itemTotal = itemTotal;
		this.ordlineref = ordlineref;
		this.originCountry = originCountry;
		this.prdSino = prdSino;
		this.chessisNo = chessisNo;
		this.machineNo = machineNo;
	}
	@Override
	public String toString() {
		return "ItemDetails [id=" + id + ", siNo=" + siNo + ", itemDescription=" + itemDescription + ", hsnCode="
				+ hsnCode + ", batchName=" + batchName + ", barcode=" + barcode + ", quantity=" + quantity
				+ ", freeQty=" + freeQty + ", uqc=" + uqc + ", rate=" + rate + ", itemTotal=" + itemTotal
				+ ", ordlineref=" + ordlineref + ", originCountry=" + originCountry + ", prdSino=" + prdSino
				+ ", chessisNo=" + chessisNo + ", machineNo=" + machineNo + "]";
	}
	 
	
}
