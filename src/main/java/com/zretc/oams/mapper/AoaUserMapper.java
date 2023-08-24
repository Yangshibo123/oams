package com.zretc.oams.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zretc.oams.entity.AoaUser;
import com.zretc.oams.mapper.provider.txlNbProvider;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
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
    @SelectProvider(type = txlNbProvider.class,method = "txlNb")
    IPage<HashMap> querytxlNb(Page page);
}
