package com.o2o.dao;

import java.util.List;

import com.o2o.entity.Shop;

/** 
* @author 作者：wanwei 
* @version 创建时间：2017年11月3日 上午9:28:01 
* 类说明 
*/
public interface ShopDao {
/**
 * 增添店铺
 * @param shop
 * @return
 */
int insertShop(Shop shop);
/**
 * 更新店铺
 */
int updateShop(Shop shop);
}
