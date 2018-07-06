package com.bisa.health.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name="e_ecg_min_param",indexes={@Index(columnList="user_guid")})
public class MinReportParam {
	
	//心律  
	private	int	id;//	主键ID
	private	int	avg_heartRate; // 平均心率
	private	int	fastest_heartRate; // 最快心率
	private	int	slowest_heartRate; // 最慢心率
	private double bradycardia_rate; //心动过缓百分比
	private double tachycardia_rate; //心动过速百分比
	//心律异常
	private int pvc_count; //室早数，百分比
	private int pac_count; //房早数，百分比
	private double af_count; //房颤，百分比
	private double svt_count; //室上速百分比
	private double vt_count; //室速百分比
	//ST/QTC异常  
	private int st; //ST 段      平均高度
	//private int qtc;  //平均间期
	//技术参数
	private int avg_hr;   //平均心搏
	private int p_width;     //p波宽度
	private int p_r;      //P-R间期     
	private int qrs;   //从Q波开始到S波结束
	//private int qt_qtc;    //从Q波开始到T波结束
	//private String p_qrs_t;     // 如：6.30/35/29 deg
	//private String rii_svi; //如：2.5/0.12 mV
	
	private String report_number;
	private int user_guid;
	private String session_time;  //心电数据文件名上的数据时间
	private long session_gmt_time; //心电数据文件名上的数据时间毫秒数
	private	String dat_filename; //文件名

	private int qt;
	private int qtc;
	private int p;
	private int t;
	private double rii;
	private double svi;
	
	private	String suggest;	//总结建议
	private String fifteen_curves;	//15分钟心率曲线
	private int normal_cardiac_num;	//正常心博总数
	private double normal_cardiac;	//正常心博百分比
	private int bradycardia_total;	//心动过缓次数（过慢心博总数）
	private int tachycardia_total;	//心动过速次数（过快心博总数）
	private String pvc_curves;	//Pvc曲线
	private String pac_curves;	//Pac曲线

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAvg_heartRate() {
		return avg_heartRate;
	}
	public void setAvg_heartRate(int avg_heartRate) {
		this.avg_heartRate = avg_heartRate;
	}
	public int getFastest_heartRate() {
		return fastest_heartRate;
	}
	public void setFastest_heartRate(int fastest_heartRate) {
		this.fastest_heartRate = fastest_heartRate;
	}
	public int getSlowest_heartRate() {
		return slowest_heartRate;
	}
	public void setSlowest_heartRate(int slowest_heartRate) {
		this.slowest_heartRate = slowest_heartRate;
	}
	public double getBradycardia_rate() {
		return bradycardia_rate;
	}
	public void setBradycardia_rate(double bradycardia_rate) {
		this.bradycardia_rate = bradycardia_rate;
	}
	public double getTachycardia_rate() {
		return tachycardia_rate;
	}
	public void setTachycardia_rate(double tachycardia_rate) {
		this.tachycardia_rate = tachycardia_rate;
	}
	public int getPvc_count() {
		return pvc_count;
	}
	public void setPvc_count(int pvc_count) {
		this.pvc_count = pvc_count;
	}
	public int getPac_count() {
		return pac_count;
	}
	public void setPac_count(int pac_count) {
		this.pac_count = pac_count;
	}
	public double getAf_count() {
		return af_count;
	}
	public void setAf_count(double af_count) {
		this.af_count = af_count;
	}
	public double getSvt_count() {
		return svt_count;
	}
	public void setSvt_count(double svt_count) {
		this.svt_count = svt_count;
	}
	public double getVt_count() {
		return vt_count;
	}
	public void setVt_count(double vt_count) {
		this.vt_count = vt_count;
	}
	public int getSt() {
		return st;
	}
	public void setSt(int st) {
		this.st = st;
	}
	public int getAvg_hr() {
		return avg_hr;
	}
	public void setAvg_hr(int avg_hr) {
		this.avg_hr = avg_hr;
	}
	public int getP_width() {
		return p_width;
	}
	public void setP_width(int p_width) {
		this.p_width = p_width;
	}
	public int getP_r() {
		return p_r;
	}
	public void setP_r(int p_r) {
		this.p_r = p_r;
	}
	public int getQrs() {
		return qrs;
	}
	public void setQrs(int qrs) {
		this.qrs = qrs;
	}
	public String getReport_number() {
		return report_number;
	}
	public void setReport_number(String report_number) {
		this.report_number = report_number;
	}
	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}
	public String getSession_time() {
		return session_time;
	}
	public void setSession_time(String session_time) {
		this.session_time = session_time;
	}
	public long getSession_gmt_time() {
		return session_gmt_time;
	}
	public void setSession_gmt_time(long session_gmt_time) {
		this.session_gmt_time = session_gmt_time;
	}
	public String getDat_filename() {
		return dat_filename;
	}
	public void setDat_filename(String dat_filename) {
		this.dat_filename = dat_filename;
	}
	public int getQt() {
		return qt;
	}
	public void setQt(int qt) {
		this.qt = qt;
	}
	public int getQtc() {
		return qtc;
	}
	public void setQtc(int qtc) {
		this.qtc = qtc;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getT() {
		return t;
	}
	public void setT(int t) {
		this.t = t;
	}
	public double getRii() {
		return rii;
	}
	public void setRii(double rii) {
		this.rii = rii;
	}
	public double getSvi() {
		return svi;
	}
	public void setSvi(double svi) {
		this.svi = svi;
	}
	
	public String getSuggest() {
		return suggest;
	}
	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}
	public String getFifteen_curves() {
		return fifteen_curves;
	}
	public void setFifteen_curves(String fifteen_curves) {
		this.fifteen_curves = fifteen_curves;
	}
	public int getNormal_cardiac_num() {
		return normal_cardiac_num;
	}
	public void setNormal_cardiac_num(int normal_cardiac_num) {
		this.normal_cardiac_num = normal_cardiac_num;
	}
	public double getNormal_cardiac() {
		return normal_cardiac;
	}
	public void setNormal_cardiac(double normal_cardiac) {
		this.normal_cardiac = normal_cardiac;
	}
	public int getBradycardia_total() {
		return bradycardia_total;
	}
	public void setBradycardia_total(int bradycardia_total) {
		this.bradycardia_total = bradycardia_total;
	}
	public int getTachycardia_total() {
		return tachycardia_total;
	}
	public void setTachycardia_total(int tachycardia_total) {
		this.tachycardia_total = tachycardia_total;
	}
	public String getPvc_curves() {
		return pvc_curves;
	}
	public void setPvc_curves(String pvc_curves) {
		this.pvc_curves = pvc_curves;
	}
	public String getPac_curves() {
		return pac_curves;
	}
	public void setPac_curves(String pac_curves) {
		this.pac_curves = pac_curves;
	}
	public MinReportParam() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
