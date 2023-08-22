package com.zretc.oams.service;

import com.zretc.oams.entity.AoaScheduleUser;
import com.zretc.oams.mapper.AoaScheduleUserMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaScheduleUser)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaScheduleUserService")
public class AoaScheduleUserService {
    @Resource
    private AoaScheduleUserMapper aoaScheduleUserMapper;

    public AoaScheduleUser queryById(Long id) {
        return this.aoaScheduleUserMapper.selectById(id);
    }

    public IPage<AoaScheduleUser> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaScheduleUserMapper.selectPage(page,wrapper);
    }
    public List<AoaScheduleUser> queryAll() {
        return this.aoaScheduleUserMapper.selectList(null);
    }
    public AoaScheduleUser insert(AoaScheduleUser aoaScheduleUser) {
        this.aoaScheduleUserMapper.insert(aoaScheduleUser);
        return aoaScheduleUser;
    }

    public AoaScheduleUser update(AoaScheduleUser aoaScheduleUser) {
        this.aoaScheduleUserMapper.updateById(aoaScheduleUser);
        return this.queryById(aoaScheduleUser.getId());
    }

    public boolean deleteById(Long id) {
        return this.aoaScheduleUserMapper.deleteById(id) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaScheduleUserMapper.deleteBatchIds(ids) > 0;
    }
    
}
