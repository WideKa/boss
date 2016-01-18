package com.wideka.boss.api.item.bo;

import java.io.Serializable;

/**
 * 批次相关图片.
 * 
 * @author JiakunXu
 * 
 */
public class BatchPic implements Serializable {

	private static final long serialVersionUID = -8491107956380001905L;

	private Long picId;

	private Long batchId;

	private String picUrl;

	public Long getPicId() {
		return picId;
	}

	public void setPicId(Long picId) {
		this.picId = picId;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

}
