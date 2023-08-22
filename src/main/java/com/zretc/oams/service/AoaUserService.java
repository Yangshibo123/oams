package com.zretc.oams.service;

import com.zretc.oams.entity.AoaUser;
import com.zretc.oams.mapper.AoaUserMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaUser)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaUserService")
public class AoaUserService {
    @Resource
    private AoaUserMapper aoaUserMapper;

    public AoaUser queryById(Long userId) {
        return this.aoaUserMapper.selectById(userId);
    }

    public IPage<AoaUser> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaUserMapper.selectPage(page,wrapper);
    }
    public List<AoaUser> queryAll() {
        return this.aoaUserMapper.selectList(null);
    }
    public AoaUser insert(AoaUser aoaUser) {
        this.aoaUserMapper.insert(aoaUser);
        return aoaUser;
    }

    public AoaUser update(AoaUser aoaUser) {
        this.aoaUserMapper.updateById(aoaUser);
        return this.queryById(aoaUser.getUserId());
    }

    public boolean deleteById(Long userId) {
        return this.aoaUserMapper.deleteById(userId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaUserMapper.deleteBatchIds(ids) > 0;
    }
    
}
