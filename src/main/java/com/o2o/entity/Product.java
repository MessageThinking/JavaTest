package com.o2o.entity;

import java.util.Date;
import java.util.List;

/**
 * @author 作者：wanwei
 * @version 创建时间：2017年11月2日 下午7:33:43 类说明
 */
public class Product {
	private Long productId;
	private String productName;
	private Product Desc;
	// 简略图
	private String imgAddr;
	private String normalPrice;
	private String promotionPrice;
	private String priority;
	private Date createTimee;
	private Date lastEditTime;
	// -1不可用, 0.下架 1.在前端展示系统展示
	private Integer enableStatus;
	private List<ProductImg> productImgList;
	private ProductCategory productCategory;
	private Shop shop;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Product getDesc() {
		return Desc;
	}

	public void setDesc(Product desc) {
		Desc = desc;
	}

	public String getImgAddr() {
		return imgAddr;
	}

	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
	}

	public String getNormalPrice() {
		return normalPrice;
	}

	public void setNormalPrice(String normalPrice) {
		this.normalPrice = normalPrice;
	}

	public String getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(String promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Date getCreateTimee() {
		return createTimee;
	}

	public void setCreateTimee(Date createTimee) {
		this.createTimee = createTimee;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

	public Integer getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}

	public List<ProductImg> getProductImgList() {
		return productImgList;
	}

	public void setProductImgList(List<ProductImg> productImgList) {
		this.productImgList = productImgList;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

}
