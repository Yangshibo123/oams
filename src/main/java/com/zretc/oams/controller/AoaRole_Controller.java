package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaRole_;
import com.zretc.oams.service.AoaRole_Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaRole_)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@RestController
@RequestMapping("aoaRole_")
@SaCheckLogin
public class AoaRole_Controller {

    @Resource
    private AoaRole_Service aoaRole_Service;

    @PostMapping("add")
    public Object add(AoaRole_ aoaRole_){
        return R.ok(aoaRole_Service.insert(aoaRole_));
    }
    @PostMapping("edit")
    public Object edit(AoaRole_ aoaRole_){
        return R.ok(aoaRole_Service.update(aoaRole_));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaRole_Service.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaRole_Service.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaRole_Service.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaRole_Service.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaRole_Service.deleteByIds(ids));
    }
}
