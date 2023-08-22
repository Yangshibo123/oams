package com.zretc.oams.service;

import com.zretc.oams.entity.AoaDirector;
import com.zretc.oams.mapper.AoaDirectorMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaDirector)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@Service("aoaDirectorService")
public class AoaDirectorService {
    @Resource
    private AoaDirectorMapper aoaDirectorMapper;

    public AoaDirector queryById(Long directorId) {
        return this.aoaDirectorMapper.selectById(directorId);
    }

    public IPage<AoaDirector> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaDirectorMapper.selectPage(page,wrapper);
    }
    public List<AoaDirector> queryAll() {
        return this.aoaDirectorMapper.selectList(null);
    }
    public AoaDirector insert(AoaDirector aoaDirector) {
        this.aoaDirectorMapper.insert(aoaDirector);
        return aoaDirector;
    }

    public AoaDirector update(AoaDirector aoaDirector) {
        this.aoaDirectorMapper.updateById(aoaDirector);
        return this.queryById(aoaDirector.getDirectorId());
    }

    public boolean deleteById(Long directorId) {
        return this.aoaDirectorMapper.deleteById(directorId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaDirectorMapper.deleteBatchIds(ids) > 0;
    }
    
}
