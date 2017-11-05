package com.o2o.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.o2o.entity.Area;
import com.o2o.entity.ShopCategory;
import com.o2o.service.AreaService;
import com.o2o.service.ShopCategoryService;

/**
 * @author 作者：wanwei
 * @version 创建时间：2017年11月4日 下午8:04:53 类说明
 */
@Controller
@RequestMapping("/shopadmin")
public class ShopAdminController {
	@Autowired
	private ShopCategoryService shopCategoryService;
	@Autowired
	private AreaService areaService;
	@RequestMapping(value="/getshopInfo", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getShopInfo() {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<ShopCategory> shopCategoryList = new ArrayList<ShopCategory>();
		List<Area> areaList = new ArrayList<Area>();
		try {
			shopCategoryList = shopCategoryService.getShopCategoryList(new ShopCategory());
			areaList = areaService.getAreaList();
			modelMap.put("shopCategoryList", shopCategoryList);
			modelMap.put("areaList", areaList);
			modelMap.put("success", true);
		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("errorMessage", e.getMessage());
		}
		return modelMap;
	}
}
