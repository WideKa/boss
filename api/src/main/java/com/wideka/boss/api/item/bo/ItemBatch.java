package com.wideka.boss.api.item.bo;

import java.io.Serializable;
import java.util.List;

/**
 * 批次.
 * 
 * @author JiakunXu
 * 
 */
public class ItemBatch implements Serializable {

	private static final long serialVersionUID = -7320842354430546694L;

	private Long batchId;

	private Long itemId;

	private String batchNo;

	/**
	 * 采茶时间.
	 */
	private String pickDate;

	/**
	 * 炒茶时间.
	 */
	private String friedDate;

	/**
	 * 包装时间.
	 */
	private String packDate;

	// >>>>>>>>>>以下是辅助属性<<<<<<<<<<

	/**
	 * 批次所属商品.
	 */
	private Item item;

	/**
	 * 批次相关图片.
	 */
	private List<BatchPic> batchPicList;

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getPickDate() {
		return pickDate;
	}

	public void setPickDate(String pickDate) {
		this.pickDate = pickDate;
	}

	public String getFriedDate() {
		return friedDate;
	}

	public void setFriedDate(String friedDate) {
		this.friedDate = friedDate;
	}

	public String getPackDate() {
		return packDate;
	}

	public void setPackDate(String packDate) {
		this.packDate = packDate;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public List<BatchPic> getBatchPicList() {
		return batchPicList;
	}

	public void setBatchPicList(List<BatchPic> batchPicList) {
		this.batchPicList = batchPicList;
	}

}
