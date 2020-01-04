package com.alter.shop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @PackageName: com.alter.shop.config
 * @ClassName: CorsConfig
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2020/1/2  16:26
 */
//@Configuration
public class CorsConfig implements WebMvcConfigurer {

    //public WebMvcConfigurer corsConfigurer(){
    //    return new WebMvcConfigurer() {
    //        @Override
    //        public void addCorsMappings(CorsRegistry registry) {
    //            registry.addMapping("/**")
    //                    .allowedOrigins("http://127.0.0.1")
    //                    .allowedHeaders("*")
    //                    .allowedMethods("*")
    //                    .allowCredentials(true)
    //                    .exposedHeaders(HttpHeaders.SET_COOKIE).maxAge(3600L);
    //        }
    //    };
    //}
}
