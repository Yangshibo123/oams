package com.zretc.oams.service;

import com.zretc.oams.entity.AoaProcessList;
import com.zretc.oams.mapper.AoaProcessListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaProcessList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaProcessListService")
public class AoaProcessListService {
    @Resource
    private AoaProcessListMapper aoaProcessListMapper;

    public AoaProcessList queryById(Long processId) {
        return this.aoaProcessListMapper.selectById(processId);
    }

    public IPage<AoaProcessList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaProcessListMapper.selectPage(page,wrapper);
    }
    public List<AoaProcessList> queryAll() {
        return this.aoaProcessListMapper.selectList(null);
    }
    public AoaProcessList insert(AoaProcessList aoaProcessList) {
        this.aoaProcessListMapper.insert(aoaProcessList);
        return aoaProcessList;
    }

    public AoaProcessList update(AoaProcessList aoaProcessList) {
        this.aoaProcessListMapper.updateById(aoaProcessList);
        return this.queryById(aoaProcessList.getProcessId());
    }

    public boolean deleteById(Long processId) {
        return this.aoaProcessListMapper.deleteById(processId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaProcessListMapper.deleteBatchIds(ids) > 0;
    }
    
}
