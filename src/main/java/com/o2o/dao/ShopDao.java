package com.o2o.dao;

import java.util.List;

import com.o2o.entity.Shop;


*/
public interface ShopDao {
/**
 *wanwei增添店铺
 * @param shop
 * @return
 */
int insertShop(Shop shop);
/**
 * 更新店铺
 */
int updateShop(Shop shop);
}
