package com.bisa.health.app.ecg.dto;

import org.apache.commons.lang3.StringUtils;

import com.bisa.health.app.model.DenoiseData;

public class DenoiseDataDto {
	
	private String session_id;
	private int[] ecg;//byte[]
	private String ecg_unit;
	private int[] maskinfo;//byte[]
	private int[] ecg_temp;//byte[]
	private int qrs_intv;
	private String qrs_intv_unit;  //msec
	private int pr_intv;
	private String pr_intv_unit; //msec
	private int qt_intv;
	private String qt_intv_unit;//msec
	private int qtc_intv;
	private String qtc_intv_unit; //msec
	private int st_elev;
	private String st_elev_unit;  //mm
	private int sample_time;  //250
	private String sample_time_unit;//Hz
	private int hrv_rmssd;
	private int hrv_sdsd;
	
	private String hrv_rmssd_unit; //msec
	private String hrv_sdsd_unit;//msec
	
	private String session_start_time;
	private String session_end_time;
	private String sensor_session_id;
	private int heart_rate;
	
	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public int[] getEcg() {
		return ecg;
	}

	public void setEcg(int[] ecg) {
		this.ecg = ecg;
	}

	public String getEcg_unit() {
		return ecg_unit;
	}

	public void setEcg_unit(String ecg_unit) {
		this.ecg_unit = ecg_unit;
	}

	public int[] getMaskinfo() {
		return maskinfo;
	}

	public void setMaskinfo(int[] maskinfo) {
		this.maskinfo = maskinfo;
	}

	public int[] getEcg_temp() {
		return ecg_temp;
	}

	public void setEcg_temp(int[] ecg_temp) {
		this.ecg_temp = ecg_temp;
	}

	public int getQrs_intv() {
		return qrs_intv;
	}

	public void setQrs_intv(int qrs_intv) {
		this.qrs_intv = qrs_intv;
	}

	public String getQrs_intv_unit() {
		return qrs_intv_unit;
	}

	public void setQrs_intv_unit(String qrs_intv_unit) {
		this.qrs_intv_unit = qrs_intv_unit;
	}

	public int getPr_intv() {
		return pr_intv;
	}

	public void setPr_intv(int pr_intv) {
		this.pr_intv = pr_intv;
	}

	public String getPr_intv_unit() {
		return pr_intv_unit;
	}

	public void setPr_intv_unit(String pr_intv_unit) {
		this.pr_intv_unit = pr_intv_unit;
	}

	public int getQt_intv() {
		return qt_intv;
	}

	public void setQt_intv(int qt_intv) {
		this.qt_intv = qt_intv;
	}

	public String getQt_intv_unit() {
		return qt_intv_unit;
	}

	public void setQt_intv_unit(String qt_intv_unit) {
		this.qt_intv_unit = qt_intv_unit;
	}

	public int getQtc_intv() {
		return qtc_intv;
	}

	public void setQtc_intv(int qtc_intv) {
		this.qtc_intv = qtc_intv;
	}

	public String getQtc_intv_unit() {
		return qtc_intv_unit;
	}

	public void setQtc_intv_unit(String qtc_intv_unit) {
		this.qtc_intv_unit = qtc_intv_unit;
	}

	public int getSt_elev() {
		return st_elev;
	}

	public void setSt_elev(int st_elev) {
		this.st_elev = st_elev;
	}

	public String getSt_elev_unit() {
		return st_elev_unit;
	}

	public void setSt_elev_unit(String st_elev_unit) {
		this.st_elev_unit = st_elev_unit;
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

	public int getHrv_rmssd() {
		return hrv_rmssd;
	}

	public void setHrv_rmssd(int hrv_rmssd) {
		this.hrv_rmssd = hrv_rmssd;
	}

	public int getHrv_sdsd() {
		return hrv_sdsd;
	}

	public void setHrv_sdsd(int hrv_sdsd) {
		this.hrv_sdsd = hrv_sdsd;
	}

	public String getHrv_rmssd_unit() {
		return hrv_rmssd_unit;
	}

	public void setHrv_rmssd_unit(String hrv_rmssd_unit) {
		this.hrv_rmssd_unit = hrv_rmssd_unit;
	}

	public String getHrv_sdsd_unit() {
		return hrv_sdsd_unit;
	}

	public void setHrv_sdsd_unit(String hrv_sdsd_unit) {
		this.hrv_sdsd_unit = hrv_sdsd_unit;
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

	public DenoiseDataDto(String session_id, int[] ecg, String ecg_unit, int[] maskinfo, int[] ecg_temp, int qrs_intv,
			String qrs_intv_unit, int pr_intv, String pr_intv_unit, int qt_intv, String qt_intv_unit, int qtc_intv,
			String qtc_intv_unit, int st_elev, String st_elev_unit, int sample_time, String sample_time_unit,
			int hrv_rmssd, int hrv_sdsd, String hrv_rmssd_unit, String hrv_sdsd_unit, String session_start_time,
			String session_end_time, String sensor_session_id, int heart_rate) {
		super();
		this.session_id = session_id;
		this.ecg = ecg;
		this.ecg_unit = ecg_unit;
		this.maskinfo = maskinfo;
		this.ecg_temp = ecg_temp;
		this.qrs_intv = qrs_intv;
		this.qrs_intv_unit = qrs_intv_unit;
		this.pr_intv = pr_intv;
		this.pr_intv_unit = pr_intv_unit;
		this.qt_intv = qt_intv;
		this.qt_intv_unit = qt_intv_unit;
		this.qtc_intv = qtc_intv;
		this.qtc_intv_unit = qtc_intv_unit;
		this.st_elev = st_elev;
		this.st_elev_unit = st_elev_unit;
		this.sample_time = sample_time;
		this.sample_time_unit = sample_time_unit;
		this.hrv_rmssd = hrv_rmssd;
		this.hrv_sdsd = hrv_sdsd;
		this.hrv_rmssd_unit = hrv_rmssd_unit;
		this.hrv_sdsd_unit = hrv_sdsd_unit;
		this.session_start_time = session_start_time;
		this.session_end_time = session_end_time;
		this.sensor_session_id = sensor_session_id;
		this.heart_rate = heart_rate;
	}

	public DenoiseDataDto() {
		super();
	}

	/*public DenoiseDataDto loadDenoiseDataDto(DenoiseData denoiseData){
		DenoiseDataDto denoiseDataDto = new DenoiseDataDto();
		denoiseDataDto.setSession_id(denoiseData.getSession_id());
		denoiseDataDto.setEcg(StringToArray(denoiseData.getEcg()));
		denoiseDataDto.setEcg_unit("");
		denoiseDataDto.setMaskinfo(maskinfo);
		denoiseDataDto.setEcg_temp(ecg_temp);
		denoiseDataDto.setQrs_intv(qrs_intv);
		denoiseDataDto.setQrs_intv_unit(qrs_intv_unit);
		denoiseDataDto.setPr_intv(pr_intv);
		denoiseDataDto.setPr_intv_unit(pr_intv_unit);
		denoiseDataDto.setQt_intv(qt_intv);
		denoiseDataDto.setQt_intv_unit(qt_intv_unit);
		denoiseDataDto.setQtc_intv(qtc_intv);
		denoiseDataDto.setQtc_intv_unit(qtc_intv_unit);
		denoiseDataDto.setSt_elev(st_elev);
		denoiseDataDto.setSt_elev_unit(st_elev_unit);
		denoiseDataDto.setSample_time(sample_time);
		denoiseDataDto.setSample_time_unit(sample_time_unit);
		denoiseDataDto.setHrv_rmssd(hrv_rmssd);
		denoiseDataDto.setHrv_sdsd(hrv_sdsd);
		denoiseDataDto.setHrv_rmssd_unit(hrv_rmssd_unit);
		denoiseDataDto.setHrv_sdsd_unit(hrv_sdsd_unit);
		denoiseDataDto.setSession_start_time(session_start_time);
		denoiseDataDto.setSession_end_time(session_end_time);
		denoiseDataDto.setSensor_session_id(sensor_session_id);
		denoiseDataDto.setHeart_rate(heart_rate);
		return denoiseDataDto;
	}*/


	//500,400,100,200
	private static int[] StringToArray(String str) {

		String[] arr = str.split(",");
		int[] int_arr = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			if(StringUtils.isEmpty(arr[i])){
				int_arr[i] = 0;
			}
			int_arr[i] = Integer.parseInt(arr[i]);
		}
		return int_arr;
	}
	
}
