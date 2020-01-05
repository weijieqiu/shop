package com.alter.shop.service;

import com.alter.shop.pojo.Menu;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @PackageName: com.alter.shop.service
 * @ClassName: MenuServiceImpl
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2020/1/3  22:51
 */
@Service
public class MenuServiceImpl implements MenuService {


    /**
     * 一级菜单列表
     */
    List<Menu> menuList = new ArrayList<>();
    /**
     * 二级菜单列表
     * 商品管理子列表
     */
    List<Menu> shopMenuList = new ArrayList<>();
    /**
     * 二级菜单列表
     * 用户管理子列表
     */
    List<Menu> userMenuList = new ArrayList<>();

    public MenuServiceImpl() {
        Menu shopList = new Menu(101, "商品列表", "shopList", null);
        Menu shopQuery = new Menu(102, "商品查询", "shopQuery", null);
        shopMenuList.add(shopList);
        shopMenuList.add(shopQuery);
        //menuList= new Menu(1, "商品管理", null, shopMenuList);
        menuList.add(new Menu(1, "商品管理", "shopManager", shopMenuList));

        Menu userList = new Menu(201, "用户列表", "userList", null);
        Menu userQuery = new Menu(202, "用户查询", "userQuery", null);
        userMenuList.add(userList);
        userMenuList.add(userQuery);
        menuList.add(new Menu(2, "用户管理", "userManager", userMenuList));
    }

    @Override
    public List<Menu> getMenuList() {

        return menuList;
    }

    public static void main(String[] args) {
        MenuService menuService = new MenuServiceImpl();
        menuService.getMenuList();
    }

}
