package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaEvectionmoney implements Serializable {
    private static final long serialVersionUID = -52751813516764982L;
    @TableId(type = IdType.AUTO)
    private Long evectionmoneyId;
    /**
    * 财务部意见及说明
    */
    private String financialAdvice;
    /**
    * 经理意见及说明
    */
    private String managerAdvice;
    /**
    * 申请总金额
    */
    private Object money;
    /**
    * 关联客户
    */
    private String name;
    private Long proId;
    private Integer pro;
}
