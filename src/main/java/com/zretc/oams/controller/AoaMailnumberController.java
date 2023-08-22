package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaMailnumber;
import com.zretc.oams.service.AoaMailnumberService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaMailnumber)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@RestController
@RequestMapping("aoaMailnumber")
@SaCheckLogin
public class AoaMailnumberController {

    @Resource
    private AoaMailnumberService aoaMailnumberService;

    @PostMapping("add")
    public Object add(AoaMailnumber aoaMailnumber){
        return R.ok(aoaMailnumberService.insert(aoaMailnumber));
    }
    @PostMapping("edit")
    public Object edit(AoaMailnumber aoaMailnumber){
        return R.ok(aoaMailnumberService.update(aoaMailnumber));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaMailnumberService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaMailnumberService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaMailnumberService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaMailnumberService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaMailnumberService.deleteByIds(ids));
    }
}
