package com.o2o.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.o2o.dao.ShopCategoryDao;
import com.o2o.entity.ShopCategory;
import com.o2o.exception.ShopException;
import com.o2o.service.ShopCategoryService;

/**
 * @author 作者：wanwei
 * @version 创建时间：2017年11月4日 下午11:08:58 类说明
 */
@Service
public class ShopCategoryServiceImp implements ShopCategoryService {
	@Autowired
	private ShopCategoryDao shopCategoryDao;

	@Override
	public List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition) {

		return shopCategoryDao.queryShopCategory(shopCategoryCondition);
	}

}
