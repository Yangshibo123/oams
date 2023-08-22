package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaUser implements Serializable {
    private static final long serialVersionUID = -66184135603598826L;
    @TableId(type = IdType.AUTO)
    /**
    * 用户id
    */
    private Long userId;
    /**
    * 地址
    */
    private String address;
    /**
    * 银行
    */
    private String bank;
    /**
    * 生日
    */
    private Date birth;
    /**
    * 邮件
    */
    private String eamil;
    /**
    * 上司id
    */
    private Long fatherId;
    /**
    * 入职时间
    */
    private Date hireTime;
    /**
    * 用户身份证
    */
    private String userIdcard;
    /**
    * 用户头像路径
    */
    private String imgPath;
    /**
    * 该用户是否被禁用
    */
    private Integer isLock;
    /**
    * 用户最后登录ip
    */
    private String lastLoginIp;
    /**
    * 最后登录时间
    */
    private Date lastLoginTime;
    /**
    * 最后修改时间
    */
    private Date modifyTime;
    /**
    * 最后修改此用户的用户id
    */
    private Long modifyUserId;
    /**
    * 用户密码
    */
    private String password;
    /**
    * 真实姓名
    */
    private String realName;
    /**
    * 用户薪水
    */
    private Object salary;
    /**
    * 学校
    */
    private String userSchool;
    /**
    * 性别
    */
    private String sex;
    /**
    * 主题皮肤
    */
    private String themeSkin;
    /**
    * 用户学历
    */
    private String userEdu;
    /**
    * 登录用户名
    */
    private String userName;
    /**
    * 用户签名
    */
    private String userSign;
    /**
    * 用户电话
    */
    private String userTel;
    /**
    * 部门
    */
    private Long deptId;
    /**
    * 职位
    */
    private Long positionId;
    /**
    * 角色
    */
    private Long roleId;
    private Integer superman;
    /**
    * 请假天数
    */
    private Integer holiday;
    private String pinyin;
}
