package com.o2o.entity;

import java.util.Date;

/**
 * @author 作者：wanwei
 * @version 创建时间：2017年11月2日 下午7:30:11 类说明
 */
public class ProductCategory {
	private Long productCategoryId;
	private Long shopId;
	private String productCateoryName;
	private Integer priority;
	private Date createTime;

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getProductCateoryName() {
		return productCateoryName;
	}

	public void setProductCateoryName(String productCateoryName) {
		this.productCateoryName = productCateoryName;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
