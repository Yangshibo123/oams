package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaScheduleUser implements Serializable {
    private static final long serialVersionUID = -85615919241193677L;
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long rcid;
    private Long userId;
}
