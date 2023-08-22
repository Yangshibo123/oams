package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaUserLoginRecord implements Serializable {
    private static final long serialVersionUID = 750639640284388082L;
    @TableId(type = IdType.AUTO)
    private Long recordId;
    private String browser;
    private String ipAddr;
    private Date loginTime;
    private String sessionId;
    private Long userId;
}
