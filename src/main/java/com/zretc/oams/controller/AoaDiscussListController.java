package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaDiscussList;
import com.zretc.oams.service.AoaDiscussListService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaDiscussList)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@RestController
@RequestMapping("aoaDiscussList")
@SaCheckLogin
public class AoaDiscussListController {

    @Resource
    private AoaDiscussListService aoaDiscussListService;

    @PostMapping("add")
    public Object add(AoaDiscussList aoaDiscussList){
        return R.ok(aoaDiscussListService.insert(aoaDiscussList));
    }
    @PostMapping("edit")
    public Object edit(AoaDiscussList aoaDiscussList){
        return R.ok(aoaDiscussListService.update(aoaDiscussList));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaDiscussListService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaDiscussListService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaDiscussListService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaDiscussListService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaDiscussListService.deleteByIds(ids));
    }
}
