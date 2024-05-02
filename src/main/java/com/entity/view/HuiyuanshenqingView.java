package com.entity.view;

import com.entity.HuiyuanshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 12:26:42
 */
@TableName("huiyuanshenqing")
public class HuiyuanshenqingView  extends HuiyuanshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuanshenqingView(){
	}
 
 	public HuiyuanshenqingView(HuiyuanshenqingEntity huiyuanshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuanshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
