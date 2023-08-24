package com.zretc.oams.service;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.zretc.oams.entity.AoaDirectorUsers;
import com.zretc.oams.mapper.AoaDirectorUsersMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaDirectorUsers)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@Service("aoaDirectorUsersService")
public class AoaDirectorUsersService {
    @Resource
    private AoaDirectorUsersMapper aoaDirectorUsersMapper;

    public AoaDirectorUsers queryById(Long directorUsersId) {
        return this.aoaDirectorUsersMapper.selectById(directorUsersId);
    }

    public IPage<AoaDirectorUsers> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaDirectorUsersMapper.selectPage(page,wrapper);
    }
    public List<AoaDirectorUsers> queryAll() {
        return this.aoaDirectorUsersMapper.queryAll();
    }
    public AoaDirectorUsers insert(AoaDirectorUsers aoaDirectorUsers) {
        this.aoaDirectorUsersMapper.insert(aoaDirectorUsers);
        return aoaDirectorUsers;
    }

    public AoaDirectorUsers update(AoaDirectorUsers aoaDirectorUsers) {
        this.aoaDirectorUsersMapper.updateById(aoaDirectorUsers);
        return this.queryById(aoaDirectorUsers.getDirectorUsersId());
    }

    public boolean deleteById(Long directorUsersId) {
        return this.aoaDirectorUsersMapper.deleteById(directorUsersId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaDirectorUsersMapper.deleteBatchIds(ids) > 0;
    }
    
}
