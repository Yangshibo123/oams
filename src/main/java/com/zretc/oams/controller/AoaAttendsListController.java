package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaAttendsList;
import com.zretc.oams.service.AoaAttendsListService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaAttendsList)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@RestController
@RequestMapping("aoaAttendsList")
@SaCheckLogin
public class AoaAttendsListController {

    @Resource
    private AoaAttendsListService aoaAttendsListService;

    @PostMapping("add")
    public Object add(AoaAttendsList aoaAttendsList){
        return R.ok(aoaAttendsListService.insert(aoaAttendsList));
    }
    @PostMapping("edit")
    public Object edit(AoaAttendsList aoaAttendsList){
        return R.ok(aoaAttendsListService.update(aoaAttendsList));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaAttendsListService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaAttendsListService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaAttendsListService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaAttendsListService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaAttendsListService.deleteByIds(ids));
    }
}
