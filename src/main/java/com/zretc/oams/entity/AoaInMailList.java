package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaInMailList implements Serializable {
    private static final long serialVersionUID = -23024039153384422L;
    @TableId(type = IdType.AUTO)
    /**
    * 邮件id
    */
    private Long mailId;
    /**
    * 邮件内容
    */
    private String mailContent;
    /**
    * 邮件创建时间
    */
    private Date mailCreateTime;
    /**
    * 邮件附件id
    */
    private Long mailFileId;
    /**
    * 邮件主题
    */
    private String mailTitle;
    /**
    * 邮件类型（通知，公告，邮件）
    */
    private Long mailType;
    /**
    * 发件人id
    */
    private Long mailInPushUserId;
    /**
    * 接收人（可以是多个）
    */
    private String inReceiver;
    /**
    * 邮件状态（一般，紧急，重要）
    */
    private Long mailStatusId;
    /**
    * 外部邮件账号id
    */
    private Long mailNumberId;
    private Integer mailDel;
    private Integer mailPush;
    private Integer mailStar;
}
