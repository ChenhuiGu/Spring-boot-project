package pers.guchh;


public class User {
    private String userName;
    private Integer age;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public void showUser(){
        System.out.println("username:"+userName);
        System.out.println("age:"+age);
    }
}


