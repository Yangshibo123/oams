package com.zretc.oams.service;

import com.zretc.oams.entity.AoaUserLoginRecord;
import com.zretc.oams.mapper.AoaUserLoginRecordMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaUserLoginRecord)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaUserLoginRecordService")
public class AoaUserLoginRecordService {
    @Resource
    private AoaUserLoginRecordMapper aoaUserLoginRecordMapper;

    public AoaUserLoginRecord queryById(Long recordId) {
        return this.aoaUserLoginRecordMapper.selectById(recordId);
    }

    public IPage<AoaUserLoginRecord> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaUserLoginRecordMapper.selectPage(page,wrapper);
    }
    public List<AoaUserLoginRecord> queryAll() {
        return this.aoaUserLoginRecordMapper.selectList(null);
    }
    public AoaUserLoginRecord insert(AoaUserLoginRecord aoaUserLoginRecord) {
        this.aoaUserLoginRecordMapper.insert(aoaUserLoginRecord);
        return aoaUserLoginRecord;
    }

    public AoaUserLoginRecord update(AoaUserLoginRecord aoaUserLoginRecord) {
        this.aoaUserLoginRecordMapper.updateById(aoaUserLoginRecord);
        return this.queryById(aoaUserLoginRecord.getRecordId());
    }

    public boolean deleteById(Long recordId) {
        return this.aoaUserLoginRecordMapper.deleteById(recordId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaUserLoginRecordMapper.deleteBatchIds(ids) > 0;
    }
    
}
