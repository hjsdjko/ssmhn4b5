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


import com.dao.ShetuanshenqingxinxiDao;
import com.entity.ShetuanshenqingxinxiEntity;
import com.service.ShetuanshenqingxinxiService;
import com.entity.vo.ShetuanshenqingxinxiVO;
import com.entity.view.ShetuanshenqingxinxiView;

@Service("shetuanshenqingxinxiService")
public class ShetuanshenqingxinxiServiceImpl extends ServiceImpl<ShetuanshenqingxinxiDao, ShetuanshenqingxinxiEntity> implements ShetuanshenqingxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShetuanshenqingxinxiEntity> page = this.selectPage(
                new Query<ShetuanshenqingxinxiEntity>(params).getPage(),
                new EntityWrapper<ShetuanshenqingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanshenqingxinxiEntity> wrapper) {
		  Page<ShetuanshenqingxinxiView> page =new Query<ShetuanshenqingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShetuanshenqingxinxiVO> selectListVO(Wrapper<ShetuanshenqingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShetuanshenqingxinxiVO selectVO(Wrapper<ShetuanshenqingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShetuanshenqingxinxiView> selectListView(Wrapper<ShetuanshenqingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShetuanshenqingxinxiView selectView(Wrapper<ShetuanshenqingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
