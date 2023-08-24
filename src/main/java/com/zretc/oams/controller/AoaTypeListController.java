package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.entity.AoaTypeList;
import com.zretc.oams.service.AoaTypeListService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaTypeList)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:09
 */
@RestController
@RequestMapping("aoaTypeList")
@SaCheckLogin
public class AoaTypeListController {

    @Resource
    private AoaTypeListService aoaTypeListService;

    @GetMapping ("queryDeeplyList")
    public Object queryDeeplyList(){
        return R.ok(aoaTypeListService.queryTypeByModel("aoa_process_list"));
    }
    @GetMapping("queryIncomeTypeList")
    public Object queryIncomeTypeList(){
        return R.ok(aoaTypeListService.queryTypeByModel("aoa_bursement"));
    }




    @PostMapping("add")
    public Object add(AoaTypeList aoaTypeList){
        return R.ok(aoaTypeListService.insert(aoaTypeList));
    }
    @PostMapping("edit")
    public Object edit(AoaTypeList aoaTypeList){
        return R.ok(aoaTypeListService.update(aoaTypeList));
    }
    @GetMapping("queryById")
    public Object queryById(@RequestParam(value = "id") Long id) {
        return R.ok(aoaTypeListService.queryById(id));
    }
    @GetMapping("queryAll")
    public Object queryAll() {
        return R.ok(aoaTypeListService.queryAll());
    }
    @GetMapping("queryList")
    public Object queryList(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return R.ok(this.aoaTypeListService.queryList(pageNo, pageSize));
    }
    @PostMapping("deleteById")
    public Object deleteById(@RequestParam(value = "id") Long id) {
        return R.ok(this.aoaTypeListService.deleteById(id));
    }
    @PostMapping("deleteByIds")
    public Object deleteByIds(@RequestParam List<Long> ids) {
        return R.ok(this.aoaTypeListService.deleteByIds(ids));
    }
}
