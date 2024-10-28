package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuEntity;
import java.util.Map;

/**
 * 球员信息 服务类
 * @since 2021-03-22
 */
public interface YonghuService extends IService<YonghuEntity> {

     PageUtils queryPage(Map<String, Object> params);

}