package com.bisa.health.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import com.bisa.health.app.ecg.dto.ArrhythmiaDataDto;
@Entity
@Table(name="e_arrhythmia_data",indexes={@Index(columnList="user_guid")})
public class ArrhythmiaData {
	private int id;
	private int afib_flag;//boolean
	private String afib_plot_x;//byte[]
	private String afib_plot_y;//byte[]
	private int at_flag;
	private int pac_flag;//boolean
	private String pac_pvc_index;//byte[]
	private int pvc_flag;//boolean
	private int sb_flag;//boolean
	private int vt_flag; //boolean
	private int hyperk_flag;//boolean
	private int hypok_flag;//boolean
	private int hyperca_flag;//boolean
	private int hypoca_flag;
	private int qtc_long_flag;//boolean
	private int qtc_short_flag;//boolean
	private int qrs_wide_flag;//boolean
	private int twave_negative_flag;//boolean
	private int st_elevation_flag;//boolean
	private String session_start_time;
	private String session_end_time;
	private String sample_time;
	private String session_id;
	
	private int user_guid;
	private String dat_filename;
	private String report_number;
	private String datfile_time;
	
	private ArrhythmiaDataDto arrhythmiaDataDto;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAfib_flag() {
		return afib_flag;
	}
	public void setAfib_flag(int afib_flag) {
		this.afib_flag = afib_flag;
	}
	public String getAfib_plot_x() {
		return afib_plot_x;
	}
	public void setAfib_plot_x(String afib_plot_x) {
		this.afib_plot_x = afib_plot_x;
	}
	public String getAfib_plot_y() {
		return afib_plot_y;
	}
	public void setAfib_plot_y(String afib_plot_y) {
		this.afib_plot_y = afib_plot_y;
	}
	public int getPac_flag() {
		return pac_flag;
	}
	public void setPac_flag(int pac_flag) {
		this.pac_flag = pac_flag;
	}
	public String getPac_pvc_index() {
		return pac_pvc_index;
	}
	public void setPac_pvc_index(String pac_pvc_index) {
		this.pac_pvc_index = pac_pvc_index;
	}
	public int getPvc_flag() {
		return pvc_flag;
	}
	public void setPvc_flag(int pvc_flag) {
		this.pvc_flag = pvc_flag;
	}
	public int getSb_flag() {
		return sb_flag;
	}
	public void setSb_flag(int sb_flag) {
		this.sb_flag = sb_flag;
	}
	public int getVt_flag() {
		return vt_flag;
	}
	public void setVt_flag(int vt_flag) {
		this.vt_flag = vt_flag;
	}
	public int getHyperk_flag() {
		return hyperk_flag;
	}
	public void setHyperk_flag(int hyperk_flag) {
		this.hyperk_flag = hyperk_flag;
	}
	public int getHypok_flag() {
		return hypok_flag;
	}
	public void setHypok_flag(int hypok_flag) {
		this.hypok_flag = hypok_flag;
	}
	public int getHyperca_flag() {
		return hyperca_flag;
	}
	public void setHyperca_flag(int hyperca_flag) {
		this.hyperca_flag = hyperca_flag;
	}
	public int getQtc_long_flag() {
		return qtc_long_flag;
	}
	public void setQtc_long_flag(int qtc_long_flag) {
		this.qtc_long_flag = qtc_long_flag;
	}
	public int getQtc_short_flag() {
		return qtc_short_flag;
	}
	public void setQtc_short_flag(int qtc_short_flag) {
		this.qtc_short_flag = qtc_short_flag;
	}
	public int getQrs_wide_flag() {
		return qrs_wide_flag;
	}
	public void setQrs_wide_flag(int qrs_wide_flag) {
		this.qrs_wide_flag = qrs_wide_flag;
	}
	public int getTwave_negative_flag() {
		return twave_negative_flag;
	}
	public void setTwave_negative_flag(int twave_negative_flag) {
		this.twave_negative_flag = twave_negative_flag;
	}
	public int getSt_elevation_flag() {
		return st_elevation_flag;
	}
	public void setSt_elevation_flag(int st_elevation_flag) {
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
	public String getSample_time() {
		return sample_time;
	}
	public void setSample_time(String sample_time) {
		this.sample_time = sample_time;
	}
	public String getSession_id() {
		return session_id;
	}
	public void setSession_id(String session_id) {
		this.session_id = session_id;
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
	public String getReport_number() {
		return report_number;
	}
	public void setReport_number(String report_number) {
		this.report_number = report_number;
	}
	
	public String getDatfile_time() {
		return datfile_time;
	}
	public void setDatfile_time(String datfile_time) {
		this.datfile_time = datfile_time;
	}
	
	public int getAt_flag() {
		return at_flag;
	}
	public void setAt_flag(int at_flag) {
		this.at_flag = at_flag;
	}
	
	public int getHypoca_flag() {
		return hypoca_flag;
	}
	public void setHypoca_flag(int hypoca_flag) {
		this.hypoca_flag = hypoca_flag;
	}
	public ArrhythmiaData() {
		super();
	}
	public ArrhythmiaData(int id, int afib_flag, String afib_plot_x, String afib_plot_y, int at_flag, int pac_flag,
			String pac_pvc_index, int pvc_flag, int sb_flag, int vt_flag, int hyperk_flag, int hypok_flag,
			int hyperca_flag, int hypoca_flag, int qtc_long_flag, int qtc_short_flag, int qrs_wide_flag,
			int twave_negative_flag, int st_elevation_flag, String session_start_time, String session_end_time,
			String sample_time, String session_id, int user_guid, String dat_filename, String report_number,
			String datfile_time) {
		super();
		this.id = id;
		this.afib_flag = afib_flag;
		this.afib_plot_x = afib_plot_x;
		this.afib_plot_y = afib_plot_y;
		this.at_flag = at_flag;
		this.pac_flag = pac_flag;
		this.pac_pvc_index = pac_pvc_index;
		this.pvc_flag = pvc_flag;
		this.sb_flag = sb_flag;
		this.vt_flag = vt_flag;
		this.hyperk_flag = hyperk_flag;
		this.hypok_flag = hypok_flag;
		this.hyperca_flag = hyperca_flag;
		this.hypoca_flag = hypoca_flag;
		this.qtc_long_flag = qtc_long_flag;
		this.qtc_short_flag = qtc_short_flag;
		this.qrs_wide_flag = qrs_wide_flag;
		this.twave_negative_flag = twave_negative_flag;
		this.st_elevation_flag = st_elevation_flag;
		this.session_start_time = session_start_time;
		this.session_end_time = session_end_time;
		this.sample_time = sample_time;
		this.session_id = session_id;
		this.user_guid = user_guid;
		this.dat_filename = dat_filename;
		this.report_number = report_number;
		this.datfile_time = datfile_time;
	}
	
	public ArrhythmiaData(ArrhythmiaDataDto arrhythmiaDataDto) {
		super();
		this.arrhythmiaDataDto = arrhythmiaDataDto;
	}
	
	public ArrhythmiaData loadArrhythmiaData(int user_guid,String dat_filename,String report_number,String datfile_time){
		ArrhythmiaData arrhythmiaData = new ArrhythmiaData();
		arrhythmiaData.setAfib_flag((arrhythmiaDataDto.isAfib_flag())?1:0);
		arrhythmiaData.setAfib_plot_x(intArrayToString(arrhythmiaDataDto.getAfib_plot_x()));
		arrhythmiaData.setAfib_plot_y(intArrayToString(arrhythmiaDataDto.getAfib_plot_y()));
		arrhythmiaData.setAt_flag(arrhythmiaDataDto.isAt_flag()?1:0);
		arrhythmiaData.setPac_flag(arrhythmiaDataDto.isPac_flag()?1:0);
		arrhythmiaData.setPac_pvc_index(String.valueOf(arrhythmiaDataDto.getPac_pvc_index()));
		arrhythmiaData.setPvc_flag(arrhythmiaDataDto.isPvc_flag()?1:0);
		arrhythmiaData.setSb_flag(arrhythmiaDataDto.isSb_flag()?1:0);
		arrhythmiaData.setVt_flag(arrhythmiaDataDto.isVt_flag()?1:0);
		arrhythmiaData.setHyperk_flag(arrhythmiaDataDto.isHyperk_flag()?1:0);
		arrhythmiaData.setHypok_flag(arrhythmiaDataDto.isHypok_flag()?1:0);
		arrhythmiaData.setHyperca_flag(arrhythmiaDataDto.isHyperca_flag()?1:0);
		arrhythmiaData.setHypoca_flag(arrhythmiaDataDto.isHypoca_flag()?1:0);
		arrhythmiaData.setQtc_long_flag(arrhythmiaDataDto.isQtc_long_flag()?1:0);
		arrhythmiaData.setQtc_short_flag(arrhythmiaDataDto.isQtc_short_flag()?1:0);
		arrhythmiaData.setQrs_wide_flag(arrhythmiaDataDto.isQrs_wide_flag()?1:0);
		arrhythmiaData.setTwave_negative_flag(arrhythmiaDataDto.isTwave_negative_flag()?1:0);
		arrhythmiaData.setSt_elevation_flag(arrhythmiaDataDto.isSt_elevation_flag()?1:0);
		arrhythmiaData.setSession_start_time(arrhythmiaDataDto.getSession_start_time());
		arrhythmiaData.setSession_end_time(arrhythmiaDataDto.getSession_end_time());
		arrhythmiaData.setSample_time(String.valueOf(arrhythmiaDataDto.getSample_time()));
		arrhythmiaData.setSession_id(arrhythmiaDataDto.getSession_id());
		arrhythmiaData.setUser_guid(user_guid);	
		arrhythmiaData.setDat_filename(dat_filename);
		arrhythmiaData.setReport_number(report_number);
		arrhythmiaData.setDatfile_time(datfile_time);
		return arrhythmiaData;
	}
	private static String intArrayToString(int[] int_arr){
		String str = "";
		for(int i : int_arr){
			str += i + ",";
		}
		str = str.substring(0,str.length()-1);
		System.out.println(str);
		return str;
	}
}

