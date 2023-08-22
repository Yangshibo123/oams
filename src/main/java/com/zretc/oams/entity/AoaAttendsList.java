package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaAttendsList implements Serializable {
    private static final long serialVersionUID = -96755619334326245L;
    @TableId(type = IdType.AUTO)
    /**
    * （无）
    */
    private Long attendsId;
    /**
    * 登陆ip
    */
    private String attendsIp;
    /**
    * 考勤备注
    */
    private String attendsRemark;
    /**
    * 考勤时间
    */
    private Date attendsTime;
    /**
    * 状态id
    */
    private Long statusId;
    /**
    * 类型id
    */
    private Long typeId;
    /**
    * （无）
    */
    private Long attendsUserId;
    /**
    * 考勤时分
    */
    private String attendHmtime;
    /**
    * 星期几
    */
    private String weekOfday;
    /**
    * 请假开始时间（？）
    */
    private Object holidayDays;
    /**
    * 请假开始时间（？重复）
    */
    private Date holidayStart;
}
