package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaOvertime implements Serializable {
    private static final long serialVersionUID = -44566353897990002L;
    @TableId(type = IdType.AUTO)
    private Long overtimeId;
    /**
    * 加班类型
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
