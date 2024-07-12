package com.entity.model;

import com.entity.LiulangdongwujiuzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 流浪动物救助
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LiulangdongwujiuzhuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
	 * 获取：救助标题
	 */
    public String getLiulangdongwujiuzhuName() {
        return liulangdongwujiuzhuName;
    }


    /**
	 * 设置：救助标题
	 */
    public void setLiulangdongwujiuzhuName(String liulangdongwujiuzhuName) {
        this.liulangdongwujiuzhuName = liulangdongwujiuzhuName;
    }
    /**
	 * 获取：现场图片
	 */
    public String getLiulangdongwujiuzhuPhoto() {
        return liulangdongwujiuzhuPhoto;
    }


    /**
	 * 设置：现场图片
	 */
    public void setLiulangdongwujiuzhuPhoto(String liulangdongwujiuzhuPhoto) {
        this.liulangdongwujiuzhuPhoto = liulangdongwujiuzhuPhoto;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getLiulangdongwujiuzhuClicknum() {
        return liulangdongwujiuzhuClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setLiulangdongwujiuzhuClicknum(Integer liulangdongwujiuzhuClicknum) {
        this.liulangdongwujiuzhuClicknum = liulangdongwujiuzhuClicknum;
    }
    /**
	 * 获取：救助过程简介
	 */
    public String getLiulangdongwujiuzhuContent() {
        return liulangdongwujiuzhuContent;
    }


    /**
	 * 设置：救助过程简介
	 */
    public void setLiulangdongwujiuzhuContent(String liulangdongwujiuzhuContent) {
        this.liulangdongwujiuzhuContent = liulangdongwujiuzhuContent;
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
