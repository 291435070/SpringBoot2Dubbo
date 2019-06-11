package com.zy.dubbo.provider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.zy.dubbo.provider.model.News;
import com.zy.dubbo.provider.service.DemoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProviderApplicationTest {

	private Logger logger = LoggerFactory.getLogger(getClass());
	private Logger toFile1 = LoggerFactory.getLogger("toFile1");
	private Logger toFile2 = LoggerFactory.getLogger("toFile2");

	@Autowired
	private DemoService demoService;

	@Test
	public void test1() {
		News news = demoService.news();
		logger.debug(JSON.toJSONString(news));
		logger.info(JSON.toJSONString(news));
		logger.warn(JSON.toJSONString(news));
		logger.error(JSON.toJSONString(news));
		
		toFile1.debug(JSON.toJSONString(news));
		toFile1.info(JSON.toJSONString(news));
		toFile1.warn(JSON.toJSONString(news));
		toFile1.error(JSON.toJSONString(news));
		
		toFile2.debug(JSON.toJSONString(news));
		toFile2.info(JSON.toJSONString(news));
		toFile2.warn(JSON.toJSONString(news));
		toFile2.error(JSON.toJSONString(news));
	}

}