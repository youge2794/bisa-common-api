package com.bisa.appweb.dto;

import java.util.ArrayList;
import java.util.List;

import com.bisa.health.model.UserAuths;

public class AppUserDto {
	
	private int l_type;
	
	private String username;
	
	
	public int getL_type() {
		return l_type;
	}
	public void setL_type(int l_type) {
		this.l_type = l_type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public AppUserDto(int l_type, String username) {
		super();
		this.l_type = l_type;
		this.username = username;
	}
	public AppUserDto() {
		super();
	}
	public AppUserDto takeAppUserDto(UserAuths user){
		AppUserDto appUserDto = new AppUserDto();
		appUserDto.setL_type(user.getL_type());
		appUserDto.setUsername(user.getUsername());
		return appUserDto;
	}
	public static  List<AppUserDto> takeListAppUserDto(List<UserAuths> list){
		
		if(list==null){
			return null;
		}
		List<AppUserDto> audList = new ArrayList<AppUserDto>();
		for (UserAuths user : list) {
			AppUserDto apd = new AppUserDto();
			audList.add(apd.takeAppUserDto(user));
		}
		return audList;
	}
	
}
