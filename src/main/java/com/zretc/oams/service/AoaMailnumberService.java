package com.zretc.oams.service;

import com.zretc.oams.entity.AoaMailnumber;
import com.zretc.oams.mapper.AoaMailnumberMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaMailnumber)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaMailnumberService")
public class AoaMailnumberService {
    @Resource
    private AoaMailnumberMapper aoaMailnumberMapper;

    public AoaMailnumber queryById(Long mailNumberId) {
        return this.aoaMailnumberMapper.selectById(mailNumberId);
    }

    public IPage<AoaMailnumber> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaMailnumberMapper.selectPage(page,wrapper);
    }
    public List<AoaMailnumber> queryAll() {
        return this.aoaMailnumberMapper.selectList(null);
    }
    public AoaMailnumber insert(AoaMailnumber aoaMailnumber) {
        this.aoaMailnumberMapper.insert(aoaMailnumber);
        return aoaMailnumber;
    }

    public AoaMailnumber update(AoaMailnumber aoaMailnumber) {
        this.aoaMailnumberMapper.updateById(aoaMailnumber);
        return this.queryById(aoaMailnumber.getMailNumberId());
    }

    public boolean deleteById(Long mailNumberId) {
        return this.aoaMailnumberMapper.deleteById(mailNumberId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaMailnumberMapper.deleteBatchIds(ids) > 0;
    }
    
}
