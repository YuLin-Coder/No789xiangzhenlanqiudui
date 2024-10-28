package com.entity.view;

import com.entity.SaichengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

/**
 * 赛程信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @email
 * @date 2021-03-22
 */
@TableName("saicheng")
public class SaichengView extends SaichengEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	public SaichengView() {

	}

	public SaichengView(SaichengEntity saichengEntity) {
		try {
			BeanUtils.copyProperties(this, saichengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
