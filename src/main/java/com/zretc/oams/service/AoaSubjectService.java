package com.zretc.oams.service;

import com.zretc.oams.entity.AoaSubject;
import com.zretc.oams.mapper.AoaSubjectMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaSubject)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@Service("aoaSubjectService")
public class AoaSubjectService {
    @Resource
    private AoaSubjectMapper aoaSubjectMapper;

    public AoaSubject queryById(Long subjectId) {
        return this.aoaSubjectMapper.selectById(subjectId);
    }

    public IPage<AoaSubject> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaSubjectMapper.selectPage(page,wrapper);
    }
    public List<AoaSubject> queryAll() {
        return this.aoaSubjectMapper.selectList(null);
    }
    public AoaSubject insert(AoaSubject aoaSubject) {
        this.aoaSubjectMapper.insert(aoaSubject);
        return aoaSubject;
    }

    public AoaSubject update(AoaSubject aoaSubject) {
        this.aoaSubjectMapper.updateById(aoaSubject);
        return this.queryById(aoaSubject.getSubjectId());
    }

    public boolean deleteById(Long subjectId) {
        return this.aoaSubjectMapper.deleteById(subjectId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaSubjectMapper.deleteBatchIds(ids) > 0;
    }
    
}
