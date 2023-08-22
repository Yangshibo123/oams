package com.zretc.oams.service;

import com.zretc.oams.entity.AoaEvection;
import com.zretc.oams.mapper.AoaEvectionMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaEvection)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@Service("aoaEvectionService")
public class AoaEvectionService {
    @Resource
    private AoaEvectionMapper aoaEvectionMapper;

    public AoaEvection queryById(Long evectionId) {
        return this.aoaEvectionMapper.selectById(evectionId);
    }

    public IPage<AoaEvection> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaEvectionMapper.selectPage(page,wrapper);
    }
    public List<AoaEvection> queryAll() {
        return this.aoaEvectionMapper.selectList(null);
    }
    public AoaEvection insert(AoaEvection aoaEvection) {
        this.aoaEvectionMapper.insert(aoaEvection);
        return aoaEvection;
    }

    public AoaEvection update(AoaEvection aoaEvection) {
        this.aoaEvectionMapper.updateById(aoaEvection);
        return this.queryById(aoaEvection.getEvectionId());
    }

    public boolean deleteById(Long evectionId) {
        return this.aoaEvectionMapper.deleteById(evectionId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaEvectionMapper.deleteBatchIds(ids) > 0;
    }
    
}
