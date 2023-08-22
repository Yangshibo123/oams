package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaRolePowerList implements Serializable {
    private static final long serialVersionUID = 503246436908209252L;
    @TableId(type = IdType.AUTO)
    private Long pkId;
    private Integer isShow;
    private Long menuId;
    private Long roleId;
}
