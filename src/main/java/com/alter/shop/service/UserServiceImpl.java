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
        User user1 = new User("1","Admin","Admin123.");
        User user2 = new User("2","limin","liming");
        User user3 = new User("3","limi","liming");
        User user4 = new User("4","lim","liming");
        User user5 = new User("5","li","liming");
        this.userList.add(user1);
        this.userList.add(user2);
        this.userList.add(user3);
        this.userList.add(user4);
        this.userList.add(user5);


    }
    public UserServiceImpl(){
        getUserlist();
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
}
