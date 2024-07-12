package com.entity.view;

import com.entity.LiulangdongwujiuzhuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 流浪动物救助
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("liulangdongwujiuzhu")
public class LiulangdongwujiuzhuView extends LiulangdongwujiuzhuEntity implements Serializable {
    private static final long serialVersionUID = 1L;




	public LiulangdongwujiuzhuView() {

	}

	public LiulangdongwujiuzhuView(LiulangdongwujiuzhuEntity liulangdongwujiuzhuEntity) {
		try {
			BeanUtils.copyProperties(this, liulangdongwujiuzhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















}
