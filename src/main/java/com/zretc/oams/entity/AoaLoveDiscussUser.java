package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaLoveDiscussUser implements Serializable {
    private static final long serialVersionUID = -59691245112063942L;
    @TableId(type = IdType.AUTO)
    private Long discussId;
    private Long userId;
}
