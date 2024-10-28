package com.entity.view;

import com.entity.XiangzhenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

/**
 * 乡镇信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @email
 * @date 2021-03-22
 */
@TableName("xiangzhen")
public class XiangzhenView extends XiangzhenEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	public XiangzhenView() {

	}

	public XiangzhenView(XiangzhenEntity xiangzhenEntity) {
		try {
			BeanUtils.copyProperties(this, xiangzhenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
