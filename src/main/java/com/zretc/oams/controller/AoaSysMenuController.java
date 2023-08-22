package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaSysMenu;
import com.zretc.oams.service.AoaSysMenuService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaSysMenu)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@RestController
@RequestMapping("aoaSysMenu")
@SaCheckLogin
public class AoaSysMenuController {

    @Resource
    private AoaSysMenuService aoaSysMenuService;

    @PostMapping("add")
    public Object add(AoaSysMenu aoaSysMenu){
        return R.ok(aoaSysMenuService.insert(aoaSysMenu));
    }
    @PostMapping("edit")
    public Object edit(AoaSysMenu aoaSysMenu){
        return R.ok(aoaSysMenuService.update(aoaSysMenu));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaSysMenuService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaSysMenuService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaSysMenuService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaSysMenuService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaSysMenuService.deleteByIds(ids));
    }
}
