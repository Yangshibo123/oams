package com.zretc.oams.service;

import com.zretc.oams.entity.AoaTraffic;
import com.zretc.oams.mapper.AoaTrafficMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaTraffic)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaTrafficService")
public class AoaTrafficService {
    @Resource
    private AoaTrafficMapper aoaTrafficMapper;

    public AoaTraffic queryById(Long trafficId) {
        return this.aoaTrafficMapper.selectById(trafficId);
    }

    public IPage<AoaTraffic> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaTrafficMapper.selectPage(page,wrapper);
    }
    public List<AoaTraffic> queryAll() {
        return this.aoaTrafficMapper.selectList(null);
    }
    public AoaTraffic insert(AoaTraffic aoaTraffic) {
        this.aoaTrafficMapper.insert(aoaTraffic);
        return aoaTraffic;
    }

    public AoaTraffic update(AoaTraffic aoaTraffic) {
        this.aoaTrafficMapper.updateById(aoaTraffic);
        return this.queryById(aoaTraffic.getTrafficId());
    }

    public boolean deleteById(Long trafficId) {
        return this.aoaTrafficMapper.deleteById(trafficId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaTrafficMapper.deleteBatchIds(ids) > 0;
    }
    
}
