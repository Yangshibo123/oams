package com.zretc.oams.service;

import com.zretc.oams.entity.AoaHoliday;
import com.zretc.oams.mapper.AoaHolidayMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaHoliday)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaHolidayService")
public class AoaHolidayService {
    @Resource
    private AoaHolidayMapper aoaHolidayMapper;

    public AoaHoliday queryById(Long holidayId) {
        return this.aoaHolidayMapper.selectById(holidayId);
    }

    public IPage<AoaHoliday> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaHolidayMapper.selectPage(page,wrapper);
    }
    public List<AoaHoliday> queryAll() {
        return this.aoaHolidayMapper.selectList(null);
    }
    public AoaHoliday insert(AoaHoliday aoaHoliday) {
        this.aoaHolidayMapper.insert(aoaHoliday);
        return aoaHoliday;
    }

    public AoaHoliday update(AoaHoliday aoaHoliday) {
        this.aoaHolidayMapper.updateById(aoaHoliday);
        return this.queryById(aoaHoliday.getHolidayId());
    }

    public boolean deleteById(Long holidayId) {
        return this.aoaHolidayMapper.deleteById(holidayId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaHolidayMapper.deleteBatchIds(ids) > 0;
    }
    
}
