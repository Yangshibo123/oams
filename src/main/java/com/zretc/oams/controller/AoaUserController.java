package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zretc.oams.entity.AoaUser;
import com.zretc.oams.service.AoaUserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AoaUser)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@RestController
@RequestMapping("aoaUser")
@SaCheckLogin
public class AoaUserController {

    @Resource
    private AoaUserService aoaUserService;


    @PostMapping("add")
    public Object add(AoaUser aoaUser) {
        return R.ok(aoaUserService.insert(aoaUser));
    }

    @PostMapping("edit")
    public Object edit(AoaUser aoaUser) {
        return R.ok(aoaUserService.update(aoaUser));
    }

    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaUserService.queryById(id));
    }

    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaUserService.queryAll());
    }

    @GetMapping("queryList")
    public Object queryList(
            @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
            @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaUserService.queryList(pageNo, pageSize));
    }

    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaUserService.deleteById(id));
    }

    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaUserService.deleteByIds(ids));
    }
    @GetMapping("login")
    public Object login(String username, String password) {
        return this.aoaUserService.login(username,password);
    }

    @GetMapping("queryMenus")
    public Object queryMenus(Long userId){
        return R.ok(this.aoaUserService.queryMenusById(userId));
    }
}
