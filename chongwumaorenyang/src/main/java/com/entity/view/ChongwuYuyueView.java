package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ChongwuYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 宠物领养申请
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("chongwu_yuyue")
public class ChongwuYuyueView extends ChongwuYuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 领养状态的值
	*/
	@ColumnInfo(comment="领养状态的字典表值",type="varchar(200)")
	private String chongwuYuyueValue;
	/**
	* 领养审核的值
	*/
	@ColumnInfo(comment="领养审核的字典表值",type="varchar(200)")
	private String chongwuYuyueYesnoValue;

	//级联表 宠物
		/**
		* 宠物名称
		*/

		@ColumnInfo(comment="宠物名称",type="varchar(200)")
		private String chongwuName;
		/**
		* 宠物照片
		*/

		@ColumnInfo(comment="宠物照片",type="varchar(200)")
		private String chongwuPhoto;
		/**
		* 宠物品种
		*/
		@ColumnInfo(comment="宠物品种",type="int(11)")
		private Integer chongwuTypes;
			/**
			* 宠物品种的值
			*/
			@ColumnInfo(comment="宠物品种的字典表值",type="varchar(200)")
			private String chongwuValue;
		/**
		* 宠物类型
		*/
		@ColumnInfo(comment="宠物类型",type="int(11)")
		private Integer chongwuleixTypes;
			/**
			* 宠物类型的值
			*/
			@ColumnInfo(comment="宠物类型的字典表值",type="varchar(200)")
			private String chongwuleixValue;
		/**
		* 宠物年龄
		*/

		@ColumnInfo(comment="宠物年龄",type="int(11)")
		private Integer chongwuAge;
		/**
		* 宠物性别
		*/
		@ColumnInfo(comment="宠物性别",type="int(11)")
		private Integer xingbieTypes;
			/**
			* 宠物性别的值
			*/
			@ColumnInfo(comment="宠物性别的字典表值",type="varchar(200)")
			private String xingbieValue;
		/**
		* 宠物特征
		*/

		@ColumnInfo(comment="宠物特征",type="varchar(200)")
		private String chongwuTezheng;
		/**
		* 宠物状态
		*/
		@ColumnInfo(comment="宠物状态",type="int(11)")
		private Integer dongwuTypes;
			/**
			* 宠物状态的值
			*/
			@ColumnInfo(comment="宠物状态的字典表值",type="varchar(200)")
			private String dongwuValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer chongwuDelete;
		/**
		* 宠物简介
		*/

		@ColumnInfo(comment="宠物简介",type="text")
		private String chongwuContent;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 身份证号
		*/

		@ColumnInfo(comment="身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer yonghuDelete;



	public ChongwuYuyueView() {

	}

	public ChongwuYuyueView(ChongwuYuyueEntity chongwuYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, chongwuYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 领养状态的值
	*/
	public String getChongwuYuyueValue() {
		return chongwuYuyueValue;
	}
	/**
	* 设置： 领养状态的值
	*/
	public void setChongwuYuyueValue(String chongwuYuyueValue) {
		this.chongwuYuyueValue = chongwuYuyueValue;
	}
	//当前表的
	/**
	* 获取： 领养审核的值
	*/
	public String getChongwuYuyueYesnoValue() {
		return chongwuYuyueYesnoValue;
	}
	/**
	* 设置： 领养审核的值
	*/
	public void setChongwuYuyueYesnoValue(String chongwuYuyueYesnoValue) {
		this.chongwuYuyueYesnoValue = chongwuYuyueYesnoValue;
	}


	//级联表的get和set 宠物

		/**
		* 获取： 宠物名称
		*/
		public String getChongwuName() {
			return chongwuName;
		}
		/**
		* 设置： 宠物名称
		*/
		public void setChongwuName(String chongwuName) {
			this.chongwuName = chongwuName;
		}

		/**
		* 获取： 宠物照片
		*/
		public String getChongwuPhoto() {
			return chongwuPhoto;
		}
		/**
		* 设置： 宠物照片
		*/
		public void setChongwuPhoto(String chongwuPhoto) {
			this.chongwuPhoto = chongwuPhoto;
		}
		/**
		* 获取： 宠物品种
		*/
		public Integer getChongwuTypes() {
			return chongwuTypes;
		}
		/**
		* 设置： 宠物品种
		*/
		public void setChongwuTypes(Integer chongwuTypes) {
			this.chongwuTypes = chongwuTypes;
		}


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
		/**
		* 获取： 宠物类型
		*/
		public Integer getChongwuleixTypes() {
			return chongwuleixTypes;
		}
		/**
		* 设置： 宠物类型
		*/
		public void setChongwuleixTypes(Integer chongwuleixTypes) {
			this.chongwuleixTypes = chongwuleixTypes;
		}


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

		/**
		* 获取： 宠物年龄
		*/
		public Integer getChongwuAge() {
			return chongwuAge;
		}
		/**
		* 设置： 宠物年龄
		*/
		public void setChongwuAge(Integer chongwuAge) {
			this.chongwuAge = chongwuAge;
		}
		/**
		* 获取： 宠物性别
		*/
		public Integer getXingbieTypes() {
			return xingbieTypes;
		}
		/**
		* 设置： 宠物性别
		*/
		public void setXingbieTypes(Integer xingbieTypes) {
			this.xingbieTypes = xingbieTypes;
		}


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

		/**
		* 获取： 宠物特征
		*/
		public String getChongwuTezheng() {
			return chongwuTezheng;
		}
		/**
		* 设置： 宠物特征
		*/
		public void setChongwuTezheng(String chongwuTezheng) {
			this.chongwuTezheng = chongwuTezheng;
		}
		/**
		* 获取： 宠物状态
		*/
		public Integer getDongwuTypes() {
			return dongwuTypes;
		}
		/**
		* 设置： 宠物状态
		*/
		public void setDongwuTypes(Integer dongwuTypes) {
			this.dongwuTypes = dongwuTypes;
		}


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

		/**
		* 获取： 逻辑删除
		*/
		public Integer getChongwuDelete() {
			return chongwuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setChongwuDelete(Integer chongwuDelete) {
			this.chongwuDelete = chongwuDelete;
		}

		/**
		* 获取： 宠物简介
		*/
		public String getChongwuContent() {
			return chongwuContent;
		}
		/**
		* 设置： 宠物简介
		*/
		public void setChongwuContent(String chongwuContent) {
			this.chongwuContent = chongwuContent;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 联系方式
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getYonghuDelete() {
			return yonghuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setYonghuDelete(Integer yonghuDelete) {
			this.yonghuDelete = yonghuDelete;
		}


	@Override
	public String toString() {
		return "ChongwuYuyueView{" +
			", chongwuYuyueValue=" + chongwuYuyueValue +
			", chongwuYuyueYesnoValue=" + chongwuYuyueYesnoValue +
			", chongwuName=" + chongwuName +
			", chongwuPhoto=" + chongwuPhoto +
			", chongwuAge=" + chongwuAge +
			", chongwuTezheng=" + chongwuTezheng +
			", chongwuDelete=" + chongwuDelete +
			", chongwuContent=" + chongwuContent +
			", yonghuName=" + yonghuName +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhone=" + yonghuPhone +
			", yonghuEmail=" + yonghuEmail +
			", newMoney=" + newMoney +
			", yonghuDelete=" + yonghuDelete +
			"} " + super.toString();
	}
}
