package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaLoveUser;
import com.zretc.oams.service.AoaLoveUserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaLoveUser)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@RestController
@RequestMapping("aoaLoveUser")
@SaCheckLogin
public class AoaLoveUserController {

    @Resource
    private AoaLoveUserService aoaLoveUserService;

    @PostMapping("add")
    public Object add(AoaLoveUser aoaLoveUser){
        return R.ok(aoaLoveUserService.insert(aoaLoveUser));
    }
    @PostMapping("edit")
    public Object edit(AoaLoveUser aoaLoveUser){
        return R.ok(aoaLoveUserService.update(aoaLoveUser));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaLoveUserService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaLoveUserService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaLoveUserService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaLoveUserService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaLoveUserService.deleteByIds(ids));
    }
}
