package com.dao;

import com.entity.HuiyuanshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanshenqingVO;
import com.entity.view.HuiyuanshenqingView;


/**
 * 会员申请
 * 
 * @author 
 * @email 
 * @date 2021-04-14 12:26:42
 */
public interface HuiyuanshenqingDao extends BaseMapper<HuiyuanshenqingEntity> {
	
	List<HuiyuanshenqingVO> selectListVO(@Param("ew") Wrapper<HuiyuanshenqingEntity> wrapper);
	
	HuiyuanshenqingVO selectVO(@Param("ew") Wrapper<HuiyuanshenqingEntity> wrapper);
	
	List<HuiyuanshenqingView> selectListView(@Param("ew") Wrapper<HuiyuanshenqingEntity> wrapper);

	List<HuiyuanshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanshenqingEntity> wrapper);
	
	HuiyuanshenqingView selectView(@Param("ew") Wrapper<HuiyuanshenqingEntity> wrapper);
	
}
