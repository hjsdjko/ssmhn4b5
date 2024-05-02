package com.dao;

import com.entity.HuodongcanyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongcanyuVO;
import com.entity.view.HuodongcanyuView;


/**
 * 活动参与
 * 
 * @author 
 * @email 
 * @date 2021-04-14 12:26:42
 */
public interface HuodongcanyuDao extends BaseMapper<HuodongcanyuEntity> {
	
	List<HuodongcanyuVO> selectListVO(@Param("ew") Wrapper<HuodongcanyuEntity> wrapper);
	
	HuodongcanyuVO selectVO(@Param("ew") Wrapper<HuodongcanyuEntity> wrapper);
	
	List<HuodongcanyuView> selectListView(@Param("ew") Wrapper<HuodongcanyuEntity> wrapper);

	List<HuodongcanyuView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongcanyuEntity> wrapper);
	
	HuodongcanyuView selectView(@Param("ew") Wrapper<HuodongcanyuEntity> wrapper);
	
}
