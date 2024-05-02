package com.entity.view;

import com.entity.XiaoyuanshetuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校园社团
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 12:26:42
 */
@TableName("xiaoyuanshetuan")
public class XiaoyuanshetuanView  extends XiaoyuanshetuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyuanshetuanView(){
	}
 
 	public XiaoyuanshetuanView(XiaoyuanshetuanEntity xiaoyuanshetuanEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyuanshetuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
