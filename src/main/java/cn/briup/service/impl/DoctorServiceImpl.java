package cn.briup.service.impl;

import java.util.List;

import org.junit.Test;

import cn.briup.common.BaseServiceImpl;
import cn.briup.common.IBaseDao;
import cn.briup.dao.AppointmentDao;
import cn.briup.dao.DoctorDao;
import cn.briup.domain.Appointment;
import cn.briup.domain.Doctor;
import cn.briup.domain.Patient;
import cn.briup.service.IDoctorService;
import cn.briup.util.DIAGNOSIS;
import cn.briup.util.Page;

public class DoctorServiceImpl extends BaseServiceImpl<Doctor> implements IDoctorService {

	private DoctorDao doctorDao = new DoctorDao();

	@Override
	public IBaseDao<Doctor> getDao() throws Exception {
		return doctorDao;
	}

	@Override
	public void addDoctor(Doctor d) throws Exception {
		this.getDao().save(d);
	}

	@Override
	public void updateDoctor(Doctor d) throws Exception {
		this.getDao().update(d);
	}

	@Override
	public void deleteDoctor(String doctorId) throws Exception {
		this.getDao().deleteById(Integer.parseInt(doctorId));
	}

	@Override
	public List<Doctor> findDoctor(String id) throws Exception {
		Doctor e = new Doctor();
		e.setDid(Integer.parseInt(id));
		return this.getDao().queryByExample(e);
	}

	@Override
	public List<Doctor> findAllDoctor() throws Exception {
		Doctor e = new Doctor();
		return this.getDao().queryByExample(e);
	}

	/**
	 * 先获取病人的id 然后通过病人的主键查找到中间表的信息，然后将病人改为已被医治
	 * 设置病人是否被诊断，使用枚举类DIAGNOSIS 
	 */
	@Override
	public boolean changediagnosis(Patient p, Doctor d) throws Exception {
		AppointmentDao appointmentDao = new AppointmentDao();
		Appointment e = new Appointment();
		e.setPid(p.getPid());
		e.setDid(d.getDid());
		List<Appointment> queryByExample = appointmentDao.queryByExample(e);
		if (queryByExample.size() ==1) {
			queryByExample.get(0).setDiagnosis(DIAGNOSIS.YES_DIAGNOSIS.getIndex());
			appointmentDao.update(queryByExample.get(0));
			return true;
		}else{
			return false;
		}
	}
	/**
	 * 通过医生类型查询医生
	 * @param e
	 * @return
	 * @throws Exception
	 */
	public List<Doctor> findbydclassifiction(Doctor e) throws Exception{
		List<Doctor> queryByExample = doctorDao.queryByExample(e);
		return queryByExample;
	}

	@Override
	public List<Doctor> queryByPage(Doctor d, Page page) throws Exception {
		
		return doctorDao.queryByPage(d, page);
	}

	@Override
	public int doctorAmount(Doctor d) throws Exception {

		return doctorDao.getAmount(d);
	}
}
