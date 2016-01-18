package com.wideka.boss.api.item;

import com.wideka.boss.api.item.bo.ItemBatch;

/**
 * 
 * @author JiakunXu
 * 
 */
public interface IItemBatchService {

	/**
	 * 
	 * @param batchId
	 * @return
	 */
	ItemBatch getItemBatch(String batchId);

	/**
	 * 
	 * @param batchId
	 * @return
	 */
	ItemBatch getItemBatch(Long batchId);

}
