package com.entity.view;

import com.entity.ChongwuLingyangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 流浪宠物领养
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chongwu_lingyang")
public class ChongwuLingyangView extends ChongwuLingyangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 审核状态的值
		*/
		private String chongwuLingyangYesnoValue;



		//级联表 chongwu
			/**
			* 宠物名称
			*/
			private String chongwuName;
			/**
			* 宠物照片
			*/
			private String chongwuPhoto;
			/**
			* 宠物类型
			*/
			private Integer chongwuTypes;
				/**
				* 宠物类型的值
				*/
				private String chongwuValue;
			/**
			* 认领状态
			*/
			private Integer chongwuStatusTypes;
				/**
				* 认领状态的值
				*/
				private String chongwuStatusValue;
			/**
			* 宠物简介
			*/
			private String chongwuContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public ChongwuLingyangView() {

	}

	public ChongwuLingyangView(ChongwuLingyangEntity chongwuLingyangEntity) {
		try {
			BeanUtils.copyProperties(this, chongwuLingyangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 审核状态的值
			*/
			public String getChongwuLingyangYesnoValue() {
				return chongwuLingyangYesnoValue;
			}
			/**
			* 设置： 审核状态的值
			*/
			public void setChongwuLingyangYesnoValue(String chongwuLingyangYesnoValue) {
				this.chongwuLingyangYesnoValue = chongwuLingyangYesnoValue;
			}










				//级联表的get和set chongwu
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
					* 获取： 宠物类型
					*/
					public Integer getChongwuTypes() {
						return chongwuTypes;
					}
					/**
					* 设置： 宠物类型
					*/
					public void setChongwuTypes(Integer chongwuTypes) {
						this.chongwuTypes = chongwuTypes;
					}


						/**
						* 获取： 宠物类型的值
						*/
						public String getChongwuValue() {
							return chongwuValue;
						}
						/**
						* 设置： 宠物类型的值
						*/
						public void setChongwuValue(String chongwuValue) {
							this.chongwuValue = chongwuValue;
						}
					/**
					* 获取： 认领状态
					*/
					public Integer getChongwuStatusTypes() {
						return chongwuStatusTypes;
					}
					/**
					* 设置： 认领状态
					*/
					public void setChongwuStatusTypes(Integer chongwuStatusTypes) {
						this.chongwuStatusTypes = chongwuStatusTypes;
					}


						/**
						* 获取： 认领状态的值
						*/
						public String getChongwuStatusValue() {
							return chongwuStatusValue;
						}
						/**
						* 设置： 认领状态的值
						*/
						public void setChongwuStatusValue(String chongwuStatusValue) {
							this.chongwuStatusValue = chongwuStatusValue;
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































				//级联表的get和set yonghu
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
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
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



}
