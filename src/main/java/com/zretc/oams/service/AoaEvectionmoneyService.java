package com.zretc.oams.service;

import com.zretc.oams.entity.AoaEvectionmoney;
import com.zretc.oams.mapper.AoaEvectionmoneyMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaEvectionmoney)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaEvectionmoneyService")
public class AoaEvectionmoneyService {
    @Resource
    private AoaEvectionmoneyMapper aoaEvectionmoneyMapper;

    public AoaEvectionmoney queryById(Long evectionmoneyId) {
        return this.aoaEvectionmoneyMapper.selectById(evectionmoneyId);
    }

    public IPage<AoaEvectionmoney> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaEvectionmoneyMapper.selectPage(page,wrapper);
    }
    public List<AoaEvectionmoney> queryAll() {
        return this.aoaEvectionmoneyMapper.selectList(null);
    }
    public AoaEvectionmoney insert(AoaEvectionmoney aoaEvectionmoney) {
        this.aoaEvectionmoneyMapper.insert(aoaEvectionmoney);
        return aoaEvectionmoney;
    }

    public AoaEvectionmoney update(AoaEvectionmoney aoaEvectionmoney) {
        this.aoaEvectionmoneyMapper.updateById(aoaEvectionmoney);
        return this.queryById(aoaEvectionmoney.getEvectionmoneyId());
    }

    public boolean deleteById(Long evectionmoneyId) {
        return this.aoaEvectionmoneyMapper.deleteById(evectionmoneyId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaEvectionmoneyMapper.deleteBatchIds(ids) > 0;
    }
    
}
