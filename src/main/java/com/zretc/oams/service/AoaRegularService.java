package com.zretc.oams.service;

import com.zretc.oams.entity.AoaRegular;
import com.zretc.oams.mapper.AoaRegularMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaRegular)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaRegularService")
public class AoaRegularService {
    @Resource
    private AoaRegularMapper aoaRegularMapper;

    public AoaRegular queryById(Long regularId) {
        return this.aoaRegularMapper.selectById(regularId);
    }

    public IPage<AoaRegular> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaRegularMapper.selectPage(page,wrapper);
    }
    public List<AoaRegular> queryAll() {
        return this.aoaRegularMapper.selectList(null);
    }
    public AoaRegular insert(AoaRegular aoaRegular) {
        this.aoaRegularMapper.insert(aoaRegular);
        return aoaRegular;
    }

    public AoaRegular update(AoaRegular aoaRegular) {
        this.aoaRegularMapper.updateById(aoaRegular);
        return this.queryById(aoaRegular.getRegularId());
    }

    public boolean deleteById(Long regularId) {
        return this.aoaRegularMapper.deleteById(regularId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaRegularMapper.deleteBatchIds(ids) > 0;
    }
    
}
