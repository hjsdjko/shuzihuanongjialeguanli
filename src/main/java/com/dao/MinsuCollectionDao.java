package com.dao;

import com.entity.MinsuCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MinsuCollectionView;

/**
 * 客房收藏 Dao 接口
 *
 * @author 
 */
public interface MinsuCollectionDao extends BaseMapper<MinsuCollectionEntity> {

   List<MinsuCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
