package com.zretc.oams.mapper;

import com.zretc.oams.entity.AoaSysMenu;
import com.zretc.oams.mapper.provider.AoaSysMenuProvider;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;


/**
 * (AoaSysMenu)Mapper
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Mapper
@Repository
public interface AoaSysMenuMapper extends BaseMapper<AoaSysMenu>{
    @SelectProvider(type = AoaSysMenuProvider.class,method = "grade1MenuSql")
    public List<AoaSysMenu> queryGrade1MenuByUserId(Long userId);
    @SelectProvider(type = AoaSysMenuProvider.class,method = "grade2MenuSql")
    public List<AoaSysMenu> queryGrade2MenuByUserId(Long userId);
}
