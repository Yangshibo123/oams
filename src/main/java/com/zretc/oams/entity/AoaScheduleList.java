package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaScheduleList implements Serializable {
    private static final long serialVersionUID = 530619514843170078L;
    @TableId(type = IdType.AUTO)
    /**
    * 日程id
    */
    private Long rcId;
    /**
    * 发布时间
    */
    private Date createTime;
    /**
    * 结束时间
    */
    private Date endTime;
    private String filedescribe;
    /**
    * 是否提醒
    */
    private Integer isRemind;
    /**
    * 开始时间
    */
    private Date startTime;
    /**
    * 状态id
    */
    private Long statusId;
    /**
    * 日程标题
    */
    private String title;
    /**
    * 类型id
    */
    private Long typeId;
    /**
    * 日程所属人
    */
    private Long userId;
    /**
    * 日程描述
    */
    private String miaoshu;
    private Integer isreminded;
}
