package com.zretc.oams.mapper.provider;


import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public class AoaAttendsListProvider {
    public String MhFeSql(Page page, String sel){
        String sql="SELECT y.user_name,l.type_name,z.attends_time,z.attends_ip,z.attends_remark,zt.status_name\n" +
                "from aoa_attends_list  z,aoa_user y,aoa_type_list l,aoa_status_list zt\n" +
                "where z.type_id=l.type_id\n" +
                "and z.attends_user_id=y.user_id\n" +
                "and z.status_id=zt.status_id ";
        if (StringUtils.isNotBlank(sel)){
            sql+="and y.user_name like '%"+sel+"%' ";
            sql+="or l.type_name like '%"+sel+"%' ";
            sql+="or z.attends_time like '%"+sel+" %'";
            sql+="or z.attends_ip like '%"+sel+"%' ";
            sql+="or z.attends_remark like '%"+sel+"%' ";
            sql+="or zt.status_name like '%"+sel+"%' ";
        }





        return sql;
    }
}
