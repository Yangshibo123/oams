package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaDiscussList implements Serializable {
    private static final long serialVersionUID = 895373640181605707L;
    @TableId(type = IdType.AUTO)
    /**
    * 主键id
    */
    private Long discussId;
    /**
    * 附件id没有外键为了查找方便
    */
    private Integer attachmentId;
    /**
    * 内容
    */
    private String content;
    /**
    * 创建时间
    */
    private Date createTime;
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
    * 访问量
    */
    private Integer visitNum;
    /**
    * 讨论归属人
    */
    private Long discussUserId;
    /**
    * 投票id
    */
    private Long voteId;
    /**
    * 创建时间
    */
    private Date modifyTime;
}
