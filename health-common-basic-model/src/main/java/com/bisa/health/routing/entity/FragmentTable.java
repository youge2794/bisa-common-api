package com.bisa.health.routing.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fragment_table")
public class FragmentTable implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int shard_id;
	private int start_id;
	private int end_id;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(columnDefinition = "char(25)",nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getShard_id() {
		return shard_id;
	}
	public void setShard_id(int shard_id) {
		this.shard_id = shard_id;
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
	
	
}
