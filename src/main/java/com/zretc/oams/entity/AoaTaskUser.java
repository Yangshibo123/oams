package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaTaskUser implements Serializable {
    private static final long serialVersionUID = -34569412521373167L;
    @TableId(type = IdType.AUTO)
    /**
    * 任务接收人主键id
    */
    private Long pkId;
    /**
    * 任务状态id
    */
    private Long statusId;
    /**
    * 任务id外键
    */
    private Long taskId;
    /**
    * 接收人id外键
    */
    private Long taskReciveUserId;
}
