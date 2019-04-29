package com.wxy.ics.member.entity;

import java.io.Serializable;

/**
 * @author wangxiayun
 * @since  2018/10/29 18:41
 **/
public class PageRequest<T> implements Serializable {
    private Integer pageNum;
    private Integer pageSize;
    private T bo;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public T getBo() {
        return bo;
    }

    public void setBo(T bo) {
        this.bo = bo;
    }
}
