package com.alter.shop.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PackageName: com.example.studyjwt.utils
 * @ClassName: JSONResultUtils
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2020/1/1  15:11
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JSONResultUtils {
    private String status;
    private String message;
    private Object object;

}
