package com.dao;

import com.entity.XiaoyuanshetuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyuanshetuanVO;
import com.entity.view.XiaoyuanshetuanView;


/**
 * 校园社团
 * 
 * @author 
 * @email 
 * @date 2021-04-14 12:26:42
 */
public interface XiaoyuanshetuanDao extends BaseMapper<XiaoyuanshetuanEntity> {
	
	List<XiaoyuanshetuanVO> selectListVO(@Param("ew") Wrapper<XiaoyuanshetuanEntity> wrapper);
	
	XiaoyuanshetuanVO selectVO(@Param("ew") Wrapper<XiaoyuanshetuanEntity> wrapper);
	
	List<XiaoyuanshetuanView> selectListView(@Param("ew") Wrapper<XiaoyuanshetuanEntity> wrapper);

	List<XiaoyuanshetuanView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyuanshetuanEntity> wrapper);
	
	XiaoyuanshetuanView selectView(@Param("ew") Wrapper<XiaoyuanshetuanEntity> wrapper);
	
}
