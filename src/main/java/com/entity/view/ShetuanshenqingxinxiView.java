package com.entity.view;

import com.entity.ShetuanshenqingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社团申请信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 12:26:42
 */
@TableName("shetuanshenqingxinxi")
public class ShetuanshenqingxinxiView  extends ShetuanshenqingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShetuanshenqingxinxiView(){
	}
 
 	public ShetuanshenqingxinxiView(ShetuanshenqingxinxiEntity shetuanshenqingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shetuanshenqingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
