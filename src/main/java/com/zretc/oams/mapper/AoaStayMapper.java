package com.zretc.oams.mapper;

import com.zretc.oams.entity.AoaStay;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
 * (AoaStay)Mapper
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Mapper
@Repository
public interface AoaStayMapper extends BaseMapper<AoaStay>{

}
