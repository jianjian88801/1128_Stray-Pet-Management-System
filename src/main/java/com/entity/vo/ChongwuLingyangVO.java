package com.entity.vo;

import com.entity.ChongwuLingyangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 流浪宠物领养
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chongwu_lingyang")
public class ChongwuLingyangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
