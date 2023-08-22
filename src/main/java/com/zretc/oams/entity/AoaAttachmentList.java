package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaAttachmentList implements Serializable {
    private static final long serialVersionUID = -17946005920666593L;
    @TableId(type = IdType.AUTO)
    /**
    * 附件id
    */
    private Long attachmentId;
    /**
    * 附件名字
    */
    private String attachmentName;
    /**
    * 附件存储路径
    */
    private String attachmentPath;
    /**
    * 附件后缀
    */
    private String attachmentShuffix;
    /**
    * 附件大小
    */
    private String attachmentSize;
    /**
    * 附件类型
    */
    private String attachmentType;
    /**
    * 所属模块
    */
    private String model;
    /**
    * 附件上传时间
    */
    private Date uploadTime;
    /**
    * 用户id
    */
    private String userId;
}
