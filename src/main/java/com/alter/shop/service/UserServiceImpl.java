package com.alter.shop.service;


import com.alter.shop.pojo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: com.example.studyjwt.service
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2020/1/1  14:37
 */
@Service
public class UserServiceImpl implements UserService {

    private List<User> userList = new ArrayList<>();

    public void getUserlist(){



    }
    public UserServiceImpl(){
        User user1 = new User("1","Admin","Admin123.","Admin@123.com", "123","超级管理员","启用");
        User user2 = new User("2","User","User123.","User@123.com", "123","用户","启用");
        this.userList.add(user1);
        this.userList.add(user2);
    }


    @Override
    public User getUser(String id) {
        for (User user : userList){
            if(user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserByName(String name) {
        for (User user : userList){
            if (user.getUsername().equals(name)){
                return user;
            }
        }
        return null;
    }

    /**
     * 得到用户列表
     * @return
     */
    @Override
    public List<User> getUserList() {
        return userList;
    }
}
