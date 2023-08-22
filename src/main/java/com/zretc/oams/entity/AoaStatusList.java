package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaStatusList implements Serializable {
    private static final long serialVersionUID = 604705320507209602L;
    @TableId(type = IdType.AUTO)
    /**
    * 状态id
    */
    private Long statusId;
    /**
    * 状态颜色
    */
    private String statusColor;
    /**
    * 状态模块
    */
    private String statusModel;
    /**
    * 状态名称
    */
    private String statusName;
    /**
    * 状态排序值
    */
    private Integer sortValue;
    /**
    * 百分比
    */
    private String sortPrecent;
}
