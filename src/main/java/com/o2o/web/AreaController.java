package com.o2o.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.o2o.entity.Area;
import com.o2o.service.AreaService;

/** 
* @author 作者：wanwei 
* @version 创建时间：2017年11月2日 下午11:56:59 
* 类说明 
*/
@Controller
@RequestMapping("/superadmin")
public class AreaController {
 Logger  logger = LoggerFactory.getLogger(AreaController.class);  
@Autowired
private AreaService areaService;
@RequestMapping(value="/listArea",method=RequestMethod.GET)
@ResponseBody
public Map<String,Object> listArea(){
	logger.info("===start===");
	Map<String,Object> ModelMap=new HashMap<String,Object>();
	List<Area> AreaList=new ArrayList<Area>();
	try {
		AreaList=areaService.getAreaList();
		ModelMap.put("rows", AreaList);
		ModelMap.put("total",AreaList.size());
	}catch(Exception e) {
		e.printStackTrace();
		ModelMap.put("success",false);
		ModelMap.put("error", e.toString());
	}
	logger.info("===ModelMap==="+ModelMap);
	logger.info("===start===");
	return ModelMap;
}
}
