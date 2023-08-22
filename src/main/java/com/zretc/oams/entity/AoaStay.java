package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaStay implements Serializable {
    private static final long serialVersionUID = 279656790016702371L;
    @TableId(type = IdType.AUTO)
    /**
    * 入住日期
    */
    private Long stayId;
    /**
    * 入住天数
    */
    private Integer day;
    /**
    * 入住酒店
    */
    private String hotelName;
    /**
    * 离店日期
    */
    private Date leaveTime;
    /**
    * 入住城市
    */
    private String stayCity;
    /**
    * 酒店标准
    */
    private Object stayMoney;
    private Date stayTime;
    private Long evemoneyId;
    /**
    * 出差人员
    */
    private Long userName;
}
