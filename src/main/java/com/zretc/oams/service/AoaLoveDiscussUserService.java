package com.zretc.oams.service;

import com.zretc.oams.entity.AoaLoveDiscussUser;
import com.zretc.oams.mapper.AoaLoveDiscussUserMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaLoveDiscussUser)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaLoveDiscussUserService")
public class AoaLoveDiscussUserService {
    @Resource
    private AoaLoveDiscussUserMapper aoaLoveDiscussUserMapper;

    public AoaLoveDiscussUser queryById(Long discussId) {
        return this.aoaLoveDiscussUserMapper.selectById(discussId);
    }

    public IPage<AoaLoveDiscussUser> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaLoveDiscussUserMapper.selectPage(page,wrapper);
    }
    public List<AoaLoveDiscussUser> queryAll() {
        return this.aoaLoveDiscussUserMapper.selectList(null);
    }
    public AoaLoveDiscussUser insert(AoaLoveDiscussUser aoaLoveDiscussUser) {
        this.aoaLoveDiscussUserMapper.insert(aoaLoveDiscussUser);
        return aoaLoveDiscussUser;
    }

    public AoaLoveDiscussUser update(AoaLoveDiscussUser aoaLoveDiscussUser) {
        this.aoaLoveDiscussUserMapper.updateById(aoaLoveDiscussUser);
        return this.queryById(aoaLoveDiscussUser.getDiscussId());
    }

    public boolean deleteById(Long discussId) {
        return this.aoaLoveDiscussUserMapper.deleteById(discussId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaLoveDiscussUserMapper.deleteBatchIds(ids) > 0;
    }
    
}
