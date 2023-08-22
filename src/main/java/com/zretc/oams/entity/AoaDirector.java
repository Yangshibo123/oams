package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaDirector implements Serializable {
    private static final long serialVersionUID = 757104235851169024L;
    @TableId(type = IdType.AUTO)
    /**
    * 主键
    */
    private Long directorId;
    /**
    * 用户住址
    */
    private String address;
    /**
    * 公司号码
    */
    private String companyNumber;
    /**
    * 邮件
    */
    private String email;
    /**
    * 头像路径
    */
    private Integer imagePath;
    /**
    * 电话号码
    */
    private String phoneNumber;
    /**
    * 通讯录名称的拼音
    */
    private String pinyin;
    /**
    * 备注
    */
    private String remark;
    /**
    * 性别
    */
    private String sex;
    /**
    * 通讯录名称
    */
    private String userName;
    /**
    * 由哪个用户创建的
    */
    private Long userId;
    /**
    * 公司名称
    */
    private String companyname;
}
