package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaReviewed;
import com.zretc.oams.service.AoaReviewedService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaReviewed)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@RestController
@RequestMapping("aoaReviewed")
@SaCheckLogin
public class AoaReviewedController {

    @Resource
    private AoaReviewedService aoaReviewedService;

    @PostMapping("add")
    public Object add(AoaReviewed aoaReviewed){
        return R.ok(aoaReviewedService.insert(aoaReviewed));
    }
    @PostMapping("edit")
    public Object edit(AoaReviewed aoaReviewed){
        return R.ok(aoaReviewedService.update(aoaReviewed));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaReviewedService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaReviewedService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaReviewedService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaReviewedService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaReviewedService.deleteByIds(ids));
    }
}
