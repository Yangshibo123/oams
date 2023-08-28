package com.zretc.oams.service;

import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaProcessList;
import com.zretc.oams.mapper.AoaDetailsburseMapper;
import com.zretc.oams.mapper.AoaProcessListMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * (AoaProcessList)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@Service("aoaProcessListService")
public class AoaProcessListService {
    @Resource
    private AoaProcessListMapper aoaProcessListMapper;
    @Resource
    private AoaDetailsburseMapper aoaDetailsburseMapper;
    public Object queryMyList(Long userId,String content,Integer pageNo,Integer pageSize){
        Page page = new Page(pageNo,pageSize);
        return R.ok(aoaProcessListMapper.queryMyList(page,userId,content));
    }

    public Object queryMyBursementDetail(Long processId){
        HashMap result = aoaProcessListMapper.queryMyBursementDetail(processId);
        Long bursementId = Long.parseLong(result.get("bursementId").toString());
        List<HashMap> details = aoaDetailsburseMapper.querDetailBurse(bursementId);
        result.put("details",details);
        return R.ok(result);
    }
    public AoaProcessList queryById(Long processId) {
        return this.aoaProcessListMapper.selectById(processId);
    }

    public IPage<AoaProcessList> queryList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        Page page = new Page(pageNo,pageSize);
        return this.aoaProcessListMapper.selectPage(page,wrapper);
    }
    public List<AoaProcessList> queryAll() {
        return this.aoaProcessListMapper.selectList(null);
    }
    public AoaProcessList insert(AoaProcessList aoaProcessList) {
        this.aoaProcessListMapper.insert(aoaProcessList);
        return aoaProcessList;
    }

    public AoaProcessList update(AoaProcessList aoaProcessList) {
        this.aoaProcessListMapper.updateById(aoaProcessList);
        return this.queryById(aoaProcessList.getProcessId());
    }

    public boolean deleteById(Long processId) {
        return this.aoaProcessListMapper.deleteById(processId) > 0;
    }
    public boolean deleteByIds(List<Long> ids) {
        return this.aoaProcessListMapper.deleteBatchIds(ids) > 0;
    }

}
