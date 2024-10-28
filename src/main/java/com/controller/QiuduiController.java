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

import com.entity.QiuduiEntity;

import com.service.QiuduiService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 球队信息
 * 后端接口
 * @author
 * @email
 * @date 2021-03-22
*/
@RestController
@Controller
@RequestMapping("/qiudui")
public class QiuduiController {
    private static final Logger logger = LoggerFactory.getLogger(QiuduiController.class);

    @Autowired
    private QiuduiService qiuduiService;

    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params){
        logger.debug("Controller:"+this.getClass().getName()+",page方法");
        PageUtils page = qiuduiService.queryPage(params);
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("Controller:"+this.getClass().getName()+",info方法");
        QiuduiEntity qiudui = qiuduiService.selectById(id);
        if(qiudui!=null){
            return R.ok().put("data", qiudui);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody QiuduiEntity qiudui, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",save");
        Wrapper<QiuduiEntity> queryWrapper = new EntityWrapper<QiuduiEntity>()
            .eq("name", qiudui.getName())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        QiuduiEntity qiuduiEntity = qiuduiService.selectOne(queryWrapper);
        if("".equals(qiudui.getImgPhoto()) || "null".equals(qiudui.getImgPhoto())){
            qiudui.setImgPhoto(null);
        }
        qiudui.setSum(0);
        if(qiuduiEntity==null){
            qiuduiService.insert(qiudui);
            return R.ok();
        }else {
            return R.error(511,"已有相同数据");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody QiuduiEntity qiudui, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",update");
        //根据字段查询是否有相同数据
        Wrapper<QiuduiEntity> queryWrapper = new EntityWrapper<QiuduiEntity>()
            .notIn("id",qiudui.getId())
            .eq("name", qiudui.getName())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        QiuduiEntity qiuduiEntity = qiuduiService.selectOne(queryWrapper);
        if("".equals(qiudui.getImgPhoto()) || "null".equals(qiudui.getImgPhoto())){
                qiudui.setImgPhoto(null);
        }
        if(qiuduiEntity==null){
            qiuduiService.updateById(qiudui);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"已有相同数据");
        }
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        logger.debug("Controller:"+this.getClass().getName()+",delete");
        qiuduiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
}

