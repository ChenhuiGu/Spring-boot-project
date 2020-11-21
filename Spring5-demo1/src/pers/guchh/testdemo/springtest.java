package pers.guchh.testdemo;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.guchh.User;
import pers.guchh.service.userService;

public class springtest {

//    @Test
//    public void testAdd(){
//        //加载配置文件
//
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("beans.xml");
//        //获取对象
//        User user = context.getBean("user",User.class);
//        System.out.println(user);
//        user.showUser();
//    }

    @Test
    public void serviceadd(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean1.xml");
        userService us = context.getBean("us",userService.class);
        us.add();
    }
}
