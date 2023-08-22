package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaNoticeList implements Serializable {
    private static final long serialVersionUID = -13156093176070211L;
    @TableId(type = IdType.AUTO)
    private Long noticeId;
    private String content;
    private Integer isTop;
    private Date modifyTime;
    private Date noticeTime;
    private Long statusId;
    private String title;
    private Long typeId;
    private String url;
    private Long userId;
}
