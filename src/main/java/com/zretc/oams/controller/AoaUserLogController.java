package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaUserLog;
import com.zretc.oams.service.AoaUserLogService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaUserLog)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@RestController
@RequestMapping("aoaUserLog")
@SaCheckLogin
public class AoaUserLogController {

    @Resource
    private AoaUserLogService aoaUserLogService;

    @PostMapping("add")
    public Object add(AoaUserLog aoaUserLog){
        return R.ok(aoaUserLogService.insert(aoaUserLog));
    }
    @PostMapping("edit")
    public Object edit(AoaUserLog aoaUserLog){
        return R.ok(aoaUserLogService.update(aoaUserLog));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaUserLogService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaUserLogService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaUserLogService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaUserLogService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaUserLogService.deleteByIds(ids));
    }
}
