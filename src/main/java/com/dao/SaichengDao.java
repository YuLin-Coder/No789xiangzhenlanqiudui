package com.dao;

import com.entity.SaichengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.SaichengView;

/**
 * 赛程信息 Dao 接口
 *
 * @since 2021-03-22
 */
public interface SaichengDao extends BaseMapper<SaichengEntity> {

   List<SaichengView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
