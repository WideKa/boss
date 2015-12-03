package com.wideka.boss.trade.action;

import java.util.List;

import com.wideka.boss.api.trade.ITradeService;
import com.wideka.boss.api.trade.bo.Trade;
import com.wideka.boss.framework.action.BaseAction;
import com.wideka.boss.framework.bo.BooleanResult;
import com.wideka.boss.framework.struts.annotations.JsonResult;

/**
 * 
 * @author JiakunXu
 * 
 */
public class TradeAction extends BaseAction {

	private static final long serialVersionUID = -3583761070404384603L;

	private ITradeService tradeService;

	private int total;

	private List<Trade> tradeList;

	private String tradeId;

	private String tradeNo;

	private String tradeDate;

	private String result;

	@JsonResult(field = "tradeList", include = { "tradeId", "tradeNo", "tradeDate", "like", "likeDate", "itemName",
		"sellerName" }, total = "total")
	public String getTradeJsonList() {
		Trade t = new Trade();
		t = getSearchInfo(t);

		total = tradeService.getTradeCount(t);

		if (total > 0) {
			tradeList = tradeService.getTradeList(t);
		}

		return JSON_RESULT;
	}

	@JsonResult(field = "result")
	public String updateTradeNo() {
		BooleanResult res = tradeService.updateTradeNo(tradeId, tradeNo, getUser().getUserId().toString());

		this.setResult(res.getCode());
		if (!res.getResult()) {
			this.getServletResponse().setStatus(500);
		}

		return JSON_RESULT;
	}

	@JsonResult(field = "result")
	public String updateTradeDate() {
		BooleanResult res = tradeService.updateTradeDate(tradeId, tradeDate, getUser().getUserId().toString());

		this.setResult(res.getCode());
		if (!res.getResult()) {
			this.getServletResponse().setStatus(500);
		}

		return JSON_RESULT;
	}

	public ITradeService getTradeService() {
		return tradeService;
	}

	public void setTradeService(ITradeService tradeService) {
		this.tradeService = tradeService;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Trade> getTradeList() {
		return tradeList;
	}

	public void setTradeList(List<Trade> tradeList) {
		this.tradeList = tradeList;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
