/**
* 
*/
package com.bisa.health.basic.dao;

import java.lang.reflect.ParameterizedType;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;

import com.bisa.health.basic.entity.Pager;
import com.bisa.health.basic.entity.PagerQueryParam;
import com.bisa.health.basic.entity.SystemContext;


/**
 * @author Administrator
 *
 */
public class BaseDao<T> implements IBaseDao<T> {

	private SessionFactory sessionFactory;

	private Class<?> clz;

	public Class<?> getClz() {
		if (clz == null) {
			clz = ((Class<?>) (((ParameterizedType) (this.getClass().getGenericSuperclass()))
					.getActualTypeArguments()[0]));
		}
		return clz;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Inject
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#add(java.lang.Object)
	 */
	//@Override
	public T add(T t) {
		
		getSession().save(t);
		return t;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#update(java.lang.Object)
	 */
	//@Override
	public void update(T t) {
		getSession().update(t);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#delete(int)
	 */
	//@Override
	public void delete(int id) {
		getSession().delete(this.load(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#load(int)
	 */
	//@Override
	public T load(int id) {

		return (T) getSession().load(getClz(), id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#list(java.lang.String,
	 * java.lang.Object[])
	 */
	public List<T> list(String hql, Object[] args) {
		return this.list(hql, args, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#list(java.lang.String,
	 * java.lang.Object)
	 */
	public List<T> list(String hql, Object arg) {
		return this.list(hql, new Object[] { arg });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#list(java.lang.String)
	 */
	public List<T> list(String hql) {
		return this.list(hql, null);
	}
	
	private String initSort(String hql) {
		String order = SystemContext.getOrder();
		String sort = SystemContext.getSort();
		if(sort!=null&&!"".equals(sort.trim())) {
			hql+=" order by "+sort;
			if(!"desc".equals(order)) hql+=" asc";
			else hql+=" desc";
		}
		return hql;
	}

	private String initSort(String hql, PagerQueryParam pageParam) {

		if (pageParam != null) {
			String order = pageParam.getOrder();
			String sort = pageParam.getSort();
			if (sort != null && !"".equals(sort.trim())) {
				hql += " order by " + sort;
				if (!"desc".equals(order))
					hql += " asc";
				else
					hql += " desc";
			}
		}
		return hql;
	}

	@SuppressWarnings("rawtypes")
	private void setAliasParameter(Query query, Map<String, Object> alias) {
		if (alias != null) {
			Set<String> keys = alias.keySet();
			for (String key : keys) {
				Object val = alias.get(key);
				if (val instanceof Collection) {
					query.setParameterList(key, (Collection) val);
				} else {
					query.setParameter(key, val);
				}
			}
		}
	
	}
	

	private void setParameter(Query query, Object[] args) {
		if (args != null && args.length > 0) {
			int index = 0;
			for (Object arg : args) {
				query.setParameter(index++, arg);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#list(java.lang.String,
	 * java.lang.Object[], java.util.Map)
	 */
	public List<T> list(String hql, Object[] args, Map<String, Object> alias) {
		hql = initSort(hql, null);
		Query query = getSession().createQuery(hql);
		setAliasParameter(query, alias);
		setParameter(query, args);
		return query.list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#list(java.lang.String, java.util.Map)
	 */
	public List<T> listByAlias(String hql, Map<String, Object> alias) {
		return this.list(hql, null, alias);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#find(java.lang.String,
	 * java.lang.Object[])
	 */
	public Pager<T> find(String hql, Object[] args,PagerQueryParam pageParam) {
		return this.find(hql, args, null,pageParam);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#find(java.lang.String,
	 * java.lang.Object)
	 */
	public Pager<T> find(String hql, Object arg) {
		return this.find(hql, new Object[] { arg });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#find(java.lang.String)
	 */
	public Pager<T> find(String hql) {
		return this.find(hql, null);
	}
	
	@SuppressWarnings("rawtypes")
	private void setPagers(Query query,Pager pages) {
		Integer pageSize = SystemContext.getPageSize();
		Integer pageOffset = SystemContext.getPageOffset();
		if(pageOffset==null||pageOffset<0) pageOffset = 0;
		if(pageSize==null||pageSize<0) pageSize = 15;
		pages.setOffset(pageOffset);
		pages.setSize(pageSize);
		query.setFirstResult(pageOffset).setMaxResults(pageSize);
	}

	@SuppressWarnings("rawtypes")
	private void setPagers(Query query, Pager pages,PagerQueryParam pageParam) {
		Integer pageSize = pageParam.getSize();
		Integer pageOffset = pageParam.getOffset();
		if (pageOffset == null || pageOffset < 0)
			pageOffset = 0;
		if (pageSize == null || pageSize < 0)
			pageSize = 15;
		pages.setOffset(pageOffset);
		pages.setSize(pageSize);
		query.setFirstResult(pageOffset).setMaxResults(pageSize);
	}

	private String getCountHql(String hql, boolean isHql) {
		String e = hql.substring(hql.toLowerCase().indexOf("from"));
		String c = "select count(1) " + e;
		if (isHql)
			c = c.replaceAll("fetch", "");
		return c;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#find(java.lang.String,
	 * java.lang.Object[], java.util.Map)
	 */
	public Pager<T> find(String hql, Object[] args, Map<String, Object> alias,PagerQueryParam pageParam) {
		hql = initSort(hql, null);
		String cq = getCountHql(hql, true);
		Query cquery = getSession().createQuery(cq);
		Query query = getSession().createQuery(hql);
		// 设置别名参数
		setAliasParameter(query, alias);
		setAliasParameter(cquery, alias);
		// 设置参数
		setParameter(query, args);
		setParameter(cquery, args);
		Pager<T> pages = new Pager<T>();
		setPagers(query, pages,pageParam);
		List<T> datas = query.list();
		pages.setDatas(datas);
		long total = (Long) cquery.uniqueResult();
		pages.setTotal(total);
		return pages;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#find(java.lang.String, java.util.Map)
	 */
	public Pager<T> findByAlias(String hql, Map<String, Object> alias,PagerQueryParam pageParam) {
		return this.find(hql, null, alias,pageParam);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#queryObject(java.lang.String,
	 * java.lang.Object[])
	 */
	public Object queryObject(String hql, Object[] args) {
		return this.queryObject(hql, args, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#queryObject(java.lang.String,
	 * java.lang.Object)
	 */
	public Object queryObject(String hql, Object arg) {
		return this.queryObject(hql, new Object[] { arg });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#queryObject(java.lang.String)
	 */
	public Object queryObject(String hql) {
		return this.queryObject(hql, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#updateByHql(java.lang.String,
	 * java.lang.Object[])
	 */
	public void updateByHql(String hql, Object[] args) {
		Query query = getSession().createQuery(hql);
		setParameter(query, args);
		query.executeUpdate();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#updateByHql(java.lang.String,
	 * java.lang.Object)
	 */
	public void updateByHql(String hql, Object arg) {
		this.updateByHql(hql, new Object[] { arg });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#updateByHql(java.lang.String)
	 */
	public void updateByHql(String hql) {
		this.updateByHql(hql, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#listBySql(java.lang.String,
	 * java.lang.Object[], java.lang.Class, boolean)
	 */
	public <N extends Object> List<N> listBySql(String sql, Object[] args, Class<?> clz, boolean hasEntity) {
		return this.listBySql(sql, args, null, clz, hasEntity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#listBySql(java.lang.String,
	 * java.lang.Object, java.lang.Class, boolean)
	 */
	public <N extends Object> List<N> listBySql(String sql, Object arg, Class<?> clz, boolean hasEntity) {
		return this.listBySql(sql, new Object[] { arg }, clz, hasEntity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#listBySql(java.lang.String,
	 * java.lang.Class, boolean)
	 */
	public <N extends Object> List<N> listBySql(String sql, Class<?> clz, boolean hasEntity) {
		return this.listBySql(sql, null, clz, hasEntity);
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#listBySql(java.lang.String,
	 * java.lang.Class, boolean)
	 */
	public <N extends Object> List<N> listBySql(String sql, Object[] arg,Class<?> clz) {
		return this.listBySql(sql, arg, clz, true);
	}

	
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#listBySql(java.lang.String,
	 * java.lang.Object[], java.util.Map, java.lang.Class, boolean)
	 */
	public <N extends Object> List<N> listBySql(String sql, Object[] args, Map<String, Object> alias, Class<?> clz,
			boolean hasEntity) {
		sql = initSort(sql, null);
		SQLQuery sq = getSession().createSQLQuery(sql);
		if(alias!=null)
		setAliasParameter(sq, alias);
		setParameter(sq, args);
		if (hasEntity) {
			sq.addEntity(clz);
		} else
			sq.setResultTransformer(Transformers.aliasToBean(clz));
		return sq.list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#listBySql(java.lang.String,
	 * java.util.Map, java.lang.Class, boolean)
	 */
	public <N extends Object> List<N> listByAliasSql(String sql, Map<String, Object> alias, Class<?> clz,
			boolean hasEntity) {
		return this.listBySql(sql, null, alias, clz, hasEntity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#findBySql(java.lang.String,
	 * java.lang.Object[], java.lang.Class, boolean)
	 */
	public <N extends Object> Pager<N> findBySql(String sql, Object[] args, Class<?> clz, PagerQueryParam pageParam,
			boolean hasEntity) {
		return this.findBySql(sql, args, null, clz, pageParam, hasEntity);
	}
	
	public <N extends Object>Pager<N> findBySql(String sql, Object[] args, Class<?> clz, boolean hasEntity) {
		return this.findBySql(sql, args, null, clz, null, hasEntity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#findBySql(java.lang.String,
	 * java.lang.Object, java.lang.Class, boolean)
	 */
	public <N extends Object>Pager<N> findBySql(String sql, Object arg, Class<?> clz, boolean hasEntity) {
		return this.findBySql(sql, new Object[]{arg}, clz, hasEntity);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#findBySql(java.lang.String,
	 * java.lang.Class, boolean)
	 */
	public <N extends Object> Pager<N> findBySql(String sql, Class<?> clz, boolean hasEntity) {
		return this.findBySql(sql, null, clz, hasEntity);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#findBySql(java.lang.String,
	 * java.lang.Object[], java.util.Map, java.lang.Class, boolean)
	 */
	public <N extends Object> Pager<N> findBySql(String sql, Object[] args, Map<String, Object> alias, Class<?> clz,
			PagerQueryParam pageParam, boolean hasEntity) {
			
		if(pageParam == null){
			sql = initSort(sql);
		}else{
			sql = initSort(sql, pageParam);
		}

		String cq = getCountHql(sql, false);
		SQLQuery sq = getSession().createSQLQuery(sql);
		SQLQuery cquery = getSession().createSQLQuery(cq);
		setAliasParameter(sq, alias);
		setAliasParameter(cquery, alias);
		setParameter(sq, args);
		setParameter(cquery, args);
	
		Pager<N> pages = new Pager<N>();
		if(pageParam == null){
			setPagers(sq, pages);
		}else{
			setPagers(sq, pages,pageParam);
		}
		if (hasEntity) {
			sq.addEntity(clz);
		} else {
			sq.setResultTransformer(Transformers.aliasToBean(clz));
		}
		List<N> datas = sq.list();
		pages.setDatas(datas);
		long total = ((BigInteger) cquery.uniqueResult()).longValue();
		pages.setTotal(total);
		return pages;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.konghao.baisc.dao.IBaseDao#findBySql(java.lang.String,
	 * java.util.Map, java.lang.Class, boolean)
	 */
	public <N extends Object> Pager<N> findByAliasSql(String sql, Map<String, Object> alias, Class<?> clz,
			PagerQueryParam pageParam, boolean hasEntity) {
		return this.findBySql(sql, null, alias, clz, pageParam, hasEntity);
	}

	public Object queryObject(String hql, Object[] args, Map<String, Object> alias) {
		Query query = getSession().createQuery(hql);
		setAliasParameter(query, alias);
		setParameter(query, args);
		return query.uniqueResult();
	}

	public Object queryObjectByAlias(String hql, Map<String, Object> alias) {
		return this.queryObject(hql, null, alias);
	}
	
	
	/*
	 * BySql
	 */


	/**
	 * 获取持久状态的对象， 可直接set执行update
	 * @param sql
	 * @param args
	 * @param clz
	 * @return
	 */
	public T queryObjectBySql(String sql, Object[] args, Class<?> clz) {
		return queryObjectBySql(sql,args,clz,true);
	}

	public T queryObjectBySql(String sql, Object[] args, Class<?> clz, boolean hasEntity) {
		SQLQuery query = getSession().createSQLQuery(sql);
		if (args != null)
			setParameter(query, args);
		if (hasEntity) {
			query.addEntity(clz);
		} else {
			query.setResultTransformer(Transformers.aliasToBean(clz));
		}
		List<T> t = query.list();
		return t.isEmpty() ? null : t.get(0);
	}
	
	/**
	 * 获取托管状态的对象， 不可直接set执行update
	 * @param sql
	 * @param args
	 * @param clz
	 * @return
	 */
	public T selectObjectBySql(String sql, Object[] args, Class<?> clz){
		return selectObjectBySql(sql,args,clz,true);
	}
	
	public T selectObjectBySql(String sql, Object[] args, Class<?> clz, boolean hasEntity){
		SQLQuery query = getSession().createSQLQuery(sql);
		if (args != null)
			setParameter(query, args);
		if (hasEntity) {
			query.addEntity(clz);
		} else {
			query.setResultTransformer(Transformers.aliasToBean(clz));
		}
		List<T> t = query.list();
		
		if(!t.isEmpty()){
			T _t = t.get(0);
			this.getSession().evict(_t); //托管状态
			return _t;
		}else{
			return null;
		}
	}
	
	public int queryBySql(String sql, Object[] args) {
		SQLQuery query = getSession().createSQLQuery(sql);
		if (args != null)
			setParameter(query, args);
		return query.executeUpdate();
	}

	
	public long queryTotal(String sql, Object[] args){
		SQLQuery query = getSession().createSQLQuery(sql);
		if (args != null)
			setParameter(query, args);
		long total = ((BigInteger) query.uniqueResult()).longValue();
		return total;
	}
	
	public long queryIntegerTotal(String sql, Object[] args){
		SQLQuery query = getSession().createSQLQuery(sql);
		if (args != null)
			setParameter(query, args);
		long total = ((Integer) query.uniqueResult()).longValue();
		return total;
	}


	public int addBySql(String sql,Object[] args) {
		return queryBySql(sql,args);
	}


	public int updateBySql(String sql,Object[] args) {
		return queryBySql(sql,args);
	}


	public int deleteBySql(String sql,Object[] args) {
		return queryBySql(sql,args);
	}
}
