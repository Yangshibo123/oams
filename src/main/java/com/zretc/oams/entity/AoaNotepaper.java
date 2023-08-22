package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaNotepaper implements Serializable {
    private static final long serialVersionUID = -35162720552359238L;
    @TableId(type = IdType.AUTO)
    private Long notepaperId;
    private String concent;
    private Date createTime;
    private String title;
    private Long notepaperUserId;
}
