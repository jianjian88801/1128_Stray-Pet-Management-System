package com.entity.view;

import com.entity.ChongwuyongpinCommentbackEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品评价
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chongwuyongpin_commentback")
public class ChongwuyongpinCommentbackView extends ChongwuyongpinCommentbackEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 chongwuyongpin
			/**
			* 商品名称
			*/
			private String chongwuyongpinName;
			/**
			* 商品照片
			*/
			private String chongwuyongpinPhoto;
			/**
			* 商品类型
			*/
			private Integer chongwuyongpinTypes;
				/**
				* 商品类型的值
				*/
				private String chongwuyongpinValue;
			/**
			* 购买获得积分
			*/
			private Integer chongwuyongpinPrice;
			/**
			* 商品库存
			*/
			private Integer chongwuyongpinKucunNumber;
			/**
			* 商品原价
			*/
			private Double chongwuyongpinOldMoney;
			/**
			* 现价
			*/
			private Double chongwuyongpinNewMoney;
			/**
			* 点击次数
			*/
			private Integer chongwuyongpinClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer chongwuyongpinDelete;
			/**
			* 商品简介
			*/
			private String chongwuyongpinContent;

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

	public ChongwuyongpinCommentbackView() {

	}

	public ChongwuyongpinCommentbackView(ChongwuyongpinCommentbackEntity chongwuyongpinCommentbackEntity) {
		try {
			BeanUtils.copyProperties(this, chongwuyongpinCommentbackEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set chongwuyongpin
					/**
					* 获取： 商品名称
					*/
					public String getChongwuyongpinName() {
						return chongwuyongpinName;
					}
					/**
					* 设置： 商品名称
					*/
					public void setChongwuyongpinName(String chongwuyongpinName) {
						this.chongwuyongpinName = chongwuyongpinName;
					}
					/**
					* 获取： 商品照片
					*/
					public String getChongwuyongpinPhoto() {
						return chongwuyongpinPhoto;
					}
					/**
					* 设置： 商品照片
					*/
					public void setChongwuyongpinPhoto(String chongwuyongpinPhoto) {
						this.chongwuyongpinPhoto = chongwuyongpinPhoto;
					}
					/**
					* 获取： 商品类型
					*/
					public Integer getChongwuyongpinTypes() {
						return chongwuyongpinTypes;
					}
					/**
					* 设置： 商品类型
					*/
					public void setChongwuyongpinTypes(Integer chongwuyongpinTypes) {
						this.chongwuyongpinTypes = chongwuyongpinTypes;
					}


						/**
						* 获取： 商品类型的值
						*/
						public String getChongwuyongpinValue() {
							return chongwuyongpinValue;
						}
						/**
						* 设置： 商品类型的值
						*/
						public void setChongwuyongpinValue(String chongwuyongpinValue) {
							this.chongwuyongpinValue = chongwuyongpinValue;
						}
					/**
					* 获取： 购买获得积分
					*/
					public Integer getChongwuyongpinPrice() {
						return chongwuyongpinPrice;
					}
					/**
					* 设置： 购买获得积分
					*/
					public void setChongwuyongpinPrice(Integer chongwuyongpinPrice) {
						this.chongwuyongpinPrice = chongwuyongpinPrice;
					}
					/**
					* 获取： 商品库存
					*/
					public Integer getChongwuyongpinKucunNumber() {
						return chongwuyongpinKucunNumber;
					}
					/**
					* 设置： 商品库存
					*/
					public void setChongwuyongpinKucunNumber(Integer chongwuyongpinKucunNumber) {
						this.chongwuyongpinKucunNumber = chongwuyongpinKucunNumber;
					}
					/**
					* 获取： 商品原价
					*/
					public Double getChongwuyongpinOldMoney() {
						return chongwuyongpinOldMoney;
					}
					/**
					* 设置： 商品原价
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
					* 获取： 商品简介
					*/
					public String getChongwuyongpinContent() {
						return chongwuyongpinContent;
					}
					/**
					* 设置： 商品简介
					*/
					public void setChongwuyongpinContent(String chongwuyongpinContent) {
						this.chongwuyongpinContent = chongwuyongpinContent;
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
