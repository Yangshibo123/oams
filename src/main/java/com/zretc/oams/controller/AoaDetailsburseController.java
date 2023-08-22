package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaDetailsburse;
import com.zretc.oams.service.AoaDetailsburseService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaDetailsburse)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@RestController
@RequestMapping("aoaDetailsburse")
@SaCheckLogin
public class AoaDetailsburseController {

    @Resource
    private AoaDetailsburseService aoaDetailsburseService;

    @PostMapping("add")
    public Object add(AoaDetailsburse aoaDetailsburse){
        return R.ok(aoaDetailsburseService.insert(aoaDetailsburse));
    }
    @PostMapping("edit")
    public Object edit(AoaDetailsburse aoaDetailsburse){
        return R.ok(aoaDetailsburseService.update(aoaDetailsburse));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaDetailsburseService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaDetailsburseService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaDetailsburseService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaDetailsburseService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaDetailsburseService.deleteByIds(ids));
    }
}
