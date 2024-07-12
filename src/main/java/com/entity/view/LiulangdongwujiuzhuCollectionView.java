package com.entity.view;

import com.entity.LiulangdongwujiuzhuCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 流浪动物救助收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("liulangdongwujiuzhu_collection")
public class LiulangdongwujiuzhuCollectionView extends LiulangdongwujiuzhuCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String liulangdongwujiuzhuCollectionValue;



		//级联表 liulangdongwujiuzhu
			/**
			* 救助标题
			*/
			private String liulangdongwujiuzhuName;
			/**
			* 现场图片
			*/
			private String liulangdongwujiuzhuPhoto;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 点击次数
			*/
			private Integer liulangdongwujiuzhuClicknum;
			/**
			* 救助过程简介
			*/
			private String liulangdongwujiuzhuContent;

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

	public LiulangdongwujiuzhuCollectionView() {

	}

	public LiulangdongwujiuzhuCollectionView(LiulangdongwujiuzhuCollectionEntity liulangdongwujiuzhuCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, liulangdongwujiuzhuCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getLiulangdongwujiuzhuCollectionValue() {
				return liulangdongwujiuzhuCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setLiulangdongwujiuzhuCollectionValue(String liulangdongwujiuzhuCollectionValue) {
				this.liulangdongwujiuzhuCollectionValue = liulangdongwujiuzhuCollectionValue;
			}




























				//级联表的get和set liulangdongwujiuzhu
					/**
					* 获取： 救助标题
					*/
					public String getLiulangdongwujiuzhuName() {
						return liulangdongwujiuzhuName;
					}
					/**
					* 设置： 救助标题
					*/
					public void setLiulangdongwujiuzhuName(String liulangdongwujiuzhuName) {
						this.liulangdongwujiuzhuName = liulangdongwujiuzhuName;
					}
					/**
					* 获取： 现场图片
					*/
					public String getLiulangdongwujiuzhuPhoto() {
						return liulangdongwujiuzhuPhoto;
					}
					/**
					* 设置： 现场图片
					*/
					public void setLiulangdongwujiuzhuPhoto(String liulangdongwujiuzhuPhoto) {
						this.liulangdongwujiuzhuPhoto = liulangdongwujiuzhuPhoto;
					}
					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}
					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getLiulangdongwujiuzhuClicknum() {
						return liulangdongwujiuzhuClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setLiulangdongwujiuzhuClicknum(Integer liulangdongwujiuzhuClicknum) {
						this.liulangdongwujiuzhuClicknum = liulangdongwujiuzhuClicknum;
					}
					/**
					* 获取： 救助过程简介
					*/
					public String getLiulangdongwujiuzhuContent() {
						return liulangdongwujiuzhuContent;
					}
					/**
					* 设置： 救助过程简介
					*/
					public void setLiulangdongwujiuzhuContent(String liulangdongwujiuzhuContent) {
						this.liulangdongwujiuzhuContent = liulangdongwujiuzhuContent;
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
