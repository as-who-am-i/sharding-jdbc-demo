package east;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.sharding.east.SpringBootDBTableApplication;
import com.sharding.east.dao.LouDongMapper;
import com.sharding.east.po.LouDong;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootDBTableApplication.class})
@Slf4j
public class LouDangServiceTest {

    @Autowired
    LouDongMapper louDongDao;

    @Test
    public void LouDangAdd() {

        for (int i = 0; i < 16; i++) {
            LouDong louDong = new LouDong();
            louDong.setId(i + "ab");
            louDong.setName("张三");
            louDong.setCity("河南");
            louDong.setLdNum(i + "LdNum");
            louDong.setRegion(i + "Region");
            louDong.setUnitNum(i + "UnitNum");
            int rows = louDongDao.insert(louDong);
            log.info("---------------[rows:{}]--------------", rows);

        }
        //int rows = louDangService.add(louDongs);

    }
}
