package com.papa2.boss.monitor.dao;

import java.util.List;

import com.papa2.boss.api.cache.bo.CacheStats;

/**
 * 
 * @author xujiakun
 * 
 */
public interface ICacheMonitorDao {

	/**
	 * 
	 * @param cacheStats
	 * @return
	 */
	int getCacheMonitorCount(CacheStats cacheStats);

	/**
	 * 
	 * @param cacheStats
	 * @return
	 */
	List<CacheStats> getCacheMonitorList(CacheStats cacheStats);

	/**
	 * 
	 * @param cacheStatsList
	 * @return
	 */
	String createCacheMonitor(List<CacheStats> cacheStatsList);

}
