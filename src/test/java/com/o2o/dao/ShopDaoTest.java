package com.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.o2o.BaseTest;
import com.o2o.entity.Area;
import com.o2o.entity.PersonInfo;
import com.o2o.entity.Shop;
import com.o2o.entity.ShopCategory;

/** 
* @author 作者：wanwei 
* @version 创建时间：2017年11月4日 下午4:08:59 
* 类说明 
*/
public class ShopDaoTest extends BaseTest {
@Autowired
private ShopDao shopDao;
@Test
@Ignore
public void InsertTest() {
	Shop shop = new Shop();
	PersonInfo owner = new PersonInfo();
	Area area = new Area();
	ShopCategory shopCategory = new ShopCategory();
	owner.setUserId(1L);
	area.setAreaId(2);
	shopCategory.setShopCategoryId(20L);
	shop.setOwner(owner);
	shop.setArea(area);
	shop.setShopCategory(shopCategory);
	shop.setShopName("测试的店铺");
	shop.setShopDesc("test");
	shop.setShopAddr("test");
	shop.setPhone("test");
	shop.setShopImg("test");
	shop.setCreateTime(new Date());
	shop.setEnableStatus(0);
	shop.setAdvice("审核中");
	int effectedNum = shopDao.insertShop(shop);
	assertEquals(1,effectedNum);
}
@Test
public void updateShopTest() {
	Shop shop = new Shop();
	shop.setShopId(1L);		
	shop.setShopDesc("测试好了");
	shop.setShopAddr("测试地址");
	shop.setLastEditTime(new Date());
	int effectedNum = shopDao.updateShop(shop);
	assertEquals(1, effectedNum);
}
}
