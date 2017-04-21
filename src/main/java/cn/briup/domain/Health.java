package cn.briup.domain;

import java.util.Date;

/**
 * 养生之道文章 
 */
public class Health {
	private int h_id; //id
	private String h_title; //标题, 不能为空
	private String h_content; //内容
	private String h_image; //图片链接
	private Date h_releaseTime; //发布时间
	public int getH_id() {
		return h_id;
	}
	public void setH_id(int h_id) {
		this.h_id = h_id;
	}
	public String getH_title() {
		return h_title;
	}
	public void setH_title(String h_title) {
		this.h_title = h_title;
	}
	public String getH_content() {
		return h_content;
	}
	public void setH_content(String h_content) {
		this.h_content = h_content;
	}
	public String getH_image() {
		return h_image;
	}
	public void setH_image(String h_image) {
		this.h_image = h_image;
	}
	public Date getH_releaseTime() {
		return h_releaseTime;
	}
	public void setH_releaseTime(Date h_releaseTime) {
		this.h_releaseTime = h_releaseTime;
	}
	

}
