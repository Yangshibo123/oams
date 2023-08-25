package com.zretc.oams.mapper.provider;

public class DetailBurseProvider {
    //查询一级菜单
    public String queryDetailBurseSql(Long bursmentId){
        String sql = "select descript,detailmoney,invoices,produce_time,s.name\n" +
                "from aoa_detailsburse d, aoa_subject s\n" +
                "where s.subject_id = d.subject and d.bursment_id = #{bursmentId}";
        return sql;
    }
}
