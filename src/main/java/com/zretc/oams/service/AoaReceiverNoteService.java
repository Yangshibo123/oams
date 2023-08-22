package com.zretc.oams.service;

import com.zretc.oams.entity.AoaReceiverNote;
import com.zretc.oams.mapper.AoaReceiverNoteMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaReceiverNote)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaReceiverNoteService")
public class AoaReceiverNoteService {
    @Resource
    private AoaReceiverNoteMapper aoaReceiverNoteMapper;

    public AoaReceiverNote queryById(Long id) {
        return this.aoaReceiverNoteMapper.selectById(id);
    }

    public IPage<AoaReceiverNote> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaReceiverNoteMapper.selectPage(page,wrapper);
    }
    public List<AoaReceiverNote> queryAll() {
        return this.aoaReceiverNoteMapper.selectList(null);
    }
    public AoaReceiverNote insert(AoaReceiverNote aoaReceiverNote) {
        this.aoaReceiverNoteMapper.insert(aoaReceiverNote);
        return aoaReceiverNote;
    }

    public AoaReceiverNote update(AoaReceiverNote aoaReceiverNote) {
        this.aoaReceiverNoteMapper.updateById(aoaReceiverNote);
        return this.queryById(aoaReceiverNote.getId());
    }

    public boolean deleteById(Long id) {
        return this.aoaReceiverNoteMapper.deleteById(id) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaReceiverNoteMapper.deleteBatchIds(ids) > 0;
    }
    
}
