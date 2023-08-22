package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaBursement implements Serializable {
    private static final long serialVersionUID = -78761291736298115L;
    @TableId(type = IdType.AUTO)
    private Long bursementId;
    /**
    * 总计金额
    */
    private Object allMoney;
    /**
    * 票据总数
    */
    private Integer allinvoices;
    /**
    * 报销日期
    */
    private Date burseTime;
    /**
    * 财务部意见及说明
    */
    private String financialAdvice;
    /**
    * 经理意见及说明
    */
    private String managerAdvice;
    /**
    * 相关客户
    */
    private String name;
    /**
    * 报销方式（银行卡，现金，其他）
    */
    private Long typeId;
    /**
    * 报销人员
    */
    private Long operationName;
    private Long proId;
    /**
    * 证明人
    */
    private Long userName;
}
