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


import com.dao.HuodongcanyuDao;
import com.entity.HuodongcanyuEntity;
import com.service.HuodongcanyuService;
import com.entity.vo.HuodongcanyuVO;
import com.entity.view.HuodongcanyuView;

@Service("huodongcanyuService")
public class HuodongcanyuServiceImpl extends ServiceImpl<HuodongcanyuDao, HuodongcanyuEntity> implements HuodongcanyuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongcanyuEntity> page = this.selectPage(
                new Query<HuodongcanyuEntity>(params).getPage(),
                new EntityWrapper<HuodongcanyuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongcanyuEntity> wrapper) {
		  Page<HuodongcanyuView> page =new Query<HuodongcanyuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuodongcanyuVO> selectListVO(Wrapper<HuodongcanyuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodongcanyuVO selectVO(Wrapper<HuodongcanyuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodongcanyuView> selectListView(Wrapper<HuodongcanyuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongcanyuView selectView(Wrapper<HuodongcanyuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
