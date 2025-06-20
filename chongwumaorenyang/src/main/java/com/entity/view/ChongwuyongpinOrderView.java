package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ChongwuyongpinOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 宠物用品订单
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("chongwuyongpin_order")
public class ChongwuyongpinOrderView extends ChongwuyongpinOrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 订单类型的值
	*/
	@ColumnInfo(comment="订单类型的字典表值",type="varchar(200)")
	private String chongwuyongpinOrderValue;
	/**
	* 支付类型的值
	*/
	@ColumnInfo(comment="支付类型的字典表值",type="varchar(200)")
	private String chongwuyongpinOrderPaymentValue;

	//级联表 收货地址
					 
		/**
		* 收货地址 的 创建用户
		*/
		@ColumnInfo(comment="创建用户",type="int(20)")
		private Integer addressYonghuId;
		/**
		* 收货人
		*/

		@ColumnInfo(comment="收货人",type="varchar(200)")
		private String addressName;
		/**
		* 电话
		*/

		@ColumnInfo(comment="电话",type="varchar(200)")
		private String addressPhone;
		/**
		* 地址
		*/

		@ColumnInfo(comment="地址",type="varchar(200)")
		private String addressDizhi;
		/**
		* 是否默认地址
		*/
		@ColumnInfo(comment="是否默认地址",type="int(11)")
		private Integer isdefaultTypes;
			/**
			* 是否默认地址的值
			*/
			@ColumnInfo(comment="是否默认地址的字典表值",type="varchar(200)")
			private String isdefaultValue;
	//级联表 宠物用品
		/**
		* 宠物用品名称
		*/

		@ColumnInfo(comment="宠物用品名称",type="varchar(200)")
		private String chongwuyongpinName;
		/**
		* 宠物用品照片
		*/

		@ColumnInfo(comment="宠物用品照片",type="varchar(200)")
		private String chongwuyongpinPhoto;
		/**
		* 宠物用品类型
		*/
		@ColumnInfo(comment="宠物用品类型",type="int(11)")
		private Integer chongwuyongpinTypes;
			/**
			* 宠物用品类型的值
			*/
			@ColumnInfo(comment="宠物用品类型的字典表值",type="varchar(200)")
			private String chongwuyongpinValue;
		/**
		* 宠物用品库存
		*/

		@ColumnInfo(comment="宠物用品库存",type="int(11)")
		private Integer chongwuyongpinKucunNumber;
		/**
		* 原价
		*/
		@ColumnInfo(comment="原价",type="decimal(10,2)")
		private Double chongwuyongpinOldMoney;
		/**
		* 现价
		*/
		@ColumnInfo(comment="现价",type="decimal(10,2)")
		private Double chongwuyongpinNewMoney;
		/**
		* 点击次数
		*/

		@ColumnInfo(comment="点击次数",type="int(11)")
		private Integer chongwuyongpinClicknum;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer chongwuyongpinDelete;
		/**
		* 宠物用品简介
		*/

		@ColumnInfo(comment="宠物用品简介",type="text")
		private String chongwuyongpinContent;
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



	public ChongwuyongpinOrderView() {

	}

	public ChongwuyongpinOrderView(ChongwuyongpinOrderEntity chongwuyongpinOrderEntity) {
		try {
			BeanUtils.copyProperties(this, chongwuyongpinOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 订单类型的值
	*/
	public String getChongwuyongpinOrderValue() {
		return chongwuyongpinOrderValue;
	}
	/**
	* 设置： 订单类型的值
	*/
	public void setChongwuyongpinOrderValue(String chongwuyongpinOrderValue) {
		this.chongwuyongpinOrderValue = chongwuyongpinOrderValue;
	}
	//当前表的
	/**
	* 获取： 支付类型的值
	*/
	public String getChongwuyongpinOrderPaymentValue() {
		return chongwuyongpinOrderPaymentValue;
	}
	/**
	* 设置： 支付类型的值
	*/
	public void setChongwuyongpinOrderPaymentValue(String chongwuyongpinOrderPaymentValue) {
		this.chongwuyongpinOrderPaymentValue = chongwuyongpinOrderPaymentValue;
	}


	//级联表的get和set 收货地址
		/**
		* 获取：收货地址 的 创建用户
		*/
		public Integer getAddressYonghuId() {
			return addressYonghuId;
		}
		/**
		* 设置：收货地址 的 创建用户
		*/
		public void setAddressYonghuId(Integer addressYonghuId) {
			this.addressYonghuId = addressYonghuId;
		}

		/**
		* 获取： 收货人
		*/
		public String getAddressName() {
			return addressName;
		}
		/**
		* 设置： 收货人
		*/
		public void setAddressName(String addressName) {
			this.addressName = addressName;
		}

		/**
		* 获取： 电话
		*/
		public String getAddressPhone() {
			return addressPhone;
		}
		/**
		* 设置： 电话
		*/
		public void setAddressPhone(String addressPhone) {
			this.addressPhone = addressPhone;
		}

		/**
		* 获取： 地址
		*/
		public String getAddressDizhi() {
			return addressDizhi;
		}
		/**
		* 设置： 地址
		*/
		public void setAddressDizhi(String addressDizhi) {
			this.addressDizhi = addressDizhi;
		}
		/**
		* 获取： 是否默认地址
		*/
		public Integer getIsdefaultTypes() {
			return isdefaultTypes;
		}
		/**
		* 设置： 是否默认地址
		*/
		public void setIsdefaultTypes(Integer isdefaultTypes) {
			this.isdefaultTypes = isdefaultTypes;
		}


			/**
			* 获取： 是否默认地址的值
			*/
			public String getIsdefaultValue() {
				return isdefaultValue;
			}
			/**
			* 设置： 是否默认地址的值
			*/
			public void setIsdefaultValue(String isdefaultValue) {
				this.isdefaultValue = isdefaultValue;
			}
	//级联表的get和set 宠物用品

		/**
		* 获取： 宠物用品名称
		*/
		public String getChongwuyongpinName() {
			return chongwuyongpinName;
		}
		/**
		* 设置： 宠物用品名称
		*/
		public void setChongwuyongpinName(String chongwuyongpinName) {
			this.chongwuyongpinName = chongwuyongpinName;
		}

		/**
		* 获取： 宠物用品照片
		*/
		public String getChongwuyongpinPhoto() {
			return chongwuyongpinPhoto;
		}
		/**
		* 设置： 宠物用品照片
		*/
		public void setChongwuyongpinPhoto(String chongwuyongpinPhoto) {
			this.chongwuyongpinPhoto = chongwuyongpinPhoto;
		}
		/**
		* 获取： 宠物用品类型
		*/
		public Integer getChongwuyongpinTypes() {
			return chongwuyongpinTypes;
		}
		/**
		* 设置： 宠物用品类型
		*/
		public void setChongwuyongpinTypes(Integer chongwuyongpinTypes) {
			this.chongwuyongpinTypes = chongwuyongpinTypes;
		}


			/**
			* 获取： 宠物用品类型的值
			*/
			public String getChongwuyongpinValue() {
				return chongwuyongpinValue;
			}
			/**
			* 设置： 宠物用品类型的值
			*/
			public void setChongwuyongpinValue(String chongwuyongpinValue) {
				this.chongwuyongpinValue = chongwuyongpinValue;
			}

		/**
		* 获取： 宠物用品库存
		*/
		public Integer getChongwuyongpinKucunNumber() {
			return chongwuyongpinKucunNumber;
		}
		/**
		* 设置： 宠物用品库存
		*/
		public void setChongwuyongpinKucunNumber(Integer chongwuyongpinKucunNumber) {
			this.chongwuyongpinKucunNumber = chongwuyongpinKucunNumber;
		}

		/**
		* 获取： 原价
		*/
		public Double getChongwuyongpinOldMoney() {
			return chongwuyongpinOldMoney;
		}
		/**
		* 设置： 原价
		*/
		public void setChongwuyongpinOldMoney(Double chongwuyongpinOldMoney) {
			this.chongwuyongpinOldMoney = chongwuyongpinOldMoney;
		}

		/**
		* 获取： 现价
		*/
		public Double getChongwuyongpinNewMoney() {
			return chongwuyongpinNewMoney;
		}
		/**
		* 设置： 现价
		*/
		public void setChongwuyongpinNewMoney(Double chongwuyongpinNewMoney) {
			this.chongwuyongpinNewMoney = chongwuyongpinNewMoney;
		}

		/**
		* 获取： 点击次数
		*/
		public Integer getChongwuyongpinClicknum() {
			return chongwuyongpinClicknum;
		}
		/**
		* 设置： 点击次数
		*/
		public void setChongwuyongpinClicknum(Integer chongwuyongpinClicknum) {
			this.chongwuyongpinClicknum = chongwuyongpinClicknum;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getChongwuyongpinDelete() {
			return chongwuyongpinDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setChongwuyongpinDelete(Integer chongwuyongpinDelete) {
			this.chongwuyongpinDelete = chongwuyongpinDelete;
		}

		/**
		* 获取： 宠物用品简介
		*/
		public String getChongwuyongpinContent() {
			return chongwuyongpinContent;
		}
		/**
		* 设置： 宠物用品简介
		*/
		public void setChongwuyongpinContent(String chongwuyongpinContent) {
			this.chongwuyongpinContent = chongwuyongpinContent;
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
		return "ChongwuyongpinOrderView{" +
			", chongwuyongpinOrderValue=" + chongwuyongpinOrderValue +
			", chongwuyongpinOrderPaymentValue=" + chongwuyongpinOrderPaymentValue +
			", addressName=" + addressName +
			", addressPhone=" + addressPhone +
			", addressDizhi=" + addressDizhi +
			", yonghuName=" + yonghuName +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhone=" + yonghuPhone +
			", yonghuEmail=" + yonghuEmail +
			", newMoney=" + newMoney +
			", yonghuDelete=" + yonghuDelete +
			", chongwuyongpinName=" + chongwuyongpinName +
			", chongwuyongpinPhoto=" + chongwuyongpinPhoto +
			", chongwuyongpinKucunNumber=" + chongwuyongpinKucunNumber +
			", chongwuyongpinOldMoney=" + chongwuyongpinOldMoney +
			", chongwuyongpinNewMoney=" + chongwuyongpinNewMoney +
			", chongwuyongpinClicknum=" + chongwuyongpinClicknum +
			", chongwuyongpinDelete=" + chongwuyongpinDelete +
			", chongwuyongpinContent=" + chongwuyongpinContent +
			"} " + super.toString();
	}
}
