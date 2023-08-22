package com.zretc.oams.entity;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.sql.Date;
@Data
public class AoaReceiverNote implements Serializable {
    private static final long serialVersionUID = 529038081050739731L;
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long noteId;
    private Long userId;
}
