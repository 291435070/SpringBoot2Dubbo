package com.zy.dubbo.provider.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.zy.dubbo.provider.dao.DemoDao;
import com.zy.dubbo.provider.model.News;
import com.zy.dubbo.provider.service.DemoService;

@Service(version = "1.0")
public class DemoServiceImpl implements DemoService {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private DemoDao demoDao;

	@Override
	public String sayHello(String name) {
		logger.info("Dubbo Remote Invoking 1.0");
		return String.format("[%s] : Hello, %s", "Dubbo", name);
	}

	@Override
	public List<Map<String, Object>> listNews(long id) {
		return demoDao.listNews(id);
	}

	@Override
	public News news() {
		return demoDao.news();
	}

}