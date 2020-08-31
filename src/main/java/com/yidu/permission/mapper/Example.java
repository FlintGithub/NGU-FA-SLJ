package com.yidu.permission.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Example {
    public List selectInfo();
}
