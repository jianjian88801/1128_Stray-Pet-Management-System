package com.dao;

import com.entity.LiulangdongwujiuzhuCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LiulangdongwujiuzhuCollectionView;

/**
 * 流浪动物救助收藏 Dao 接口
 *
 * @author 
 */
public interface LiulangdongwujiuzhuCollectionDao extends BaseMapper<LiulangdongwujiuzhuCollectionEntity> {

   List<LiulangdongwujiuzhuCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
