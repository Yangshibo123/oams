package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaVoteTitleUser;
import com.zretc.oams.service.AoaVoteTitleUserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaVoteTitleUser)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@RestController
@RequestMapping("aoaVoteTitleUser")
@SaCheckLogin
public class AoaVoteTitleUserController {

    @Resource
    private AoaVoteTitleUserService aoaVoteTitleUserService;

    @PostMapping("add")
    public Object add(AoaVoteTitleUser aoaVoteTitleUser){
        return R.ok(aoaVoteTitleUserService.insert(aoaVoteTitleUser));
    }
    @PostMapping("edit")
    public Object edit(AoaVoteTitleUser aoaVoteTitleUser){
        return R.ok(aoaVoteTitleUserService.update(aoaVoteTitleUser));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaVoteTitleUserService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaVoteTitleUserService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaVoteTitleUserService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaVoteTitleUserService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaVoteTitleUserService.deleteByIds(ids));
    }
}
