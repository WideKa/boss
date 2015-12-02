package com.wideka.boss.trade.service.impl;

import java.util.List;

import com.wideka.boss.api.trade.ITradeService;
import com.wideka.boss.api.trade.bo.Trade;
import com.wideka.boss.framework.log.Logger4jCollection;
import com.wideka.boss.framework.log.Logger4jExtend;
import com.wideka.boss.framework.util.LogUtil;
import com.wideka.boss.trade.dao.ITradeDao;

/**
 * 
 * @author JiakunXu
 * 
 */
public class TradeServiceImpl implements ITradeService {

	private Logger4jExtend logger = Logger4jCollection.getLogger(TradeServiceImpl.class);

	private ITradeDao tradeDao;

	@Override
	public int getTradeCount(Trade trade) {
		if (trade == null) {
			return 0;
		}

		try {
			return tradeDao.getTradeCount(trade);
		} catch (Exception e) {
			logger.error(LogUtil.parserBean(trade), e);
		}

		return 0;
	}

	@Override
	public List<Trade> getTradeList(Trade trade) {
		if (trade == null) {
			return null;
		}

		try {
			return tradeDao.getTradeList(trade);
		} catch (Exception e) {
			logger.error(LogUtil.parserBean(trade), e);
		}

		return null;
	}

	public ITradeDao getTradeDao() {
		return tradeDao;
	}

	public void setTradeDao(ITradeDao tradeDao) {
		this.tradeDao = tradeDao;
	}

}
