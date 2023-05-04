package com.dispatch.entity;



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
@Table(name="REFLEX_ITEMDETAILS")
public class ReflexItemsDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String itemCode;
	private String itemDescription;
	private String itemQty;
	private String orderNo;
	private String customerOrderNo;
	private String hazardousMaterial;
	private String itemNetWeight;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "parcel_id")
//	private ParcelDetails parcelDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemQty() {
		return itemQty;
	}

	public void setItemQty(String itemQty) {
		this.itemQty = itemQty;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getCustomerOrderNo() {
		return customerOrderNo;
	}

	public void setCustomerOrderNo(String customerOrderNo) {
		this.customerOrderNo = customerOrderNo;
	}

	public String getHazardousMaterial() {
		return hazardousMaterial;
	}

	public void setHazardousMaterial(String hazardousMaterial) {
		this.hazardousMaterial = hazardousMaterial;
	}

	public String getItemNetWeight() {
		return itemNetWeight;
	}

	public void setItemNetWeight(String itemNetWeight) {
		this.itemNetWeight = itemNetWeight;
	}

 
 
	public ReflexItemsDetails(Long id, String itemCode, String itemDescription, String itemQty, String orderNo,
			String customerOrderNo, String hazardousMaterial, String itemNetWeight) {
		super();
		this.id = id;
		this.itemCode = itemCode;
		this.itemDescription = itemDescription;
		this.itemQty = itemQty;
		this.orderNo = orderNo;
		this.customerOrderNo = customerOrderNo;
		this.hazardousMaterial = hazardousMaterial;
		this.itemNetWeight = itemNetWeight;
	}

	public ReflexItemsDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ItemsDetails [id=" + id + ", itemCode=" + itemCode + ", itemDescription=" + itemDescription
				+ ", itemQty=" + itemQty + ", orderNo=" + orderNo + ", customerOrderNo=" + customerOrderNo
				+ ", hazardousMaterial=" + hazardousMaterial + ", itemNetWeight=" + itemNetWeight  + "]";
	}

 
	
}
