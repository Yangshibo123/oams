package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaDirectorUsers implements Serializable {
    private static final long serialVersionUID = 248315772998698008L;
    @TableId(type = IdType.AUTO)
    private Long directorUsersId;
    private String catelogName;
    private Integer isHandle;
    private Long directorId;
    private Long userId;
    private Long shareUserId;
    private Date sharetime;
}
