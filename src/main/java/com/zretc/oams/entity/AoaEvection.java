package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaEvection implements Serializable {
    private static final long serialVersionUID = -99932162340499611L;
    @TableId(type = IdType.AUTO)
    private Long evectionId;
    /**
    * 外出类型
    */
    private Long typeId;
    private Long proId;
    /**
    * 人事部意见及说明
    */
    private String personnelAdvice;
    /**
    * 经理意见及说明
    */
    private String managerAdvice;
}
