package com.zretc.oams.service;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaSysMenu;
import com.zretc.oams.entity.AoaUser;
import com.zretc.oams.mapper.AoaSysMenuMapper;
import com.zretc.oams.mapper.AoaUserMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
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
    @Resource
    private AoaSysMenuMapper menuMapper;

    public AoaUser queryById(Long userId) {
        return this.aoaUserMapper.selectById(userId);
    }


    public IPage<HashMap> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo, pageSize);
        return this.aoaUserMapper.querytxlNb(page);
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

    //登录
    public Object login(String username, String password) {
        List<AoaUser> aoaUsers = aoaUserMapper.login(username, password);
        if (StringUtils.isNotBlank(username)) {
            if (aoaUsers.size() > 0) {
                if (StringUtils.isNotBlank(password)) {
                    AoaUser user = aoaUsers.get(0);
                    if (user.getPassword().equals(password)) {
                        HashMap map = new HashMap();
                        map.put("user", user);
                        map.put("menus", this.queryMenusById(user.getUserId()));
                        return R.ok(map);
                    } else {
                        return R.failed("密码不正确");
                    }
                } else {
                    return R.failed("请输入密码");
                }
            } else {
                return R.failed("用户名不存在");
            }
        } else {
            return R.failed("请输入用户名");
        }
    }

    public List<AoaSysMenu> queryMenusById(Long userId) {
        List<AoaSysMenu> grade1Menus = menuMapper.queryGrade1MenuByUserId(userId);
        List<AoaSysMenu> grade2Menus = menuMapper.queryGrade2MenuByUserId(userId);
        for (AoaSysMenu grade1Menu : grade1Menus) {
            for (int i = grade2Menus.size() - 1; i >= 0; i--) {
                AoaSysMenu grade2Menu = grade2Menus.get(i);
                if (grade1Menu.getMenuId() == grade2Menu.getParentId()) {
                    grade1Menu.getGrade2Menus().add(grade2Menu);
                    grade2Menus.remove(i);
                } else {
                    break;
                }
            }
        }
        return grade1Menus;
    }
}
