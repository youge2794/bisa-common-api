package com.bisa.health.common.entity;

import java.io.Serializable;

import org.codehaus.jackson.map.ObjectMapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class XinGeMsg implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    @JsonProperty("status")
	private int status;
    
    @JsonProperty("action")
	private String action;
    
    @JsonProperty("msg")
	private String msg;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		 ObjectMapper mapper = new ObjectMapper();
	        String repoStr = null;
	        try {
	            repoStr = mapper.writeValueAsString(this);

	        } catch (Exception e) {
	            //TODO do someting
	        }
	        return repoStr;
	}
	
	
	
}

