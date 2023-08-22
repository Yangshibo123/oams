package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaHoliday;
import com.zretc.oams.service.AoaHolidayService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaHoliday)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:08
 */
@RestController
@RequestMapping("aoaHoliday")
@SaCheckLogin
public class AoaHolidayController {

    @Resource
    private AoaHolidayService aoaHolidayService;

    @PostMapping("add")
    public Object add(AoaHoliday aoaHoliday){
        return R.ok(aoaHolidayService.insert(aoaHoliday));
    }
    @PostMapping("edit")
    public Object edit(AoaHoliday aoaHoliday){
        return R.ok(aoaHolidayService.update(aoaHoliday));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaHolidayService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaHolidayService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaHolidayService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaHolidayService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaHolidayService.deleteByIds(ids));
    }
}
