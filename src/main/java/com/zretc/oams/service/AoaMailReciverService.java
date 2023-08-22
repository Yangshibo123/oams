package com.zretc.oams.service;

import com.zretc.oams.entity.AoaMailReciver;
import com.zretc.oams.mapper.AoaMailReciverMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaMailReciver)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaMailReciverService")
public class AoaMailReciverService {
    @Resource
    private AoaMailReciverMapper aoaMailReciverMapper;

    public AoaMailReciver queryById(Long pkId) {
        return this.aoaMailReciverMapper.selectById(pkId);
    }

    public IPage<AoaMailReciver> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaMailReciverMapper.selectPage(page,wrapper);
    }
    public List<AoaMailReciver> queryAll() {
        return this.aoaMailReciverMapper.selectList(null);
    }
    public AoaMailReciver insert(AoaMailReciver aoaMailReciver) {
        this.aoaMailReciverMapper.insert(aoaMailReciver);
        return aoaMailReciver;
    }

    public AoaMailReciver update(AoaMailReciver aoaMailReciver) {
        this.aoaMailReciverMapper.updateById(aoaMailReciver);
        return this.queryById(aoaMailReciver.getPkId());
    }

    public boolean deleteById(Long pkId) {
        return this.aoaMailReciverMapper.deleteById(pkId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaMailReciverMapper.deleteBatchIds(ids) > 0;
    }
    
}
