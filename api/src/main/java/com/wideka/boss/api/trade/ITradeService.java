package com.wideka.boss.api.trade;

import java.util.List;

import com.wideka.boss.api.trade.bo.Trade;
import com.wideka.boss.framework.bo.BooleanResult;

/**
 * 
 * @author JiakunXu
 * 
 */
public interface ITradeService {

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
	 * @param tradeId
	 * @param tradeNo
	 * @param modifyUser
	 * @return
	 */
	BooleanResult updateTradeNo(String tradeId, String tradeNo, String modifyUser);

	/**
	 * 
	 * @param tradeId
	 * @param tradeDate
	 * @param modifyUser
	 * @return
	 */
	BooleanResult updateTradeDate(String tradeId, String tradeDate, String modifyUser);

	/**
	 * 
	 * @param tradeCode
	 * @return
	 */
	Trade getTrade(String tradeCode);

	/**
	 * 
	 * @param tradeCode
	 * @param modifyUser
	 * @return
	 */
	BooleanResult like(String tradeCode, String modifyUser);

}
