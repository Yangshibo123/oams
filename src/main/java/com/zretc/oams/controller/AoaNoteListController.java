package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaNoteList;
import com.zretc.oams.service.AoaNoteListService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaNoteList)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@RestController
@RequestMapping("aoaNoteList")
@SaCheckLogin
public class AoaNoteListController {

    @Resource
    private AoaNoteListService aoaNoteListService;

    @PostMapping("add")
    public Object add(AoaNoteList aoaNoteList){
        return R.ok(aoaNoteListService.insert(aoaNoteList));
    }
    @PostMapping("edit")
    public Object edit(AoaNoteList aoaNoteList){
        return R.ok(aoaNoteListService.update(aoaNoteList));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaNoteListService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaNoteListService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaNoteListService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaNoteListService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaNoteListService.deleteByIds(ids));
    }
}
