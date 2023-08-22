package com.zretc.oams.service;

import com.zretc.oams.entity.AoaPosition;
import com.zretc.oams.mapper.AoaPositionMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaPosition)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaPositionService")
public class AoaPositionService {
    @Resource
    private AoaPositionMapper aoaPositionMapper;

    public AoaPosition queryById(Long positionId) {
        return this.aoaPositionMapper.selectById(positionId);
    }

    public IPage<AoaPosition> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaPositionMapper.selectPage(page,wrapper);
    }
    public List<AoaPosition> queryAll() {
        return this.aoaPositionMapper.selectList(null);
    }
    public AoaPosition insert(AoaPosition aoaPosition) {
        this.aoaPositionMapper.insert(aoaPosition);
        return aoaPosition;
    }

    public AoaPosition update(AoaPosition aoaPosition) {
        this.aoaPositionMapper.updateById(aoaPosition);
        return this.queryById(aoaPosition.getPositionId());
    }

    public boolean deleteById(Long positionId) {
        return this.aoaPositionMapper.deleteById(positionId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaPositionMapper.deleteBatchIds(ids) > 0;
    }
    
}
