package com.dao;

import com.entity.ChongwuLingyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuLingyangView;

/**
 * 流浪宠物领养 Dao 接口
 *
 * @author 
 */
public interface ChongwuLingyangDao extends BaseMapper<ChongwuLingyangEntity> {

   List<ChongwuLingyangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
