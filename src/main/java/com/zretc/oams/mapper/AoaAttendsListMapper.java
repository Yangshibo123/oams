package com.zretc.oams.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zretc.oams.entity.AoaAttendsList;
import com.zretc.oams.mapper.provider.AoaAttendsListProvider;
import com.zretc.oams.mapper.provider.AoaSysMenuProvider;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;


/**
 * (AoaAttendsList)Mapper
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@Mapper
@Repository
public interface AoaAttendsListMapper extends BaseMapper<AoaAttendsList>{
@SelectProvider(type = AoaAttendsListProvider.class,method = "MhFeSql")
    IPage<HashMap> queryMUFy(Page page, String sel);
}
