package cn.briup.domain;

import java.util.Date;

/**
 * 预约表
 * @author 86954
 *
 */
public class Appointment {
//	主键，不能为空
	private int id;
	
//	医生主键，不能为空
	private int did;
	
//	病人主键，不能为空
	private int pid;
	
//	预约看病时间，不能为空
	private Date time;

//	是否被诊断，不能为空
	private int diagnosis;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(int diagnosis) {
		this.diagnosis = diagnosis;
	}
	
}
