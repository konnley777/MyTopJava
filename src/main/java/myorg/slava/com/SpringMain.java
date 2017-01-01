package myorg.slava.com;

import myorg.slava.com.repository.mock.MockUserRepository;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Created by home on 01.01.2017.
 */
public class SpringMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-config.xml");
        System.out.println("/n"+Arrays.toString(appCtx.getBeanDefinitionNames()));
       // MockUserRepository mockUserRepository = (MockUserRepository)appCtx.getBean("mockUserRepository");
        MockUserRepository mockUserRepository = appCtx.getBean(MockUserRepository.class);
        appCtx.close();

    }
}
