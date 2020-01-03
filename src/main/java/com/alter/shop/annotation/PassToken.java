package com.alter.shop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @PackageName: com.alter.shop.annotation
 * @ClassName: PassToken
 * @Description: 该注解表示跳过 Token 拦截验证
 * @author: qiuweijie
 * @date: 2020/1/2  15:09
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PassToken {
    boolean required() default true;
}
