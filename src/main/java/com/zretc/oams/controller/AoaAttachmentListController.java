package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaAttachmentList;
import com.zretc.oams.service.AoaAttachmentListService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaAttachmentList)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@RestController
@RequestMapping("aoaAttachmentList")
@SaCheckLogin
public class AoaAttachmentListController {

    @Resource
    private AoaAttachmentListService aoaAttachmentListService;

    @PostMapping("add")
    public Object add(AoaAttachmentList aoaAttachmentList){
        return R.ok(aoaAttachmentListService.insert(aoaAttachmentList));
    }
    @PostMapping("edit")
    public Object edit(AoaAttachmentList aoaAttachmentList){
        return R.ok(aoaAttachmentListService.update(aoaAttachmentList));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaAttachmentListService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaAttachmentListService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaAttachmentListService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaAttachmentListService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaAttachmentListService.deleteByIds(ids));
    }
}
