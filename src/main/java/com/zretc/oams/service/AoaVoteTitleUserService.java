package com.zretc.oams.service;

import com.zretc.oams.entity.AoaVoteTitleUser;
import com.zretc.oams.mapper.AoaVoteTitleUserMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaVoteTitleUser)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaVoteTitleUserService")
public class AoaVoteTitleUserService {
    @Resource
    private AoaVoteTitleUserMapper aoaVoteTitleUserMapper;

    public AoaVoteTitleUser queryById(Long voteTitleUserId) {
        return this.aoaVoteTitleUserMapper.selectById(voteTitleUserId);
    }

    public IPage<AoaVoteTitleUser> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaVoteTitleUserMapper.selectPage(page,wrapper);
    }
    public List<AoaVoteTitleUser> queryAll() {
        return this.aoaVoteTitleUserMapper.selectList(null);
    }
    public AoaVoteTitleUser insert(AoaVoteTitleUser aoaVoteTitleUser) {
        this.aoaVoteTitleUserMapper.insert(aoaVoteTitleUser);
        return aoaVoteTitleUser;
    }

    public AoaVoteTitleUser update(AoaVoteTitleUser aoaVoteTitleUser) {
        this.aoaVoteTitleUserMapper.updateById(aoaVoteTitleUser);
        return this.queryById(aoaVoteTitleUser.getVoteTitleUserId());
    }

    public boolean deleteById(Long voteTitleUserId) {
        return this.aoaVoteTitleUserMapper.deleteById(voteTitleUserId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaVoteTitleUserMapper.deleteBatchIds(ids) > 0;
    }
    
}
