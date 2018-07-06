package com.bisa.health.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="e_event",uniqueConstraints={@UniqueConstraint(columnNames="user_guid")})
public class Event {
	
	private int id;
	/*
	 * identify id
	 */
	private int user_guid;  
	/**
	 * contact method
	 * 1-phone
	 * 2-mail
	 */
	private int eventI_type;
	/**
	 * contact name
	 */
	private String eventI_name;
	/**
	 *contact number
	 */
	private String eventI_num;
	private String eventI_mail;
	//the second contact
	private int eventII_type;
	private String eventII_name;
	private String eventII_num;
	private String eventII_mail;
	
	//the third contact
	private int eventIII_type;
	private String eventIII_name;
	private String eventIII_num;
	private String eventIII_mail;
	//the forth contact
	/*
	private int eventIV_type;
	private String eventIV_name;
	private String eventIV_num;
	*/
	
	//the fifth contact
	/*
	private int eventV_type;
	private String eventV_name;
	private String eventV_num;
	*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@Column(length=4)
	public int getEventI_type() {
		return eventI_type;
	}
	public void setEventI_type(int eventI_type) {
		this.eventI_type = eventI_type;
	}
	@Column(length=24)
	public String getEventI_name() {
		return eventI_name;
	}
	public void setEventI_name(String eventI_name) {
		this.eventI_name = eventI_name;
	}
	
	public int getEventII_type() {
		return eventII_type;
	}
	public void setEventII_type(int eventII_type) {
		this.eventII_type = eventII_type;
	}
	@Column(length=24)
	public String getEventII_name() {
		return eventII_name;
	}
	public void setEventII_name(String eventII_name) {
		this.eventII_name = eventII_name;
	}
	public int getEventIII_type() {
		return eventIII_type;
	}
	public void setEventIII_type(int eventIII_type) {
		this.eventIII_type = eventIII_type;
	}
	@Column(length=24)
	public String getEventIII_name() {
		return eventIII_name;
	}
	public void setEventIII_name(String eventIII_name) {
		this.eventIII_name = eventIII_name;
	}
	@Column(length=20)
	public String getEventI_num() {
		return eventI_num;
	}
	public void setEventI_num(String eventI_num) {
		this.eventI_num = eventI_num;
	}
	@Column(length=20)
	public String getEventII_num() {
		return eventII_num;
	}
	public void setEventII_num(String eventII_num) {
		this.eventII_num = eventII_num;
	}
	@Column(length=20)
	public String getEventIII_num() {
		return eventIII_num;
	}
	public void setEventIII_num(String eventIII_num) {
		this.eventIII_num = eventIII_num;
	}
	
	public String getEventI_mail() {
		return eventI_mail;
	}
	public void setEventI_mail(String eventI_mail) {
		this.eventI_mail = eventI_mail;
	}
	public String getEventII_mail() {
		return eventII_mail;
	}
	public void setEventII_mail(String eventII_mail) {
		this.eventII_mail = eventII_mail;
	}
	public String getEventIII_mail() {
		return eventIII_mail;
	}
	public void setEventIII_mail(String eventIII_mail) {
		this.eventIII_mail = eventIII_mail;
	}
	public Event() {
		super();
	}
}
