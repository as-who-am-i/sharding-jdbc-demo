package com.sharding.east.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sharding.east.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
