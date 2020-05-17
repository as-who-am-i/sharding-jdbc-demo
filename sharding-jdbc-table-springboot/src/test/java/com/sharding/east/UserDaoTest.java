package com.sharding.east;


import com.east.sharding.SpringBootTableApplication;
import com.east.sharding.dao.UserDao;
import com.east.sharding.po.LouDong;
import com.east.sharding.po.User;
import com.east.sharding.service.LouDangService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootTableApplication.class})
@Slf4j
public class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Test
    public void louDangAdd(){

        List<User> users = new ArrayList<>();
        for (long i = 0; i < 36; i++) {
            User user = new User();
            user.setId(i);
            user.setName(i+"张三");
            user.setCity(i+"河南");
            users.add(user);
        }
        List<User> res = userDao.saveAll(users);
        log.info("---------------[{}]--------------",res.size());
    }

    @Test
    public void louDangSelect(){

        List<User> res = userDao.findUsersByCityLike("%河南%");
        res = res.stream().sorted(Comparator.comparing(User::getId)).collect(Collectors.toList());
        log.info("---------------[{}]--------------",res);
    }
}
