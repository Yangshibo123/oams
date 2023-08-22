package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaDirectorUsers;
import com.zretc.oams.service.AoaDirectorUsersService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaDirectorUsers)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@RestController
@RequestMapping("aoaDirectorUsers")
@SaCheckLogin
public class AoaDirectorUsersController {

    @Resource
    private AoaDirectorUsersService aoaDirectorUsersService;

    @PostMapping("add")
    public Object add(AoaDirectorUsers aoaDirectorUsers){
        return R.ok(aoaDirectorUsersService.insert(aoaDirectorUsers));
    }
    @PostMapping("edit")
    public Object edit(AoaDirectorUsers aoaDirectorUsers){
        return R.ok(aoaDirectorUsersService.update(aoaDirectorUsers));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaDirectorUsersService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaDirectorUsersService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaDirectorUsersService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaDirectorUsersService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaDirectorUsersService.deleteByIds(ids));
    }
}
