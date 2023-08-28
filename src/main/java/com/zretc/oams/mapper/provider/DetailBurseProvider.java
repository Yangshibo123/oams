package com.zretc.oams.mapper.provider;

public class DetailBurseProvider {
    //查询一级菜单
    public String queryDetailBurseSql(Long bursmentId){
        String sql = "SELECT\n" +
                "\tdescript,\n" +
                "\tdetailmoney,\n" +
                "\tinvoices,\n" +
                "\tproduce_time,\n" +
                "\ts.NAME \n" +
                "FROM\n" +
                "\taoa_detailsburse d\n" +
                "\tJOIN aoa_subject s ON d.SUBJECT = s.NAME \n" +
                "WHERE\n" +
                "\td.bursment_id = #{bursmentId}";
        return sql;
    }
}
