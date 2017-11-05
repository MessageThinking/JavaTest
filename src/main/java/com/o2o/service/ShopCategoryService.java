package com.o2o.service;

import java.util.List;

import com.o2o.entity.ShopCategory;

/** 
* @author 作者：wanwei 
* @version 创建时间：2017年11月4日 下午11:07:20 
* 类说明 
*/
public interface ShopCategoryService {
	List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);
}
