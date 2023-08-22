package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaSubject implements Serializable {
    private static final long serialVersionUID = 753647382906735319L;
    @TableId(type = IdType.AUTO)
    private Long subjectId;
    private String name;
    private Long parentId;
}
