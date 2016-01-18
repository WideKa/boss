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

	private String tradeCode;

	private Long batchId;

	private String tradeNo;

	private String tradeDate;

	private String like;

	private String likeDate;

	private String modifyUser;

	// >>>>>>>>>>以下是辅助属性<<<<<<<<<<

	public Long getTradeId() {
		return tradeId;
	}

	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradeCode() {
		return tradeCode;
	}

	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
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

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}

	public String getLikeDate() {
		return likeDate;
	}

	public void setLikeDate(String likeDate) {
		this.likeDate = likeDate;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

}
