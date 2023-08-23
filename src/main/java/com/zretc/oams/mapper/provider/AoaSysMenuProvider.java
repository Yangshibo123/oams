package com.zretc.oams.mapper.provider;

public class AoaSysMenuProvider {
    public String grade1MenuSql(Long userId){
        String sql = "SELECT\n" +
                "m.menu_id,\n" +
                "\tm.menu_name,\n" +
                "\tm.menu_icon,\n" +
                "\tm.menu_url,m.parent_id \n" +
                "FROM\n" +
                "\taoa_user u\n" +
                "\tJOIN aoa_role r ON u.role_id = r.role_id\n" +
                "\tJOIN aoa_role_power_list p ON r.role_id = p.role_id\n" +
                "\tJOIN aoa_sys_menu m ON p.menu_id = m.menu_id \n" +
                "where u.user_id = #{userId} and m.parent_id =0 \n" +
                "ORDER BY m.menu_id ";
        return sql;
    }

    public String grade2MenuSql(Long userId){
        String sql = "SELECT\n" +
                "m.menu_id,\n" +
                "\tm.menu_name,\n" +
                "\tm.menu_icon,\n" +
                "\tm.menu_url,m.parent_id \n" +
                "FROM\n" +
                "\taoa_user u\n" +
                "\tJOIN aoa_role r ON u.role_id = r.role_id\n" +
                "\tJOIN aoa_role_power_list p ON r.role_id = p.role_id\n" +
                "\tJOIN aoa_sys_menu m ON p.menu_id = m.menu_id \n" +
                "where u.user_id = #{userId} and m.parent_id !=0 and p.is_show = 1 \n " +
                "ORDER BY m.parent_id desc ";
        return sql;
    }
}
