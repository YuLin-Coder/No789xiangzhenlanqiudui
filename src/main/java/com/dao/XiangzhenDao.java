package com.dao;

import com.entity.XiangzhenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangzhenView;

/**
 * 乡镇信息 Dao 接口
 *
 * @since 2021-03-22
 */
public interface XiangzhenDao extends BaseMapper<XiangzhenEntity> {

   List<XiangzhenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
