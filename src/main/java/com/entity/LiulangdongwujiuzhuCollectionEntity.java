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
 * 流浪动物救助收藏
 *
 * @author 
 * @email
 */
@TableName("liulangdongwujiuzhu_collection")
public class LiulangdongwujiuzhuCollectionEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LiulangdongwujiuzhuCollectionEntity() {

	}

	public LiulangdongwujiuzhuCollectionEntity(T t) {
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
     * 流浪动物救助
     */
    @TableField(value = "liulangdongwujiuzhu_id")

    private Integer liulangdongwujiuzhuId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 类型
     */
    @TableField(value = "liulangdongwujiuzhu_collection_types")

    private Integer liulangdongwujiuzhuCollectionTypes;


    /**
     * 收藏时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：流浪动物救助
	 */
    public Integer getLiulangdongwujiuzhuId() {
        return liulangdongwujiuzhuId;
    }


    /**
	 * 获取：流浪动物救助
	 */

    public void setLiulangdongwujiuzhuId(Integer liulangdongwujiuzhuId) {
        this.liulangdongwujiuzhuId = liulangdongwujiuzhuId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：类型
	 */
    public Integer getLiulangdongwujiuzhuCollectionTypes() {
        return liulangdongwujiuzhuCollectionTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setLiulangdongwujiuzhuCollectionTypes(Integer liulangdongwujiuzhuCollectionTypes) {
        this.liulangdongwujiuzhuCollectionTypes = liulangdongwujiuzhuCollectionTypes;
    }
    /**
	 * 设置：收藏时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：收藏时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "LiulangdongwujiuzhuCollection{" +
            "id=" + id +
            ", liulangdongwujiuzhuId=" + liulangdongwujiuzhuId +
            ", yonghuId=" + yonghuId +
            ", liulangdongwujiuzhuCollectionTypes=" + liulangdongwujiuzhuCollectionTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
