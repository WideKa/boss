package com.wideka.boss.item.service.impl;

import org.apache.commons.lang3.StringUtils;

import com.wideka.boss.api.item.IBatchPicService;
import com.wideka.boss.api.item.IItemBatchService;
import com.wideka.boss.api.item.IItemService;
import com.wideka.boss.api.item.bo.ItemBatch;
import com.wideka.boss.framework.log.Logger4jCollection;
import com.wideka.boss.framework.log.Logger4jExtend;
import com.wideka.boss.framework.util.LogUtil;
import com.wideka.boss.item.dao.IItemBatchDao;

/**
 * 
 * @author JiakunXu
 * 
 */
public class ItemBatchServiceImpl implements IItemBatchService {

	private Logger4jExtend logger = Logger4jCollection.getLogger(ItemBatchServiceImpl.class);

	private IItemService itemService;

	private IBatchPicService batchPicService;

	private IItemBatchDao itemBatchDao;

	@Override
	public ItemBatch getItemBatch(String batchId) {
		if (StringUtils.isBlank(batchId)) {
			return null;
		}

		try {
			return getItemBatch(Long.valueOf(batchId));
		} catch (NumberFormatException e) {
			logger.error(batchId, e);
		}

		return null;
	}

	@Override
	public ItemBatch getItemBatch(Long batchId) {
		if (batchId == null) {
			return null;
		}

		ItemBatch itemBatch = new ItemBatch();
		itemBatch.setBatchId(batchId);

		try {
			itemBatch = itemBatchDao.getItemBatch(itemBatch);
		} catch (Exception e) {
			logger.error(LogUtil.parserBean(itemBatch), e);

			return null;
		}

		if (itemBatch != null) {
			itemBatch.setItem(itemService.getItem(itemBatch.getItemId()));
			itemBatch.setBatchPicList(batchPicService.getBatchPicList(batchId));
		}

		return itemBatch;
	}

	public IItemService getItemService() {
		return itemService;
	}

	public void setItemService(IItemService itemService) {
		this.itemService = itemService;
	}

	public IBatchPicService getBatchPicService() {
		return batchPicService;
	}

	public void setBatchPicService(IBatchPicService batchPicService) {
		this.batchPicService = batchPicService;
	}

	public IItemBatchDao getItemBatchDao() {
		return itemBatchDao;
	}

	public void setItemBatchDao(IItemBatchDao itemBatchDao) {
		this.itemBatchDao = itemBatchDao;
	}

}
