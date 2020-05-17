package east;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.sharding.east.SpringBootDBTableApplication;
import com.sharding.east.dao.UserMapper;
import com.sharding.east.po.User;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootDBTableApplication.class})
@Slf4j
public class UserDaoTest {

    @Autowired
    UserMapper userDao;

    @Test
    public void louDangAdd() {

        List<User> users = new ArrayList<>();
        for (long i = 76; i < 176; i++) {
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

       /* List<User> res = userDao.findUsersByCityLike("%河南%");
        res = res.stream().sorted(Comparator.comparing(User::getId)).collect(Collectors.toList());
        log.info("---------------[{}]--------------", res);*/
    }
}
