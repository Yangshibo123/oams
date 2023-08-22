package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaEvectionmoney;
import com.zretc.oams.service.AoaEvectionmoneyService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaEvectionmoney)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@RestController
@RequestMapping("aoaEvectionmoney")
@SaCheckLogin
public class AoaEvectionmoneyController {

    @Resource
    private AoaEvectionmoneyService aoaEvectionmoneyService;

    @PostMapping("add")
    public Object add(AoaEvectionmoney aoaEvectionmoney){
        return R.ok(aoaEvectionmoneyService.insert(aoaEvectionmoney));
    }
    @PostMapping("edit")
    public Object edit(AoaEvectionmoney aoaEvectionmoney){
        return R.ok(aoaEvectionmoneyService.update(aoaEvectionmoney));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaEvectionmoneyService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaEvectionmoneyService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaEvectionmoneyService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaEvectionmoneyService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaEvectionmoneyService.deleteByIds(ids));
    }
}
