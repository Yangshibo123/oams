package com.zretc.oams.mapper;

import com.zretc.oams.entity.AoaDetailsburse;
import com.zretc.oams.mapper.provider.DetailBurseProvider;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;


/**
 * (AoaDetailsburse)Mapper
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@Mapper
@Repository
public interface AoaDetailsburseMapper extends BaseMapper<AoaDetailsburse>{
    @SelectProvider(type = DetailBurseProvider.class,method = "queryDetailBurseSql")
    List<HashMap> querDetailBurse(Long bursmentId);
}
