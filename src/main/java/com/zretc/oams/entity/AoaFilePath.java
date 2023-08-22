package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaFilePath implements Serializable {
    private static final long serialVersionUID = -32446025404030103L;
    @TableId(type = IdType.AUTO)
    /**
    * 路径id
    */
    private Long pathId;
    private Long parentId;
    private String pathName;
    private Long pathUserId;
    private Long pathIstrash;
}
