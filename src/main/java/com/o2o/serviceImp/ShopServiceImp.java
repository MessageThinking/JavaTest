package com.o2o.serviceImp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.o2o.dao.ShopDao;
import com.o2o.dto.ShopExecution;
import com.o2o.entity.Shop;
import com.o2o.enums.ShopStateEnum;
import com.o2o.exception.ShopException;
import com.o2o.service.ShopService;

/**
 * @author 作者：wanwei
 * @version 创建时间：2017年11月4日 下午7:05:01 类说明
 */
@Service
@Transactional
public class ShopServiceImp implements ShopService {
	@Autowired
	private ShopDao shopDao;
	@Override
	public ShopExecution addShop(Shop shop) throws ShopException {
		if (shop == null) {
			return new ShopExecution(ShopStateEnum.NULL_SHOP);
		}
		try {
			// 给店铺信息赋初始值
			shop.setEnableStatus(0);
			shop.setCreateTime(new Date());
			shop.setLastEditTime(new Date());
			// 添加店铺信息
			int shopNumber = shopDao.insertShop(shop);
			if (shopNumber < 0) {
				throw new ShopException("创建店铺失败");
			}
		} catch (ShopException e) {
			throw new ShopException("addShopError" + e.getMessage());
		}
		return new ShopExecution(ShopStateEnum.CHECK, shop);
	}
}
