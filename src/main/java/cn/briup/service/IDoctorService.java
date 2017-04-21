package cn.briup.service;

import java.util.List;

import cn.briup.common.IBaseService;
import cn.briup.domain.Doctor;
import cn.briup.domain.Patient;
import cn.briup.util.Page;

public interface IDoctorService extends IBaseService<Doctor> {

	/* 添加医生 */
	public void addDoctor(Doctor d) throws Exception;

	/* 更新医生信息 */
	public void updateDoctor(Doctor d) throws Exception;

	/* 通过医生id,删除医生 */
	public void deleteDoctor(String doctorId) throws Exception;

	/* 查找单个医生, 查询条件id */
	public List<Doctor> findDoctor(String id) throws Exception;

	/* 查找所有医生 */
	public List<Doctor> findAllDoctor() throws Exception;

	/*
	 * 病人看病后，医生将病人设置为已看
	 */
	public boolean changediagnosis(Patient p, Doctor d) throws Exception;
	
	/* 分页查询 */
	public List<Doctor> queryByPage(Doctor d, Page page) throws Exception;
	
	/* 查询医生总数 */
	public int doctorAmount(Doctor d) throws Exception;
}
