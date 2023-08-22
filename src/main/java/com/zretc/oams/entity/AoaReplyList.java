package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaReplyList implements Serializable {
    private static final long serialVersionUID = -30410425042626587L;
    @TableId(type = IdType.AUTO)
    private Long replyId;
    /**
    * 内容
    */
    private String content;
    /**
    * 回复时间
    */
    private Date replayTime;
    private Long discussId;
    private Long replyUserId;
}
