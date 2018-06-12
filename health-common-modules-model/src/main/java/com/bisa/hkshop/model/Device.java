package com.bisa.hkshop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_device")
public class Device {
	private int id;
	private String country;		//国家
	private String time_zone;  //地区
	private int batch;	   //生产批次
	//private Date produced_date; //生产日期 
	private String year;  //生产年
	private String month;	//生产月
	private String batch_num;  //生产批次顺序
	private String device_fid;  //工厂唯一编号(产品顺序批号000000-999999)
	private String shipment_date;  //出货日期（出库时间）
	private String shipment_tel;    //出货电话
	private String shipment_country;  //出货城市
	private String shipment_isnot;   //是否出库  10:出库  20:没出库
	private String logistics_number;  //运单号
	private Date warranty_date;  //保修日期
	private String order_no;   //订单号
	private Date delivery_date;  //到货日期
	private Date fdate;   //维修日期
	private String device_id;   //程序员唯一的设备id HC+180300 CN 000001
	private Date update_time;  //更新时间
	private Date insert_time;  //插入时间(入库时间)
	private String finished_categories; //成品类别 HC+
	private String finishedpro_num;  //成品生产批号(年+月+批次<00-99>) 180300
	private String sales_area;   //销售区域  CN
	private String warranty_status;  //保修状态（10：无保修    20:未激活   30:保修中   40:已过期）
	private String warehouse_man;  //入库人
	private String shipment_man;   //出库人
	private String product_id;	//商品id
	private String sn;   //成品序列号 保留字段  SN180300 000001
	private int p_type_id;   //产品类别
	private int user_guid; 
	private int sn_index;   //分表id
	private int del_status;
 	private String shipment_status; //出库状态：1正常出库 2：换货出库
 	private String scrapped_status; //设备是否报废：0：报废  1：维修
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTime_zone() {
		return time_zone;
	}
	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getShipment_date() {
		return shipment_date;
	}
	public void setShipment_date(String shipment_date) {
		this.shipment_date = shipment_date;
	}
	public String getShipment_tel() {
		return shipment_tel;
	}
	public void setShipment_tel(String shipment_tel) {
		this.shipment_tel = shipment_tel;
	}
	public String getShipment_country() {
		return shipment_country;
	}
	public void setShipment_country(String shipment_country) {
		this.shipment_country = shipment_country;
	}
	public String getShipment_isnot() {
		return shipment_isnot;
	}
	public void setShipment_isnot(String shipment_isnot) {
		this.shipment_isnot = shipment_isnot;
	}
	public String getLogistics_number() {
		return logistics_number;
	}
	public void setLogistics_number(String logistics_number) {
		this.logistics_number = logistics_number;
	}
	public Date getWarranty_date() {
		return warranty_date;
	}
	public void setWarranty_date(Date warranty_date) {
		this.warranty_date = warranty_date;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public Date getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public Date getInsert_time() {
		return insert_time;
	}
	public void setInsert_time(Date insert_time) {
		this.insert_time = insert_time;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}
	public int getSn_index() {
		return sn_index;
	}
	public void setSn_index(int sn_index) {
		this.sn_index = sn_index;
	}
	public String getDevice_fid() {
		return device_fid;
	}
	public void setDevice_fid(String device_fid) {
		this.device_fid = device_fid;
	}
	public Date getFdate() {
		return fdate;
	}
	public void setFdate(Date fdate) {
		this.fdate = fdate;
	}
	public String getDevice_id() {
		return device_id;
	}
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getSales_area() {
		return sales_area;
	}
	public void setSales_area(String sales_area) {
		this.sales_area = sales_area;
	}
	public String getWarranty_status() {
		return warranty_status;
	}
	public void setWarranty_status(String warranty_status) {
		this.warranty_status = warranty_status;
	}
	public String getWarehouse_man() {
		return warehouse_man;
	}
	public void setWarehouse_man(String warehouse_man) {
		this.warehouse_man = warehouse_man;
	}
	public String getShipment_man() {
		return shipment_man;
	}
	public void setShipment_man(String shipment_man) {
		this.shipment_man = shipment_man;
	}
	public int getP_type_id() {
		return p_type_id;
	}
	public void setP_type_id(int p_type_id) {
		this.p_type_id = p_type_id;
	}
	public String getBatch_num() {
		return batch_num;
	}
	public void setBatch_num(String batch_num) {
		this.batch_num = batch_num;
	}
	public String getFinished_categories() {
		return finished_categories;
	}
	public void setFinished_categories(String finished_categories) {
		this.finished_categories = finished_categories;
	}
	public String getFinishedpro_num() {
		return finishedpro_num;
	}
	public void setFinishedpro_num(String finishedpro_num) {
		this.finishedpro_num = finishedpro_num;
	}
	public int getDel_status() {
		return del_status;
	}
	public void setDel_status(int del_status) {
		this.del_status = del_status;
	}
	public String getShipment_status() {
		return shipment_status;
	}
	public void setShipment_status(String shipment_status) {
		this.shipment_status = shipment_status;
	}
	public String getScrapped_status() {
		return scrapped_status;
	}
	public void setScrapped_status(String scrapped_status) {
		this.scrapped_status = scrapped_status;
	}
	
}
