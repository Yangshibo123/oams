package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaScheduleList;
import com.zretc.oams.service.AoaScheduleListService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaScheduleList)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@RestController
@RequestMapping("aoaScheduleList")
@SaCheckLogin
public class AoaScheduleListController {

    @Resource
    private AoaScheduleListService aoaScheduleListService;

    @PostMapping("add")
    public Object add(AoaScheduleList aoaScheduleList){
        return R.ok(aoaScheduleListService.insert(aoaScheduleList));
    }
    @PostMapping("edit")
    public Object edit(AoaScheduleList aoaScheduleList){
        return R.ok(aoaScheduleListService.update(aoaScheduleList));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaScheduleListService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaScheduleListService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaScheduleListService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaScheduleListService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaScheduleListService.deleteByIds(ids));
    }
}
