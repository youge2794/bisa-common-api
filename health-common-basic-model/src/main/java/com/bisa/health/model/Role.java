package com.bisa.health.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="t_role",uniqueConstraints={@UniqueConstraint(columnNames={"name"})})
public class Role implements Principal{
	public static final String PRINCIPAL_TYPE="role";
	private int id;
	/**
	 * 应用标识
	 */
	private Long guid;
	private String name;
	private int status;
	private String sn;
	private String create_time;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Long getGuid() {
		return guid;
	}

	public void setGuid(Long guid) {
		this.guid = guid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Column(columnDefinition = "datetime")
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	
	
}
