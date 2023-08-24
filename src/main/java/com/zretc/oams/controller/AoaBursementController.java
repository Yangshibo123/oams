package com.zretc.oams.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.VO.BursementVO;
import com.zretc.oams.entity.AoaBursement;
import com.zretc.oams.service.AoaBursementService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.List;
/**
 * (AoaBursement)接口
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@RestController
@RequestMapping("aoaBursement")
@SaCheckLogin
public class AoaBursementController {

    @Resource
    private AoaBursementService aoaBursementService;

    @PostMapping("add")
    public Object add(BursementVO bursementVO){
        return R.ok(aoaBursementService.add(bursementVO));
    }

}
