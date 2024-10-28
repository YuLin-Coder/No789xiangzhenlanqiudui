package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaichengEntity;
import java.util.Map;

/**
 * 赛程信息 服务类
 * @since 2021-03-22
 */
public interface SaichengService extends IService<SaichengEntity> {

     PageUtils queryPage(Map<String, Object> params);

}