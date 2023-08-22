package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaVoteTitleUser implements Serializable {
    private static final long serialVersionUID = -46227082780872394L;
    @TableId(type = IdType.AUTO)
    private Long voteTitleUserId;
    /**
    * 投票id
    */
    private Long voteId;
    /**
    * 用户id
    */
    private Long userId;
    /**
    * 标题
    */
    private Long titleId;
}
