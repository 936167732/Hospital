package cn.briup.test;

import java.util.List;

import org.junit.Test;

import cn.briup.dao.PatientDao;
import cn.briup.domain.Patient;
import cn.briup.service.impl.PatientServiceImpl;

public class paient {
	@Test
	public  void main() {
		
//		Patient e=new Patient();
//		PatientDao patientDao=new PatientDao();
//		List<Patient> queryByExample;
//		try {
//			queryByExample = patientDao.queryByExample(e);
//			System.out.println(queryByExample);
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		/* 测试预约功能 */
		PatientServiceImpl patientService = new PatientServiceImpl();
		Patient patient = new Patient();
		
		patient.setPname("哈哈哈哈");
		
		try {
			patientService.appointmentDoctor("6", patient);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* 测试取消预约功能 */
//		PatientServiceImpl patientService = new PatientServiceImpl();
//		
//		try {
//			patientService.cancelAppointment("18");
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
	}
}
