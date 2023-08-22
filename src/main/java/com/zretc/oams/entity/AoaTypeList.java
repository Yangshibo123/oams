package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaTypeList implements Serializable {
    private static final long serialVersionUID = -61749279362497758L;
    @TableId(type = IdType.AUTO)
    /**
    * 类型id
    */
    private Long typeId;
    /**
    * 类型颜色
    */
    private String typeColor;
    /**
    * 所属模块
    */
    private String typeModel;
    /**
    * 类型名字
    */
    private String typeName;
    /**
    * 排序值
    */
    private Integer sortValue;
}
