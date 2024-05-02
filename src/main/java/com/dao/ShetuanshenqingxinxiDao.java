package com.dao;

import com.entity.ShetuanshenqingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShetuanshenqingxinxiVO;
import com.entity.view.ShetuanshenqingxinxiView;


/**
 * 社团申请信息
 * 
 * @author 
 * @email 
 * @date 2021-04-14 12:26:42
 */
public interface ShetuanshenqingxinxiDao extends BaseMapper<ShetuanshenqingxinxiEntity> {
	
	List<ShetuanshenqingxinxiVO> selectListVO(@Param("ew") Wrapper<ShetuanshenqingxinxiEntity> wrapper);
	
	ShetuanshenqingxinxiVO selectVO(@Param("ew") Wrapper<ShetuanshenqingxinxiEntity> wrapper);
	
	List<ShetuanshenqingxinxiView> selectListView(@Param("ew") Wrapper<ShetuanshenqingxinxiEntity> wrapper);

	List<ShetuanshenqingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShetuanshenqingxinxiEntity> wrapper);
	
	ShetuanshenqingxinxiView selectView(@Param("ew") Wrapper<ShetuanshenqingxinxiEntity> wrapper);
	
}
