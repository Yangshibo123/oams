package com.zretc.oams.service;

import com.zretc.oams.entity.AoaBursement;
import com.zretc.oams.mapper.AoaBursementMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaBursement)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@Service("aoaBursementService")
public class AoaBursementService {
    @Resource
    private AoaBursementMapper aoaBursementMapper;

    public AoaBursement queryById(Long bursementId) {
        return this.aoaBursementMapper.selectById(bursementId);
    }

    public IPage<AoaBursement> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaBursementMapper.selectPage(page,wrapper);
    }
    public List<AoaBursement> queryAll() {
        return this.aoaBursementMapper.selectList(null);
    }
    public AoaBursement insert(AoaBursement aoaBursement) {
        this.aoaBursementMapper.insert(aoaBursement);
        return aoaBursement;
    }

    public AoaBursement update(AoaBursement aoaBursement) {
        this.aoaBursementMapper.updateById(aoaBursement);
        return this.queryById(aoaBursement.getBursementId());
    }

    public boolean deleteById(Long bursementId) {
        return this.aoaBursementMapper.deleteById(bursementId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaBursementMapper.deleteBatchIds(ids) > 0;
    }
    
}
