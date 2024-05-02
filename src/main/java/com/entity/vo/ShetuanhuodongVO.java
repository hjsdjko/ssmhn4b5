package com.entity.vo;

import com.entity.ShetuanhuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 社团活动
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 12:26:42
 */
public class ShetuanhuodongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 活动类型
	 */
	
	private String huodongleixing;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 举办日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jubanriqi;
		
	/**
	 * 举办社团
	 */
	
	private String jubanshetuan;
		
	/**
	 * 活动地点
	 */
	
	private String huodongdidian;
		
	/**
	 * 活动时长
	 */
	
	private Integer huodongshizhang;
		
	/**
	 * 活动内容
	 */
	
	private String huodongneirong;
				
	
	/**
	 * 设置：活动类型
	 */
	 
	public void setHuodongleixing(String huodongleixing) {
		this.huodongleixing = huodongleixing;
	}
	
	/**
	 * 获取：活动类型
	 */
	public String getHuodongleixing() {
		return huodongleixing;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：举办日期
	 */
	 
	public void setJubanriqi(Date jubanriqi) {
		this.jubanriqi = jubanriqi;
	}
	
	/**
	 * 获取：举办日期
	 */
	public Date getJubanriqi() {
		return jubanriqi;
	}
				
	
	/**
	 * 设置：举办社团
	 */
	 
	public void setJubanshetuan(String jubanshetuan) {
		this.jubanshetuan = jubanshetuan;
	}
	
	/**
	 * 获取：举办社团
	 */
	public String getJubanshetuan() {
		return jubanshetuan;
	}
				
	
	/**
	 * 设置：活动地点
	 */
	 
	public void setHuodongdidian(String huodongdidian) {
		this.huodongdidian = huodongdidian;
	}
	
	/**
	 * 获取：活动地点
	 */
	public String getHuodongdidian() {
		return huodongdidian;
	}
				
	
	/**
	 * 设置：活动时长
	 */
	 
	public void setHuodongshizhang(Integer huodongshizhang) {
		this.huodongshizhang = huodongshizhang;
	}
	
	/**
	 * 获取：活动时长
	 */
	public Integer getHuodongshizhang() {
		return huodongshizhang;
	}
				
	
	/**
	 * 设置：活动内容
	 */
	 
	public void setHuodongneirong(String huodongneirong) {
		this.huodongneirong = huodongneirong;
	}
	
	/**
	 * 获取：活动内容
	 */
	public String getHuodongneirong() {
		return huodongneirong;
	}
			
}
