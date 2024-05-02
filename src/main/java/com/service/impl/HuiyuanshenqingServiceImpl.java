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


import com.dao.HuiyuanshenqingDao;
import com.entity.HuiyuanshenqingEntity;
import com.service.HuiyuanshenqingService;
import com.entity.vo.HuiyuanshenqingVO;
import com.entity.view.HuiyuanshenqingView;

@Service("huiyuanshenqingService")
public class HuiyuanshenqingServiceImpl extends ServiceImpl<HuiyuanshenqingDao, HuiyuanshenqingEntity> implements HuiyuanshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanshenqingEntity> page = this.selectPage(
                new Query<HuiyuanshenqingEntity>(params).getPage(),
                new EntityWrapper<HuiyuanshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanshenqingEntity> wrapper) {
		  Page<HuiyuanshenqingView> page =new Query<HuiyuanshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanshenqingVO> selectListVO(Wrapper<HuiyuanshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanshenqingVO selectVO(Wrapper<HuiyuanshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanshenqingView> selectListView(Wrapper<HuiyuanshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanshenqingView selectView(Wrapper<HuiyuanshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
