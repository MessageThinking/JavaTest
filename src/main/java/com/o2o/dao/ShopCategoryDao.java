package com.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.o2o.entity.ShopCategory;

/** 
* @author 作者：wanwei 
* @version 创建时间：2017年11月4日 下午10:49:13 
* 类说明 
*/
public interface ShopCategoryDao {
List<ShopCategory> queryShopCategory(@Param("shopCategoryCondition")ShopCategory shopCategoryCondition);
}
