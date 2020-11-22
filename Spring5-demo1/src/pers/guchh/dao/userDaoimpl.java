package pers.guchh.dao;

import org.springframework.stereotype.Component;


@Component(value = "userDaoimpl")
public class userDaoimpl implements userDao{
    @Override
    public void update() {
        System.out.println("add dao");
    }
}
