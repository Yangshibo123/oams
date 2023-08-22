package com.zretc.oams.service;

import com.zretc.oams.entity.AoaDiscussList;
import com.zretc.oams.mapper.AoaDiscussListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaDiscussList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@Service("aoaDiscussListService")
public class AoaDiscussListService {
    @Resource
    private AoaDiscussListMapper aoaDiscussListMapper;

    public AoaDiscussList queryById(Long discussId) {
        return this.aoaDiscussListMapper.selectById(discussId);
    }

    public IPage<AoaDiscussList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaDiscussListMapper.selectPage(page,wrapper);
    }
    public List<AoaDiscussList> queryAll() {
        return this.aoaDiscussListMapper.selectList(null);
    }
    public AoaDiscussList insert(AoaDiscussList aoaDiscussList) {
        this.aoaDiscussListMapper.insert(aoaDiscussList);
        return aoaDiscussList;
    }

    public AoaDiscussList update(AoaDiscussList aoaDiscussList) {
        this.aoaDiscussListMapper.updateById(aoaDiscussList);
        return this.queryById(aoaDiscussList.getDiscussId());
    }

    public boolean deleteById(Long discussId) {
        return this.aoaDiscussListMapper.deleteById(discussId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaDiscussListMapper.deleteBatchIds(ids) > 0;
    }
    
}
