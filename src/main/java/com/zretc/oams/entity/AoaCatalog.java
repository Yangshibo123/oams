package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaCatalog implements Serializable {
    private static final long serialVersionUID = 668424675780548413L;
    @TableId(type = IdType.AUTO)
    /**
    * 目录id
    */
    private Long catalogId;
    /**
    * 目录名字
    */
    private String catalogName;
    /**
    * 判断id
    */
    private Integer parentId;
    private Long cataUserId;
}
