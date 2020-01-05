package com.alter.shop.pojo;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PackageName: com.alter.shop.pojo
 * @ClassName: User
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2020/1/2  15:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 用户 id
     */
   private String id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 角色
     */
    private String role;

    /**
     * 状态
     */
    private String status;



}
