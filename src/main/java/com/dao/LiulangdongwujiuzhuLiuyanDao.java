package com.dao;

import com.entity.LiulangdongwujiuzhuLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LiulangdongwujiuzhuLiuyanView;

/**
 * 流浪动物救助留言 Dao 接口
 *
 * @author 
 */
public interface LiulangdongwujiuzhuLiuyanDao extends BaseMapper<LiulangdongwujiuzhuLiuyanEntity> {

   List<LiulangdongwujiuzhuLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
