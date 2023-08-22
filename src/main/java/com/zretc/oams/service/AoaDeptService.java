package com.zretc.oams.service;

import com.zretc.oams.entity.AoaDept;
import com.zretc.oams.mapper.AoaDeptMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaDept)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@Service("aoaDeptService")
public class AoaDeptService {
    @Resource
    private AoaDeptMapper aoaDeptMapper;

    public AoaDept queryById(Long deptId) {
        return this.aoaDeptMapper.selectById(deptId);
    }

    public IPage<AoaDept> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaDeptMapper.selectPage(page,wrapper);
    }
    public List<AoaDept> queryAll() {
        return this.aoaDeptMapper.selectList(null);
    }
    public AoaDept insert(AoaDept aoaDept) {
        this.aoaDeptMapper.insert(aoaDept);
        return aoaDept;
    }

    public AoaDept update(AoaDept aoaDept) {
        this.aoaDeptMapper.updateById(aoaDept);
        return this.queryById(aoaDept.getDeptId());
    }

    public boolean deleteById(Long deptId) {
        return this.aoaDeptMapper.deleteById(deptId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaDeptMapper.deleteBatchIds(ids) > 0;
    }
    
}
