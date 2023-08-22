package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaNoticeList;
import com.zretc.oams.service.AoaNoticeListService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaNoticeList)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@RestController
@RequestMapping("aoaNoticeList")
@SaCheckLogin
public class AoaNoticeListController {

    @Resource
    private AoaNoticeListService aoaNoticeListService;

    @PostMapping("add")
    public Object add(AoaNoticeList aoaNoticeList){
        return R.ok(aoaNoticeListService.insert(aoaNoticeList));
    }
    @PostMapping("edit")
    public Object edit(AoaNoticeList aoaNoticeList){
        return R.ok(aoaNoticeListService.update(aoaNoticeList));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaNoticeListService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaNoticeListService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaNoticeListService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaNoticeListService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaNoticeListService.deleteByIds(ids));
    }
}
