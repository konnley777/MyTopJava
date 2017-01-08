package myorg.slava.com.web.mock;

import myorg.slava.com.util.exception.NotFoundException;
import myorg.slava.com.web.user.AdminUserRestController;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class UserAdminMockTest {
    private static ConfigurableApplicationContext appCtx;
    private static AdminUserRestController controller;

    @BeforeClass
    public static void beforeClass() {
        appCtx = new ClassPathXmlApplicationContext("spring/spring-config.xml");
        System.out.println("\n" + Arrays.toString(appCtx.getBeanDefinitionNames()) + "\n");
        controller = appCtx.getBean(AdminUserRestController.class);
    }

    @AfterClass
    public static void afterClass() {
        appCtx.close();
    }

    @Test
    public void testDelete() throws Exception {
        controller.delete();
    }

    @Test(expected = NotFoundException.class)
    public void testDeleteNotFound() throws Exception {
        controller.delete();
    }
}