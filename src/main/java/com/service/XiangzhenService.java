package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangzhenEntity;
import java.util.Map;

/**
 * 乡镇信息 服务类
 * @since 2021-03-22
 */
public interface XiangzhenService extends IService<XiangzhenEntity> {

     PageUtils queryPage(Map<String, Object> params);

}