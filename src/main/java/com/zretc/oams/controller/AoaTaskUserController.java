package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaTaskUser;
import com.zretc.oams.service.AoaTaskUserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaTaskUser)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@RestController
@RequestMapping("aoaTaskUser")
@SaCheckLogin
public class AoaTaskUserController {

    @Resource
    private AoaTaskUserService aoaTaskUserService;

    @PostMapping("add")
    public Object add(AoaTaskUser aoaTaskUser){
        return R.ok(aoaTaskUserService.insert(aoaTaskUser));
    }
    @PostMapping("edit")
    public Object edit(AoaTaskUser aoaTaskUser){
        return R.ok(aoaTaskUserService.update(aoaTaskUser));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaTaskUserService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaTaskUserService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaTaskUserService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaTaskUserService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaTaskUserService.deleteByIds(ids));
    }
}
