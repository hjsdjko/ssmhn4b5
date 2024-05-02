package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShetuanshenqingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShetuanshenqingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShetuanshenqingxinxiView;


/**
 * 社团申请信息
 *
 * @author 
 * @email 
 * @date 2021-04-14 12:26:42
 */
public interface ShetuanshenqingxinxiService extends IService<ShetuanshenqingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShetuanshenqingxinxiVO> selectListVO(Wrapper<ShetuanshenqingxinxiEntity> wrapper);
   	
   	ShetuanshenqingxinxiVO selectVO(@Param("ew") Wrapper<ShetuanshenqingxinxiEntity> wrapper);
   	
   	List<ShetuanshenqingxinxiView> selectListView(Wrapper<ShetuanshenqingxinxiEntity> wrapper);
   	
   	ShetuanshenqingxinxiView selectView(@Param("ew") Wrapper<ShetuanshenqingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShetuanshenqingxinxiEntity> wrapper);
   	
}

