package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaPlanList implements Serializable {
    private static final long serialVersionUID = 962552703960630630L;
    @TableId(type = IdType.AUTO)
    private Long planId;
    /**
    * 记录创建时间
    */
    private Date createTime;
    /**
    * 结束时间
    */
    private Date endTime;
    /**
    * 标签
    */
    private String label;
    /**
    * 计划评论
    */
    private String planComment;
    /**
    * 计划内容
    */
    private String planContent;
    /**
    * 计划总结
    */
    private String planSummary;
    /**
    * 开始时间
    */
    private Date startTime;
    /**
    * 状态id
    */
    private Long statusId;
    /**
    * 标题
    */
    private String title;
    /**
    * 类型id
    */
    private Long typeId;
    /**
    * 用户计划外键
    */
    private Long planUserId;
    /**
    * 附件id
    */
    private Long attachId;
}
