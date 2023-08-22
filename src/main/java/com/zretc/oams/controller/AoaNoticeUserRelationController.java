package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaNoticeUserRelation;
import com.zretc.oams.service.AoaNoticeUserRelationService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaNoticeUserRelation)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@RestController
@RequestMapping("aoaNoticeUserRelation")
@SaCheckLogin
public class AoaNoticeUserRelationController {

    @Resource
    private AoaNoticeUserRelationService aoaNoticeUserRelationService;

    @PostMapping("add")
    public Object add(AoaNoticeUserRelation aoaNoticeUserRelation){
        return R.ok(aoaNoticeUserRelationService.insert(aoaNoticeUserRelation));
    }
    @PostMapping("edit")
    public Object edit(AoaNoticeUserRelation aoaNoticeUserRelation){
        return R.ok(aoaNoticeUserRelationService.update(aoaNoticeUserRelation));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaNoticeUserRelationService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaNoticeUserRelationService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaNoticeUserRelationService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaNoticeUserRelationService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaNoticeUserRelationService.deleteByIds(ids));
    }
}
