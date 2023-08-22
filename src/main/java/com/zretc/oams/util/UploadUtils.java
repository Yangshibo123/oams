package com.zretc.oams.util;

import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class UploadUtils {
    public static String upload(String uploadPath,MultipartFile file){
        if(file==null){
            return null;
        }
        String fileName = file.getOriginalFilename();//获取上传文件的名字
        //获取文件的拓展名
        String suffix = StringUtils.getFilenameExtension(fileName);
        String newFileName = UUID.randomUUID()+"."+suffix;
        try {
            file.transferTo(new File(uploadPath+newFileName));//上传文件到指定为止
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return newFileName;
    }
}
