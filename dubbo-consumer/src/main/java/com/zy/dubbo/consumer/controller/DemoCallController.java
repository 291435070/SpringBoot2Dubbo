package com.zy.dubbo.consumer.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zy.dubbo.provider.model.News;
import com.zy.dubbo.provider.service.DemoService;

@RestController
public class DemoCallController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Reference(version = "1.0")
	private DemoService demoService;

	@GetMapping("test")
	public Object test() {
		logger.info("{}", LocalDateTime.now());
		return LocalDateTime.now();
	}

	@GetMapping("get")
	public Object get() {
		String result = demoService.sayHello("James");
		logger.info(result);
		return result;
	}

	@GetMapping("list")
	public Object list() {
		List<Map<String, Object>> result = demoService.listNews(10);
		return result;
	}

	@GetMapping("news")
	public Object news() {
		News result = demoService.news();
		return result;
	}

}