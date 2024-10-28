package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.SaichengDao;
import com.entity.SaichengEntity;
import com.service.SaichengService;
import com.entity.view.SaichengView;

/**
 * 赛程信息 服务实现类
 * @since 2021-03-22
 */
@Service("saichengService")
@Transactional
public class SaichengServiceImpl extends ServiceImpl<SaichengDao, SaichengEntity> implements SaichengService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<SaichengView> page =new Query<SaichengView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
