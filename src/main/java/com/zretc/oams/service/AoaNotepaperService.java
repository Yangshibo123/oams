package com.zretc.oams.service;

import com.zretc.oams.entity.AoaNotepaper;
import com.zretc.oams.mapper.AoaNotepaperMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaNotepaper)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaNotepaperService")
public class AoaNotepaperService {
    @Resource
    private AoaNotepaperMapper aoaNotepaperMapper;

    public AoaNotepaper queryById(Long notepaperId) {
        return this.aoaNotepaperMapper.selectById(notepaperId);
    }

    public IPage<AoaNotepaper> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaNotepaperMapper.selectPage(page,wrapper);
    }
    public List<AoaNotepaper> queryAll() {
        return this.aoaNotepaperMapper.selectList(null);
    }
    public AoaNotepaper insert(AoaNotepaper aoaNotepaper) {
        this.aoaNotepaperMapper.insert(aoaNotepaper);
        return aoaNotepaper;
    }

    public AoaNotepaper update(AoaNotepaper aoaNotepaper) {
        this.aoaNotepaperMapper.updateById(aoaNotepaper);
        return this.queryById(aoaNotepaper.getNotepaperId());
    }

    public boolean deleteById(Long notepaperId) {
        return this.aoaNotepaperMapper.deleteById(notepaperId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaNotepaperMapper.deleteBatchIds(ids) > 0;
    }
    
}
