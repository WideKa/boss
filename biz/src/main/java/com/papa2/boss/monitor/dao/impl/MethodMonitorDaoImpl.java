package com.papa2.boss.monitor.dao.impl;

import java.util.List;

import com.papa2.boss.api.monitor.bo.MethodMonitor;
import com.papa2.boss.framework.dao.impl.BaseDaoImpl;
import com.papa2.boss.monitor.dao.IMethodMonitorDao;

/**
 * 
 * @author xujiakun
 * 
 */
public class MethodMonitorDaoImpl extends BaseDaoImpl implements IMethodMonitorDao {

	@Override
	public int getMethodMonitorCount(MethodMonitor methodMonitor) {
		return (Integer) getSqlMapClientTemplate()
			.queryForObject("monitor.method.getMethodMonitorCount", methodMonitor);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MethodMonitor> getMethodMonitorList(MethodMonitor methodMonitor) {
		return (List<MethodMonitor>) getSqlMapClientTemplate().queryForList("monitor.method.getMethodMonitorList",
			methodMonitor);
	}

	@Override
	public String createMethodMonitor(MethodMonitor methodMonitor) {
		return (String) getSqlMapClientTemplate().insert("monitor.method.createMethodMonitor", methodMonitor);
	}

}
