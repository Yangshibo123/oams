package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaLoveDiscussUser;
import com.zretc.oams.service.AoaLoveDiscussUserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaLoveDiscussUser)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@RestController
@RequestMapping("aoaLoveDiscussUser")
@SaCheckLogin
public class AoaLoveDiscussUserController {

    @Resource
    private AoaLoveDiscussUserService aoaLoveDiscussUserService;

    @PostMapping("add")
    public Object add(AoaLoveDiscussUser aoaLoveDiscussUser){
        return R.ok(aoaLoveDiscussUserService.insert(aoaLoveDiscussUser));
    }
    @PostMapping("edit")
    public Object edit(AoaLoveDiscussUser aoaLoveDiscussUser){
        return R.ok(aoaLoveDiscussUserService.update(aoaLoveDiscussUser));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaLoveDiscussUserService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaLoveDiscussUserService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaLoveDiscussUserService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaLoveDiscussUserService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaLoveDiscussUserService.deleteByIds(ids));
    }
}
