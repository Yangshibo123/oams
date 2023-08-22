package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaRegular implements Serializable {
    private static final long serialVersionUID = -47259924633195397L;
    @TableId(type = IdType.AUTO)
    private Long regularId;
    /**
    * 对公司产品的意见及建议
    */
    private String advice;
    /**
    * 目前存在的不足
    */
    private String deficiency;
    /**
    * 如何在本岗位作得更好
    */
    private String dobetter;
    /**
    * 试用期/实习期心得体会
    */
    private String experience;
    /**
    * 人事部意见及说明
    */
    private String personnelAdvice;
    /**
    * 试用期/实习期在哪些方面有了成长
    */
    private String pullulate;
    /**
    * 对本岗位职员的要求的理解
    */
    private String understand;
    private Long proId;
    /**
    * 经理意见及说明
    */
    private String managerAdvice;
    /**
    * 实习天数
    */
    private Integer days;
}
