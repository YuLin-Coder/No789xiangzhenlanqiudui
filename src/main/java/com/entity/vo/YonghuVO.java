package com.entity.vo;

import com.entity.YonghuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 球员信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @email
 * @date 2021-03-22
 */
@TableName("yonghu")
public class YonghuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 名称 Search
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

    @TableField(value = "Assists")
    private Integer Assists;


    /**
     * 性别 Search
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 所属球队 Search
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
	 * 设置：名称 Search
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：名称 Search
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
        return Assists;
    }


    /**
	 * 获取：场均助攻数
	 */

    public void setAssists(Integer Assists) {
        this.Assists = Assists;
    }
    /**
	 * 设置：性别 Search
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别 Search
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：所属球队 Search
	 */
    public Integer getQdTypes() {
        return qdTypes;
    }


    /**
	 * 获取：所属球队 Search
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

}
