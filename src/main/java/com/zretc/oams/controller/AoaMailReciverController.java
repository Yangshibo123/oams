package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaMailReciver;
import com.zretc.oams.service.AoaMailReciverService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaMailReciver)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@RestController
@RequestMapping("aoaMailReciver")
@SaCheckLogin
public class AoaMailReciverController {

    @Resource
    private AoaMailReciverService aoaMailReciverService;

    @PostMapping("add")
    public Object add(AoaMailReciver aoaMailReciver){
        return R.ok(aoaMailReciverService.insert(aoaMailReciver));
    }
    @PostMapping("edit")
    public Object edit(AoaMailReciver aoaMailReciver){
        return R.ok(aoaMailReciverService.update(aoaMailReciver));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaMailReciverService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaMailReciverService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaMailReciverService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaMailReciverService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaMailReciverService.deleteByIds(ids));
    }
}
