package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 商品
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
    @TableField(value = "id")

    private Integer id;


    /**
     * 商品名称
     */
    @TableField(value = "chongwuyongpin_name")

    private String chongwuyongpinName;


    /**
     * 商品照片
     */
    @TableField(value = "chongwuyongpin_photo")

    private String chongwuyongpinPhoto;


    /**
     * 商品类型
     */
    @TableField(value = "chongwuyongpin_types")

    private Integer chongwuyongpinTypes;


    /**
     * 购买获得积分
     */
    @TableField(value = "chongwuyongpin_price")

    private Integer chongwuyongpinPrice;


    /**
     * 商品库存
     */
    @TableField(value = "chongwuyongpin_kucun_number")

    private Integer chongwuyongpinKucunNumber;


    /**
     * 商品原价
     */
    @TableField(value = "chongwuyongpin_old_money")

    private Double chongwuyongpinOldMoney;


    /**
     * 现价
     */
    @TableField(value = "chongwuyongpin_new_money")

    private Double chongwuyongpinNewMoney;


    /**
     * 点击次数
     */
    @TableField(value = "chongwuyongpin_clicknum")

    private Integer chongwuyongpinClicknum;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "chongwuyongpin_delete")

    private Integer chongwuyongpinDelete;


    /**
     * 商品简介
     */
    @TableField(value = "chongwuyongpin_content")

    private String chongwuyongpinContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：商品名称
	 */
    public String getChongwuyongpinName() {
        return chongwuyongpinName;
    }


    /**
	 * 获取：商品名称
	 */

    public void setChongwuyongpinName(String chongwuyongpinName) {
        this.chongwuyongpinName = chongwuyongpinName;
    }
    /**
	 * 设置：商品照片
	 */
    public String getChongwuyongpinPhoto() {
        return chongwuyongpinPhoto;
    }


    /**
	 * 获取：商品照片
	 */

    public void setChongwuyongpinPhoto(String chongwuyongpinPhoto) {
        this.chongwuyongpinPhoto = chongwuyongpinPhoto;
    }
    /**
	 * 设置：商品类型
	 */
    public Integer getChongwuyongpinTypes() {
        return chongwuyongpinTypes;
    }


    /**
	 * 获取：商品类型
	 */

    public void setChongwuyongpinTypes(Integer chongwuyongpinTypes) {
        this.chongwuyongpinTypes = chongwuyongpinTypes;
    }
    /**
	 * 设置：购买获得积分
	 */
    public Integer getChongwuyongpinPrice() {
        return chongwuyongpinPrice;
    }


    /**
	 * 获取：购买获得积分
	 */

    public void setChongwuyongpinPrice(Integer chongwuyongpinPrice) {
        this.chongwuyongpinPrice = chongwuyongpinPrice;
    }
    /**
	 * 设置：商品库存
	 */
    public Integer getChongwuyongpinKucunNumber() {
        return chongwuyongpinKucunNumber;
    }


    /**
	 * 获取：商品库存
	 */

    public void setChongwuyongpinKucunNumber(Integer chongwuyongpinKucunNumber) {
        this.chongwuyongpinKucunNumber = chongwuyongpinKucunNumber;
    }
    /**
	 * 设置：商品原价
	 */
    public Double getChongwuyongpinOldMoney() {
        return chongwuyongpinOldMoney;
    }


    /**
	 * 获取：商品原价
	 */

    public void setChongwuyongpinOldMoney(Double chongwuyongpinOldMoney) {
        this.chongwuyongpinOldMoney = chongwuyongpinOldMoney;
    }
    /**
	 * 设置：现价
	 */
    public Double getChongwuyongpinNewMoney() {
        return chongwuyongpinNewMoney;
    }


    /**
	 * 获取：现价
	 */

    public void setChongwuyongpinNewMoney(Double chongwuyongpinNewMoney) {
        this.chongwuyongpinNewMoney = chongwuyongpinNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getChongwuyongpinClicknum() {
        return chongwuyongpinClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setChongwuyongpinClicknum(Integer chongwuyongpinClicknum) {
        this.chongwuyongpinClicknum = chongwuyongpinClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getChongwuyongpinDelete() {
        return chongwuyongpinDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setChongwuyongpinDelete(Integer chongwuyongpinDelete) {
        this.chongwuyongpinDelete = chongwuyongpinDelete;
    }
    /**
	 * 设置：商品简介
	 */
    public String getChongwuyongpinContent() {
        return chongwuyongpinContent;
    }


    /**
	 * 获取：商品简介
	 */

    public void setChongwuyongpinContent(String chongwuyongpinContent) {
        this.chongwuyongpinContent = chongwuyongpinContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Chongwuyongpin{" +
            "id=" + id +
            ", chongwuyongpinName=" + chongwuyongpinName +
            ", chongwuyongpinPhoto=" + chongwuyongpinPhoto +
            ", chongwuyongpinTypes=" + chongwuyongpinTypes +
            ", chongwuyongpinPrice=" + chongwuyongpinPrice +
            ", chongwuyongpinKucunNumber=" + chongwuyongpinKucunNumber +
            ", chongwuyongpinOldMoney=" + chongwuyongpinOldMoney +
            ", chongwuyongpinNewMoney=" + chongwuyongpinNewMoney +
            ", chongwuyongpinClicknum=" + chongwuyongpinClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", chongwuyongpinDelete=" + chongwuyongpinDelete +
            ", chongwuyongpinContent=" + chongwuyongpinContent +
            ", createTime=" + createTime +
        "}";
    }
}
