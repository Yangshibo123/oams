package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.util.UploadUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("upload")
@SaCheckLogin
public class UploadController {
    @Value("D:/resource/")
    private String uploadPath;

    @GetMapping("upload")
    public Object upload(MultipartFile file){
        return R.ok(UploadUtils.upload(uploadPath,file));
    }
}
