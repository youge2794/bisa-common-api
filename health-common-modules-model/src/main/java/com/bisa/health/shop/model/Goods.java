package com.bisa.health.shop.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_goods")
public class Goods implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4256398755051915154L;
	private Integer id;
	private Integer classifyId;    //商品分类编号
	private String goodsName;      //商品名字
	private String goodsNumber;	//商品编号(uuid)
	
	private String title;  			//商品大标题
	private String description;		//商品描述
	private BigDecimal goodsPrice;		//单价
	private Integer storeNumber;   //商品库存数量
	private Integer needPost;		//0-不需要邮递；1-需要邮递
	
	private Date putawayTime;		//上架时间
	private Date soldoutTime;		//下架时间
	private Integer salesNumber;	//销量
	private Integer appraiseNumber;//评论数量
	
	private String imgUrl;  //主图
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="classify_id")
	public Integer getClassifyId() {
		return classifyId;
	}

	public void setClassifyId(Integer classifyId) {
		this.classifyId = classifyId;
	}
	@Column(name="goods_name")
	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	@Column(name="goods_number")
	public String getGoodsNumber() {
		return goodsNumber;
	}

	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="goods_price")
	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	@Column(name="store_number")
	public Integer getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(Integer storeNumber) {
		this.storeNumber = storeNumber;
	}
	@Column(name="need_post")
	public Integer getNeedPost() {
		return needPost;
	}

	public void setNeedPost(Integer needPost) {
		this.needPost = needPost;
	}
	@Column(name="putaway_time")
	public Date getPutawayTime() {
		return putawayTime;
	}

	public void setPutawayTime(Date putawayTime) {
		this.putawayTime = putawayTime;
	}
	@Column(name="soldout_time")
	public Date getSoldoutTime() {
		return soldoutTime;
	}
	public void setSoldoutTime(Date soldoutTime) {
		this.soldoutTime = soldoutTime;
	}
	
	@Column(name="sales_number")
	public Integer getSalesNumber() {
		return salesNumber;
	}
	public void setSalesNumber(Integer salesNumber) {
		this.salesNumber = salesNumber;
	}
	
	@Column(name="appraise_number")
	public Integer getAppraiseNumber() {
		return appraiseNumber;
	}
	public void setAppraiseNumber(Integer appraiseNumber) {
		this.appraiseNumber = appraiseNumber;
	}
	
	@Column(name="img_url")
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Goods() {
		super();
	}

	public Goods(Integer id, Integer classifyId, String goodsName, String goodsNumber, String title, String description,
			BigDecimal goodsPrice, Integer storeNumber, Integer needPost, Date putawayTime, Date soldoutTime,
			Integer salesNumber, Integer appraiseNumber, String imgUrl) {
		super();
		this.id = id;
		this.classifyId = classifyId;
		this.goodsName = goodsName;
		this.goodsNumber = goodsNumber;
		this.title = title;
		this.description = description;
		this.goodsPrice = goodsPrice;
		this.storeNumber = storeNumber;
		this.needPost = needPost;
		this.putawayTime = putawayTime;
		this.soldoutTime = soldoutTime;
		this.salesNumber = salesNumber;
		this.appraiseNumber = appraiseNumber;
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", classifyId=" + classifyId + ", goodsName=" + goodsName + ", goodsNumber="
				+ goodsNumber + ", title=" + title + ", description=" + description + ", goodsPrice=" + goodsPrice
				+ ", storeNumber=" + storeNumber + ", needPost=" + needPost + ", putawayTime=" + putawayTime
				+ ", soldoutTime=" + soldoutTime + ", salesNumber=" + salesNumber + ", appraiseNumber=" + appraiseNumber
				+ ", imgUrl=" + imgUrl + "]";
	}
	
}