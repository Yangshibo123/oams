package com.zretc.oams.service;

import com.zretc.oams.entity.AoaNoteList;
import com.zretc.oams.mapper.AoaNoteListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaNoteList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaNoteListService")
public class AoaNoteListService {
    @Resource
    private AoaNoteListMapper aoaNoteListMapper;

    public AoaNoteList queryById(Long noteId) {
        return this.aoaNoteListMapper.selectById(noteId);
    }

    public IPage<AoaNoteList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaNoteListMapper.selectPage(page,wrapper);
    }
    public List<AoaNoteList> queryAll() {
        return this.aoaNoteListMapper.selectList(null);
    }
    public AoaNoteList insert(AoaNoteList aoaNoteList) {
        this.aoaNoteListMapper.insert(aoaNoteList);
        return aoaNoteList;
    }

    public AoaNoteList update(AoaNoteList aoaNoteList) {
        this.aoaNoteListMapper.updateById(aoaNoteList);
        return this.queryById(aoaNoteList.getNoteId());
    }

    public boolean deleteById(Long noteId) {
        return this.aoaNoteListMapper.deleteById(noteId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaNoteListMapper.deleteBatchIds(ids) > 0;
    }
    
}
