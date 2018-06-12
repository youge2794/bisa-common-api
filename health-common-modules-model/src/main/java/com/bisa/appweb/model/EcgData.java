package com.bisa.appweb.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name="e_ecg_data",indexes={@Index(columnList="user_guid")})
public class EcgData {
	
	private	int	id;
	
	private	String dat_filename; //文件名
	
	private	byte[] ecg_dat;  //心电数据
	
	private	String finished_time;  //心电数据上传到数据库的时间
	
	private String report_number;
	
	private String session_time;  //心电数据文件名上的数据时间
	
	private int user_guid;
	
	private long session_gmt_time; //心电数据文件名上的数据时间毫秒数
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDat_filename() {
		return dat_filename;
	}
	public void setDat_filename(String dat_filename) {
		this.dat_filename = dat_filename;
	}
	public byte[] getEcg_dat() {
		return ecg_dat;
	}
	public void setEcg_dat(byte[] ecg_dat) {
		this.ecg_dat = ecg_dat;
	}
	@Column(columnDefinition = "datetime")
	public String getFinished_time() {
		return finished_time;
	}
	public void setFinished_time(String finished_time) {
		this.finished_time = finished_time;
	}
	public String getReport_number() {
		return report_number;
	}
	public void setReport_number(String report_number) {
		this.report_number = report_number;
	}
	@Column(columnDefinition = "datetime")
	public String getSession_time() {
		return session_time;
	}
	public void setSession_time(String session_time) {
		this.session_time = session_time;
	}
	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}
	public long getSession_gmt_time() {
		return session_gmt_time;
	}
	public void setSession_gmt_time(long session_gmt_time) {
		this.session_gmt_time = session_gmt_time;
	}
	public EcgData() {
		super();
	}
	public EcgData(int id, String dat_filename, byte[] ecg_dat, String finished_time, String report_number,
			String session_time, int user_guid, long session_gmt_time) {
		super();
		this.id = id;
		this.dat_filename = dat_filename;
		this.ecg_dat = ecg_dat;
		this.finished_time = finished_time;
		this.report_number = report_number;
		this.session_time = session_time;
		this.user_guid = user_guid;
		this.session_gmt_time = session_gmt_time;
	}
}
