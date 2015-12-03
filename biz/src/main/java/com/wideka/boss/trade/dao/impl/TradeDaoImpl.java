package com.wideka.boss.trade.dao.impl;

import java.util.List;

import com.wideka.boss.api.trade.bo.Trade;
import com.wideka.boss.framework.dao.impl.BaseDaoImpl;
import com.wideka.boss.trade.dao.ITradeDao;

/**
 * 
 * @author JiakunXu
 * 
 */
public class TradeDaoImpl extends BaseDaoImpl implements ITradeDao {

	@Override
	public int getTradeCount(Trade trade) {
		return (Integer) getSqlMapClientTemplate().queryForObject("trade.getTradeCount", trade);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Trade> getTradeList(Trade trade) {
		return (List<Trade>) getSqlMapClientTemplate().queryForList("trade.getTradeList", trade);
	}

	@Override
	public int updateTrade(Trade trade) {
		return getSqlMapClientTemplate().update("trade.updateTrade", trade);
	}

}
