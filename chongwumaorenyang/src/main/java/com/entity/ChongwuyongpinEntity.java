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
 * 宠物用品
 *
 * @author 
 * @email
 */
@TableName("chongwuyongpin")
public class ChongwuyongpinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChongwuyongpinEntity() {

	}

	public ChongwuyongpinEntity(T t) {
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
     * 宠物用品名称
     */
    @ColumnInfo(comment="宠物用品名称",type="varchar(200)")
    @TableField(value = "chongwuyongpin_name")

    private String chongwuyongpinName;


    /**
     * 宠物用品照片
     */
    @ColumnInfo(comment="宠物用品照片",type="varchar(200)")
    @TableField(value = "chongwuyongpin_photo")

    private String chongwuyongpinPhoto;


    /**
     * 宠物用品类型
     */
    @ColumnInfo(comment="宠物用品类型",type="int(11)")
    @TableField(value = "chongwuyongpin_types")

    private Integer chongwuyongpinTypes;


    /**
     * 宠物用品库存
     */
    @ColumnInfo(comment="宠物用品库存",type="int(11)")
    @TableField(value = "chongwuyongpin_kucun_number")

    private Integer chongwuyongpinKucunNumber;


    /**
     * 原价
     */
    @ColumnInfo(comment="原价",type="decimal(10,2)")
    @TableField(value = "chongwuyongpin_old_money")

    private Double chongwuyongpinOldMoney;


    /**
     * 现价
     */
    @ColumnInfo(comment="现价",type="decimal(10,2)")
    @TableField(value = "chongwuyongpin_new_money")

    private Double chongwuyongpinNewMoney;


    /**
     * 点击次数
     */
    @ColumnInfo(comment="点击次数",type="int(11)")
    @TableField(value = "chongwuyongpin_clicknum")

    private Integer chongwuyongpinClicknum;


    /**
     * 是否上架
     */
    @ColumnInfo(comment="是否上架",type="int(11)")
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "chongwuyongpin_delete")

    private Integer chongwuyongpinDelete;


    /**
     * 宠物用品简介
     */
    @ColumnInfo(comment="宠物用品简介",type="text")
    @TableField(value = "chongwuyongpin_content")

    private String chongwuyongpinContent;


    /**
     * 创建时间
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
	 * 获取：宠物用品名称
	 */
    public String getChongwuyongpinName() {
        return chongwuyongpinName;
    }
    /**
	 * 设置：宠物用品名称
	 */

    public void setChongwuyongpinName(String chongwuyongpinName) {
        this.chongwuyongpinName = chongwuyongpinName;
    }
    /**
	 * 获取：宠物用品照片
	 */
    public String getChongwuyongpinPhoto() {
        return chongwuyongpinPhoto;
    }
    /**
	 * 设置：宠物用品照片
	 */

    public void setChongwuyongpinPhoto(String chongwuyongpinPhoto) {
        this.chongwuyongpinPhoto = chongwuyongpinPhoto;
    }
    /**
	 * 获取：宠物用品类型
	 */
    public Integer getChongwuyongpinTypes() {
        return chongwuyongpinTypes;
    }
    /**
	 * 设置：宠物用品类型
	 */

    public void setChongwuyongpinTypes(Integer chongwuyongpinTypes) {
        this.chongwuyongpinTypes = chongwuyongpinTypes;
    }
    /**
	 * 获取：宠物用品库存
	 */
    public Integer getChongwuyongpinKucunNumber() {
        return chongwuyongpinKucunNumber;
    }
    /**
	 * 设置：宠物用品库存
	 */

    public void setChongwuyongpinKucunNumber(Integer chongwuyongpinKucunNumber) {
        this.chongwuyongpinKucunNumber = chongwuyongpinKucunNumber;
    }
    /**
	 * 获取：原价
	 */
    public Double getChongwuyongpinOldMoney() {
        return chongwuyongpinOldMoney;
    }
    /**
	 * 设置：原价
	 */

    public void setChongwuyongpinOldMoney(Double chongwuyongpinOldMoney) {
        this.chongwuyongpinOldMoney = chongwuyongpinOldMoney;
    }
    /**
	 * 获取：现价
	 */
    public Double getChongwuyongpinNewMoney() {
        return chongwuyongpinNewMoney;
    }
    /**
	 * 设置：现价
	 */

    public void setChongwuyongpinNewMoney(Double chongwuyongpinNewMoney) {
        this.chongwuyongpinNewMoney = chongwuyongpinNewMoney;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getChongwuyongpinClicknum() {
        return chongwuyongpinClicknum;
    }
    /**
	 * 设置：点击次数
	 */

    public void setChongwuyongpinClicknum(Integer chongwuyongpinClicknum) {
        this.chongwuyongpinClicknum = chongwuyongpinClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 设置：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getChongwuyongpinDelete() {
        return chongwuyongpinDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setChongwuyongpinDelete(Integer chongwuyongpinDelete) {
        this.chongwuyongpinDelete = chongwuyongpinDelete;
    }
    /**
	 * 获取：宠物用品简介
	 */
    public String getChongwuyongpinContent() {
        return chongwuyongpinContent;
    }
    /**
	 * 设置：宠物用品简介
	 */

    public void setChongwuyongpinContent(String chongwuyongpinContent) {
        this.chongwuyongpinContent = chongwuyongpinContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Chongwuyongpin{" +
            ", id=" + id +
            ", chongwuyongpinName=" + chongwuyongpinName +
            ", chongwuyongpinPhoto=" + chongwuyongpinPhoto +
            ", chongwuyongpinTypes=" + chongwuyongpinTypes +
            ", chongwuyongpinKucunNumber=" + chongwuyongpinKucunNumber +
            ", chongwuyongpinOldMoney=" + chongwuyongpinOldMoney +
            ", chongwuyongpinNewMoney=" + chongwuyongpinNewMoney +
            ", chongwuyongpinClicknum=" + chongwuyongpinClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", chongwuyongpinDelete=" + chongwuyongpinDelete +
            ", chongwuyongpinContent=" + chongwuyongpinContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
