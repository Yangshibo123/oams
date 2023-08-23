package com.zretc.oams.mapper.provider;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public class txlNbProvider {
    public String txlNb(Page page){
       String sql ="select d.dept_name,r.role_name,u.img_path,u.user_name,u.sex,u.user_tel,u.eamil\n" +
               "from aoa_role r,aoa_dept d,aoa_user u\n" +
               "where u.role_id = r.role_id\n" +
               "and u.dept_id = d.dept_id";
       return sql;
    }
}
