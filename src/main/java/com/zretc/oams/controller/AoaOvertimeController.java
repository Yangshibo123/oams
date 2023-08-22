package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaOvertime;
import com.zretc.oams.service.AoaOvertimeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaOvertime)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@RestController
@RequestMapping("aoaOvertime")
@SaCheckLogin
public class AoaOvertimeController {

    @Resource
    private AoaOvertimeService aoaOvertimeService;

    @PostMapping("add")
    public Object add(AoaOvertime aoaOvertime){
        return R.ok(aoaOvertimeService.insert(aoaOvertime));
    }
    @PostMapping("edit")
    public Object edit(AoaOvertime aoaOvertime){
        return R.ok(aoaOvertimeService.update(aoaOvertime));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaOvertimeService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaOvertimeService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaOvertimeService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaOvertimeService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaOvertimeService.deleteByIds(ids));
    }
}
