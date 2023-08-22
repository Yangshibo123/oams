package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaTaskList implements Serializable {
    private static final long serialVersionUID = 916042440094419323L;
    @TableId(type = IdType.AUTO)
    /**
    * 任务id主键
    */
    private Long taskId;
    /**
    * 任务评价
    */
    private String comment;
    /**
    * 任务结束时间
    */
    private Date endTime;
    /**
    * 是否取消任务
    */
    private Integer isCancel;
    /**
    * 任务是否置顶
    */
    private Integer isTop;
    /**
    * 任务修改时间
    */
    private Date modifyTime;
    /**
    * 发布时间
    */
    private Date publishTime;
    /**
    * 任务开始时间
    */
    private Date starTime;
    /**
    * 任务状态id
    */
    private Integer statusId;
    /**
    * 任务描述
    */
    private String taskDescribe;
    /**
    * 任务结束后反馈
    */
    private String ticking;
    /**
    * 任务主题
    */
    private String title;
    /**
    * 任务类型（公事，私事）
    */
    private Long typeId;
    /**
    * 发布人id
    */
    private Long taskPushUserId;
    /**
    * 接收人
    */
    private String reciverlist;
}
