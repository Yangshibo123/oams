package com.zretc.oams.service;

import com.baomidou.mybatisplus.extension.api.R;
import com.zretc.oams.VO.BursementVO;
import com.zretc.oams.VO.DetailBurseVO;
import com.zretc.oams.entity.AoaBursement;
import com.zretc.oams.entity.AoaDetailsburse;
import com.zretc.oams.entity.AoaProcessList;
import com.zretc.oams.entity.AoaReviewed;
import com.zretc.oams.mapper.AoaBursementMapper;
import com.zretc.oams.mapper.AoaDetailsburseMapper;
import com.zretc.oams.mapper.AoaProcessListMapper;
import com.zretc.oams.mapper.AoaReviewedMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.beans.Transient;
import java.sql.Date;
import java.util.List;

import static javax.swing.text.html.HTML.Tag.OL;

/**
 * (AoaBursement)Service
 *
 * @author makejava
 * @since 2023-08-22 11:19:07
 */
@Service("aoaBursementService")
public class AoaBursementService {
    @Resource
    private AoaProcessListMapper processListMapper;
    @Resource
    private AoaBursementMapper bursementMapper;
    @Resource
    private AoaReviewedMapper reviewedMapper;
    @Resource
    private AoaDetailsburseMapper detailsburseMapper;

    @Transactional(rollbackFor = Exception.class)
    public Object add(BursementVO bursementVo) {
        int totalUpdate = 0;
        //流程表储存
        AoaProcessList aoaProcessList = new AoaProcessList();
        aoaProcessList.setProcessDes(bursementVo.getProcessDes());
        aoaProcessList.setProcessName(bursementVo.getProcessName());
        aoaProcessList.setProcessUserId(bursementVo.getUserId());
        aoaProcessList.setApplyTime(new Date(System.currentTimeMillis()));
        aoaProcessList.setDeeplyId(bursementVo.getDeeply());
        aoaProcessList.setTypeName("费用报销");
        aoaProcessList.setStatusId(0L);
        totalUpdate = processListMapper.insert(aoaProcessList);
        // 审核表存储
        AoaReviewed reviewed = new AoaReviewed();
        reviewed.setStatusId(0L);
        reviewed.setUserId(bursementVo.getShneheren());
        reviewed.setProId(aoaProcessList.getProcessId());
        totalUpdate += reviewedMapper.insert(reviewed);
        //报销表
        AoaBursement bursement = new AoaBursement();
        bursement.setProId(aoaProcessList.getProcessId());
        bursement.setBurseTime(new Date(System.currentTimeMillis()));
        bursement.setName(bursementVo.getName());
        bursement.setTypeId(bursementVo.getTypeId());
        bursement.setUserName(bursementVo.getUserName());//证明人
        bursement.setBurseTime(new Date(System.currentTimeMillis()));
        double allMoney = 0;
        int invoiceNum = 0;
        //报销明细表
        for (DetailBurseVO detailV0 : bursementVo.getReData()) {
            AoaDetailsburse detailsburse = new AoaDetailsburse();
            detailsburse.setBursmentId(bursement.getBursementId());
            detailsburse.setDescript(detailV0.getDescript());
            detailsburse.setInvoices(detailV0.getInvoices());
            detailsburse.setProduceTime(detailV0.getProduceTime());
            detailsburse.setSubject(detailV0.getSubjectId());
            detailsburse.setDetailmoney(detailV0.getDetailmoney());
            totalUpdate += detailsburseMapper.insert(detailsburse);
            System.out.println("明细为"+detailsburse);
            invoiceNum += detailV0.getInvoices();
            allMoney += detailV0.getDetailmoney();
        }
        bursement.setAllMoney(allMoney);
        bursement.setAllinvoices(invoiceNum);
        totalUpdate += bursementMapper.updateById(bursement);
        if (totalUpdate > 0) {
            return R.ok(totalUpdate);
        } else {
            return R.failed("添加失败");
        }
    }
}
