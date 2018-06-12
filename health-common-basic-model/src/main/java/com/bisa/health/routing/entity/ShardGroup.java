package com.bisa.health.routing.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shard_group")
public class ShardGroup implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer sid;
	private String name;
	private boolean writable;
	private int start_id;
	private int end_id;
	private String ip;
	private int port;
	private String dbuser;
	private String dbpwd;
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(columnDefinition = "char(50)",nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isWritable() {
		return writable;
	}
	public void setWritable(boolean writable) {
		this.writable = writable;
	}
	
	public int getStart_id() {
		return start_id;
	}
	public void setStart_id(int start_id) {
		this.start_id = start_id;
	}
	public int getEnd_id() {
		return end_id;
	}
	public void setEnd_id(int end_id) {
		this.end_id = end_id;
	}
	@Column(columnDefinition = "char(15)",nullable=false)
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	@Column(columnDefinition = "char(15)",nullable=false)
	public String getDbuser() {
		return dbuser;
	}
	public void setDbuser(String dbuser) {
		this.dbuser = dbuser;
	}
	
	@Column(columnDefinition = "char(18)",nullable=false)
	public String getDbpwd() {
		return dbpwd;
	}
	public void setDbpwd(String dbpwd) {
		this.dbpwd = dbpwd;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}

	
	
}
