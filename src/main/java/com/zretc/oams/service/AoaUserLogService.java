package com.zretc.oams.service;

import com.zretc.oams.entity.AoaUserLog;
import com.zretc.oams.mapper.AoaUserLogMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaUserLog)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaUserLogService")
public class AoaUserLogService {
    @Resource
    private AoaUserLogMapper aoaUserLogMapper;

    public AoaUserLog queryById(Long logId) {
        return this.aoaUserLogMapper.selectById(logId);
    }

    public IPage<AoaUserLog> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaUserLogMapper.selectPage(page,wrapper);
    }
    public List<AoaUserLog> queryAll() {
        return this.aoaUserLogMapper.selectList(null);
    }
    public AoaUserLog insert(AoaUserLog aoaUserLog) {
        this.aoaUserLogMapper.insert(aoaUserLog);
        return aoaUserLog;
    }

    public AoaUserLog update(AoaUserLog aoaUserLog) {
        this.aoaUserLogMapper.updateById(aoaUserLog);
        return this.queryById(aoaUserLog.getLogId());
    }

    public boolean deleteById(Long logId) {
        return this.aoaUserLogMapper.deleteById(logId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaUserLogMapper.deleteBatchIds(ids) > 0;
    }
    
}
