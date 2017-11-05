package com.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.o2o.BaseTest;
import com.o2o.entity.Area;
import com.o2o.serviceImp.AreaServiceImp;


/** 
* @author 作者：wanwei 
* @version 创建时间：2017年11月2日 下午10:37:51 
* 类说明 
*/
public class AreaServiceTest extends BaseTest{
@Autowired
private AreaServiceImp areaServiceimp;
@Test
public void testqueryArea(){
List<Area> areaService=areaServiceimp.getAreaList();
assertEquals("西苑",areaService.get(0).getAreaName());
}
}
