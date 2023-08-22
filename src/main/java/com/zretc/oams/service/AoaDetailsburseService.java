package com.zretc.oams.service;

import com.zretc.oams.entity.AoaDetailsburse;
import com.zretc.oams.mapper.AoaDetailsburseMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaDetailsburse)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@Service("aoaDetailsburseService")
public class AoaDetailsburseService {
    @Resource
    private AoaDetailsburseMapper aoaDetailsburseMapper;

    public AoaDetailsburse queryById(Long detailsburseId) {
        return this.aoaDetailsburseMapper.selectById(detailsburseId);
    }

    public IPage<AoaDetailsburse> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaDetailsburseMapper.selectPage(page,wrapper);
    }
    public List<AoaDetailsburse> queryAll() {
        return this.aoaDetailsburseMapper.selectList(null);
    }
    public AoaDetailsburse insert(AoaDetailsburse aoaDetailsburse) {
        this.aoaDetailsburseMapper.insert(aoaDetailsburse);
        return aoaDetailsburse;
    }

    public AoaDetailsburse update(AoaDetailsburse aoaDetailsburse) {
        this.aoaDetailsburseMapper.updateById(aoaDetailsburse);
        return this.queryById(aoaDetailsburse.getDetailsburseId());
    }

    public boolean deleteById(Long detailsburseId) {
        return this.aoaDetailsburseMapper.deleteById(detailsburseId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaDetailsburseMapper.deleteBatchIds(ids) > 0;
    }
    
}
