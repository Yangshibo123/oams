package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaNoteList implements Serializable {
    private static final long serialVersionUID = -68247405711995725L;
    @TableId(type = IdType.AUTO)
    /**
    * 笔记id
    */
    private Long noteId;
    /**
    * 内容
    */
    private String content;
    /**
    * 发布时间
    */
    private Date createTime;
    /**
    * 状态id
    */
    private Long statusId;
    /**
    * 笔记标题
    */
    private String title;
    /**
    * 类型id
    */
    private Long typeId;
    /**
    * 目录id
    */
    private Long catalogId;
    /**
    * 附件id
    */
    private Long attachId;
    /**
    * 是否收藏
    */
    private Long isCollected;
    /**
    * 类型id
    */
    private Long createmanId;
    /**
    * 笔记分享接收人
    */
    private String receiver;
}
