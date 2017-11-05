package com.o2o.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.o2o.dao.AreaDao;
import com.o2o.entity.Area;
import com.o2o.service.AreaService;

/** 
* @author 作者：wanwei 
* @version 创建时间：2017年11月2日 下午10:28:02 
* 类说明 
*/
@Service
public class AreaServiceImp implements AreaService {
 @Autowired
 private AreaDao areaDao;
	@Override
	public List<Area> getAreaList() {
		return areaDao.queryArea() ;
	}

}
