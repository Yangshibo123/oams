package com.zretc.oams.service;

import com.zretc.oams.entity.AoaCatalog;
import com.zretc.oams.mapper.AoaCatalogMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaCatalog)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@Service("aoaCatalogService")
public class AoaCatalogService {
    @Resource
    private AoaCatalogMapper aoaCatalogMapper;

    public AoaCatalog queryById(Long catalogId) {
        return this.aoaCatalogMapper.selectById(catalogId);
    }

    public IPage<AoaCatalog> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaCatalogMapper.selectPage(page,wrapper);
    }
    public List<AoaCatalog> queryAll() {
        return this.aoaCatalogMapper.selectList(null);
    }
    public AoaCatalog insert(AoaCatalog aoaCatalog) {
        this.aoaCatalogMapper.insert(aoaCatalog);
        return aoaCatalog;
    }

    public AoaCatalog update(AoaCatalog aoaCatalog) {
        this.aoaCatalogMapper.updateById(aoaCatalog);
        return this.queryById(aoaCatalog.getCatalogId());
    }

    public boolean deleteById(Long catalogId) {
        return this.aoaCatalogMapper.deleteById(catalogId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaCatalogMapper.deleteBatchIds(ids) > 0;
    }
    
}
