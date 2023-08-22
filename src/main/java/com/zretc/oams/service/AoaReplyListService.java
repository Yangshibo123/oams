package com.zretc.oams.service;

import com.zretc.oams.entity.AoaReplyList;
import com.zretc.oams.mapper.AoaReplyListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaReplyList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaReplyListService")
public class AoaReplyListService {
    @Resource
    private AoaReplyListMapper aoaReplyListMapper;

    public AoaReplyList queryById(Long replyId) {
        return this.aoaReplyListMapper.selectById(replyId);
    }

    public IPage<AoaReplyList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaReplyListMapper.selectPage(page,wrapper);
    }
    public List<AoaReplyList> queryAll() {
        return this.aoaReplyListMapper.selectList(null);
    }
    public AoaReplyList insert(AoaReplyList aoaReplyList) {
        this.aoaReplyListMapper.insert(aoaReplyList);
        return aoaReplyList;
    }

    public AoaReplyList update(AoaReplyList aoaReplyList) {
        this.aoaReplyListMapper.updateById(aoaReplyList);
        return this.queryById(aoaReplyList.getReplyId());
    }

    public boolean deleteById(Long replyId) {
        return this.aoaReplyListMapper.deleteById(replyId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaReplyListMapper.deleteBatchIds(ids) > 0;
    }
    
}
