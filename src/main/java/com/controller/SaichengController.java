package com.controller;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.SaichengEntity;

import com.service.SaichengService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 赛程信息
 * 后端接口
 * @author
 * @email
 * @date 2021-03-22
*/
@RestController
@Controller
@RequestMapping("/saicheng")
public class SaichengController {
    private static final Logger logger = LoggerFactory.getLogger(SaichengController.class);

    @Autowired
    private SaichengService saichengService;

    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params){
        logger.debug("Controller:"+this.getClass().getName()+",page方法");
        PageUtils page = saichengService.queryPage(params);
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("Controller:"+this.getClass().getName()+",info方法");
        SaichengEntity saicheng = saichengService.selectById(id);
        if(saicheng!=null){
            return R.ok().put("data", saicheng);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody SaichengEntity saicheng, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",save");
        Wrapper<SaichengEntity> queryWrapper = new EntityWrapper<SaichengEntity>()
            .eq("qd1_types", saicheng.getQd1Types())
            .eq("qd2_types", saicheng.getQd2Types())
            .eq("jieguo_content", saicheng.getJieguoContent())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        SaichengEntity saichengEntity = saichengService.selectOne(queryWrapper);
        if(saichengEntity==null){
            saichengService.insert(saicheng);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody SaichengEntity saicheng, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",update");
        //根据字段查询是否有相同数据
        Wrapper<SaichengEntity> queryWrapper = new EntityWrapper<SaichengEntity>()
            .notIn("id",saicheng.getId())
            .eq("qd1_types", saicheng.getQd1Types())
            .eq("qd2_types", saicheng.getQd2Types())
            .eq("jieguo_content", saicheng.getJieguoContent())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        SaichengEntity saichengEntity = saichengService.selectOne(queryWrapper);
        if(saichengEntity==null){
            saichengService.updateById(saicheng);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        logger.debug("Controller:"+this.getClass().getName()+",delete");
        saichengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
}

