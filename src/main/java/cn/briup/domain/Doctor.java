package cn.briup.domain;

public class Doctor {
//	主键
	private int did;
//	姓名
	private String dname;
//	手机号码
	private String dphonenum;
//	职称
	private String dtitle;
//	类型
	private String dclassifiction;
//	介绍
	private String introduce;
//	擅长
	private String dmajor;
//	学历
	private String degree;
//	密码
	private String password;
//	性别
	private String dsex;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDphonenum() {
		return dphonenum;
	}

	public void setDphonenum(String dphonenum) {
		this.dphonenum = dphonenum;
	}

	public String getDtitle() {
		return dtitle;
	}

	public void setDtitle(String dtitle) {
		this.dtitle = dtitle;
	}

	public String getDclassifiction() {
		return dclassifiction;
	}

	public void setDclassifiction(String dclassifiction) {
		this.dclassifiction = dclassifiction;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getDmajor() {
		return dmajor;
	}

	public void setDmajor(String dmajor) {
		this.dmajor = dmajor;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDsex() {
		return dsex;
	}

	public void setDsex(String dsex) {
		this.dsex = dsex;
	}

	@Override
	public String toString() {
		return "Doctor [did=" + did + ", dname=" + dname + ", dphonenum=" + dphonenum + ", dtitle=" + dtitle
				+ ", dclassifiction=" + dclassifiction + ", introduce=" + introduce + ", dmajor=" + dmajor + ", degree="
				+ degree + ", password=" + password + ", dsex=" + dsex + "]";
	}
	
	
	
}
