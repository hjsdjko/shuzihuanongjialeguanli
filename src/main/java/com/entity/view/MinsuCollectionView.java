package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.MinsuCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 客房收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("minsu_collection")
public class MinsuCollectionView extends MinsuCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String minsuCollectionValue;

	//级联表 客房
		/**
		* 客房编号
		*/

		@ColumnInfo(comment="客房编号",type="varchar(200)")
		private String minsuUuidNumber;
		/**
		* 客房名称
		*/

		@ColumnInfo(comment="客房名称",type="varchar(200)")
		private String minsuName;
		/**
		* 客房照片
		*/

		@ColumnInfo(comment="客房照片",type="varchar(200)")
		private String minsuPhoto;
		/**
		* 客房类型
		*/
		@ColumnInfo(comment="客房类型",type="int(11)")
		private Integer minsuTypes;
			/**
			* 客房类型的值
			*/
			@ColumnInfo(comment="客房类型的字典表值",type="varchar(200)")
			private String minsuValue;
		/**
		* 客房定金
		*/
		@ColumnInfo(comment="客房定金",type="decimal(10,2)")
		private Double minsuNewMoney;
		/**
		* 点击次数
		*/

		@ColumnInfo(comment="点击次数",type="int(11)")
		private Integer minsuClicknum;
		/**
		* 客房介绍
		*/

		@ColumnInfo(comment="客房介绍",type="text")
		private String minsuContent;
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
		private Integer minsuDelete;
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



	public MinsuCollectionView() {

	}

	public MinsuCollectionView(MinsuCollectionEntity minsuCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, minsuCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getMinsuCollectionValue() {
		return minsuCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setMinsuCollectionValue(String minsuCollectionValue) {
		this.minsuCollectionValue = minsuCollectionValue;
	}


	//级联表的get和set 客房

		/**
		* 获取： 客房编号
		*/
		public String getMinsuUuidNumber() {
			return minsuUuidNumber;
		}
		/**
		* 设置： 客房编号
		*/
		public void setMinsuUuidNumber(String minsuUuidNumber) {
			this.minsuUuidNumber = minsuUuidNumber;
		}

		/**
		* 获取： 客房名称
		*/
		public String getMinsuName() {
			return minsuName;
		}
		/**
		* 设置： 客房名称
		*/
		public void setMinsuName(String minsuName) {
			this.minsuName = minsuName;
		}

		/**
		* 获取： 客房照片
		*/
		public String getMinsuPhoto() {
			return minsuPhoto;
		}
		/**
		* 设置： 客房照片
		*/
		public void setMinsuPhoto(String minsuPhoto) {
			this.minsuPhoto = minsuPhoto;
		}
		/**
		* 获取： 客房类型
		*/
		public Integer getMinsuTypes() {
			return minsuTypes;
		}
		/**
		* 设置： 客房类型
		*/
		public void setMinsuTypes(Integer minsuTypes) {
			this.minsuTypes = minsuTypes;
		}


			/**
			* 获取： 客房类型的值
			*/
			public String getMinsuValue() {
				return minsuValue;
			}
			/**
			* 设置： 客房类型的值
			*/
			public void setMinsuValue(String minsuValue) {
				this.minsuValue = minsuValue;
			}

		/**
		* 获取： 客房定金
		*/
		public Double getMinsuNewMoney() {
			return minsuNewMoney;
		}
		/**
		* 设置： 客房定金
		*/
		public void setMinsuNewMoney(Double minsuNewMoney) {
			this.minsuNewMoney = minsuNewMoney;
		}

		/**
		* 获取： 点击次数
		*/
		public Integer getMinsuClicknum() {
			return minsuClicknum;
		}
		/**
		* 设置： 点击次数
		*/
		public void setMinsuClicknum(Integer minsuClicknum) {
			this.minsuClicknum = minsuClicknum;
		}

		/**
		* 获取： 客房介绍
		*/
		public String getMinsuContent() {
			return minsuContent;
		}
		/**
		* 设置： 客房介绍
		*/
		public void setMinsuContent(String minsuContent) {
			this.minsuContent = minsuContent;
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
		public Integer getMinsuDelete() {
			return minsuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setMinsuDelete(Integer minsuDelete) {
			this.minsuDelete = minsuDelete;
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
		return "MinsuCollectionView{" +
			", minsuCollectionValue=" + minsuCollectionValue +
			", minsuUuidNumber=" + minsuUuidNumber +
			", minsuName=" + minsuName +
			", minsuPhoto=" + minsuPhoto +
			", minsuNewMoney=" + minsuNewMoney +
			", minsuClicknum=" + minsuClicknum +
			", minsuContent=" + minsuContent +
			", minsuDelete=" + minsuDelete +
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
