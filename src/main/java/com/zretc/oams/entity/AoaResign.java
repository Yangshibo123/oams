package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaResign implements Serializable {
    private static final long serialVersionUID = 897490493277085906L;
    @TableId(type = IdType.AUTO)
    private Long resignId;
    /**
    * 财务部意见及说明
    */
    private String financialAdvice;
    /**
    * 是否还有费用报销未完成
    */
    private Object isFinish;
    /**
    * 未完成事宜
    */
    private String nofinish;
    /**
    * 人事部意见及说明
    */
    private String personnelAdvice;
    /**
    * 申请人的意见及建议
    */
    private String suggest;
    /**
    * 工作交接人员
    */
    private Long handUser;
    private Long proId;
    /**
    * 经理意见及说明
    */
    private String managerAdvice;
}
