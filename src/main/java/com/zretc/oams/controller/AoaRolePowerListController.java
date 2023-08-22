package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaRolePowerList;
import com.zretc.oams.service.AoaRolePowerListService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaRolePowerList)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@RestController
@RequestMapping("aoaRolePowerList")
@SaCheckLogin
public class AoaRolePowerListController {

    @Resource
    private AoaRolePowerListService aoaRolePowerListService;

    @PostMapping("add")
    public Object add(AoaRolePowerList aoaRolePowerList){
        return R.ok(aoaRolePowerListService.insert(aoaRolePowerList));
    }
    @PostMapping("edit")
    public Object edit(AoaRolePowerList aoaRolePowerList){
        return R.ok(aoaRolePowerListService.update(aoaRolePowerList));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaRolePowerListService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaRolePowerListService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaRolePowerListService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaRolePowerListService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaRolePowerListService.deleteByIds(ids));
    }
}
