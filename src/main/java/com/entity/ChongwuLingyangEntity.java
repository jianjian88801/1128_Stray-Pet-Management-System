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
 * 流浪宠物领养
 *
 * @author 
 * @email
 */
@TableName("chongwu_lingyang")
public class ChongwuLingyangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChongwuLingyangEntity() {

	}

	public ChongwuLingyangEntity(T t) {
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
     * 宠物
     */
    @TableField(value = "chongwu_id")

    private Integer chongwuId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 申请理由
     */
    @TableField(value = "chongwu_text")

    private String chongwuText;


    /**
     * 审核状态
     */
    @TableField(value = "chongwu_lingyang_yesno_types")

    private Integer chongwuLingyangYesnoTypes;


    /**
     * 审核原因
     */
    @TableField(value = "chongwu_lingyang_yesno_text")

    private String chongwuLingyangYesnoText;


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
	 * 设置：宠物
	 */
    public Integer getChongwuId() {
        return chongwuId;
    }


    /**
	 * 获取：宠物
	 */

    public void setChongwuId(Integer chongwuId) {
        this.chongwuId = chongwuId;
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
	 * 设置：申请理由
	 */
    public String getChongwuText() {
        return chongwuText;
    }


    /**
	 * 获取：申请理由
	 */

    public void setChongwuText(String chongwuText) {
        this.chongwuText = chongwuText;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getChongwuLingyangYesnoTypes() {
        return chongwuLingyangYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setChongwuLingyangYesnoTypes(Integer chongwuLingyangYesnoTypes) {
        this.chongwuLingyangYesnoTypes = chongwuLingyangYesnoTypes;
    }
    /**
	 * 设置：审核原因
	 */
    public String getChongwuLingyangYesnoText() {
        return chongwuLingyangYesnoText;
    }


    /**
	 * 获取：审核原因
	 */

    public void setChongwuLingyangYesnoText(String chongwuLingyangYesnoText) {
        this.chongwuLingyangYesnoText = chongwuLingyangYesnoText;
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
        return "ChongwuLingyang{" +
            "id=" + id +
            ", chongwuId=" + chongwuId +
            ", yonghuId=" + yonghuId +
            ", chongwuText=" + chongwuText +
            ", chongwuLingyangYesnoTypes=" + chongwuLingyangYesnoTypes +
            ", chongwuLingyangYesnoText=" + chongwuLingyangYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
