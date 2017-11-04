package com.o2o.dao;

import java.util.List;

import com.o2o.entity.Area;

/** 
* @author 作者：wanwei 
* @version 创建时间：2017年11月2日 下午8:02:57 
* 类说明 
*/
public interface AreaDao {
	/**
	 * 返回AreaList
	 * @return
	 */
List<Area> queryArea();
}
