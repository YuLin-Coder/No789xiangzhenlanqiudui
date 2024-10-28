package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 球队信息
 *
 * @email
 * @date 2021-03-22
 */
@TableName("qiudui")
public class QiuduiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    public QiuduiEntity() {

    }

    public QiuduiEntity(T t) {
    try {
    BeanUtils.copyProperties(this, t);
    } catch (IllegalAccessException | InvocationTargetException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    }
    }


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 球队名称
     */
    @TableField(value = "name")

    private String name;


    /**
     * 所属乡镇
     */
    @TableField(value = "xz_types")

    private Integer xzTypes;


    /**
     * 球队队徽
     */
    @TableField(value = "img_photo")

    private String imgPhoto;


    /**
     * 队员人数
     */
    @TableField(value = "sum")

    private Integer sum;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：球队名称
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：球队名称
	 */

    public void setName(String name) {
        this.name = name;
    }
    /**
	 * 设置：所属乡镇
	 */
    public Integer getXzTypes() {
        return xzTypes;
    }


    /**
	 * 获取：所属乡镇
	 */

    public void setXzTypes(Integer xzTypes) {
        this.xzTypes = xzTypes;
    }
    /**
	 * 设置：球队队徽
	 */
    public String getImgPhoto() {
        return imgPhoto;
    }


    /**
	 * 获取：球队队徽
	 */

    public void setImgPhoto(String imgPhoto) {
        this.imgPhoto = imgPhoto;
    }
    /**
	 * 设置：队员人数
	 */
    public Integer getSum() {
        return sum;
    }


    /**
	 * 获取：队员人数
	 */

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
    return "Qiudui{" +
            "id=" + id +
            ", name=" + name +
            ", xzTypes=" + xzTypes +
            ", imgPhoto=" + imgPhoto +
            ", sum=" + sum +
    "}";
    }
    }
