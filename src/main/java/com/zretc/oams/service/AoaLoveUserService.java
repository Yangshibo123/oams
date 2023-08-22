package com.zretc.oams.service;

import com.zretc.oams.entity.AoaLoveUser;
import com.zretc.oams.mapper.AoaLoveUserMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaLoveUser)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaLoveUserService")
public class AoaLoveUserService {
    @Resource
    private AoaLoveUserMapper aoaLoveUserMapper;

    public AoaLoveUser queryById(Long id) {
        return this.aoaLoveUserMapper.selectById(id);
    }

    public IPage<AoaLoveUser> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaLoveUserMapper.selectPage(page,wrapper);
    }
    public List<AoaLoveUser> queryAll() {
        return this.aoaLoveUserMapper.selectList(null);
    }
    public AoaLoveUser insert(AoaLoveUser aoaLoveUser) {
        this.aoaLoveUserMapper.insert(aoaLoveUser);
        return aoaLoveUser;
    }

    public AoaLoveUser update(AoaLoveUser aoaLoveUser) {
        this.aoaLoveUserMapper.updateById(aoaLoveUser);
        return this.queryById(aoaLoveUser.getId());
    }

    public boolean deleteById(Long id) {
        return this.aoaLoveUserMapper.deleteById(id) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaLoveUserMapper.deleteBatchIds(ids) > 0;
    }
    
}
