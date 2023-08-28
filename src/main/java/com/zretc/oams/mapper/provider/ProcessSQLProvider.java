package com.zretc.oams.mapper.provider;

import org.springframework.util.StringUtils;

public class ProcessSQLProvider {
    public String queryMyList(Long userId,String content) {
        String sql = "SELECT\n" +
                "\tp.process_id,\n" +
                "\tp.type_name,\n" +
                "\tprocess_name,\n" +
                "\tapply_time,\n" +
                "\tuser_name,\n" +
                "\ttype.type_name deeply_name,\n" +
                "\tstatus_name,\n" +
                "\ts.status_id \n" +
                "FROM\n" +
                "\taoa_process_list p,\n" +
                "\taoa_reviewed r,\n" +
                "\taoa_user sh,\n" +
                "\taoa_type_list type,\n" +
                "\taoa_status_list s \n" +
                "WHERE\n" +
                "\tp.process_id = r.pro_id\n" +
                "AND r.user_id = sh.user_id\n" +
                "AND p.deeply_id = type.type_id\n" +
                "AND s.status_id = p.status_id\n" +
                "AND p.process_user_id = "+userId+"\n";
        if (!StringUtils.isEmpty(content)){
            sql += "AND (sh.user_name like'%"+content+"%'\n" +
                    "\t\t\tor p.type_name like'%"+content+"%'\n" +
                    "\t\t\tor p.process_name like'%"+content+"%'\n" +
                    "\t\t\tor s.status_name like'%"+content+"%')";
        }
        return sql;
    }

    public String queryMyBursementDetailSql(Long processId){
        String sql = "SELECT p.process_name,s.status_name,tdr.user_name,d.dept_name,\n" +
                "r.reviewed_time,zmr.user_name zmr,b.name,t.type_name,p.shenuser shr,\n" +
                "b.allinvoices,b.burse_time,b.bursement_id,type.type_name deeply_name\n" +
                "from aoa_process_list p\n" +
                "JOIN aoa_reviewed r on p.process_id = r.pro_id\n" +
                "join aoa_status_list s  ON r.status_id  = s.status_id \n" +
                "join aoa_user tdr on tdr.user_id = r.user_id\n" +
                "join aoa_dept d on d.dept_id = tdr.dept_id\n" +
                "join aoa_bursement b on b.pro_id = p.process_id\n" +
                "join aoa_user zmr on b.user_name =  zmr.user_id\n" +
                "join aoa_type_list t on t.type_id = b.type_id\n" +
                "join aoa_type_list type on type.type_id = p.deeply_id\n" +
                "where p.process_id = #{processId}";
        return sql;
    }


}
