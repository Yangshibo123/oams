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


    public Object queryTreeList(){
        //查出一级菜单
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("parent_id",1);
        List<AoaSubject> grade1List =  aoaSubjectMapper.selectList(wrapper);
        List<AoaSubject> grade2List =  aoaSubjectMapper.queryGrade2();
        for (AoaSubject subject1: grade1List){
            for (int i = grade2List.size()-1;i>=0;i--){
                AoaSubject subject2 = grade2List.get(i);
                if (subject1.getSubjectId()==subject2.getParentId()){
                        subject1.getChildren().add(subject2);
                        grade2List.remove(i);
                }else {
                    break;
                }
            }
        }
        return grade1List;
    }
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
