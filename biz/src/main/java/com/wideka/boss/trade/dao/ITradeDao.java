package com.wideka.boss.trade.dao;

import java.util.List;

import com.wideka.boss.api.trade.bo.Trade;

/**
 * 
 * @author JiakunXu
 * 
 */
public interface ITradeDao {

	/**
	 * 
	 * @param trade
	 * @return
	 */
	int getTradeCount(Trade trade);

	/**
	 * 
	 * @param trade
	 * @return
	 */
	List<Trade> getTradeList(Trade trade);

	/**
	 * 
	 * @param trade
	 * @return
	 */
	int updateTrade(Trade trade);

	/**
	 * 
	 * @param trade
	 * @return
	 */
	Trade getTrade(Trade trade);

}
