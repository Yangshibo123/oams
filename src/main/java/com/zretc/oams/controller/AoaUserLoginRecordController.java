package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaUserLoginRecord;
import com.zretc.oams.service.AoaUserLoginRecordService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaUserLoginRecord)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@RestController
@RequestMapping("aoaUserLoginRecord")
@SaCheckLogin
public class AoaUserLoginRecordController {

    @Resource
    private AoaUserLoginRecordService aoaUserLoginRecordService;

    @PostMapping("add")
    public Object add(AoaUserLoginRecord aoaUserLoginRecord){
        return R.ok(aoaUserLoginRecordService.insert(aoaUserLoginRecord));
    }
    @PostMapping("edit")
    public Object edit(AoaUserLoginRecord aoaUserLoginRecord){
        return R.ok(aoaUserLoginRecordService.update(aoaUserLoginRecord));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaUserLoginRecordService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaUserLoginRecordService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaUserLoginRecordService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaUserLoginRecordService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaUserLoginRecordService.deleteByIds(ids));
    }
}
