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
 * 流浪动物救助
 *
 * @author 
 * @email
 */
@TableName("liulangdongwujiuzhu")
public class LiulangdongwujiuzhuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LiulangdongwujiuzhuEntity() {

	}

	public LiulangdongwujiuzhuEntity(T t) {
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
     * 救助标题
     */
    @TableField(value = "liulangdongwujiuzhu_name")

    private String liulangdongwujiuzhuName;


    /**
     * 现场图片
     */
    @TableField(value = "liulangdongwujiuzhu_photo")

    private String liulangdongwujiuzhuPhoto;


    /**
     * 赞
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 点击次数
     */
    @TableField(value = "liulangdongwujiuzhu_clicknum")

    private Integer liulangdongwujiuzhuClicknum;


    /**
     * 救助过程简介
     */
    @TableField(value = "liulangdongwujiuzhu_content")

    private String liulangdongwujiuzhuContent;


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
	 * 设置：救助标题
	 */
    public String getLiulangdongwujiuzhuName() {
        return liulangdongwujiuzhuName;
    }


    /**
	 * 获取：救助标题
	 */

    public void setLiulangdongwujiuzhuName(String liulangdongwujiuzhuName) {
        this.liulangdongwujiuzhuName = liulangdongwujiuzhuName;
    }
    /**
	 * 设置：现场图片
	 */
    public String getLiulangdongwujiuzhuPhoto() {
        return liulangdongwujiuzhuPhoto;
    }


    /**
	 * 获取：现场图片
	 */

    public void setLiulangdongwujiuzhuPhoto(String liulangdongwujiuzhuPhoto) {
        this.liulangdongwujiuzhuPhoto = liulangdongwujiuzhuPhoto;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getLiulangdongwujiuzhuClicknum() {
        return liulangdongwujiuzhuClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setLiulangdongwujiuzhuClicknum(Integer liulangdongwujiuzhuClicknum) {
        this.liulangdongwujiuzhuClicknum = liulangdongwujiuzhuClicknum;
    }
    /**
	 * 设置：救助过程简介
	 */
    public String getLiulangdongwujiuzhuContent() {
        return liulangdongwujiuzhuContent;
    }


    /**
	 * 获取：救助过程简介
	 */

    public void setLiulangdongwujiuzhuContent(String liulangdongwujiuzhuContent) {
        this.liulangdongwujiuzhuContent = liulangdongwujiuzhuContent;
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
        return "Liulangdongwujiuzhu{" +
            "id=" + id +
            ", liulangdongwujiuzhuName=" + liulangdongwujiuzhuName +
            ", liulangdongwujiuzhuPhoto=" + liulangdongwujiuzhuPhoto +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", liulangdongwujiuzhuClicknum=" + liulangdongwujiuzhuClicknum +
            ", liulangdongwujiuzhuContent=" + liulangdongwujiuzhuContent +
            ", createTime=" + createTime +
        "}";
    }
}
