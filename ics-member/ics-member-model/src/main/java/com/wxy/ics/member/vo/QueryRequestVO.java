package com.wxy.ics.member.vo;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * QueryRequest查询基础类
 * @author wxy
 * @date 2019/03/14
 */
public class QueryRequestVO implements Serializable {

    private static final long serialVersionUID = -4869594085374385813L;

    private int pageSize;
    private int pageNum;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("pageSize", pageSize)
                .add("pageNum", pageNum)
                .toString();
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

}
