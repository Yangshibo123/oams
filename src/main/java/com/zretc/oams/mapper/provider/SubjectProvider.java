package com.zretc.oams.mapper.provider;

public class SubjectProvider {
    public String queryGrade2Sql(){
        String sql = "select subject_id,name,parent_id from aoa_subject" +
                " where parent_id !=0 and parent_id !=1 order by parent_id desc";
        return sql;
    }
}
