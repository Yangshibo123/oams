package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaTraffic implements Serializable {
    private static final long serialVersionUID = -16206568337952037L;
    @TableId(type = IdType.AUTO)
    private Long trafficId;
    /**
    * 出发城市
    */
    private String departName;
    /**
    * 出发时间
    */
    private Date departTime;
    /**
    * 到达城市
    */
    private String reachName;
    /**
    * 座位类型
    */
    private String seatType;
    /**
    * 交通标准
    */
    private Object trafficMoney;
    /**
    * 交通工具
    */
    private String trafficName;
    /**
    * 出差人员id
    */
    private Long evectionId;
    /**
    * 出差人员
    */
    private Long userName;
}
