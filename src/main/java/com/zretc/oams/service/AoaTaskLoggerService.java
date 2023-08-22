package com.zretc.oams.service;

import com.zretc.oams.entity.AoaTaskLogger;
import com.zretc.oams.mapper.AoaTaskLoggerMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaTaskLogger)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaTaskLoggerService")
public class AoaTaskLoggerService {
    @Resource
    private AoaTaskLoggerMapper aoaTaskLoggerMapper;

    public AoaTaskLogger queryById(Long loggerId) {
        return this.aoaTaskLoggerMapper.selectById(loggerId);
    }

    public IPage<AoaTaskLogger> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaTaskLoggerMapper.selectPage(page,wrapper);
    }
    public List<AoaTaskLogger> queryAll() {
        return this.aoaTaskLoggerMapper.selectList(null);
    }
    public AoaTaskLogger insert(AoaTaskLogger aoaTaskLogger) {
        this.aoaTaskLoggerMapper.insert(aoaTaskLogger);
        return aoaTaskLogger;
    }

    public AoaTaskLogger update(AoaTaskLogger aoaTaskLogger) {
        this.aoaTaskLoggerMapper.updateById(aoaTaskLogger);
        return this.queryById(aoaTaskLogger.getLoggerId());
    }

    public boolean deleteById(Long loggerId) {
        return this.aoaTaskLoggerMapper.deleteById(loggerId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaTaskLoggerMapper.deleteBatchIds(ids) > 0;
    }
    
}
