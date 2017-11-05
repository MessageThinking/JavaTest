package com.o2o.service; 
/** 
* @author 作者：wanwei 
* @version 创建时间：2017年11月4日 下午7:05:22 
* 类说明 
*/

import com.o2o.dto.ShopExecution;
import com.o2o.entity.Shop;
import com.o2o.exception.ShopException;

public interface ShopService {
ShopExecution addShop(Shop shop) throws ShopException;
}
