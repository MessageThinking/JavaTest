package com.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
* @author 作者：wanwei 
* @version 创建时间：2017年11月2日 下午8:14:14 
* 用来配置spring和Junit整合,junit启动的时候加载springIOC容器
*/
@RunWith(SpringJUnit4ClassRunner.class)
//告诉springjunit spring配置文件的位置
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {

}
