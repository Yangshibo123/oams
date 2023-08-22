package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaMailnumber implements Serializable {
    private static final long serialVersionUID = -68642714880017603L;
    @TableId(type = IdType.AUTO)
    /**
    * 邮箱的主键id
    */
    private Long mailNumberId;
    /**
    * 邮件账号
    */
    private String mailAccount;
    /**
    * 账号创建时间
    */
    private Date mailCreateTime;
    /**
    * 账号信息备注
    */
    private String mailDes;
    /**
    * 邮件账号类型
    */
    private Long mailType;
    /**
    * 用户别名
    */
    private String mailUserName;
    /**
    * 账号授权码
    */
    private String password;
    /**
    * 邮件状态（是否可用）
    */
    private Long status;
    /**
    * 用户id
    */
    private Long mailNumUserId;
}
