package com.bisa.health.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="t_sessions",uniqueConstraints={@UniqueConstraint(columnNames={"session"})})
public class Sessions implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5495164622851414285L;
	
	private String id;
	private String session;
	
	@Id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(length=2000)
	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	
}
