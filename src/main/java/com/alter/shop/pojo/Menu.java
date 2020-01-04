package com.alter.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @PackageName: com.alter.shop.pojo
 * @ClassName: Menu
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2020/1/3  22:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private int id;
    private String authName;
    private String path;
    private List children;



}
