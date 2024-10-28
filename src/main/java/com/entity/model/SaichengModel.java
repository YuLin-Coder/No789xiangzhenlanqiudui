package com.entity.model;

import com.entity.SaichengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 赛程信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @email
 * @date 2021-03-22
 */
public class SaichengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 比赛队伍1
     */
    private Integer qd1Types;


    /**
     * 比赛队伍2
     */
    private Integer qd2Types;


    /**
     * 开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date kaishiTime;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jieshuTime;


    /**
     * 比赛结果
     */
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

    }
