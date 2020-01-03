package com.alter.shop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @PackageName: com.alter.shop.annotation
 * @ClassName: UserLoginToken
 * @Description: 该注解表示需要 Token 进行验证
 * @author: qiuweijie
 * @date: 2020/1/2  15:09
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserLoginToken {
    boolean required() default true;
}
