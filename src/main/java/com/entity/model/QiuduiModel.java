package com.entity.model;

import com.entity.QiuduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 球队信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @email
 * @date 2021-03-22
 */
public class QiuduiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 球队名称 Search
     */
    private String name;


    /**
     * 所属乡镇 Search
     */
    private Integer xzTypes;


    /**
     * 球队队徽
     */
    private String imgPhoto;


    /**
     * 队员人数
     */
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
	 * 设置：球队名称 Search
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：球队名称 Search
	 */

    public void setName(String name) {
        this.name = name;
    }
    /**
	 * 设置：所属乡镇 Search
	 */
    public Integer getXzTypes() {
        return xzTypes;
    }


    /**
	 * 获取：所属乡镇 Search
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

    }
