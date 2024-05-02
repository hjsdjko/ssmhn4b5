package com.entity.view;

import com.entity.HuodongcanyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 活动参与
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 12:26:42
 */
@TableName("huodongcanyu")
public class HuodongcanyuView  extends HuodongcanyuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuodongcanyuView(){
	}
 
 	public HuodongcanyuView(HuodongcanyuEntity huodongcanyuEntity){
 	try {
			BeanUtils.copyProperties(this, huodongcanyuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
