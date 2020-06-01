package com.sharding.east;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sharding.east.SpringBootReadWriteTableApplication;
import com.sharding.east.dao.UserMapper;
import com.sharding.east.po.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootReadWriteTableApplication.class})
@Slf4j
public class UserDaoTest {

    /**
     * 完成这样的需配置主从分布的mysql集群
     * 读写分离  数据写入主节点，读取数据去从节点读取
     */


    @Autowired
    UserMapper userDao;

    @Test
    public void louDangAdd() {

        List<User> users = new ArrayList<>();
        for (long i = 2000; i < 2036l; i++) {
            User user = new User();
            //user.setId(i);
            user.setName(i + "张三");
            user.setCity(i + "河南");
            users.add(user);
            int userRow = userDao.insert(user);
            log.info("---------------[userRow:{}]--------------", userRow);
        }
    }

    @Test
    public void louDangSelect() {
        QueryWrapper wrapper = new QueryWrapper();

        //wrapper.eq(new User().getName(),"河南");
        wrapper.eq("name", "2022河南");
        List<User> res = userDao.selectList(wrapper);
        //res = res.stream().sorted(Comparator.comparing(User::getId)).collect(Collectors.toList());
        log.info("---------------[{}]--------------", res);
    }
}
