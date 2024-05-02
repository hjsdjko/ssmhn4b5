package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiaoyuanshetuanDao;
import com.entity.XiaoyuanshetuanEntity;
import com.service.XiaoyuanshetuanService;
import com.entity.vo.XiaoyuanshetuanVO;
import com.entity.view.XiaoyuanshetuanView;

@Service("xiaoyuanshetuanService")
public class XiaoyuanshetuanServiceImpl extends ServiceImpl<XiaoyuanshetuanDao, XiaoyuanshetuanEntity> implements XiaoyuanshetuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyuanshetuanEntity> page = this.selectPage(
                new Query<XiaoyuanshetuanEntity>(params).getPage(),
                new EntityWrapper<XiaoyuanshetuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyuanshetuanEntity> wrapper) {
		  Page<XiaoyuanshetuanView> page =new Query<XiaoyuanshetuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyuanshetuanVO> selectListVO(Wrapper<XiaoyuanshetuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyuanshetuanVO selectVO(Wrapper<XiaoyuanshetuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyuanshetuanView> selectListView(Wrapper<XiaoyuanshetuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyuanshetuanView selectView(Wrapper<XiaoyuanshetuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
