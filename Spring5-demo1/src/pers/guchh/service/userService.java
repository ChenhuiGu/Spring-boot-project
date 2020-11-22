package pers.guchh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pers.guchh.dao.userDao;


@Component
public class userService {
    //为什么不用userDaoimpl
    @Autowired
    private userDao userdao;

    public void setUserdao(userDao userdao) {
        this.userdao = userdao;
    }

    public void add(){
        System.out.println("add service");
        userdao.update();
    }
}
