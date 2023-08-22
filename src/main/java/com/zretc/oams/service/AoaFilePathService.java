package com.zretc.oams.service;

import com.zretc.oams.entity.AoaFilePath;
import com.zretc.oams.mapper.AoaFilePathMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaFilePath)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaFilePathService")
public class AoaFilePathService {
    @Resource
    private AoaFilePathMapper aoaFilePathMapper;

    public AoaFilePath queryById(Long pathId) {
        return this.aoaFilePathMapper.selectById(pathId);
    }

    public IPage<AoaFilePath> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaFilePathMapper.selectPage(page,wrapper);
    }
    public List<AoaFilePath> queryAll() {
        return this.aoaFilePathMapper.selectList(null);
    }
    public AoaFilePath insert(AoaFilePath aoaFilePath) {
        this.aoaFilePathMapper.insert(aoaFilePath);
        return aoaFilePath;
    }

    public AoaFilePath update(AoaFilePath aoaFilePath) {
        this.aoaFilePathMapper.updateById(aoaFilePath);
        return this.queryById(aoaFilePath.getPathId());
    }

    public boolean deleteById(Long pathId) {
        return this.aoaFilePathMapper.deleteById(pathId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaFilePathMapper.deleteBatchIds(ids) > 0;
    }
    
}
