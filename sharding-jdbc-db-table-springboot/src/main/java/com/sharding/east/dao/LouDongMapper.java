package com.sharding.east.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sharding.east.po.LouDong;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface LouDongMapper extends BaseMapper<LouDong> {

}
