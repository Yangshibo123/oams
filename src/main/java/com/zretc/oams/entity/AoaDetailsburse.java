package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaDetailsburse implements Serializable {
    private static final long serialVersionUID = -54848152354183502L;
    @TableId(type = IdType.AUTO)
    private Long detailsburseId;
    private String descript;
    private Object detailmoney;
    private Integer invoices;
    private Date produceTime;
    private String subject;
    private Long bursmentId;
}
