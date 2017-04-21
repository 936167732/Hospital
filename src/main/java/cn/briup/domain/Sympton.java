package cn.briup.domain;

import java.util.Date;

public class Sympton {
//	主键
	private int sid;
//	症状表主键
	private String sindex;
//	症状
	private String scontext;
//	发布时间
	private Date stime;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSindex() {
		return sindex;
	}
	public void setSindex(String sindex) {
		this.sindex = sindex;
	}
	public String getScontext() {
		return scontext;
	}
	public void setScontext(String scontext) {
		this.scontext = scontext;
	}
	public Date getStime() {
		return stime;
	}
	public void setStime(Date stime) {
		this.stime = stime;
	}
	@Override
	public String toString() {
		return "Sympton [sid=" + sid + ", sindex=" + sindex + ", scontext=" + scontext + ", stime=" + stime + "]";
	}
	
}
