package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.XiangzhenDao;
import com.entity.XiangzhenEntity;
import com.service.XiangzhenService;
import com.entity.view.XiangzhenView;

/**
 * 乡镇信息 服务实现类
 * @since 2021-03-22
 */
@Service("xiangzhenService")
@Transactional
public class XiangzhenServiceImpl extends ServiceImpl<XiangzhenDao, XiangzhenEntity> implements XiangzhenService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<XiangzhenView> page =new Query<XiangzhenView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
