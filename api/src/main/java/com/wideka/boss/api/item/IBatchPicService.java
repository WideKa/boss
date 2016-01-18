package com.wideka.boss.api.item;

import java.util.List;

import com.wideka.boss.api.item.bo.BatchPic;

/**
 * 
 * @author JiakunXu
 * 
 */
public interface IBatchPicService {

	/**
	 * 
	 * @param batchId
	 * @return
	 */
	List<BatchPic> getBatchPicList(String batchId);

}
