package com.entity.model;

import com.entity.XiaoyuanshetuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 校园社团
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-14 12:26:42
 */
public class XiaoyuanshetuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 社团图片
	 */
	
	private String shetuantupian;
		
	/**
	 * 成立时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chenglishijian;
		
	/**
	 * 社团类别
	 */
	
	private String shetuanleibie;
		
	/**
	 * 社团人数
	 */
	
	private Integer shetuanrenshu;
		
	/**
	 * 社团介绍
	 */
	
	private String shetuanjieshao;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
				
	
	/**
	 * 设置：社团图片
	 */
	 
	public void setShetuantupian(String shetuantupian) {
		this.shetuantupian = shetuantupian;
	}
	
	/**
	 * 获取：社团图片
	 */
	public String getShetuantupian() {
		return shetuantupian;
	}
				
	
	/**
	 * 设置：成立时间
	 */
	 
	public void setChenglishijian(Date chenglishijian) {
		this.chenglishijian = chenglishijian;
	}
	
	/**
	 * 获取：成立时间
	 */
	public Date getChenglishijian() {
		return chenglishijian;
	}
				
	
	/**
	 * 设置：社团类别
	 */
	 
	public void setShetuanleibie(String shetuanleibie) {
		this.shetuanleibie = shetuanleibie;
	}
	
	/**
	 * 获取：社团类别
	 */
	public String getShetuanleibie() {
		return shetuanleibie;
	}
				
	
	/**
	 * 设置：社团人数
	 */
	 
	public void setShetuanrenshu(Integer shetuanrenshu) {
		this.shetuanrenshu = shetuanrenshu;
	}
	
	/**
	 * 获取：社团人数
	 */
	public Integer getShetuanrenshu() {
		return shetuanrenshu;
	}
				
	
	/**
	 * 设置：社团介绍
	 */
	 
	public void setShetuanjieshao(String shetuanjieshao) {
		this.shetuanjieshao = shetuanjieshao;
	}
	
	/**
	 * 获取：社团介绍
	 */
	public String getShetuanjieshao() {
		return shetuanjieshao;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
			
}
