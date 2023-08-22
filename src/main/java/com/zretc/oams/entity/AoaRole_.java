package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaRole_ implements Serializable {
    private static final long serialVersionUID = -53686603063304812L;
    @TableId(type = IdType.AUTO)
    /**
    * 角色id
    */
    private Long roleId;
    /**
    * 角色名
    */
    private String roleName;
    /**
    * 角色权限值
    */
    private Integer roleValue;
}
