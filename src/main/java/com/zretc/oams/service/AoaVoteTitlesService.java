package com.zretc.oams.service;

import com.zretc.oams.entity.AoaVoteTitles;
import com.zretc.oams.mapper.AoaVoteTitlesMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaVoteTitles)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaVoteTitlesService")
public class AoaVoteTitlesService {
    @Resource
    private AoaVoteTitlesMapper aoaVoteTitlesMapper;

    public AoaVoteTitles queryById(Long titleId) {
        return this.aoaVoteTitlesMapper.selectById(titleId);
    }

    public IPage<AoaVoteTitles> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaVoteTitlesMapper.selectPage(page,wrapper);
    }
    public List<AoaVoteTitles> queryAll() {
        return this.aoaVoteTitlesMapper.selectList(null);
    }
    public AoaVoteTitles insert(AoaVoteTitles aoaVoteTitles) {
        this.aoaVoteTitlesMapper.insert(aoaVoteTitles);
        return aoaVoteTitles;
    }

    public AoaVoteTitles update(AoaVoteTitles aoaVoteTitles) {
        this.aoaVoteTitlesMapper.updateById(aoaVoteTitles);
        return this.queryById(aoaVoteTitles.getTitleId());
    }

    public boolean deleteById(Long titleId) {
        return this.aoaVoteTitlesMapper.deleteById(titleId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaVoteTitlesMapper.deleteBatchIds(ids) > 0;
    }
    
}
