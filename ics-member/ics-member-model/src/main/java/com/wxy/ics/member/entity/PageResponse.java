package com.wxy.ics.member.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangxiayun
 * @since  2018/10/29 18:35
 **/
public class PageResponse<T>  implements Serializable {

    private Integer pageNum;
    private Integer pageSize;
    private Integer rowCount;
    private Integer totalPage;
    private Boolean hasNextPage;
    private List<T> list;

    public static <T> PageResponse<T> success(List<T> list,Integer pageNum,Integer pageSize,Integer rowCount){
        PageResponse<T> response = new PageResponse<>();
        response.setList(list);
        response.setPageNum(pageNum);
        response.setPageSize(pageSize);
        response.setRowCount(rowCount);

        if(pageSize == 0){
            response.setTotalPage(1);
            response.setHasNextPage(false);
        }else {
            int totalPage = (rowCount  +  pageSize  - 1) / pageSize;
            boolean hasNext = false;
            if(pageNum < totalPage){
                hasNext = true;
            }
            response.setHasNextPage(hasNext);
            response.setTotalPage(totalPage);

        }
        return response;
    }

    public static <T> PageResponse<T> success(Integer pageNum,Integer pageSize){
        PageResponse<T> response = new PageResponse<>();
        response.setPageNum(pageNum);
        response.setPageSize(pageSize);
        response.setRowCount(0);
        response.setTotalPage(1);
        response.setHasNextPage(false);
        return response;
    }

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

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
