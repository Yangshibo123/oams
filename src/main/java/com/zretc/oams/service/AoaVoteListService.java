package com.zretc.oams.service;

import com.zretc.oams.entity.AoaVoteList;
import com.zretc.oams.mapper.AoaVoteListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaVoteList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaVoteListService")
public class AoaVoteListService {
    @Resource
    private AoaVoteListMapper aoaVoteListMapper;

    public AoaVoteList queryById(Long voteId) {
        return this.aoaVoteListMapper.selectById(voteId);
    }

    public IPage<AoaVoteList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaVoteListMapper.selectPage(page,wrapper);
    }
    public List<AoaVoteList> queryAll() {
        return this.aoaVoteListMapper.selectList(null);
    }
    public AoaVoteList insert(AoaVoteList aoaVoteList) {
        this.aoaVoteListMapper.insert(aoaVoteList);
        return aoaVoteList;
    }

    public AoaVoteList update(AoaVoteList aoaVoteList) {
        this.aoaVoteListMapper.updateById(aoaVoteList);
        return this.queryById(aoaVoteList.getVoteId());
    }

    public boolean deleteById(Long voteId) {
        return this.aoaVoteListMapper.deleteById(voteId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaVoteListMapper.deleteBatchIds(ids) > 0;
    }
    
}
