package com.zretc.oams.service;

import com.zretc.oams.entity.AoaRole_;
import com.zretc.oams.mapper.AoaRole_Mapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaRole_)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaRole_Service")
public class AoaRole_Service {
    @Resource
    private AoaRole_Mapper aoaRole_Mapper;

    public AoaRole_ queryById(Long roleId) {
        return this.aoaRole_Mapper.selectById(roleId);
    }

    public IPage<AoaRole_> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaRole_Mapper.selectPage(page,wrapper);
    }
    public List<AoaRole_> queryAll() {
        return this.aoaRole_Mapper.selectList(null);
    }
    public AoaRole_ insert(AoaRole_ aoaRole_) {
        this.aoaRole_Mapper.insert(aoaRole_);
        return aoaRole_;
    }

    public AoaRole_ update(AoaRole_ aoaRole_) {
        this.aoaRole_Mapper.updateById(aoaRole_);
        return this.queryById(aoaRole_.getRoleId());
    }

    public boolean deleteById(Long roleId) {
        return this.aoaRole_Mapper.deleteById(roleId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaRole_Mapper.deleteBatchIds(ids) > 0;
    }
    
}
