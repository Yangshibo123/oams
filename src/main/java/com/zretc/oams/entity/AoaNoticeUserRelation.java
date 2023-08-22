package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaNoticeUserRelation implements Serializable {
    private static final long serialVersionUID = -38089551447584633L;
    @TableId(type = IdType.AUTO)
    /**
    * 用户与通知中间关联表主键id
    */
    private Long relatinId;
    /**
    * 此条通知该用户是否一已读
    */
    private Integer isRead;
    /**
    * 通知id

    */
    private Long relatinNoticeId;
    /**
    * 用户id
    */
    private Long relatinUserId;
}
