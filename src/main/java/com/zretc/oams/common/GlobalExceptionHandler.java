package com.zretc.oams.common;

import cn.dev33.satoken.exception.NotLoginException;
import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotLoginException.class)
    @ResponseBody
    public Object handlerTokenException(Exception e){
        R r = R.failed("请先登录");
        r.setCode(401);//令牌异常 通用编码401
        r.setData(new HashMap<>());
        return r;
    }
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Object handlerException(Exception e){
        return R.failed("系统错误!");
    }
}
