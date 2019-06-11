package com.zy.dubbo.provider.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zy.dubbo.provider.model.News;

@Mapper
public interface DemoDao {

	@Select("SELECT * FROM t_news WHERE id > #{id} ORDER BY id DESC LIMIT 10")
	List<Map<String, Object>> listNews(@Param("id") long id);

	@Select("SELECT * FROM t_news ORDER BY id DESC LIMIT 1")
	News news();

}