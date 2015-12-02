package com.wideka.boss.api.trade.bo;

import com.wideka.boss.framework.bo.SearchInfo;

/**
 * 
 * @author JiakunXu
 * 
 */
public class Trade extends SearchInfo {

	private static final long serialVersionUID = 6866948669774091844L;

	private Long tradeId;

	private String tradeNo;

	private String tradeDate;

	// >>>>>>>>>>以下是辅助属性<<<<<<<<<<

	private String itemName;

	private String sellerName;

	public Long getTradeId() {
		return tradeId;
	}

	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
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
