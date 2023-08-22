package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaNotepaper;
import com.zretc.oams.service.AoaNotepaperService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaNotepaper)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@RestController
@RequestMapping("aoaNotepaper")
@SaCheckLogin
public class AoaNotepaperController {

    @Resource
    private AoaNotepaperService aoaNotepaperService;

    @PostMapping("add")
    public Object add(AoaNotepaper aoaNotepaper){
        return R.ok(aoaNotepaperService.insert(aoaNotepaper));
    }
    @PostMapping("edit")
    public Object edit(AoaNotepaper aoaNotepaper){
        return R.ok(aoaNotepaperService.update(aoaNotepaper));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaNotepaperService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaNotepaperService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaNotepaperService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaNotepaperService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaNotepaperService.deleteByIds(ids));
    }
}
