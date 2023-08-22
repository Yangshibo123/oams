package com.zretc.oams.service;

import com.zretc.oams.entity.AoaOvertime;
import com.zretc.oams.mapper.AoaOvertimeMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaOvertime)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaOvertimeService")
public class AoaOvertimeService {
    @Resource
    private AoaOvertimeMapper aoaOvertimeMapper;

    public AoaOvertime queryById(Long overtimeId) {
        return this.aoaOvertimeMapper.selectById(overtimeId);
    }

    public IPage<AoaOvertime> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaOvertimeMapper.selectPage(page,wrapper);
    }
    public List<AoaOvertime> queryAll() {
        return this.aoaOvertimeMapper.selectList(null);
    }
    public AoaOvertime insert(AoaOvertime aoaOvertime) {
        this.aoaOvertimeMapper.insert(aoaOvertime);
        return aoaOvertime;
    }

    public AoaOvertime update(AoaOvertime aoaOvertime) {
        this.aoaOvertimeMapper.updateById(aoaOvertime);
        return this.queryById(aoaOvertime.getOvertimeId());
    }

    public boolean deleteById(Long overtimeId) {
        return this.aoaOvertimeMapper.deleteById(overtimeId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaOvertimeMapper.deleteBatchIds(ids) > 0;
    }
    
}
