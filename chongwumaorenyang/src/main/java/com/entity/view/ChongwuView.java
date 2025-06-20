package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ChongwuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 宠物
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("chongwu")
public class ChongwuView extends ChongwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 宠物品种的值
	*/
	@ColumnInfo(comment="宠物品种的字典表值",type="varchar(200)")
	private String chongwuValue;
	/**
	* 宠物类型的值
	*/
	@ColumnInfo(comment="宠物类型的字典表值",type="varchar(200)")
	private String chongwuleixValue;
	/**
	* 宠物性别的值
	*/
	@ColumnInfo(comment="宠物性别的字典表值",type="varchar(200)")
	private String xingbieValue;
	/**
	* 宠物状态的值
	*/
	@ColumnInfo(comment="宠物状态的字典表值",type="varchar(200)")
	private String dongwuValue;




	public ChongwuView() {

	}

	public ChongwuView(ChongwuEntity chongwuEntity) {
		try {
			BeanUtils.copyProperties(this, chongwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 宠物品种的值
	*/
	public String getChongwuValue() {
		return chongwuValue;
	}
	/**
	* 设置： 宠物品种的值
	*/
	public void setChongwuValue(String chongwuValue) {
		this.chongwuValue = chongwuValue;
	}
	//当前表的
	/**
	* 获取： 宠物类型的值
	*/
	public String getChongwuleixValue() {
		return chongwuleixValue;
	}
	/**
	* 设置： 宠物类型的值
	*/
	public void setChongwuleixValue(String chongwuleixValue) {
		this.chongwuleixValue = chongwuleixValue;
	}
	//当前表的
	/**
	* 获取： 宠物性别的值
	*/
	public String getXingbieValue() {
		return xingbieValue;
	}
	/**
	* 设置： 宠物性别的值
	*/
	public void setXingbieValue(String xingbieValue) {
		this.xingbieValue = xingbieValue;
	}
	//当前表的
	/**
	* 获取： 宠物状态的值
	*/
	public String getDongwuValue() {
		return dongwuValue;
	}
	/**
	* 设置： 宠物状态的值
	*/
	public void setDongwuValue(String dongwuValue) {
		this.dongwuValue = dongwuValue;
	}




	@Override
	public String toString() {
		return "ChongwuView{" +
			", chongwuValue=" + chongwuValue +
			", chongwuleixValue=" + chongwuleixValue +
			", xingbieValue=" + xingbieValue +
			", dongwuValue=" + dongwuValue +
			"} " + super.toString();
	}
}
