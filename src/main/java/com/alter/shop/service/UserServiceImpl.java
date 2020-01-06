package com.alter.shop.service;


import com.alter.shop.pojo.User;
import com.alter.shop.utils.PageBean;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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
        User user3 = new User("3","User1","User123.","User@123.com", "123","用户","禁用");
        User user4 = new User("4","User2","User123.","User@123.com", "123","用户","启用");
        this.userList.add(user1);
        this.userList.add(user2);
        this.userList.add(user3);
        this.userList.add(user4);
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
    public List<User> getUserList(String query, Integer pageNum, Integer pageSize) {
        String pattern = query;
        List<User> users = null;
        List<User> usersRex = new ArrayList<>();
        int fromIndex = (pageNum-1) * pageSize;
        int toIndex = pageNum  * pageSize;
        //查询多少行数据 分页类里默认30行
         users = userList.subList(fromIndex, toIndex);
        for(User user : users){
            if(user.getUsername().contains(query)){
                usersRex.add(user);
            }

        }
        if(query.isEmpty()){
            return users;
        }else {
            if(!usersRex.isEmpty()){
                return usersRex;
            }else {
                return null;
            }
        }

    }

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.getUserList("User",1, 2);
    }
}
