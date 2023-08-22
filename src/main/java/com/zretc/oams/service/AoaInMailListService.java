package com.zretc.oams.service;

import com.zretc.oams.entity.AoaInMailList;
import com.zretc.oams.mapper.AoaInMailListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaInMailList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaInMailListService")
public class AoaInMailListService {
    @Resource
    private AoaInMailListMapper aoaInMailListMapper;

    public AoaInMailList queryById(Long mailId) {
        return this.aoaInMailListMapper.selectById(mailId);
    }

    public IPage<AoaInMailList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaInMailListMapper.selectPage(page,wrapper);
    }
    public List<AoaInMailList> queryAll() {
        return this.aoaInMailListMapper.selectList(null);
    }
    public AoaInMailList insert(AoaInMailList aoaInMailList) {
        this.aoaInMailListMapper.insert(aoaInMailList);
        return aoaInMailList;
    }

    public AoaInMailList update(AoaInMailList aoaInMailList) {
        this.aoaInMailListMapper.updateById(aoaInMailList);
        return this.queryById(aoaInMailList.getMailId());
    }

    public boolean deleteById(Long mailId) {
        return this.aoaInMailListMapper.deleteById(mailId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaInMailListMapper.deleteBatchIds(ids) > 0;
    }
    
}
