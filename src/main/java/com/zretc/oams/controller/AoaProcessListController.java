package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaProcessList;
import com.zretc.oams.service.AoaProcessListService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaProcessList)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@RestController
@RequestMapping("aoaProcessList")
@SaCheckLogin
public class AoaProcessListController {

    @Resource
    private AoaProcessListService aoaProcessListService;

    @GetMapping("queryMyBursementDetail")
    public Object queryMyBursementDetail(
            @RequestParam(value = "processId")Long processId){
        return aoaProcessListService.queryMyBursementDetail(processId);
    }
    @GetMapping("queryMyList")
    public Object queryMyList(
            @RequestParam(value = "userId") Long userId,
            @RequestParam(value = "content",required = false) String content,
            @RequestParam(value = "pageNo",defaultValue = "1",required = false) Integer pageNo,
            @RequestParam(value = "pageSize",defaultValue = "10",required = false) Integer pageSize){
        return aoaProcessListService.queryMyList(userId,content,pageNo,pageSize);
    }
    @PostMapping("add")
    public Object add(AoaProcessList aoaProcessList) {
        return R.ok(aoaProcessListService.insert(aoaProcessList));
    }

    @PostMapping("edit")
    public Object edit(AoaProcessList aoaProcessList) {
        return R.ok(aoaProcessListService.update(aoaProcessList));
    }

    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaProcessListService.queryById(id));
    }

    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaProcessListService.queryAll());
    }

    @GetMapping("queryList")
    public Object queryList(
            @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
            @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize
            ) {
        return R.ok(this.aoaProcessListService.queryList(pageNo, pageSize));
    }

    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaProcessListService.deleteById(id));
    }

    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaProcessListService.deleteByIds(ids));
    }
}
