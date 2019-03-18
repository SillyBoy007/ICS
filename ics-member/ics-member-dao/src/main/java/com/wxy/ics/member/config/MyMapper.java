package com.wxy.ics.member.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 *基础Mapper类
 * @author wxy
 * @date 2019/03/14
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
	
}