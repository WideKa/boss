package com.wideka.boss.item.service.impl;

import org.apache.commons.lang3.StringUtils;

import com.wideka.boss.api.item.IItemService;
import com.wideka.boss.api.item.bo.Item;
import com.wideka.boss.framework.log.Logger4jCollection;
import com.wideka.boss.framework.log.Logger4jExtend;
import com.wideka.boss.framework.util.LogUtil;
import com.wideka.boss.item.dao.IItemDao;

/**
 * 
 * @author JiakunXu
 * 
 */
public class ItemServiceImpl implements IItemService {

	private Logger4jExtend logger = Logger4jCollection.getLogger(ItemServiceImpl.class);

	private IItemDao itemDao;

	@Override
	public Item getItem(String itemId) {
		if (StringUtils.isBlank(itemId)) {
			return null;
		}

		try {
			return getItem(Long.valueOf(itemId));
		} catch (NumberFormatException e) {
			logger.error(itemId, e);
		}

		return null;
	}

	@Override
	public Item getItem(Long itemId) {
		if (itemId == null) {
			return null;
		}

		Item item = new Item();
		item.setItemId(itemId);

		try {
			return itemDao.getItem(item);
		} catch (Exception e) {
			logger.error(LogUtil.parserBean(item), e);
		}

		return null;
	}

	public IItemDao getItemDao() {
		return itemDao;
	}

	public void setItemDao(IItemDao itemDao) {
		this.itemDao = itemDao;
	}

}
