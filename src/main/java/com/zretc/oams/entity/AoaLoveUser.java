package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaLoveUser implements Serializable {
    private static final long serialVersionUID = -34951207174501108L;
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
    * 记录id
    */
    private Long replyId;
    /**
    * 所属用户
    */
    private Long userId;
}
