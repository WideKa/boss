package com.wideka.boss.trade.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.wideka.boss.api.trade.ITradeService;
import com.wideka.boss.api.trade.bo.Trade;
import com.wideka.boss.framework.bo.BooleanResult;
import com.wideka.boss.framework.log.Logger4jCollection;
import com.wideka.boss.framework.log.Logger4jExtend;
import com.wideka.boss.framework.util.DateUtil;
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

	@Override
	public BooleanResult updateTradeNo(String tradeId, String tradeNo, String modifyUser) {
		BooleanResult result = new BooleanResult();
		result.setResult(false);

		Trade trade = new Trade();

		if (StringUtils.isBlank(tradeId)) {
			result.setCode("交易编号不能为空。");
			return result;
		}

		try {
			trade.setTradeId(Long.valueOf(tradeId));
		} catch (NumberFormatException e) {
			logger.error(e);

			result.setCode("交易编号格式不匹配。");
			return result;
		}

		if (StringUtils.isNotBlank(tradeNo)) {
			trade.setTradeNo(tradeNo.trim());
		}

		if (StringUtils.isEmpty(modifyUser)) {
			result.setCode("操作人信息不能为空。");
			return result;
		}

		trade.setModifyUser(modifyUser);

		return updateTrade(trade);
	}

	@Override
	public BooleanResult updateTradeDate(String tradeId, String tradeDate, String modifyUser) {
		BooleanResult result = new BooleanResult();
		result.setResult(false);

		Trade trade = new Trade();

		if (StringUtils.isBlank(tradeId)) {
			result.setCode("交易编号不能为空。");
			return result;
		}

		try {
			trade.setTradeId(Long.valueOf(tradeId));
		} catch (NumberFormatException e) {
			logger.error(e);

			result.setCode("交易编号格式不匹配。");
			return result;
		}

		if (StringUtils.isNotBlank(tradeDate)) {
			try {
				DateUtil.datetime(tradeDate, DateUtil.DEFAULT_DATE_FORMAT);
			} catch (Exception e) {

				result.setCode("交易时间格式不匹配。");
				return result;
			}

			trade.setTradeDate(tradeDate);
		}

		if (StringUtils.isEmpty(modifyUser)) {
			result.setCode("操作人信息不能为空。");
			return result;
		}

		trade.setModifyUser(modifyUser);

		return updateTrade(trade);
	}

	private BooleanResult updateTrade(Trade trade) {
		BooleanResult result = new BooleanResult();
		result.setResult(false);

		try {
			int c = tradeDao.updateTrade(trade);
			if (c == 1) {
				result.setCode("修改交易数据成功！");
				result.setResult(true);
			}
		} catch (Exception e) {
			logger.error(LogUtil.parserBean(trade), e);

			result.setCode("更新交易数据表失败！");
		}

		return result;
	}

	public ITradeDao getTradeDao() {
		return tradeDao;
	}

	public void setTradeDao(ITradeDao tradeDao) {
		this.tradeDao = tradeDao;
	}

}
