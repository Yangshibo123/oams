package com.zretc.oams.service;

import com.zretc.oams.entity.AoaNoticeList;
import com.zretc.oams.mapper.AoaNoticeListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaNoticeList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaNoticeListService")
public class AoaNoticeListService {
    @Resource
    private AoaNoticeListMapper aoaNoticeListMapper;

    public AoaNoticeList queryById(Long noticeId) {
        return this.aoaNoticeListMapper.selectById(noticeId);
    }

    public IPage<AoaNoticeList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaNoticeListMapper.selectPage(page,wrapper);
    }
    public List<AoaNoticeList> queryAll() {
        return this.aoaNoticeListMapper.selectList(null);
    }
    public AoaNoticeList insert(AoaNoticeList aoaNoticeList) {
        this.aoaNoticeListMapper.insert(aoaNoticeList);
        return aoaNoticeList;
    }

    public AoaNoticeList update(AoaNoticeList aoaNoticeList) {
        this.aoaNoticeListMapper.updateById(aoaNoticeList);
        return this.queryById(aoaNoticeList.getNoticeId());
    }

    public boolean deleteById(Long noticeId) {
        return this.aoaNoticeListMapper.deleteById(noticeId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaNoticeListMapper.deleteBatchIds(ids) > 0;
    }
    
}
