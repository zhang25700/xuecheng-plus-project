package com.xuecheng.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author: zzy
 * @description: 分页查询结果模型类
 * @date: 2023/7/17 13:50
 **/
@Data
@AllArgsConstructor
public class PageResult<T> implements Serializable {

    // 数据列表
    private List<T> items;

    //总记录数
    private long counts;

    //当前页码
    private long page;

    //每页记录数
    private long pageSize;


}

