package com.wideka.boss.item.dao;

import java.util.List;

import com.wideka.boss.api.item.bo.BatchPic;

/**
 * 
 * @author JiakunXu
 * 
 */
public interface IBatchPicDao {

	/**
	 * 
	 * @param batchPic
	 * @return
	 */
	List<BatchPic> getBatchPicList(BatchPic batchPic);

}
