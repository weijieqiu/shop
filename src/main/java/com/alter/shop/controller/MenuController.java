package com.alter.shop.controller;

import com.alter.shop.annotation.PassToken;
import com.alter.shop.annotation.UserLoginToken;
import com.alter.shop.pojo.Menu;
import com.alter.shop.service.MenuService;
import com.alter.shop.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @PackageName: com.alter.shop.controller
 * @ClassName: MenuController
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2020/1/3  22:50
 */
@CrossOrigin
@RestController
@RequestMapping("api")
public class MenuController {

    @Autowired
    MenuService menuService;

    @UserLoginToken
    @RequestMapping(value = "/getMenuList",method = RequestMethod.GET)
    public Result getMenuList(){
        List<Menu> menuList =  menuService.getMenuList();

        if(menuList==null){

            return Result.fail("获取列表失败");

        }

        return Result.success("获取列表成功",menuList);
    }

}
