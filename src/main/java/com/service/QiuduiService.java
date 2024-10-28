package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiuduiEntity;
import java.util.Map;

/**
 * 球队信息 服务类
 * @since 2021-03-22
 */
public interface QiuduiService extends IService<QiuduiEntity> {

     PageUtils queryPage(Map<String, Object> params);

}