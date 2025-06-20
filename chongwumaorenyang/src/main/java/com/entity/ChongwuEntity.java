package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 宠物
 *
 * @author 
 * @email
 */
@TableName("chongwu")
public class ChongwuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChongwuEntity() {

	}

	public ChongwuEntity(T t) {
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
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 宠物名称
     */
    @ColumnInfo(comment="宠物名称",type="varchar(200)")
    @TableField(value = "chongwu_name")

    private String chongwuName;


    /**
     * 宠物照片
     */
    @ColumnInfo(comment="宠物照片",type="varchar(200)")
    @TableField(value = "chongwu_photo")

    private String chongwuPhoto;


    /**
     * 宠物品种
     */
    @ColumnInfo(comment="宠物品种",type="int(11)")
    @TableField(value = "chongwu_types")

    private Integer chongwuTypes;


    /**
     * 宠物类型
     */
    @ColumnInfo(comment="宠物类型",type="int(11)")
    @TableField(value = "chongwuleix_types")

    private Integer chongwuleixTypes;


    /**
     * 宠物年龄
     */
    @ColumnInfo(comment="宠物年龄",type="int(11)")
    @TableField(value = "chongwu_age")

    private Integer chongwuAge;


    /**
     * 宠物性别
     */
    @ColumnInfo(comment="宠物性别",type="int(11)")
    @TableField(value = "xingbie_types")

    private Integer xingbieTypes;


    /**
     * 宠物特征
     */
    @ColumnInfo(comment="宠物特征",type="varchar(200)")
    @TableField(value = "chongwu_tezheng")

    private String chongwuTezheng;


    /**
     * 宠物状态
     */
    @ColumnInfo(comment="宠物状态",type="int(11)")
    @TableField(value = "dongwu_types")

    private Integer dongwuTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "chongwu_delete")

    private Integer chongwuDelete;


    /**
     * 宠物简介
     */
    @ColumnInfo(comment="宠物简介",type="text")
    @TableField(value = "chongwu_content")

    private String chongwuContent;


    /**
     * 创建时间     homeMain
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：创建时间     homeMain
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间     homeMain
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Chongwu{" +
            ", id=" + id +
            ", chongwuName=" + chongwuName +
            ", chongwuPhoto=" + chongwuPhoto +
            ", chongwuTypes=" + chongwuTypes +
            ", chongwuleixTypes=" + chongwuleixTypes +
            ", chongwuAge=" + chongwuAge +
            ", xingbieTypes=" + xingbieTypes +
            ", chongwuTezheng=" + chongwuTezheng +
            ", dongwuTypes=" + dongwuTypes +
            ", chongwuDelete=" + chongwuDelete +
            ", chongwuContent=" + chongwuContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
