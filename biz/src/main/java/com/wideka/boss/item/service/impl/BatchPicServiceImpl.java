package com.wideka.boss.item.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.wideka.boss.api.item.IBatchPicService;
import com.wideka.boss.api.item.bo.BatchPic;
import com.wideka.boss.framework.log.Logger4jCollection;
import com.wideka.boss.framework.log.Logger4jExtend;
import com.wideka.boss.framework.util.LogUtil;
import com.wideka.boss.item.dao.IBatchPicDao;

/**
 * 
 * @author JiakunXu
 * 
 */
public class BatchPicServiceImpl implements IBatchPicService {

	private Logger4jExtend logger = Logger4jCollection.getLogger(BatchPicServiceImpl.class);

	private IBatchPicDao batchPicDao;

	@Override
	public List<BatchPic> getBatchPicList(String batchId) {
		if (StringUtils.isBlank(batchId)) {
			return null;
		}

		try {
			return getBatchPicList(Long.valueOf(batchId));
		} catch (NumberFormatException e) {
			logger.error(batchId, e);
		}

		return null;
	}

	@Override
	public List<BatchPic> getBatchPicList(Long batchId) {
		if (batchId == null) {
			return null;
		}

		BatchPic batchPic = new BatchPic();
		batchPic.setBatchId(batchId);

		try {
			return batchPicDao.getBatchPicList(batchPic);
		} catch (Exception e) {
			logger.error(LogUtil.parserBean(batchPic), e);
		}

		return null;
	}

	public IBatchPicDao getBatchPicDao() {
		return batchPicDao;
	}

	public void setBatchPicDao(IBatchPicDao batchPicDao) {
		this.batchPicDao = batchPicDao;
	}

}
