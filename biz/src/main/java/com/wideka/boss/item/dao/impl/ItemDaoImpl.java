package com.wideka.boss.item.dao.impl;

import com.wideka.boss.api.item.bo.Item;
import com.wideka.boss.framework.dao.impl.BaseDaoImpl;
import com.wideka.boss.item.dao.IItemDao;

/**
 * 
 * @author JiakunXu
 * 
 */
public class ItemDaoImpl extends BaseDaoImpl implements IItemDao {

	@Override
	public Item getItem(Item item) {
		return (Item) getSqlMapClientTemplate().queryForObject("item.getItem", item);
	}

}
