package com.zretc.oams.mapper;

import com.zretc.oams.entity.AoaReceiverNote;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
 * (AoaReceiverNote)Mapper
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Mapper
@Repository
public interface AoaReceiverNoteMapper extends BaseMapper<AoaReceiverNote>{

}
