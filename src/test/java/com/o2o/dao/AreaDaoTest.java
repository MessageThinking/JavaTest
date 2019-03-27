package com.o2o.dao; 
/** 
* @author 作者：wanwei 
* @version 创建时间：2017年11月2日 下午8:51:13 
* 类说明 
*/

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.o2o.BaseTest;
import com.o2o.entity.Area;

public class AreaDaoTest extends BaseTest{
@Autowired
 private AreaDao areaDao;
@Test
public void testQueryAreaDao() {
	List<Area> areaDaoTest=areaDao.queryArea();
	assertEquals(2,areaDaoTest.size());
}
}
