package cn.briup.service;

import java.util.List;

import cn.briup.common.IBaseService;
import cn.briup.domain.Appointment;
import cn.briup.domain.Patient;

public interface IPatientService extends IBaseService<Patient> {
	
	/* 更改病人信息 */
	public void updatePatient(Patient p) throws Exception;
	
	/* 通过病人id,删除病人 */
	public void deletePatient(String patientId) throws Exception;
	
	/* 通过病人id,查询单个病人*/
	public List<Patient> findPatient(String patientId) throws Exception;
	
	/* 查询所有病人 */
	public List<Patient> findAllPatient() throws Exception;
	
	/* 通过病人的身份证，查询病人的预约 */
	public List<Patient> findAppointment(String patientIdCard) throws Exception;
	
	/* 通过医生的姓名，预约医生 */
	public Boolean appointmentDoctor(String doctorId, Patient patient) throws Exception;
	
	/* 通过病人id, 取消预约 */
	public Boolean cancelAppointment(String patientId) throws Exception;
	
}
