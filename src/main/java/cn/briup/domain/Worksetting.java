package cn.briup.domain;

public class Worksetting {
//	主键
	private int id;
//	医生主键
	private int did;
//	工作地点
	private String workroom;
//	预约数目
	private int appointment_sum;
	
//	医生上班时间
	private String working_hours;
	
//	医生下班时间
	private String off_hours;
	
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
	public String getWorkroom() {
		return workroom;
	}
	public void setWorkroom(String workroom) {
		this.workroom = workroom;
	}
	public int getAppointment_sum() {
		return appointment_sum;
	}
	public void setAppointment_sum(int appointment_sum) {
		this.appointment_sum = appointment_sum;
	}
	public String getWorking_hours() {
		return working_hours;
	}
	public void setWorking_hours(String working_hours) {
		this.working_hours = working_hours;
	}
	public String getOff_hours() {
		return off_hours;
	}
	public void setOff_hours(String off_hours) {
		this.off_hours = off_hours;
	}
	
	
	
}
