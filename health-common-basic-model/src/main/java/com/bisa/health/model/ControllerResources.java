 package com.bisa.health.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 控制器资源，ActionResouces
 * @author Konghao
 *
 */
@Entity
@Table(name="sys_controller_res")
public class ControllerResources implements SystemResources {
	public static final String RES_TYPE="controller";
	/**
	 * 资源的标识
	 */
	private int id;
	
	/**
	 * 应用标识
	 */
	private int appid;
	
	/**
	 * 资源的名称，中文名称，组织机构管理，用户管理
	 */
	private String name;
	/**
	 * 资源的唯一标识，在我们的系统中，默认使用类名进行标识
	 */
	private String sn;
	/**
	 * 资源的父类标识
	 */
	private String psn;
	/**
	 * 资源所对应的类名:有可能有多个类，所以通过|进行分割
	 * org.konghao.sys.web.controller.OrgController|org.konghao.sys.web.controller.OrgTypeController
	 */
	private String className;
	/**
	 * 资源的排序号
	 */
	private int orderNum;
	
	
	public ControllerResources(int id, String name, String sn, String psn,
			String className, int orderNum) {
		super();
		this.id = id;
		this.name = name;
		this.sn = sn;
		this.psn = psn;
		this.className = className;
		this.orderNum = orderNum;
	}

	public void setClassName(String className) {
		if(this.className==null||"".equals(this.className)) {
			this.className = className;
		} else {
			if(this.className.indexOf(className)>=0) {
				//原有的className已经包含了，就直接返回
				return;
			} 
			this.className+="|"+className;
		}
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		
	public int getAppid() {
		return appid;
	}

	public void setAppid(int appid) {
		this.appid = appid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getPsn() {
		return psn;
	}
	public void setPsn(String psn) {
		this.psn = psn;
	}
	@Column(name="cname")
	public String getClassName() {
		return className;
	}
	@Column(name="order_num")
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	
	
	public ControllerResources() {
	}
}
