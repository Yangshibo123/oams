package com.zretc.oams.service;

import com.zretc.oams.entity.AoaSysMenu;
import com.zretc.oams.mapper.AoaSysMenuMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaSysMenu)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaSysMenuService")
public class AoaSysMenuService {
    @Resource
    private AoaSysMenuMapper aoaSysMenuMapper;

    public AoaSysMenu queryById(Long menuId) {
        return this.aoaSysMenuMapper.selectById(menuId);
    }

    public IPage<AoaSysMenu> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaSysMenuMapper.selectPage(page,wrapper);
    }
    public List<AoaSysMenu> queryAll() {
        return this.aoaSysMenuMapper.selectList(null);
    }
    public AoaSysMenu insert(AoaSysMenu aoaSysMenu) {
        this.aoaSysMenuMapper.insert(aoaSysMenu);
        return aoaSysMenu;
    }

    public AoaSysMenu update(AoaSysMenu aoaSysMenu) {
        this.aoaSysMenuMapper.updateById(aoaSysMenu);
        return this.queryById(aoaSysMenu.getMenuId());
    }

    public boolean deleteById(Long menuId) {
        return this.aoaSysMenuMapper.deleteById(menuId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaSysMenuMapper.deleteBatchIds(ids) > 0;
    }
    
}
