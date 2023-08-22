package com.zretc.oams.common;

import cn.dev33.satoken.interceptor.SaAnnotationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CommonConfig implements WebMvcConfigurer{

    /**
     * 添加拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry){
//        registry.addInterceptor(new SaAnnotationInterceptor())
//                .addPathPatterns("/**").excludePathPatterns("/users/login");
        WebMvcConfigurer.super.addInterceptors(registry);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // 拦截所有的请求
                //.allowedOrigins("*")  // 可跨域的域名，可以为 *
                .allowedOriginPatterns("*")
                .allowCredentials(true)
                .allowedMethods("*")   // 允许跨域的方法，可以单独配置
                .allowedHeaders("*");  // 允许跨域的请求头，可以单独配置
        WebMvcConfigurer.super.addCorsMappings(registry);
    }

    /**
     * 配置资源地址
     * @param registry
     */
    /*@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resource/**").addResourceLocations("file:/d:/resource/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }*/
}
