package com.entity.view;

import com.entity.QiuduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

/**
 * 球队信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @email
 * @date 2021-03-22
 */
@TableName("qiudui")
public class QiuduiView extends QiuduiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	public QiuduiView() {

	}

	public QiuduiView(QiuduiEntity qiuduiEntity) {
		try {
			BeanUtils.copyProperties(this, qiuduiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
