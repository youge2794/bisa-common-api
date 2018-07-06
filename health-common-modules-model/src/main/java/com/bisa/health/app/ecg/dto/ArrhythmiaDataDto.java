package com.bisa.health.app.ecg.dto;

public class ArrhythmiaDataDto {
	
	private boolean afib_flag;//boolean
	private int[] afib_plot_x;//byte[]
	private int[] afib_plot_y;//byte[]
	private boolean at_flag;
	private boolean pac_flag;//boolean
	private String pac_pvc_index;//byte[]
	private boolean pvc_flag;//boolean
	private boolean sb_flag;//boolean
	private boolean vt_flag; //boolean
	private boolean hyperk_flag;//boolean
	private boolean hypok_flag;//boolean
	private boolean hyperca_flag;//boolean
	private boolean hypoca_flag;
	private boolean qtc_long_flag;//boolean
	private boolean qtc_short_flag;//boolean
	private boolean qrs_wide_flag;//boolean
	private boolean twave_negative_flag;//boolean
	private boolean st_elevation_flag;//boolean
	private String session_start_time;
	private String session_end_time;
	private int sample_time;
	private String sample_time_unit;//Hz
	private String session_id;
	
	public boolean isAfib_flag() {
		return afib_flag;
	}

	public void setAfib_flag(boolean afib_flag) {
		this.afib_flag = afib_flag;
	}

	public int[] getAfib_plot_x() {
		return afib_plot_x;
	}

	public void setAfib_plot_x(int[] afib_plot_x) {
		this.afib_plot_x = afib_plot_x;
	}

	public int[] getAfib_plot_y() {
		return afib_plot_y;
	}

	public void setAfib_plot_y(int[] afib_plot_y) {
		this.afib_plot_y = afib_plot_y;
	}



	public boolean isAt_flag() {
		return at_flag;
	}



	public void setAt_flag(boolean at_flag) {
		this.at_flag = at_flag;
	}



	public boolean isPac_flag() {
		return pac_flag;
	}



	public void setPac_flag(boolean pac_flag) {
		this.pac_flag = pac_flag;
	}



	public String getPac_pvc_index() {
		return pac_pvc_index;
	}



	public void setPac_pvc_index(String pac_pvc_index) {
		this.pac_pvc_index = pac_pvc_index;
	}



	public boolean isPvc_flag() {
		return pvc_flag;
	}



	public void setPvc_flag(boolean pvc_flag) {
		this.pvc_flag = pvc_flag;
	}



	public boolean isSb_flag() {
		return sb_flag;
	}



	public void setSb_flag(boolean sb_flag) {
		this.sb_flag = sb_flag;
	}



	public boolean isVt_flag() {
		return vt_flag;
	}



	public void setVt_flag(boolean vt_flag) {
		this.vt_flag = vt_flag;
	}



	public boolean isHyperk_flag() {
		return hyperk_flag;
	}



	public void setHyperk_flag(boolean hyperk_flag) {
		this.hyperk_flag = hyperk_flag;
	}



	public boolean isHypok_flag() {
		return hypok_flag;
	}



	public void setHypok_flag(boolean hypok_flag) {
		this.hypok_flag = hypok_flag;
	}



	public boolean isHyperca_flag() {
		return hyperca_flag;
	}



	public void setHyperca_flag(boolean hyperca_flag) {
		this.hyperca_flag = hyperca_flag;
	}



	public boolean isHypoca_flag() {
		return hypoca_flag;
	}



	public void setHypoca_flag(boolean hypoca_flag) {
		this.hypoca_flag = hypoca_flag;
	}



	public boolean isQtc_long_flag() {
		return qtc_long_flag;
	}



	public void setQtc_long_flag(boolean qtc_long_flag) {
		this.qtc_long_flag = qtc_long_flag;
	}



	public boolean isQtc_short_flag() {
		return qtc_short_flag;
	}



	public void setQtc_short_flag(boolean qtc_short_flag) {
		this.qtc_short_flag = qtc_short_flag;
	}



	public boolean isQrs_wide_flag() {
		return qrs_wide_flag;
	}



	public void setQrs_wide_flag(boolean qrs_wide_flag) {
		this.qrs_wide_flag = qrs_wide_flag;
	}



	public boolean isTwave_negative_flag() {
		return twave_negative_flag;
	}



	public void setTwave_negative_flag(boolean twave_negative_flag) {
		this.twave_negative_flag = twave_negative_flag;
	}



	public boolean isSt_elevation_flag() {
		return st_elevation_flag;
	}



	public void setSt_elevation_flag(boolean st_elevation_flag) {
		this.st_elevation_flag = st_elevation_flag;
	}



	public String getSession_start_time() {
		return session_start_time;
	}



	public void setSession_start_time(String session_start_time) {
		this.session_start_time = session_start_time;
	}



	public String getSession_end_time() {
		return session_end_time;
	}



	public void setSession_end_time(String session_end_time) {
		this.session_end_time = session_end_time;
	}



	public int getSample_time() {
		return sample_time;
	}



	public void setSample_time(int sample_time) {
		this.sample_time = sample_time;
	}



	public String getSample_time_unit() {
		return sample_time_unit;
	}



	public void setSample_time_unit(String sample_time_unit) {
		this.sample_time_unit = sample_time_unit;
	}



	public String getSession_id() {
		return session_id;
	}



	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

/*

	public ArrhythmiaDataDto loadArrhythmiaDataDto(ArrhythmiaData arrhythmiaData){
		ArrhythmiaDataDto arrhythmiaDataDto = new ArrhythmiaDataDto();
		arrhythmiaDataDto.setAfib_flag(arrhythmiaData.getAfib_flag());
		arrhythmiaDataDto.setAfib_plot_x(arrhythmiaData.getAfib_plot_x());
		arrhythmiaDataDto.setAfib_plot_y(arrhythmiaData.getAfib_plot_y());
		arrhythmiaDataDto.setPac_flag(arrhythmiaData.getPac_flag());
		arrhythmiaDataDto.setPac_pvc_index(arrhythmiaData.getPac_pvc_index());
		arrhythmiaDataDto.setPvc_flag(arrhythmiaData.getPvc_flag());
		arrhythmiaDataDto.setSb_flag(arrhythmiaData.getSb_flag());
		arrhythmiaDataDto.setVt_flag(arrhythmiaData.getVt_flag());
		arrhythmiaDataDto.setHyperk_flag(arrhythmiaData.getHyperk_flag());
		arrhythmiaDataDto.setHypok_flag(arrhythmiaData.getHypok_flag());
		arrhythmiaDataDto.setHyperca_flag(arrhythmiaData.getHyperca_flag());
		arrhythmiaDataDto.setQtc_long_flag(arrhythmiaData.getQtc_long_flag());
		arrhythmiaDataDto.setQtc_short_flag(arrhythmiaData.getQtc_short_flag());
		arrhythmiaDataDto.setQrs_wide_flag(arrhythmiaData.getQrs_wide_flag());
		arrhythmiaDataDto.setTwave_negative_flag(arrhythmiaData.getTwave_negative_flag());
		arrhythmiaDataDto.setSt_elevation_flag(arrhythmiaData.getSt_elevation_flag());
		arrhythmiaDataDto.setSession_start_time(arrhythmiaData.getSession_start_time());
		arrhythmiaDataDto.setSession_end_time(arrhythmiaData.getSession_end_time());
		arrhythmiaDataDto.setSample_time(arrhythmiaData.getSample_time());
		arrhythmiaDataDto.setSession_id(arrhythmiaData.getSession_id());
		return arrhythmiaDataDto;
	}
	
	*/
}

