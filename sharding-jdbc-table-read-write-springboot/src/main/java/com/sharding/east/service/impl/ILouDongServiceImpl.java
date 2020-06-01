package com.sharding.east.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sharding.east.dao.LouDongMapper;
import com.sharding.east.po.LouDong;
import com.sharding.east.service.ILouDongService;
import org.springframework.stereotype.Service;

@Service
public class ILouDongServiceImpl extends ServiceImpl<LouDongMapper, LouDong> implements ILouDongService {
}
