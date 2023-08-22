package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaCommentList implements Serializable {
    private static final long serialVersionUID = -33040775043970021L;
    @TableId(type = IdType.AUTO)
    /**
    * 用户id
    */
    private Long commentId;
    /**
    * 发布内容
    */
    private String comment;
    /**
    * 发布时间
    */
    private Date time;
    private Long commentUserId;
    /**
    * 回复id
    */
    private Long replyId;
}
