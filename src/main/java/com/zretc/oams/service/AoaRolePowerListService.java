package com.zretc.oams.service;

import com.zretc.oams.entity.AoaRolePowerList;
import com.zretc.oams.mapper.AoaRolePowerListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaRolePowerList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaRolePowerListService")
public class AoaRolePowerListService {
    @Resource
    private AoaRolePowerListMapper aoaRolePowerListMapper;

    public AoaRolePowerList queryById(Long pkId) {
        return this.aoaRolePowerListMapper.selectById(pkId);
    }

    public IPage<AoaRolePowerList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaRolePowerListMapper.selectPage(page,wrapper);
    }
    public List<AoaRolePowerList> queryAll() {
        return this.aoaRolePowerListMapper.selectList(null);
    }
    public AoaRolePowerList insert(AoaRolePowerList aoaRolePowerList) {
        this.aoaRolePowerListMapper.insert(aoaRolePowerList);
        return aoaRolePowerList;
    }

    public AoaRolePowerList update(AoaRolePowerList aoaRolePowerList) {
        this.aoaRolePowerListMapper.updateById(aoaRolePowerList);
        return this.queryById(aoaRolePowerList.getPkId());
    }

    public boolean deleteById(Long pkId) {
        return this.aoaRolePowerListMapper.deleteById(pkId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaRolePowerListMapper.deleteBatchIds(ids) > 0;
    }
    
}
