package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaReceiverNote;
import com.zretc.oams.service.AoaReceiverNoteService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaReceiverNote)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@RestController
@RequestMapping("aoaReceiverNote")
@SaCheckLogin
public class AoaReceiverNoteController {

    @Resource
    private AoaReceiverNoteService aoaReceiverNoteService;

    @PostMapping("add")
    public Object add(AoaReceiverNote aoaReceiverNote){
        return R.ok(aoaReceiverNoteService.insert(aoaReceiverNote));
    }
    @PostMapping("edit")
    public Object edit(AoaReceiverNote aoaReceiverNote){
        return R.ok(aoaReceiverNoteService.update(aoaReceiverNote));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaReceiverNoteService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaReceiverNoteService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaReceiverNoteService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaReceiverNoteService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaReceiverNoteService.deleteByIds(ids));
    }
}
