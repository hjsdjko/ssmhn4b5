package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongcanyuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongcanyuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongcanyuView;


/**
 * 活动参与
 *
 * @author 
 * @email 
 * @date 2021-04-14 12:26:42
 */
public interface HuodongcanyuService extends IService<HuodongcanyuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongcanyuVO> selectListVO(Wrapper<HuodongcanyuEntity> wrapper);
   	
   	HuodongcanyuVO selectVO(@Param("ew") Wrapper<HuodongcanyuEntity> wrapper);
   	
   	List<HuodongcanyuView> selectListView(Wrapper<HuodongcanyuEntity> wrapper);
   	
   	HuodongcanyuView selectView(@Param("ew") Wrapper<HuodongcanyuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongcanyuEntity> wrapper);
   	
}

