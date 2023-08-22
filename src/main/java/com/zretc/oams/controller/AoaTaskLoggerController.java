package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaTaskLogger;
import com.zretc.oams.service.AoaTaskLoggerService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaTaskLogger)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@RestController
@RequestMapping("aoaTaskLogger")
@SaCheckLogin
public class AoaTaskLoggerController {

    @Resource
    private AoaTaskLoggerService aoaTaskLoggerService;

    @PostMapping("add")
    public Object add(AoaTaskLogger aoaTaskLogger){
        return R.ok(aoaTaskLoggerService.insert(aoaTaskLogger));
    }
    @PostMapping("edit")
    public Object edit(AoaTaskLogger aoaTaskLogger){
        return R.ok(aoaTaskLoggerService.update(aoaTaskLogger));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaTaskLoggerService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaTaskLoggerService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaTaskLoggerService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaTaskLoggerService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaTaskLoggerService.deleteByIds(ids));
    }
}
