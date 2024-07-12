package com.entity.model;

import com.entity.ChongwuyongpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商品
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChongwuyongpinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 逻辑删除
     */
    private Integer chongwuyongpinDelete;


    /**
     * 商品简介
     */
    private String chongwuyongpinContent;


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
	 * 获取：商品名称
	 */
    public String getChongwuyongpinName() {
        return chongwuyongpinName;
    }


    /**
	 * 设置：商品名称
	 */
    public void setChongwuyongpinName(String chongwuyongpinName) {
        this.chongwuyongpinName = chongwuyongpinName;
    }
    /**
	 * 获取：商品照片
	 */
    public String getChongwuyongpinPhoto() {
        return chongwuyongpinPhoto;
    }


    /**
	 * 设置：商品照片
	 */
    public void setChongwuyongpinPhoto(String chongwuyongpinPhoto) {
        this.chongwuyongpinPhoto = chongwuyongpinPhoto;
    }
    /**
	 * 获取：商品类型
	 */
    public Integer getChongwuyongpinTypes() {
        return chongwuyongpinTypes;
    }


    /**
	 * 设置：商品类型
	 */
    public void setChongwuyongpinTypes(Integer chongwuyongpinTypes) {
        this.chongwuyongpinTypes = chongwuyongpinTypes;
    }
    /**
	 * 获取：购买获得积分
	 */
    public Integer getChongwuyongpinPrice() {
        return chongwuyongpinPrice;
    }


    /**
	 * 设置：购买获得积分
	 */
    public void setChongwuyongpinPrice(Integer chongwuyongpinPrice) {
        this.chongwuyongpinPrice = chongwuyongpinPrice;
    }
    /**
	 * 获取：商品库存
	 */
    public Integer getChongwuyongpinKucunNumber() {
        return chongwuyongpinKucunNumber;
    }


    /**
	 * 设置：商品库存
	 */
    public void setChongwuyongpinKucunNumber(Integer chongwuyongpinKucunNumber) {
        this.chongwuyongpinKucunNumber = chongwuyongpinKucunNumber;
    }
    /**
	 * 获取：商品原价
	 */
    public Double getChongwuyongpinOldMoney() {
        return chongwuyongpinOldMoney;
    }


    /**
	 * 设置：商品原价
	 */
    public void setChongwuyongpinOldMoney(Double chongwuyongpinOldMoney) {
        this.chongwuyongpinOldMoney = chongwuyongpinOldMoney;
    }
    /**
	 * 获取：现价
	 */
    public Double getChongwuyongpinNewMoney() {
        return chongwuyongpinNewMoney;
    }


    /**
	 * 设置：现价
	 */
    public void setChongwuyongpinNewMoney(Double chongwuyongpinNewMoney) {
        this.chongwuyongpinNewMoney = chongwuyongpinNewMoney;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getChongwuyongpinClicknum() {
        return chongwuyongpinClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setChongwuyongpinClicknum(Integer chongwuyongpinClicknum) {
        this.chongwuyongpinClicknum = chongwuyongpinClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getChongwuyongpinDelete() {
        return chongwuyongpinDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setChongwuyongpinDelete(Integer chongwuyongpinDelete) {
        this.chongwuyongpinDelete = chongwuyongpinDelete;
    }
    /**
	 * 获取：商品简介
	 */
    public String getChongwuyongpinContent() {
        return chongwuyongpinContent;
    }


    /**
	 * 设置：商品简介
	 */
    public void setChongwuyongpinContent(String chongwuyongpinContent) {
        this.chongwuyongpinContent = chongwuyongpinContent;
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
