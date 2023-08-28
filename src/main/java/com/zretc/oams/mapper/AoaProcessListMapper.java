package com.zretc.oams.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zretc.oams.entity.AoaProcessList;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.HashMap;

import com.zretc.oams.mapper.provider.ProcessSQLProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;


/**
 * (AoaProcessList)Mapper
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Mapper
@Repository
public interface AoaProcessListMapper extends BaseMapper<AoaProcessList>{
    @SelectProvider(type = ProcessSQLProvider.class,method = "queryMyList")
    IPage<HashMap> queryMyList(Page page,Long userId,String content);

    @SelectProvider(type = ProcessSQLProvider.class,method = "queryMyBursementDetailSql")
    HashMap queryMyBursementDetail(Long processId);
}
