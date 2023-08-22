package com.zretc.oams.service;

import com.zretc.oams.entity.AoaNoticeUserRelation;
import com.zretc.oams.mapper.AoaNoticeUserRelationMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaNoticeUserRelation)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaNoticeUserRelationService")
public class AoaNoticeUserRelationService {
    @Resource
    private AoaNoticeUserRelationMapper aoaNoticeUserRelationMapper;

    public AoaNoticeUserRelation queryById(Long relatinId) {
        return this.aoaNoticeUserRelationMapper.selectById(relatinId);
    }

    public IPage<AoaNoticeUserRelation> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaNoticeUserRelationMapper.selectPage(page,wrapper);
    }
    public List<AoaNoticeUserRelation> queryAll() {
        return this.aoaNoticeUserRelationMapper.selectList(null);
    }
    public AoaNoticeUserRelation insert(AoaNoticeUserRelation aoaNoticeUserRelation) {
        this.aoaNoticeUserRelationMapper.insert(aoaNoticeUserRelation);
        return aoaNoticeUserRelation;
    }

    public AoaNoticeUserRelation update(AoaNoticeUserRelation aoaNoticeUserRelation) {
        this.aoaNoticeUserRelationMapper.updateById(aoaNoticeUserRelation);
        return this.queryById(aoaNoticeUserRelation.getRelatinId());
    }

    public boolean deleteById(Long relatinId) {
        return this.aoaNoticeUserRelationMapper.deleteById(relatinId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaNoticeUserRelationMapper.deleteBatchIds(ids) > 0;
    }
    
}
