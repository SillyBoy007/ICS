package com.wxy.ics.member.common.service;

import java.util.List;
/**
 * BaseService
 * @author wxy
 * @date 2019/03/14
 */
public interface BaseService<T> {
    /**
     * 全部查询
     * @return List
     */
    List<T> selectAll();

    /**
     * 根据主键查询
     * @param key
     * @return
     */
    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int batchDelete(List<String> list, String property, Class<T> clazz);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);
}
