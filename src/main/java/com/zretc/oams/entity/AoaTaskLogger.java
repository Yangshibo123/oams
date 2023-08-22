package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaTaskLogger implements Serializable {
    private static final long serialVersionUID = 356874276481484212L;
    @TableId(type = IdType.AUTO)
    /**
    * 任务日志id主键
    */
    private Long loggerId;
    /**
    * 任务日志创建时间
    */
    private Date createTime;
    /**
    * 任务日志反馈内容
    */
    private String loggerTicking;
    /**
    * 任务id外键
    */
    private Long taskId;
    /**
    * 任务日志生成人
    */
    private String username;
    /**
    * 状态id
    */
    private Integer loggerStatusid;
}
