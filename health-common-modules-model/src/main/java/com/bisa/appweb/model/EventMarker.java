package com.bisa.appweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name="e_event_marker",indexes={@Index(columnList="dat_filename")})
public class EventMarker {
	
	private int id;
	private int user_guid;
	private String dat_filename;
	private String session_time;
	private int position_start;
	private int position_end;
	private int marker_type;
	private int status;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}
	public String getDat_filename() {
		return dat_filename;
	}
	public void setDat_filename(String dat_filename) {
		this.dat_filename = dat_filename;
	}
	
	@Column(columnDefinition = "datetime")
	public String getSession_time() {
		return session_time;
	}
	public void setSession_time(String session_time) {
		this.session_time = session_time;
	}
	public int getMarker_type() {
		return marker_type;
	}
	public void setMarker_type(int marker_type) {
		this.marker_type = marker_type;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getPosition_start() {
		return position_start;
	}
	public void setPosition_start(int position_start) {
		this.position_start = position_start;
	}
	public int getPosition_end() {
		return position_end;
	}
	public void setPosition_end(int position_end) {
		this.position_end = position_end;
	}
	
}
