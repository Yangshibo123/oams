package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaDirector;
import com.zretc.oams.service.AoaDirectorService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaDirector)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@RestController
@RequestMapping("aoaDirector")
@SaCheckLogin
public class AoaDirectorController {

    @Resource
    private AoaDirectorService aoaDirectorService;

    @PostMapping("add")
    public Object add(AoaDirector aoaDirector){
        return R.ok(aoaDirectorService.insert(aoaDirector));
    }
    @PostMapping("edit")
    public Object edit(AoaDirector aoaDirector){
        return R.ok(aoaDirectorService.update(aoaDirector));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaDirectorService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaDirectorService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaDirectorService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaDirectorService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaDirectorService.deleteByIds(ids));
    }
}
