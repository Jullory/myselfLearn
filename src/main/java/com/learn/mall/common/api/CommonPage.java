package com.learn.mall.common.api;

import org.springframework.data.domain.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 分页数据封装类
 */
public class CommonPage<T> {
    private Integer pageNum;

    private Integer pageSize;

    private Integer totalPage;

    private Long total;

    private List<T> list;

    /**
     *  将PageHelper分页后的List转为分页信息
     *
     * @param list PageHelper分页后的List
     * @param <T>  通用泛型
     * @return 返回泛型结果集
     */
    public static <T> CommonPage<T> restPage(List<T> list){
        CommonPage<T> result = new CommonPage<>();
        PageInfo<T> pageInfo = new PageInfo<>(list);
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }

    /**
     *  将SpringData分页后的list转为分页信息
     * @param pageInfo SpringData分页后的信息
     * @param <T> 通用泛型入参
     * @return 返回泛型结果集
     */
    public static <T> CommonPage<T> restPage(Page<T> pageInfo){
        CommonPage<T> result = new CommonPage<>();
        result.setTotalPage(pageInfo.getTotalPages());
        result.setPageNum(pageInfo.getNumber());
        result.setPageSize(pageInfo.getSize());
        result.setTotal(pageInfo.getTotalElements());
        result.setList(pageInfo.getContent());
        return result;
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

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}