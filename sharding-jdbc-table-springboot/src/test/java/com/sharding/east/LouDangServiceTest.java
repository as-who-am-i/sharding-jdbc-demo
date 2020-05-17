package com.sharding.east;


import com.east.sharding.SpringBootTableApplication;
import com.east.sharding.dao.LouDongDao;
import com.east.sharding.po.LouDong;
import com.east.sharding.service.LouDangService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootTableApplication.class})
@Slf4j
public class LouDangServiceTest {

    @Autowired
    //LouDangService louDangService;
    LouDongDao louDongDao;

    @Test
    public void LouDangAdd(){

        List<LouDong> louDongs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            LouDong louDong = new LouDong();
            louDong.setId(i+"a");
            louDong.setName("张三");
            louDong.setCity("河南");
            louDong.setLdNum(i+"LdNum");
            louDong.setRegion(i+"Region");
            louDong.setUnitNum(i+"UnitNum");
            louDongs.add(louDong);
        }
        //int rows = louDangService.add(louDongs);
        List<LouDong> res = louDongDao.saveAll(louDongs);
        log.info("---------------[{}]--------------",res.size());
    }
}
