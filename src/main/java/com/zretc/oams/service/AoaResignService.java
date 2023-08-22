package com.zretc.oams.service;

import com.zretc.oams.entity.AoaResign;
import com.zretc.oams.mapper.AoaResignMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaResign)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaResignService")
public class AoaResignService {
    @Resource
    private AoaResignMapper aoaResignMapper;

    public AoaResign queryById(Long resignId) {
        return this.aoaResignMapper.selectById(resignId);
    }

    public IPage<AoaResign> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaResignMapper.selectPage(page,wrapper);
    }
    public List<AoaResign> queryAll() {
        return this.aoaResignMapper.selectList(null);
    }
    public AoaResign insert(AoaResign aoaResign) {
        this.aoaResignMapper.insert(aoaResign);
        return aoaResign;
    }

    public AoaResign update(AoaResign aoaResign) {
        this.aoaResignMapper.updateById(aoaResign);
        return this.queryById(aoaResign.getResignId());
    }

    public boolean deleteById(Long resignId) {
        return this.aoaResignMapper.deleteById(resignId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaResignMapper.deleteBatchIds(ids) > 0;
    }
    
}
