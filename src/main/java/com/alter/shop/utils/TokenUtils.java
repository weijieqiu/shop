package com.alter.shop.utils;

import com.alter.shop.pojo.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;


/**
 * @PackageName: com.example.studyjwt.utils
 * @ClassName: TokenUtils
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2020/1/1  14:28
 */
public class TokenUtils {

    public static String getToken(User user){
        String token= "";
        token = JWT.create().withAudience(user.getId()).sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }
}
