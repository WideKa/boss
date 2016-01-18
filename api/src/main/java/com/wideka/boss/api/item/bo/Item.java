package com.wideka.boss.api.item.bo;

import java.io.Serializable;

/**
 * 商品.
 * 
 * @author JiakunXu
 * 
 */
public class Item implements Serializable {

	private static final long serialVersionUID = 4151870703550954517L;

	private Long itemId;

	/**
	 * 卖家.
	 */
	private Long sellerId;

	private String itemNo;

	private String itemName;

	// >>>>>>>>>>以下是辅助属性<<<<<<<<<<

	private String sellerName;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

}
