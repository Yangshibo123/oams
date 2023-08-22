package com.zretc.oams.service;

import com.zretc.oams.entity.AoaAttachmentList;
import com.zretc.oams.mapper.AoaAttachmentListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaAttachmentList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@Service("aoaAttachmentListService")
public class AoaAttachmentListService {
    @Resource
    private AoaAttachmentListMapper aoaAttachmentListMapper;

    public AoaAttachmentList queryById(Long attachmentId) {
        return this.aoaAttachmentListMapper.selectById(attachmentId);
    }

    public IPage<AoaAttachmentList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaAttachmentListMapper.selectPage(page,wrapper);
    }
    public List<AoaAttachmentList> queryAll() {
        return this.aoaAttachmentListMapper.selectList(null);
    }
    public AoaAttachmentList insert(AoaAttachmentList aoaAttachmentList) {
        this.aoaAttachmentListMapper.insert(aoaAttachmentList);
        return aoaAttachmentList;
    }

    public AoaAttachmentList update(AoaAttachmentList aoaAttachmentList) {
        this.aoaAttachmentListMapper.updateById(aoaAttachmentList);
        return this.queryById(aoaAttachmentList.getAttachmentId());
    }

    public boolean deleteById(Long attachmentId) {
        return this.aoaAttachmentListMapper.deleteById(attachmentId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaAttachmentListMapper.deleteBatchIds(ids) > 0;
    }
    
}
