package cn.briup.test;

import java.util.List;

import org.junit.Test;

import cn.briup.dao.DoctorDao;
import cn.briup.domain.Doctor;
import cn.briup.util.Page;

public class DoctorTest {
	
	/*@Test
	public void insertDoctor() throws Exception{
		Doctor doc=new Doctor();
		doc.setDname("毛卫俊");
		doc.setDegree("研究生");
		doc.setDclassifiction("骨科");
		doc.setDmajor("微创手术");
		doc.setDsex("男");
		doc.setDtitle("教授");
		doc.setDphonenum("13672247121");
		DoctorDao d=new DoctorDao();
		d.save(doc);
	}
	@Test
	public void test() throws Exception{
		DoctorDao dao=new DoctorDao();
		Doctor doc=new Doctor();
		doc.setDphonenum("13672247121");
		doc.setDname("毛卫俊");
		List<Doctor> list=dao.queryByExample(doc);
		System.out.println(list.toString());
	}*/
	
	@Test
	public void testPage() throws Exception {
		DoctorDao doctorDao = new DoctorDao();
		Doctor doctor = new Doctor();
		
		int count = doctorDao.getAmount(doctor);
		
		System.out.println("医生总数: "+count);
		
		Page page = new Page(count, 1, 6);
		
		List<Doctor> doctorList = doctorDao.queryByPage(doctor, page);
		
		System.out.println(doctorList);
	}
}
