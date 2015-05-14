package com.papa2.boss.api.monitor;

import java.util.List;

import com.papa2.boss.api.monitor.bo.MethodMonitor;
import com.papa2.boss.framework.bo.BooleanResult;

/**
 * method monitor.
 * 
 * @author xujiakun
 * 
 */
public interface IMethodMonitorService {

	String ERROR_MESSAGE = "操作失败！";

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
	BooleanResult createMethodMonitor(MethodMonitor methodMonitor);

}
