package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaDept implements Serializable {
    private static final long serialVersionUID = -14909061162985823L;
    @TableId(type = IdType.AUTO)
    /**
    * 部门id
    */
    private Long deptId;
    /**
    * 部门地址
    */
    private String deptAddr;
    /**
    * 部门传真
    */
    private String deptFax;
    /**
    * 部门名字  非空 唯一
    */
    private String deptName;
    /**
    * 部门电话  
    */
    private String deptTel;
    /**
    * 部门email
    */
    private String email;
    private Long deptmanager;
    /**
    * 部门下班时间
    */
    private Date endTime;
    /**
    * 部门上班时间
    */
    private Date startTime;
}
