package com.zretc.oams.service;

import com.zretc.oams.entity.AoaScheduleList;
import com.zretc.oams.mapper.AoaScheduleListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaScheduleList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaScheduleListService")
public class AoaScheduleListService {
    @Resource
    private AoaScheduleListMapper aoaScheduleListMapper;

    public AoaScheduleList queryById(Long rcId) {
        return this.aoaScheduleListMapper.selectById(rcId);
    }

    public IPage<AoaScheduleList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaScheduleListMapper.selectPage(page,wrapper);
    }
    public List<AoaScheduleList> queryAll() {
        return this.aoaScheduleListMapper.selectList(null);
    }
    public AoaScheduleList insert(AoaScheduleList aoaScheduleList) {
        this.aoaScheduleListMapper.insert(aoaScheduleList);
        return aoaScheduleList;
    }

    public AoaScheduleList update(AoaScheduleList aoaScheduleList) {
        this.aoaScheduleListMapper.updateById(aoaScheduleList);
        return this.queryById(aoaScheduleList.getRcId());
    }

    public boolean deleteById(Long rcId) {
        return this.aoaScheduleListMapper.deleteById(rcId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaScheduleListMapper.deleteBatchIds(ids) > 0;
    }
    
}
