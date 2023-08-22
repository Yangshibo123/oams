package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaTraffic;
import com.zretc.oams.service.AoaTrafficService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaTraffic)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@RestController
@RequestMapping("aoaTraffic")
@SaCheckLogin
public class AoaTrafficController {

    @Resource
    private AoaTrafficService aoaTrafficService;

    @PostMapping("add")
    public Object add(AoaTraffic aoaTraffic){
        return R.ok(aoaTrafficService.insert(aoaTraffic));
    }
    @PostMapping("edit")
    public Object edit(AoaTraffic aoaTraffic){
        return R.ok(aoaTrafficService.update(aoaTraffic));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaTrafficService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaTrafficService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaTrafficService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaTrafficService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaTrafficService.deleteByIds(ids));
    }
}
