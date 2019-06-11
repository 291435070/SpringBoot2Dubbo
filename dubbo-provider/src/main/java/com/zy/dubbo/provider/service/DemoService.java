package com.zy.dubbo.provider.service;

import java.util.List;
import java.util.Map;

import com.zy.dubbo.provider.model.News;

public interface DemoService {

	String sayHello(String name);
	
	List<Map<String, Object>> listNews(long id);
	
	News news();

}