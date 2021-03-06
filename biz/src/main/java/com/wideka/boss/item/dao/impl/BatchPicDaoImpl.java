package com.wideka.boss.item.dao.impl;

import java.util.List;

import com.wideka.boss.api.item.bo.BatchPic;
import com.wideka.boss.framework.dao.impl.BaseDaoImpl;
import com.wideka.boss.item.dao.IBatchPicDao;

/**
 * 
 * @author JiakunXu
 * 
 */
public class BatchPicDaoImpl extends BaseDaoImpl implements IBatchPicDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<BatchPic> getBatchPicList(BatchPic batchPic) {
		return getSqlMapClientTemplate().queryForList("item.batch.pic.getBatchPicList", batchPic);
	}

}
