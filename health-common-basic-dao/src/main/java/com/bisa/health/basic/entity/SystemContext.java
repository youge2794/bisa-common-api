package com.bisa.health.basic.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 用来传列表对象的ThreadLocal数据
 * @author Administrator
 *
 */
public class SystemContext {
	
	
	/**
	 * 默认缓存5页数据
	 */
	public static double cachePage=5d;
	
	/**
	 * 分页大小
	 */
	private static ThreadLocal<Integer> pageSize = new ThreadLocal<Integer>();
	/**
	 * 分页的起始页
	 */
	private static ThreadLocal<Integer> pageOffset = new ThreadLocal<Integer>();
	/**
	 * 列表的排序字
	 */
	private static ThreadLocal<String> sort = new ThreadLocal<String>();
	/**
	 * 列表的排序方
	 */
	private static ThreadLocal<String> order = new ThreadLocal<String>();
	
	private static ThreadLocal<String> realPath = new ThreadLocal<String>();
	
	/**
	 * 分页缓存
	 * @return
	 */

	private static ThreadLocal<Integer> cacheIndex = new ThreadLocal<Integer>();
	
	private static ThreadLocal<Integer> cacheTotal = new ThreadLocal<Integer>();
	
	private static ThreadLocal<Integer> cacheDataIndex = new ThreadLocal<Integer>();
	
	private static ThreadLocal<Integer> cachePageSize = new ThreadLocal<Integer>();
	
	private static ThreadLocal<Integer> cacheOffset = new ThreadLocal<Integer>();
	
	

	
	
	public static Integer getCachePageSize() {
		return cachePageSize.get();
	}
	public static void setCachePageSize(Integer _cachePageSize) {
		SystemContext.cachePageSize.set(_cachePageSize);
	}
	public static Integer getCacheOffset() {
		return cacheOffset.get();
	}
	public static void setCacheOffset(Integer _cacheOffset) {
		SystemContext.cacheOffset.set(_cacheOffset);
	}
	public static Integer getCacheIndex() {
		return cacheIndex.get();
	}
	public static void setCacheIndex(Integer _cacheIndex) {
		SystemContext.cacheIndex.set(_cacheIndex);
	}
	public static Integer getCacheTotal() {
		return cacheTotal.get();
	}
	public static void setCacheTotal(Integer _cacheTotal) {
		SystemContext.cacheTotal.set(_cacheTotal);
	}
	public static Integer getCacheDataIndex() {
		return cacheDataIndex.get();
	}
	public static void setCacheDataIndex(Integer _cacheDataIndex) {
		SystemContext.cacheDataIndex.set(_cacheDataIndex);
	}
	public static String getRealPath() {
		return realPath.get();
	}
	public static void setRealPath(String _realPath) {
		SystemContext.realPath.set(_realPath);
	}
	public static Integer getPageSize() {
		return pageSize.get();
	}
	public static void setPageSize(Integer _pageSize) {
		pageSize.set(_pageSize);
	}
	public static Integer getPageOffset() {
		return pageOffset.get();
	}
	public static void setPageOffset(Integer _pageOffset) {
		pageOffset.set(_pageOffset);
	}
	public static String getSort() {
		return sort.get();
	}
	public static void setSort(String _sort) {
		SystemContext.sort.set(_sort);
	}
	public static String getOrder() {
		return order.get();
	}
	public static void setOrder(String _order) {
		SystemContext.order.set(_order);
	}
	
	public static void removePageSize() {
		pageSize.remove();
	}
	
	public static void removePageOffset() {
		pageOffset.remove();
	}
	
	public static void removeSort() {
		sort.remove();
	}
	
	public static void removeOrder() {
		order.remove();
	}
	
	public static void removeRealPath() {
		realPath.remove();
	}
	
	public static void setCachePage(int pageOffset,int pageSize){
		
		SystemContext.setCachePageSize(pageSize);
		
		double pageCacheTotal=pageSize*SystemContext.cachePage;
		int cacheIndex=(int) Math.ceil((pageOffset+1)*pageSize/pageCacheTotal);
		SystemContext.cacheIndex.set(cacheIndex);
		
		int limitOffset=(int) ((cacheIndex-1)*pageCacheTotal);
		SystemContext.setPageOffset(limitOffset-1);
		int limitSize=(int) pageCacheTotal;
		SystemContext.setPageSize(limitSize);

		int mCacheTotal=(int) (cacheIndex*pageCacheTotal);//算出pageSize对应的缓存索引
		SystemContext.setCacheTotal(mCacheTotal);
		
		int arrayIndex=(int) (SystemContext.cachePage-((mCacheTotal-((pageOffset+1)*pageSize))/pageSize));
		
		SystemContext.setCacheDataIndex(arrayIndex);
		
	}
	public static <T> List<T> getPageData(List<T> sourceData){
		
		int mDataIndex=SystemContext.getCacheDataIndex();
		int mPageSize=SystemContext.getCachePageSize();
		
		List<T> cacheData=new ArrayList<T>();
		
		for(int i=(mDataIndex-1)*mPageSize,j=0;j<mPageSize;i++,j++){
			if(i>sourceData.size()-1){
				break;
			}
			cacheData.add(sourceData.get(i));
		}
		return cacheData;
	}
}
