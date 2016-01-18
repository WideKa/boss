package com.wideka.boss.item.service.impl;

import com.wideka.boss.api.item.IItemBatchService;
import com.wideka.boss.api.item.bo.ItemBatch;
import com.wideka.boss.framework.log.Logger4jCollection;
import com.wideka.boss.framework.log.Logger4jExtend;
import com.wideka.boss.item.dao.IItemBatchDao;

/**
 * 
 * @author JiakunXu
 * 
 */
public class ItemBatchServiceImpl implements IItemBatchService {

	private Logger4jExtend logger = Logger4jCollection.getLogger(ItemBatchServiceImpl.class);

	private IItemBatchDao itemBatchDao;

	@Override
	public ItemBatch getItemBatch(String batchId) {
		// TODO Auto-generated method stub
		return null;
	}

	public IItemBatchDao getItemBatchDao() {
		return itemBatchDao;
	}

	public void setItemBatchDao(IItemBatchDao itemBatchDao) {
		this.itemBatchDao = itemBatchDao;
	}

}
