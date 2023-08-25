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
        String sql = "select p.process_id,p.type_name,process_name,apply_time,sh.user_name shr,\n" +
                "type.type_name deeply_name,status_name,s.status_id,fqr.user_name tbr,d.dept_name,\n" +
                "zmr.user_name zmr,b.name,bxfs.type_name bxfs,b.burse_time,b.allinvoices,b.all_money,\n" +
                "b.manager_advice,b.financial_advice,p.process_des,b.bursement_id\n" +
                "from aoa_process_list p,aoa_bursement b,aoa_reviewed r,aoa_user sh,aoa_type_list type,\n" +
                "aoa_status_list s,aoa_dept d,aoa_user fqr,aoa_user zmr,aoa_type_list bxfs\n" +
                "where p.process_id = r.pro_id and r.user_id = sh.user_id and p.process_id = b.pro_id\n" +
                "and p.deeply_id = type.type_id and s.status_id = p.status_id \n" +
                "and p.process_user_id = fqr.user_id and fqr.dept_id = d.dept_id\n" +
                "and b.user_name = zmr.user_id and bxfs.type_id = b.type_id\n" +
                "\t\t\t" +
                "and p.process_id = #{processId}";
        return sql;
    }


}
