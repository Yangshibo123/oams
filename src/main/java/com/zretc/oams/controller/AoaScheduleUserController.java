package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaScheduleUser;
import com.zretc.oams.service.AoaScheduleUserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaScheduleUser)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@RestController
@RequestMapping("aoaScheduleUser")
@SaCheckLogin
public class AoaScheduleUserController {

    @Resource
    private AoaScheduleUserService aoaScheduleUserService;

    @PostMapping("add")
    public Object add(AoaScheduleUser aoaScheduleUser){
        return R.ok(aoaScheduleUserService.insert(aoaScheduleUser));
    }
    @PostMapping("edit")
    public Object edit(AoaScheduleUser aoaScheduleUser){
        return R.ok(aoaScheduleUserService.update(aoaScheduleUser));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaScheduleUserService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaScheduleUserService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaScheduleUserService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaScheduleUserService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaScheduleUserService.deleteByIds(ids));
    }
}
