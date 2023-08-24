package com.zretc.oams.VO;

import lombok.Data;

import java.sql.Date;

@Data
public class DetailBurseVO {
    //费用日期
    private Date produceTime;
    //费用科目
    private String subjectId;
    //费用说明
    private String descript;
    //票据张数
    private Integer invoices;
    //报销金额
    private Double detailmoney;
}
