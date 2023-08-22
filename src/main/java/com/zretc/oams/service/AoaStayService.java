package com.zretc.oams.service;

import com.zretc.oams.entity.AoaStay;
import com.zretc.oams.mapper.AoaStayMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaStay)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaStayService")
public class AoaStayService {
    @Resource
    private AoaStayMapper aoaStayMapper;

    public AoaStay queryById(Long stayId) {
        return this.aoaStayMapper.selectById(stayId);
    }

    public IPage<AoaStay> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaStayMapper.selectPage(page,wrapper);
    }
    public List<AoaStay> queryAll() {
        return this.aoaStayMapper.selectList(null);
    }
    public AoaStay insert(AoaStay aoaStay) {
        this.aoaStayMapper.insert(aoaStay);
        return aoaStay;
    }

    public AoaStay update(AoaStay aoaStay) {
        this.aoaStayMapper.updateById(aoaStay);
        return this.queryById(aoaStay.getStayId());
    }

    public boolean deleteById(Long stayId) {
        return this.aoaStayMapper.deleteById(stayId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaStayMapper.deleteBatchIds(ids) > 0;
    }
    
}
