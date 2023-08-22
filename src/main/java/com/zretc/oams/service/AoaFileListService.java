package com.zretc.oams.service;

import com.zretc.oams.entity.AoaFileList;
import com.zretc.oams.mapper.AoaFileListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaFileList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaFileListService")
public class AoaFileListService {
    @Resource
    private AoaFileListMapper aoaFileListMapper;

    public AoaFileList queryById(Long fileId) {
        return this.aoaFileListMapper.selectById(fileId);
    }

    public IPage<AoaFileList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaFileListMapper.selectPage(page,wrapper);
    }
    public List<AoaFileList> queryAll() {
        return this.aoaFileListMapper.selectList(null);
    }
    public AoaFileList insert(AoaFileList aoaFileList) {
        this.aoaFileListMapper.insert(aoaFileList);
        return aoaFileList;
    }

    public AoaFileList update(AoaFileList aoaFileList) {
        this.aoaFileListMapper.updateById(aoaFileList);
        return this.queryById(aoaFileList.getFileId());
    }

    public boolean deleteById(Long fileId) {
        return this.aoaFileListMapper.deleteById(fileId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaFileListMapper.deleteBatchIds(ids) > 0;
    }
    
}
