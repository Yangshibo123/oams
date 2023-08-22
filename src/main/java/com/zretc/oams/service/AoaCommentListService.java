package com.zretc.oams.service;

import com.zretc.oams.entity.AoaCommentList;
import com.zretc.oams.mapper.AoaCommentListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaCommentList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@Service("aoaCommentListService")
public class AoaCommentListService {
    @Resource
    private AoaCommentListMapper aoaCommentListMapper;

    public AoaCommentList queryById(Long commentId) {
        return this.aoaCommentListMapper.selectById(commentId);
    }

    public IPage<AoaCommentList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaCommentListMapper.selectPage(page,wrapper);
    }
    public List<AoaCommentList> queryAll() {
        return this.aoaCommentListMapper.selectList(null);
    }
    public AoaCommentList insert(AoaCommentList aoaCommentList) {
        this.aoaCommentListMapper.insert(aoaCommentList);
        return aoaCommentList;
    }

    public AoaCommentList update(AoaCommentList aoaCommentList) {
        this.aoaCommentListMapper.updateById(aoaCommentList);
        return this.queryById(aoaCommentList.getCommentId());
    }

    public boolean deleteById(Long commentId) {
        return this.aoaCommentListMapper.deleteById(commentId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaCommentListMapper.deleteBatchIds(ids) > 0;
    }
    
}
