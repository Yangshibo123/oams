package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaHoliday implements Serializable {
    private static final long serialVersionUID = -71029346303268547L;
    @TableId(type = IdType.AUTO)
    private Long holidayId;
    private Integer leaveDays;
    private Long typeId;
    private Long proId;
    private String managerAdvice;
    private String personnelAdvice;
}
