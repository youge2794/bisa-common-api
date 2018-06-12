package com.bisa.appweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import com.bisa.appweb.ecg.dto.DenoiseDataDto;

@Entity 
@Table(name="e_denoise_data",indexes={@Index(columnList="user_guid")})
public class DenoiseData {
	
	private int id;
	private String ecg;//byte[]
	private String maskinfo;//byte[]
	private String ecg_temp;//byte[]
	private String qrs_intv;
	private String pr_intv;
	private String qt_intv;
	private String qtc_intv;
	private String st_elev;
	private String hrv_rmssd;
	private String hrv_sdsd;
	private String sample_time;
	private String session_start_time;
	private String session_end_time;
	private String sensor_session_id;
	private int heart_rate;
	private String session_id;
	
	private int user_guid;
	private String dat_filename;
	private String report_number;
	private String datfile_time;
	
	private DenoiseDataDto denoiseDataDto;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEcg() {
		return ecg;
	}
	public void setEcg(String ecg) {
		this.ecg = ecg;
	}
	public String getMaskinfo() {
		return maskinfo;
	}
	public void setMaskinfo(String maskinfo) {
		this.maskinfo = maskinfo;
	}
	public String getEcg_temp() {
		return ecg_temp;
	}
	public void setEcg_temp(String ecg_temp) {
		this.ecg_temp = ecg_temp;
	}
	public String getQrs_intv() {
		return qrs_intv;
	}
	public void setQrs_intv(String qrs_intv) {
		this.qrs_intv = qrs_intv;
	}
	public String getPr_intv() {
		return pr_intv;
	}
	public void setPr_intv(String pr_intv) {
		this.pr_intv = pr_intv;
	}
	public String getQt_intv() {
		return qt_intv;
	}
	public void setQt_intv(String qt_intv) {
		this.qt_intv = qt_intv;
	}
	public String getQtc_intv() {
		return qtc_intv;
	}
	public void setQtc_intv(String qtc_intv) {
		this.qtc_intv = qtc_intv;
	}
	public String getSt_elev() {
		return st_elev;
	}
	public void setSt_elev(String st_elev) {
		this.st_elev = st_elev;
	}
	public String getHrv_rmssd() {
		return hrv_rmssd;
	}
	public void setHrv_rmssd(String hrv_rmssd) {
		this.hrv_rmssd = hrv_rmssd;
	}
	public String getHrv_sdsd() {
		return hrv_sdsd;
	}
	public void setHrv_sdsd(String hrv_sdsd) {
		this.hrv_sdsd = hrv_sdsd;
	}
	public String getSample_time() {
		return sample_time;
	}
	public void setSample_time(String sample_time) {
		this.sample_time = sample_time;
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
	public String getSensor_session_id() {
		return sensor_session_id;
	}
	public void setSensor_session_id(String sensor_session_id) {
		this.sensor_session_id = sensor_session_id;
	}
	public int getHeart_rate() {
		return heart_rate;
	}
	public void setHeart_rate(int heart_rate) {
		this.heart_rate = heart_rate;
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
	public DenoiseData() {
		super();
	}
	
	public DenoiseData(DenoiseDataDto denoiseDataDto) {
		super();
		this.denoiseDataDto = denoiseDataDto;
	}
	
	public DenoiseData loadDenoiseDataDto(int user_guid, String dat_filename, String report_number,String datfile_time){
		DenoiseData denoiseData = new DenoiseData();
		denoiseData.setEcg(intArrayToString(denoiseDataDto.getEcg()));
		denoiseData.setMaskinfo(intArrayToString(denoiseDataDto.getMaskinfo()));
		denoiseData.setEcg_temp(intArrayToString(denoiseDataDto.getEcg_temp()));
		denoiseData.setQrs_intv(String.valueOf(denoiseDataDto.getQrs_intv()));
		denoiseData.setPr_intv(String.valueOf(denoiseDataDto.getPr_intv()));
		denoiseData.setQt_intv(String.valueOf(denoiseDataDto.getQt_intv()));
		denoiseData.setQtc_intv(String.valueOf(denoiseDataDto.getQtc_intv()));
		denoiseData.setSt_elev(String.valueOf(denoiseDataDto.getSt_elev()));
		denoiseData.setHrv_rmssd(String.valueOf(denoiseDataDto.getHrv_rmssd()));
		denoiseData.setHrv_sdsd(String.valueOf(denoiseDataDto.getHrv_sdsd()));
		denoiseData.setSample_time(String.valueOf(denoiseDataDto.getSample_time()));
		denoiseData.setSession_start_time(denoiseDataDto.getSession_start_time());
		denoiseData.setSession_end_time(denoiseDataDto.getSession_end_time());
		denoiseData.setSensor_session_id(denoiseDataDto.getSensor_session_id());
		denoiseData.setHeart_rate(denoiseDataDto.getHeart_rate());
		denoiseData.setSession_id(denoiseDataDto.getSession_id());
		denoiseData.setUser_guid(user_guid);
		denoiseData.setDat_filename(dat_filename);
		denoiseData.setReport_number(report_number);
		denoiseData.setDatfile_time(datfile_time);
		return denoiseData;
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
