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

import com.entity.XiangzhenEntity;

import com.service.XiangzhenService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 乡镇信息
 * 后端接口
 * @author
 * @email
 * @date 2021-03-22
*/
@RestController
@Controller
@RequestMapping("/xiangzhen")
public class XiangzhenController {
    private static final Logger logger = LoggerFactory.getLogger(XiangzhenController.class);

    @Autowired
    private XiangzhenService xiangzhenService;

    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params){
        logger.debug("Controller:"+this.getClass().getName()+",page方法");
        PageUtils page = xiangzhenService.queryPage(params);
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("Controller:"+this.getClass().getName()+",info方法");
        XiangzhenEntity xiangzhen = xiangzhenService.selectById(id);
        if(xiangzhen!=null){
            return R.ok().put("data", xiangzhen);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody XiangzhenEntity xiangzhen, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",save");
        Wrapper<XiangzhenEntity> queryWrapper = new EntityWrapper<XiangzhenEntity>()
            .eq("name", xiangzhen.getName())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XiangzhenEntity xiangzhenEntity = xiangzhenService.selectOne(queryWrapper);
        if(xiangzhenEntity==null){
            xiangzhenService.insert(xiangzhen);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody XiangzhenEntity xiangzhen, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",update");
        //根据字段查询是否有相同数据
        Wrapper<XiangzhenEntity> queryWrapper = new EntityWrapper<XiangzhenEntity>()
            .notIn("id",xiangzhen.getId())
            .eq("name", xiangzhen.getName())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XiangzhenEntity xiangzhenEntity = xiangzhenService.selectOne(queryWrapper);
        if(xiangzhenEntity==null){
            xiangzhenService.updateById(xiangzhen);//根据id更新
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
        xiangzhenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
}

