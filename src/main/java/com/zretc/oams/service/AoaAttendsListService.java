package com.zretc.oams.service;

import com.zretc.oams.entity.AoaAttendsList;
import com.zretc.oams.mapper.AoaAttendsListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaAttendsList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@Service("aoaAttendsListService")
public class AoaAttendsListService {
    @Resource
    private AoaAttendsListMapper aoaAttendsListMapper;

    public AoaAttendsList queryById(Long attendsId) {
        return this.aoaAttendsListMapper.selectById(attendsId);
    }

    public IPage<AoaAttendsList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaAttendsListMapper.selectPage(page,wrapper);
    }
    public List<AoaAttendsList> queryAll() {
        return this.aoaAttendsListMapper.selectList(null);
    }
    public AoaAttendsList insert(AoaAttendsList aoaAttendsList) {
        this.aoaAttendsListMapper.insert(aoaAttendsList);
        return aoaAttendsList;
    }

    public AoaAttendsList update(AoaAttendsList aoaAttendsList) {
        this.aoaAttendsListMapper.updateById(aoaAttendsList);
        return this.queryById(aoaAttendsList.getAttendsId());
    }

    public boolean deleteById(Long attendsId) {
        return this.aoaAttendsListMapper.deleteById(attendsId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaAttendsListMapper.deleteBatchIds(ids) > 0;
    }
    
}
