package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaFilePath;
import com.zretc.oams.service.AoaFilePathService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaFilePath)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@RestController
@RequestMapping("aoaFilePath")
@SaCheckLogin
public class AoaFilePathController {

    @Resource
    private AoaFilePathService aoaFilePathService;

    @PostMapping("add")
    public Object add(AoaFilePath aoaFilePath){
        return R.ok(aoaFilePathService.insert(aoaFilePath));
    }
    @PostMapping("edit")
    public Object edit(AoaFilePath aoaFilePath){
        return R.ok(aoaFilePathService.update(aoaFilePath));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaFilePathService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaFilePathService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaFilePathService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaFilePathService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaFilePathService.deleteByIds(ids));
    }
}
