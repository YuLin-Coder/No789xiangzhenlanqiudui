package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XitonggonggaoEntity;
import java.util.Map;

/**
 * 系统公告 服务类
 * @since 2021-03-22
 */
public interface XitonggonggaoService extends IService<XitonggonggaoEntity> {

     PageUtils queryPage(Map<String, Object> params);

}