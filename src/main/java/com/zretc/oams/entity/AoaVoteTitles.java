package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaVoteTitles implements Serializable {
    private static final long serialVersionUID = 883678918471427431L;
    @TableId(type = IdType.AUTO)
    /**
    * 标题id
    */
    private Long titleId;
    /**
    * 进度条颜色
    */
    private String color;
    /**
    * 投票标题
    */
    private String title;
    /**
    * 投票id
    */
    private Long voteId;
}
