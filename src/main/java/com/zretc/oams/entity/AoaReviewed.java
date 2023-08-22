package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaReviewed implements Serializable {
    private static final long serialVersionUID = 608239168333192973L;
    @TableId(type = IdType.AUTO)
    private Long reviewedId;
    private String advice;
    private Date reviewedTime;
    private Long statusId;
    private Long proId;
    private Long userId;
    private Integer del;
}
