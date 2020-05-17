package com.east.sharding.service.impl;

import com.east.sharding.dao.LouDongDao;
import com.east.sharding.po.LouDong;
import com.east.sharding.service.LouDangService;
import com.east.sharding.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LouDangServiceImpl implements LouDangService {

    @Autowired
    LouDongDao louDongDao;


    public int add(List<LouDong> louDongs) {
        List<LouDong> list = louDongDao.saveAll(louDongs);
        return list.size();
    }
}
