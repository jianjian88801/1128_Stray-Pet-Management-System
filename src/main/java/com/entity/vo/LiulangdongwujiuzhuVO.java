package com.entity.vo;

import com.entity.LiulangdongwujiuzhuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 流浪动物救助
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("liulangdongwujiuzhu")
public class LiulangdongwujiuzhuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
