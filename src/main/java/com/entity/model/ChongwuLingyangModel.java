package com.entity.model;

import com.entity.ChongwuLingyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 流浪宠物领养
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChongwuLingyangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 宠物
     */
    private Integer chongwuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 申请理由
     */
    private String chongwuText;


    /**
     * 审核状态
     */
    private Integer chongwuLingyangYesnoTypes;


    /**
     * 审核原因
     */
    private String chongwuLingyangYesnoText;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：宠物
	 */
    public Integer getChongwuId() {
        return chongwuId;
    }


    /**
	 * 设置：宠物
	 */
    public void setChongwuId(Integer chongwuId) {
        this.chongwuId = chongwuId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：申请理由
	 */
    public String getChongwuText() {
        return chongwuText;
    }


    /**
	 * 设置：申请理由
	 */
    public void setChongwuText(String chongwuText) {
        this.chongwuText = chongwuText;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getChongwuLingyangYesnoTypes() {
        return chongwuLingyangYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setChongwuLingyangYesnoTypes(Integer chongwuLingyangYesnoTypes) {
        this.chongwuLingyangYesnoTypes = chongwuLingyangYesnoTypes;
    }
    /**
	 * 获取：审核原因
	 */
    public String getChongwuLingyangYesnoText() {
        return chongwuLingyangYesnoText;
    }


    /**
	 * 设置：审核原因
	 */
    public void setChongwuLingyangYesnoText(String chongwuLingyangYesnoText) {
        this.chongwuLingyangYesnoText = chongwuLingyangYesnoText;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
