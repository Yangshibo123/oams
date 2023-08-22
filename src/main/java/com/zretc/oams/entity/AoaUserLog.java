package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaUserLog implements Serializable {
    private static final long serialVersionUID = 941049153071722459L;
    @TableId(type = IdType.AUTO)
    /**
    * 登录id
    */
    private Long logId;
    /**
    * ip地址
    */
    private String ipAddr;
    /**
    * 日志记录时间
    */
    private Date logTime;
    /**
    * 操作菜单名字
    */
    private String title;
    /**
    * 操作菜单url
    */
    private String url;
    /**
    * 用户id
    */
    private Long userId;
}
