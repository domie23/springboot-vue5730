package com.entity.model;

import com.entity.ChongwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 宠物
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChongwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 宠物名称
     */
    private String chongwuName;


    /**
     * 宠物照片
     */
    private String chongwuPhoto;


    /**
     * 宠物品种
     */
    private Integer chongwuTypes;


    /**
     * 宠物类型
     */
    private Integer chongwuleixTypes;


    /**
     * 宠物年龄
     */
    private Integer chongwuAge;


    /**
     * 宠物性别
     */
    private Integer xingbieTypes;


    /**
     * 宠物特征
     */
    private String chongwuTezheng;


    /**
     * 宠物状态
     */
    private Integer dongwuTypes;


    /**
     * 逻辑删除
     */
    private Integer chongwuDelete;


    /**
     * 宠物简介
     */
    private String chongwuContent;


    /**
     * 创建时间  show1 show2 photoShow homeMain
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：宠物名称
	 */
    public String getChongwuName() {
        return chongwuName;
    }


    /**
	 * 设置：宠物名称
	 */
    public void setChongwuName(String chongwuName) {
        this.chongwuName = chongwuName;
    }
    /**
	 * 获取：宠物照片
	 */
    public String getChongwuPhoto() {
        return chongwuPhoto;
    }


    /**
	 * 设置：宠物照片
	 */
    public void setChongwuPhoto(String chongwuPhoto) {
        this.chongwuPhoto = chongwuPhoto;
    }
    /**
	 * 获取：宠物品种
	 */
    public Integer getChongwuTypes() {
        return chongwuTypes;
    }


    /**
	 * 设置：宠物品种
	 */
    public void setChongwuTypes(Integer chongwuTypes) {
        this.chongwuTypes = chongwuTypes;
    }
    /**
	 * 获取：宠物类型
	 */
    public Integer getChongwuleixTypes() {
        return chongwuleixTypes;
    }


    /**
	 * 设置：宠物类型
	 */
    public void setChongwuleixTypes(Integer chongwuleixTypes) {
        this.chongwuleixTypes = chongwuleixTypes;
    }
    /**
	 * 获取：宠物年龄
	 */
    public Integer getChongwuAge() {
        return chongwuAge;
    }


    /**
	 * 设置：宠物年龄
	 */
    public void setChongwuAge(Integer chongwuAge) {
        this.chongwuAge = chongwuAge;
    }
    /**
	 * 获取：宠物性别
	 */
    public Integer getXingbieTypes() {
        return xingbieTypes;
    }


    /**
	 * 设置：宠物性别
	 */
    public void setXingbieTypes(Integer xingbieTypes) {
        this.xingbieTypes = xingbieTypes;
    }
    /**
	 * 获取：宠物特征
	 */
    public String getChongwuTezheng() {
        return chongwuTezheng;
    }


    /**
	 * 设置：宠物特征
	 */
    public void setChongwuTezheng(String chongwuTezheng) {
        this.chongwuTezheng = chongwuTezheng;
    }
    /**
	 * 获取：宠物状态
	 */
    public Integer getDongwuTypes() {
        return dongwuTypes;
    }


    /**
	 * 设置：宠物状态
	 */
    public void setDongwuTypes(Integer dongwuTypes) {
        this.dongwuTypes = dongwuTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getChongwuDelete() {
        return chongwuDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setChongwuDelete(Integer chongwuDelete) {
        this.chongwuDelete = chongwuDelete;
    }
    /**
	 * 获取：宠物简介
	 */
    public String getChongwuContent() {
        return chongwuContent;
    }


    /**
	 * 设置：宠物简介
	 */
    public void setChongwuContent(String chongwuContent) {
        this.chongwuContent = chongwuContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow homeMain
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow homeMain
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
