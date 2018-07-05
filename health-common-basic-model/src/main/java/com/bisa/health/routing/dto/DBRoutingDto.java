package com.bisa.health.routing.dto;

import java.io.Serializable;
import java.util.List;

import com.bisa.health.routing.entity.FragmentTable;
import com.bisa.health.routing.entity.Shard;
import com.bisa.health.routing.entity.ShardGroup;


public class DBRoutingDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean isWrite;
	private List<ShardGroup> listGroup;
	private List<Shard> listShard;
	private List<FragmentTable> listTable;
	public List<ShardGroup> getListGroup() {
		return listGroup;
	}
	public void setListGroup(List<ShardGroup> listGroup) {
		this.listGroup = listGroup;
	}
	public List<Shard> getListShard() {
		return listShard;
	}
	public void setListShard(List<Shard> listShard) {
		this.listShard = listShard;
	}
	public List<FragmentTable> getListTable() {
		return listTable;
	}
	public void setListTable(List<FragmentTable> listTable) {
		this.listTable = listTable;
	}

	public boolean isWrite() {
		return isWrite;
	}
	public void setWrite(boolean isWrite) {
		this.isWrite = isWrite;
	}
	
}
