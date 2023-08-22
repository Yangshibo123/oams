package com.zretc.oams.service;

import com.zretc.oams.entity.AoaPlanList;
import com.zretc.oams.mapper.AoaPlanListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaPlanList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaPlanListService")
public class AoaPlanListService {
    @Resource
    private AoaPlanListMapper aoaPlanListMapper;

    public AoaPlanList queryById(Long planId) {
        return this.aoaPlanListMapper.selectById(planId);
    }

    public IPage<AoaPlanList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaPlanListMapper.selectPage(page,wrapper);
    }
    public List<AoaPlanList> queryAll() {
        return this.aoaPlanListMapper.selectList(null);
    }
    public AoaPlanList insert(AoaPlanList aoaPlanList) {
        this.aoaPlanListMapper.insert(aoaPlanList);
        return aoaPlanList;
    }

    public AoaPlanList update(AoaPlanList aoaPlanList) {
        this.aoaPlanListMapper.updateById(aoaPlanList);
        return this.queryById(aoaPlanList.getPlanId());
    }

    public boolean deleteById(Long planId) {
        return this.aoaPlanListMapper.deleteById(planId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaPlanListMapper.deleteBatchIds(ids) > 0;
    }
    
}
