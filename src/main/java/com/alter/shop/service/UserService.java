package com.alter.shop.service;


import com.alter.shop.pojo.User;
import org.springframework.stereotype.Service;

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

}
