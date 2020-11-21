package pers.guchh.service;

import pers.guchh.dao.userDao;


public class userService {
    //为什么不用userDaoimpl
    private userDao userdao;

    public void setUserdao(userDao userdao) {
        this.userdao = userdao;
    }

    public void add(){
        System.out.println("add service");
        userdao.update();
    }
}
