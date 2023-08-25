package com.zretc.oams.VO;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BursementVO {
    private Long userId;//提报人id
    private Long userName;//证明人的id
    private String processName;//标题
    private String name;//相关客户
    private Long deeply;//紧急情况id
    private Long typeId;//报销方式;//
    private Long shneheren;//审核人ID
    private String processDes;//报销的内容
      private List<DetailBurseVO> reData = new ArrayList<>();//明细
}
