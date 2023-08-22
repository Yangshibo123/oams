package com.zretc.oams.service;

import com.zretc.oams.entity.AoaTaskUser;
import com.zretc.oams.mapper.AoaTaskUserMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaTaskUser)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaTaskUserService")
public class AoaTaskUserService {
    @Resource
    private AoaTaskUserMapper aoaTaskUserMapper;

    public AoaTaskUser queryById(Long pkId) {
        return this.aoaTaskUserMapper.selectById(pkId);
    }

    public IPage<AoaTaskUser> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaTaskUserMapper.selectPage(page,wrapper);
    }
    public List<AoaTaskUser> queryAll() {
        return this.aoaTaskUserMapper.selectList(null);
    }
    public AoaTaskUser insert(AoaTaskUser aoaTaskUser) {
        this.aoaTaskUserMapper.insert(aoaTaskUser);
        return aoaTaskUser;
    }

    public AoaTaskUser update(AoaTaskUser aoaTaskUser) {
        this.aoaTaskUserMapper.updateById(aoaTaskUser);
        return this.queryById(aoaTaskUser.getPkId());
    }

    public boolean deleteById(Long pkId) {
        return this.aoaTaskUserMapper.deleteById(pkId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaTaskUserMapper.deleteBatchIds(ids) > 0;
    }
    
}
