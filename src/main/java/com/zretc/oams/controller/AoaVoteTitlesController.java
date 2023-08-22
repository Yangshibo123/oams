package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaVoteTitles;
import com.zretc.oams.service.AoaVoteTitlesService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaVoteTitles)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@RestController
@RequestMapping("aoaVoteTitles")
@SaCheckLogin
public class AoaVoteTitlesController {

    @Resource
    private AoaVoteTitlesService aoaVoteTitlesService;

    @PostMapping("add")
    public Object add(AoaVoteTitles aoaVoteTitles){
        return R.ok(aoaVoteTitlesService.insert(aoaVoteTitles));
    }
    @PostMapping("edit")
    public Object edit(AoaVoteTitles aoaVoteTitles){
        return R.ok(aoaVoteTitlesService.update(aoaVoteTitles));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaVoteTitlesService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaVoteTitlesService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaVoteTitlesService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaVoteTitlesService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaVoteTitlesService.deleteByIds(ids));
    }
}