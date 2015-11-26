package com.wideka.boss.monitor.dao;

import java.util.List;

import com.wideka.boss.api.monitor.bo.ActionMonitor;

/**
 * 
 * @author xujiakun
 * 
 */
public interface IActionMonitorDao {

	/**
	 * 
	 * @param logs
	 * @return
	 */
	int createActionMonitor(List<ActionMonitor> logs);

	/**
	 * 
	 * @param log
	 * @return
	 */
	int getActionMonitorCount(ActionMonitor log);

	/**
	 * 
	 * @param log
	 * @return
	 */
	List<ActionMonitor> getActionMonitorList(ActionMonitor log);

}
