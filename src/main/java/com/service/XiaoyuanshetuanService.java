package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyuanshetuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyuanshetuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuanshetuanView;


/**
 * 校园社团
 *
 * @author 
 * @email 
 * @date 2021-04-14 12:26:42
 */
public interface XiaoyuanshetuanService extends IService<XiaoyuanshetuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyuanshetuanVO> selectListVO(Wrapper<XiaoyuanshetuanEntity> wrapper);
   	
   	XiaoyuanshetuanVO selectVO(@Param("ew") Wrapper<XiaoyuanshetuanEntity> wrapper);
   	
   	List<XiaoyuanshetuanView> selectListView(Wrapper<XiaoyuanshetuanEntity> wrapper);
   	
   	XiaoyuanshetuanView selectView(@Param("ew") Wrapper<XiaoyuanshetuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyuanshetuanEntity> wrapper);
   	
}

