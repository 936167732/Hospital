package cn.briup.domain;
/**
 * 病人  
 * @author 86954
 *
 */
public class Patient {
	private int pid; //主键
	private String pname; //姓名
	private String pphonenum; //手机号
	private String pidcard; //身份证号
	private String paddress;// 家庭地址
	private int page; //年龄
	private String psex; //性别
	private String pdoctor; //主治医生
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPphonenum() {
		return pphonenum;
	}
	public void setPphonenum(String pphonenum) {
		this.pphonenum = pphonenum;
	}
	public String getPidcard() {
		return pidcard;
	}
	public void setPidcard(String pidcard) {
		this.pidcard = pidcard;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPsex() {
		return psex;
	}
	public void setPsex(String psex) {
		this.psex = psex;
	}
	
	public String getPdoctor() {
		return pdoctor;
	}
	public void setPdoctor(String pdoctor) {
		this.pdoctor = pdoctor;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", pphonenum=" + pphonenum + ", pidcard=" + pidcard
				+ ", paddress=" + paddress + ", page=" + page + ", psex=" + psex + ", pdoctor=" + pdoctor + "]";
	}
	
	
}
