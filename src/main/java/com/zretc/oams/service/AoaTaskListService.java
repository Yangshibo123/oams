package com.zretc.oams.service;

import com.zretc.oams.entity.AoaTaskList;
import com.zretc.oams.mapper.AoaTaskListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaTaskList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaTaskListService")
public class AoaTaskListService {
    @Resource
    private AoaTaskListMapper aoaTaskListMapper;

    public AoaTaskList queryById(Long taskId) {
        return this.aoaTaskListMapper.selectById(taskId);
    }

    public IPage<AoaTaskList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaTaskListMapper.selectPage(page,wrapper);
    }
    public List<AoaTaskList> queryAll() {
        return this.aoaTaskListMapper.selectList(null);
    }
    public AoaTaskList insert(AoaTaskList aoaTaskList) {
        this.aoaTaskListMapper.insert(aoaTaskList);
        return aoaTaskList;
    }

    public AoaTaskList update(AoaTaskList aoaTaskList) {
        this.aoaTaskListMapper.updateById(aoaTaskList);
        return this.queryById(aoaTaskList.getTaskId());
    }

    public boolean deleteById(Long taskId) {
        return this.aoaTaskListMapper.deleteById(taskId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaTaskListMapper.deleteBatchIds(ids) > 0;
    }
    
}
