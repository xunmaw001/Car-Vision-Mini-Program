package com.entity.model;

import com.entity.QichexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 汽车信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-06-08 10:11:38
 */
public class QichexinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 汽车类型
	 */
	
	private String qicheleixing;
		
	/**
	 * 汽车品牌
	 */
	
	private String qichepinpai;
		
	/**
	 * 汽车颜色
	 */
	
	private String qicheyanse;
		
	/**
	 * 汽车图片
	 */
	
	private String qichetupian;
		
	/**
	 * 天窗
	 */
	
	private String tianchuang;
		
	/**
	 * 换挡方式
	 */
	
	private String huandangfangshi;
		
	/**
	 * 座位
	 */
	
	private String zuowei;
		
	/**
	 * 汽车排量
	 */
	
	private String qichepailiang;
		
	/**
	 * 上市年份
	 */
	
	private String shangshinianfen;
		
	/**
	 * 价格
	 */
	
	private String jiage;
		
	/**
	 * 汽车详情
	 */
	
	private String qichexiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：汽车类型
	 */
	 
	public void setQicheleixing(String qicheleixing) {
		this.qicheleixing = qicheleixing;
	}
	
	/**
	 * 获取：汽车类型
	 */
	public String getQicheleixing() {
		return qicheleixing;
	}
				
	
	/**
	 * 设置：汽车品牌
	 */
	 
	public void setQichepinpai(String qichepinpai) {
		this.qichepinpai = qichepinpai;
	}
	
	/**
	 * 获取：汽车品牌
	 */
	public String getQichepinpai() {
		return qichepinpai;
	}
				
	
	/**
	 * 设置：汽车颜色
	 */
	 
	public void setQicheyanse(String qicheyanse) {
		this.qicheyanse = qicheyanse;
	}
	
	/**
	 * 获取：汽车颜色
	 */
	public String getQicheyanse() {
		return qicheyanse;
	}
				
	
	/**
	 * 设置：汽车图片
	 */
	 
	public void setQichetupian(String qichetupian) {
		this.qichetupian = qichetupian;
	}
	
	/**
	 * 获取：汽车图片
	 */
	public String getQichetupian() {
		return qichetupian;
	}
				
	
	/**
	 * 设置：天窗
	 */
	 
	public void setTianchuang(String tianchuang) {
		this.tianchuang = tianchuang;
	}
	
	/**
	 * 获取：天窗
	 */
	public String getTianchuang() {
		return tianchuang;
	}
				
	
	/**
	 * 设置：换挡方式
	 */
	 
	public void setHuandangfangshi(String huandangfangshi) {
		this.huandangfangshi = huandangfangshi;
	}
	
	/**
	 * 获取：换挡方式
	 */
	public String getHuandangfangshi() {
		return huandangfangshi;
	}
				
	
	/**
	 * 设置：座位
	 */
	 
	public void setZuowei(String zuowei) {
		this.zuowei = zuowei;
	}
	
	/**
	 * 获取：座位
	 */
	public String getZuowei() {
		return zuowei;
	}
				
	
	/**
	 * 设置：汽车排量
	 */
	 
	public void setQichepailiang(String qichepailiang) {
		this.qichepailiang = qichepailiang;
	}
	
	/**
	 * 获取：汽车排量
	 */
	public String getQichepailiang() {
		return qichepailiang;
	}
				
	
	/**
	 * 设置：上市年份
	 */
	 
	public void setShangshinianfen(String shangshinianfen) {
		this.shangshinianfen = shangshinianfen;
	}
	
	/**
	 * 获取：上市年份
	 */
	public String getShangshinianfen() {
		return shangshinianfen;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(String jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public String getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：汽车详情
	 */
	 
	public void setQichexiangqing(String qichexiangqing) {
		this.qichexiangqing = qichexiangqing;
	}
	
	/**
	 * 获取：汽车详情
	 */
	public String getQichexiangqing() {
		return qichexiangqing;
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
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
