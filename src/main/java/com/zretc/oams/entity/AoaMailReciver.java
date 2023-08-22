package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaMailReciver implements Serializable {
    private static final long serialVersionUID = 405062821937978229L;
    @TableId(type = IdType.AUTO)
    private Long pkId;
    /**
    * 是否已读
    */
    private Integer isRead;
    /**
    * 内部邮件id
    */
    private Long mailId;
    /**
    * 内部用户id
    */
    private Long mailReciverId;
    /**
    * 是否星标
    */
    private Integer isStar;
    /**
    * 是否真正删除
    */
    private Integer isDel;
}
