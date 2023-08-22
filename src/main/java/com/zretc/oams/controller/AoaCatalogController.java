package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaCatalog;
import com.zretc.oams.service.AoaCatalogService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaCatalog)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@RestController
@RequestMapping("aoaCatalog")
@SaCheckLogin
public class AoaCatalogController {

    @Resource
    private AoaCatalogService aoaCatalogService;

    @PostMapping("add")
    public Object add(AoaCatalog aoaCatalog){
        return R.ok(aoaCatalogService.insert(aoaCatalog));
    }
    @PostMapping("edit")
    public Object edit(AoaCatalog aoaCatalog){
        return R.ok(aoaCatalogService.update(aoaCatalog));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaCatalogService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaCatalogService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaCatalogService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaCatalogService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaCatalogService.deleteByIds(ids));
    }
}
