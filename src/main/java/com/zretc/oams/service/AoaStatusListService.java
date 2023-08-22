package com.zretc.oams.service;

import com.zretc.oams.entity.AoaStatusList;
import com.zretc.oams.mapper.AoaStatusListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaStatusList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaStatusListService")
public class AoaStatusListService {
    @Resource
    private AoaStatusListMapper aoaStatusListMapper;

    public AoaStatusList queryById(Long statusId) {
        return this.aoaStatusListMapper.selectById(statusId);
    }

    public IPage<AoaStatusList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaStatusListMapper.selectPage(page,wrapper);
    }
    public List<AoaStatusList> queryAll() {
        return this.aoaStatusListMapper.selectList(null);
    }
    public AoaStatusList insert(AoaStatusList aoaStatusList) {
        this.aoaStatusListMapper.insert(aoaStatusList);
        return aoaStatusList;
    }

    public AoaStatusList update(AoaStatusList aoaStatusList) {
        this.aoaStatusListMapper.updateById(aoaStatusList);
        return this.queryById(aoaStatusList.getStatusId());
    }

    public boolean deleteById(Long statusId) {
        return this.aoaStatusListMapper.deleteById(statusId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaStatusListMapper.deleteBatchIds(ids) > 0;
    }
    
}
