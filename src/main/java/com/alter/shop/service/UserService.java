package com.alter.shop.service;


import com.alter.shop.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.example.studyjwt.service
 * @ClassName: UserService
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2020/1/1  14:36
 */

public interface UserService {
    User getUser(String id);
    User getUserByName(String name);
    List<User> getUserList(String query, Integer pageNum, Integer pageSize);

}
