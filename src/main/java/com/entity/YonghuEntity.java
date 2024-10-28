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
 * 球员信息
 *
 * @email
 * @date 2021-03-22
 */
@TableName("yonghu")
public class YonghuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    public YonghuEntity() {

    }

    public YonghuEntity(T t) {
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
     * 名称
     */
    @TableField(value = "name")

    private String name;


    /**
     * 账号
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 头像
     */
    @TableField(value = "img_photo")

    private String imgPhoto;


    /**
     * 籍贯
     */
    @TableField(value = "jiguan")

    private String jiguan;


    /**
     * 年龄
     */
    @TableField(value = "age")

    private Integer age;


    /**
     * 身高体重
     */
    @TableField(value = "height")

    private Integer height;


    /**
     * 场均得分
     */
    @TableField(value = "averaged")

    private Integer averaged;


    /**
     * 场均篮板数
     */
    @TableField(value = "backboard")

    private Integer backboard;


    /**
     * 场均助攻数
     */
    @TableField(value = "assists")

    private Integer assists;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 所属球队
     */
    @TableField(value = "qd_types")

    private Integer qdTypes;


    /**
     * 手机号
     */
    @TableField(value = "phone")

    private String phone;


    /**
     * 身份
     */
    @TableField(value = "role")

    private String role;


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
	 * 设置：名称
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：名称
	 */

    public void setName(String name) {
        this.name = name;
    }
    /**
	 * 设置：账号
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账号
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：头像
	 */
    public String getImgPhoto() {
        return imgPhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setImgPhoto(String imgPhoto) {
        this.imgPhoto = imgPhoto;
    }
    /**
	 * 设置：籍贯
	 */
    public String getJiguan() {
        return jiguan;
    }


    /**
	 * 获取：籍贯
	 */

    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }
    /**
	 * 设置：年龄
	 */
    public Integer getAge() {
        return age;
    }


    /**
	 * 获取：年龄
	 */

    public void setAge(Integer age) {
        this.age = age;
    }
    /**
	 * 设置：身高体重
	 */
    public Integer getHeight() {
        return height;
    }


    /**
	 * 获取：身高体重
	 */

    public void setHeight(Integer height) {
        this.height = height;
    }
    /**
	 * 设置：场均得分
	 */
    public Integer getAveraged() {
        return averaged;
    }


    /**
	 * 获取：场均得分
	 */

    public void setAveraged(Integer averaged) {
        this.averaged = averaged;
    }
    /**
	 * 设置：场均篮板数
	 */
    public Integer getBackboard() {
        return backboard;
    }


    /**
	 * 获取：场均篮板数
	 */

    public void setBackboard(Integer backboard) {
        this.backboard = backboard;
    }
    /**
	 * 设置：场均助攻数
	 */
    public Integer getAssists() {
        return assists;
    }


    /**
	 * 获取：场均助攻数
	 */

    public void setAssists(Integer assists) {
        this.assists = assists;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：所属球队
	 */
    public Integer getQdTypes() {
        return qdTypes;
    }


    /**
	 * 获取：所属球队
	 */

    public void setQdTypes(Integer qdTypes) {
        this.qdTypes = qdTypes;
    }
    /**
	 * 设置：手机号
	 */
    public String getPhone() {
        return phone;
    }


    /**
	 * 获取：手机号
	 */

    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
	 * 设置：身份
	 */
    public String getRole() {
        return role;
    }


    /**
	 * 获取：身份
	 */

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
    return "Yonghu{" +
            "id=" + id +
            ", name=" + name +
            ", username=" + username +
            ", password=" + password +
            ", imgPhoto=" + imgPhoto +
            ", jiguan=" + jiguan +
            ", age=" + age +
            ", height=" + height +
            ", averaged=" + averaged +
            ", backboard=" + backboard +
            ", assists=" + assists +
            ", sexTypes=" + sexTypes +
            ", qdTypes=" + qdTypes +
            ", phone=" + phone +
            ", role=" + role +
    "}";
    }
    }
