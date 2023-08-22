package com.zretc.oams.service;

import com.zretc.oams.entity.AoaReviewed;
import com.zretc.oams.mapper.AoaReviewedMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaReviewed)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaReviewedService")
public class AoaReviewedService {
    @Resource
    private AoaReviewedMapper aoaReviewedMapper;

    public AoaReviewed queryById(Long reviewedId) {
        return this.aoaReviewedMapper.selectById(reviewedId);
    }

    public IPage<AoaReviewed> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaReviewedMapper.selectPage(page,wrapper);
    }
    public List<AoaReviewed> queryAll() {
        return this.aoaReviewedMapper.selectList(null);
    }
    public AoaReviewed insert(AoaReviewed aoaReviewed) {
        this.aoaReviewedMapper.insert(aoaReviewed);
        return aoaReviewed;
    }

    public AoaReviewed update(AoaReviewed aoaReviewed) {
        this.aoaReviewedMapper.updateById(aoaReviewed);
        return this.queryById(aoaReviewed.getReviewedId());
    }

    public boolean deleteById(Long reviewedId) {
        return this.aoaReviewedMapper.deleteById(reviewedId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaReviewedMapper.deleteBatchIds(ids) > 0;
    }
    
}
