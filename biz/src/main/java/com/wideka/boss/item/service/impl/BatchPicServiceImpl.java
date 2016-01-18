package com.wideka.boss.item.service.impl;

import java.util.List;

import com.wideka.boss.api.item.IBatchPicService;
import com.wideka.boss.api.item.bo.BatchPic;
import com.wideka.boss.framework.log.Logger4jCollection;
import com.wideka.boss.framework.log.Logger4jExtend;
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
		// TODO Auto-generated method stub
		return null;
	}

	public IBatchPicDao getBatchPicDao() {
		return batchPicDao;
	}

	public void setBatchPicDao(IBatchPicDao batchPicDao) {
		this.batchPicDao = batchPicDao;
	}

}
