package com.bisa.health.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * This message class is used for user center's header
 * @author Administrator
 */
@Entity
@Table(name="e_user_message",indexes={@Index(columnList="user_guid")})
public class UserMessage {
	
	private int id;
	private int user_guid;//the unique id for user
	private String message;//the message content 
	private int status; //whether read(unpush-1; pushed-2;)
	private int message_type; //1-15min report;2-24hour report
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}
	public int getMessage_type() {
		return message_type;
	}
	public void setMessage_type(int message_type) {
		this.message_type = message_type;
	}
	
}
	
	
