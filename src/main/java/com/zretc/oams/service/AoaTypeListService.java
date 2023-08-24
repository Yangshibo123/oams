package com.zretc.oams.service;

import com.zretc.oams.entity.AoaTypeList;
import com.zretc.oams.mapper.AoaTypeListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaTypeList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaTypeListService")
public class AoaTypeListService {
    @Resource
    private AoaTypeListMapper aoaTypeListMapper;

    public AoaTypeList queryById(Long typeId) {
        return this.aoaTypeListMapper.selectById(typeId);
    }

    public IPage<AoaTypeList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaTypeListMapper.selectPage(page,wrapper);
    }
    public List<AoaTypeList> queryAll() {
        return this.aoaTypeListMapper.selectList(null);
    }
    public AoaTypeList insert(AoaTypeList aoaTypeList) {
        this.aoaTypeListMapper.insert(aoaTypeList);
        return aoaTypeList;
    }

    public AoaTypeList update(AoaTypeList aoaTypeList) {
        this.aoaTypeListMapper.updateById(aoaTypeList);
        return this.queryById(aoaTypeList.getTypeId());
    }

    public boolean deleteById(Long typeId) {
        return this.aoaTypeListMapper.deleteById(typeId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaTypeListMapper.deleteBatchIds(ids) > 0;
    }

    public Object queryTypeByModel(String typeModel) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("type_model",typeModel);
        return aoaTypeListMapper.selectList(wrapper);
    }
}
