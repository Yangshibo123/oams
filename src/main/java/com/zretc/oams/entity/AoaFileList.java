package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaFileList implements Serializable {
    private static final long serialVersionUID = 999413255230780641L;
    @TableId(type = IdType.AUTO)
    /**
    * 文件id
    */
    private Long fileId;
    /**
    * 文件名字
    */
    private String fileName;
    /**
    * 文件路径
    */
    private String filePath;
    /**
    * 文件后缀名
    */
    private String fileShuffix;
    /**
    * 文件类型id
    */
    private String contentType;
    /**
    * 所属模块
    */
    private String model;
    private Long pathId;
    /**
    * 文件大小
    */
    private Long size;
    /**
    * 上传时间
    */
    private Date uploadTime;
    /**
    * 外键关联用户表  -文件上传者
    */
    private Long fileUserId;
    private Object fileIstrash;
    private Long fileIsshare;
}
