package test;

import com.codebattery.model.User;
import com.codebattery.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/7/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-mvc.xml"})
public class TestUser {
    private static Logger logger = Logger.getLogger(TestUser.class);
    //	private ApplicationContext ac = null;
    @Resource
    private UserService userService;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

    @Test
    public void test1() {
        User user = userService.getUserById(1);
        System.out.println(user.getName());
        // logger.info("值："+user.getUserName());
        //logger.info(JSON.toJSONString(user));
    }
}
