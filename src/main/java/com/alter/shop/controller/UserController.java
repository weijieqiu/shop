package com.alter.shop.controller;

import com.alter.shop.annotation.PassToken;
import com.alter.shop.annotation.UserLoginToken;
import com.alter.shop.pojo.User;
import com.alter.shop.service.UserService;
import com.alter.shop.utils.Result;
import com.alter.shop.utils.TokenUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: com.alter.shop.controller
 * @ClassName: UserController
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2020/1/2  15:28
 */
@RestController
@RequestMapping("api")
@CrossOrigin
public class UserController {


    @Autowired
    UserService userService;

    @PassToken
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result login(@Valid User user , BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new RuntimeException(bindingResult.getFieldError().toString());
        }
        User userforbase =  userService.getUserByName(user.getUsername());

        if(userforbase==null){

            return Result.fail("登录失败，用户不存在");
        }
        if(!userforbase.getPassword().equals(user.getPassword())){
            return Result.fail("登录失败，密码错误");
        }
        String token = TokenUtils.getToken(userforbase);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("token",token);


        return Result.success(map);
    }


    @PassToken
    @RequestMapping(value = "/loginByUserName",method = RequestMethod.POST)
    public Result loginByUserName(@RequestBody Map<String, Object> loginForm){
        //if(bindingResult.hasErrors()){
        //    throw new RuntimeException(bindingResult.getFieldError().toString());
        //}
       Object usernameValue = loginForm.get("username");
       Object passwordValue = loginForm.get("password");
       String username=String.valueOf(usernameValue);
       String password=String.valueOf(passwordValue);
        User userforbase =  userService.getUserByName(username);

        if(userforbase==null){

            return Result.fail("登录失败，用户不存在");
        }
        if(!userforbase.getPassword().equals(password)){
            return Result.fail("登录失败，密码错误");
        }
        String token = TokenUtils.getToken(userforbase);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("token",token);


        return Result.success(map);
    }
    @UserLoginToken
    @RequestMapping("/getmessage")
    public Result getmessage(){
        return Result.success("你已经通过验证");
    }


}
