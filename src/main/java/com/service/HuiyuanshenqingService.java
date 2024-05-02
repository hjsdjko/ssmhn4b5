package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanshenqingView;


/**
 * 会员申请
 *
 * @author 
 * @email 
 * @date 2021-04-14 12:26:42
 */
public interface HuiyuanshenqingService extends IService<HuiyuanshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanshenqingVO> selectListVO(Wrapper<HuiyuanshenqingEntity> wrapper);
   	
   	HuiyuanshenqingVO selectVO(@Param("ew") Wrapper<HuiyuanshenqingEntity> wrapper);
   	
   	List<HuiyuanshenqingView> selectListView(Wrapper<HuiyuanshenqingEntity> wrapper);
   	
   	HuiyuanshenqingView selectView(@Param("ew") Wrapper<HuiyuanshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanshenqingEntity> wrapper);
   	
}

