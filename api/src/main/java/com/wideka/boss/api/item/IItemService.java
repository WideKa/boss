package com.wideka.boss.api.item;

import com.wideka.boss.api.item.bo.Item;

/**
 * 
 * @author JiakunXu
 * 
 */
public interface IItemService {

	/**
	 * 
	 * @param itemId
	 * @return
	 */
	Item getItem(String itemId);

	/**
	 * 
	 * @param itemId
	 * @return
	 */
	Item getItem(Long itemId);

}
