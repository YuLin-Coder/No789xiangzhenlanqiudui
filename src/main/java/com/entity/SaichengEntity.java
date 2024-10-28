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
 * 赛程信息
 *
 * @email
 * @date 2021-03-22
 */
@TableName("saicheng")
public class SaichengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    public SaichengEntity() {

    }

    public SaichengEntity(T t) {
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
     * 比赛队伍1
     */
    @TableField(value = "qd1_types")

    private Integer qd1Types;


    /**
     * 比赛队伍2
     */
    @TableField(value = "qd2_types")

    private Integer qd2Types;


    /**
     * 开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "kaishi_time")
    private Date kaishiTime;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "jieshu_time")
    private Date jieshuTime;


    /**
     * 比赛结果
     */
    @TableField(value = "jieguo_content")

    private String jieguoContent;


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
	 * 设置：比赛队伍1
	 */
    public Integer getQd1Types() {
        return qd1Types;
    }


    /**
	 * 获取：比赛队伍1
	 */

    public void setQd1Types(Integer qd1Types) {
        this.qd1Types = qd1Types;
    }
    /**
	 * 设置：比赛队伍2
	 */
    public Integer getQd2Types() {
        return qd2Types;
    }


    /**
	 * 获取：比赛队伍2
	 */

    public void setQd2Types(Integer qd2Types) {
        this.qd2Types = qd2Types;
    }
    /**
	 * 设置：开始时间
	 */
    public Date getKaishiTime() {
        return kaishiTime;
    }


    /**
	 * 获取：开始时间
	 */

    public void setKaishiTime(Date kaishiTime) {
        this.kaishiTime = kaishiTime;
    }
    /**
	 * 设置：结束时间
	 */
    public Date getJieshuTime() {
        return jieshuTime;
    }


    /**
	 * 获取：结束时间
	 */

    public void setJieshuTime(Date jieshuTime) {
        this.jieshuTime = jieshuTime;
    }
    /**
	 * 设置：比赛结果
	 */
    public String getJieguoContent() {
        return jieguoContent;
    }


    /**
	 * 获取：比赛结果
	 */

    public void setJieguoContent(String jieguoContent) {
        this.jieguoContent = jieguoContent;
    }

    @Override
    public String toString() {
    return "Saicheng{" +
            "id=" + id +
            ", qd1Types=" + qd1Types +
            ", qd2Types=" + qd2Types +
            ", kaishiTime=" + kaishiTime +
            ", jieshuTime=" + jieshuTime +
            ", jieguoContent=" + jieguoContent +
    "}";
    }
    }
