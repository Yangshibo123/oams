package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaPosition implements Serializable {
    private static final long serialVersionUID = 810326443402100800L;
    @TableId(type = IdType.AUTO)
    /**
    * 职位id
    */
    private Long positionId;
    /**
    * 职位层级
    */
    private Integer level;
    /**
    * 职位名称
    */
    private String name;
    /**
    * 职位描述
    */
    private String describtion;
    /**
    * 职位编号
    */
    private Long deptid;
}
