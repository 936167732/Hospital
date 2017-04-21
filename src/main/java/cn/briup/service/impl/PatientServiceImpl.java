package cn.briup.service.impl;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import cn.briup.common.BaseServiceImpl;
import cn.briup.common.IBaseDao;
import cn.briup.dao.AppointmentDao;
import cn.briup.dao.PatientDao;
import cn.briup.domain.Appointment;
import cn.briup.domain.Patient;
import cn.briup.service.IPatientService;

public class PatientServiceImpl extends BaseServiceImpl<Patient> implements IPatientService {

	private PatientDao patientDao = new PatientDao(); //病人Dao对象
	private AppointmentDao appointmentDao = new AppointmentDao();
	
	@Override
	public IBaseDao<Patient> getDao() throws Exception {
		
		return patientDao;
	}

	@Override
	public void updatePatient(Patient p) throws Exception {
		
		this.getDao().update(p);
	}

	@Override
	public void deletePatient(String patientId) throws Exception {
		
		this.getDao().deleteById(Integer.parseInt(patientId));
		
	}

	@Override
	public List<Patient> findPatient(String patientId) throws Exception {
		/* 创建病人对象，将Id封装到里面 */
		Patient patient = new Patient();
		patient.setPid(Integer.parseInt(patientId));
		
		/* 返回查询结果  */
		return this.getDao().queryByExample(patient);
	}

	@Override
	public List<Patient> findAllPatient() throws Exception {
		Patient e=new Patient();
		return this.getDao().queryByExample(e);
	}
	
	@Override
	public Boolean appointmentDoctor(String doctorId, Patient patient) throws Exception {

		
		/* 创建预约对象 */
		Appointment appointment = new Appointment();
		
		/* 保存当前病人 */
		this.getDao().save(patient);
		
		/* 当前时间 */
		Date currentTime = new Date();
		
		/* 通过病人信息查找病人 */
		List<Patient> patiens = patientDao.queryByExample(patient);

		for (Patient p : patiens){		
			/* 获取病人id, 并将它存到预约对象中 */
			appointment.setPid(p.getPid());
		}
		
		/* 添加预约 */
		appointment.setDid(Integer.parseInt(doctorId));
		appointment.setTime(currentTime);
		appointment.setDiagnosis(0);
		appointmentDao.save(appointment);
		
		/* 判断是否预约成功 */
		appointment.setDid(Integer.parseInt(doctorId)); //查询条件
		
		if (appointmentDao.queryByExample(appointment) != null){
			/* 不为空，则添加成功 */
			System.out.println("预约成功");
			return true;
		}else {
			/* 为空，则添加失败 */
			System.out.println("预约失败");
			return false;
		}
		
	}

	@Override
	public Boolean cancelAppointment(String patientId) throws Exception {
		
		/* 将病人id转换为int类型并装到预约对象中 */
		Appointment appointment = new Appointment();
		appointment.setPid(Integer.parseInt(patientId));
		
		/* 通过病人id查找到他的预约 */
		List<Appointment> appointments = appointmentDao.queryByExample(appointment);
		for (Appointment a : appointments){
			/* 通过获取到的预约ID来删除预约对象 */
			appointmentDao.deleteById(a.getId());
		}
		
		/* 判断是否删除成功 */
		if (appointmentDao.queryByExample(appointment).size() == 0){
			/* 如果为空，则删除成功 */
			System.out.println("成功取消预约");
			return true;
		}else {
			/* 不为空，则删除失败 */
			System.out.println("取消预约失败");
			return false;
		}
		
	}

	/**
	 * 通过身份证查询病人是否预约
	 */
	@Override
	public List<Patient> findAppointment(String patientIdCard) throws Exception {
		
		/* 创建预约和病人对象 */
		Appointment appointment = new Appointment();
		Patient patient = new Patient();
		
		/* 将病人身份证封装到病人对象中 */
		patient.setPidcard(patientIdCard);
		
		/* 通过病人身份证查询病人 */
		List<Patient> patientList = patientDao.queryByExample(patient);
		
		for (Patient p : patientList) {
			/* 将病人Id封装到预约对象中 */
			appointment.setPid(p.getPid());
		}
		
		if (appointmentDao.queryByExample(appointment).size() == 0) {
			return null;
		}
		
		/* 查询预约, 并返回 */
		return patientList;
		
	}



}
