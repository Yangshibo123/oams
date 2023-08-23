package com.zretc.oams.mapper;

import com.zretc.oams.entity.AoaUser;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


/**
 * (AoaUser)Mapper
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Mapper
@Repository
public interface AoaUserMapper extends BaseMapper<AoaUser>{
    @Select("select * from aoa_user where user_name = #{username}")
    List<AoaUser> login(String username,String password);
}
