package com.alter.shop.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @PackageName: com.alter.shop.service
 * @ClassName: MenuServiceImplTest
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2020/1/3  23:01
 */
class MenuServiceImplTest {

    @Autowired
    MenuServiceImpl menuService;
    @Test
    void getMenuList() {
        //menuService.getMenuList();
        System.out.println(menuService.getMenuList());
    }
}