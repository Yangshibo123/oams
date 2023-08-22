package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaVoteList implements Serializable {
    private static final long serialVersionUID = -78078873460063737L;
    @TableId(type = IdType.AUTO)
    /**
    * 主键id
    */
    private Long voteId;
    /**
    * 投票结束时间
    */
    private Date endTime;
    /**
    * 单选和多选
    */
    private Integer selectone;
    /**
    * 投票开始时间
    */
    private Date startTime;
}
