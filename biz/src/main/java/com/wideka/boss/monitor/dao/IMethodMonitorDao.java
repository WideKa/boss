package com.wideka.boss.monitor.dao;

import java.util.List;

import com.wideka.boss.api.monitor.bo.MethodMonitor;

/**
 * method monitor dao.
 * 
 * @author xujiakun
 * 
 */
public interface IMethodMonitorDao {

	/**
	 * 
	 * @param methodMonitor
	 * @return
	 */
	int getMethodMonitorCount(MethodMonitor methodMonitor);

	/**
	 * 
	 * @param methodMonitor
	 * @return
	 */
	List<MethodMonitor> getMethodMonitorList(MethodMonitor methodMonitor);

	/**
	 * 创建methodMonitor.
	 * 
	 * @param methodMonitor
	 * @return
	 */
	String createMethodMonitor(MethodMonitor methodMonitor);

}
