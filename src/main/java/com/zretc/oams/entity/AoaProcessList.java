package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class  AoaProcessList implements Serializable {
    private static final long serialVersionUID = 735735466904093033L;
    @TableId(type = IdType.AUTO)
    private Long processId;
    /**
    * 流程申请时间
    */
    private Date applyTime;
    /**
    * 紧急程度
    */
    private Long deeplyId;
    /**
    * 流程结束时间
    */
    private Date endTime;
    /**
    * 流程申请原因内容
    */
    private String processDes;
    /**
    * 标题
    */
    private String processName;
    /**
    * 流程总天数
    */
    private Integer procseeDays;
    /**
    * 流程是否被驳回
    */
    private Integer isChecked;
    /**
    * 流程开始时间
    */
    private Date startTime;
    /**
    * 流程审核状态 id
    */
    private Long statusId;
    /**
    * 流程申请类型
    */
    private String typeName;
    /**
    * 流程附件id
    */
    private Long proFileId;
    /**
    * 流程申请人
    */
    private Long processUserId;
    private String shenuser;
}
