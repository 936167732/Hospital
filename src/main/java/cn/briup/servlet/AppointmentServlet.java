package cn.briup.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.briup.domain.Appointment;
import cn.briup.domain.Doctor;
import cn.briup.domain.Patient;
import cn.briup.service.impl.DoctorServiceImpl;
import cn.briup.service.impl.PatientServiceImpl;
import cn.briup.util.Page;
import cn.briup.util.PhoneCheck;
import cn.briup.util.fastjson;
@WebServlet("/AppointmentServlet")
public class AppointmentServlet extends BaseServlet{
	
	DoctorServiceImpl doctorServiceImpl = new DoctorServiceImpl();
	PatientServiceImpl patientServiceImpl = new PatientServiceImpl();
	
	
	// 用户点击获取验证码，验证码赋值在staticphonecode中 ，当用户输入验证码后，比对是否相同
	private static String staticphonecode;
	public void getphonecode(HttpServletRequest request, HttpServletResponse response) {
		String pphonenum = request.getParameter("pphonenum");
		staticphonecode = new PhoneCheck().send(pphonenum);
		try {
			response.getWriter().write("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 病人预约医生 需要的参数： 病人id 医生id 返回：
	 */
	public void appointment(HttpServletRequest request, HttpServletResponse response) {
		// 获取病人信息
		String phonecode = request.getParameter("phonecode");
		System.out.println(phonecode+staticphonecode);
//		if (phonecode.equals(staticphonecode)) {
//			String doctorId = request.getParameter("doctorid");
//			String pname = request.getParameter("pname");
//			String pidcard = request.getParameter("pidcard");
//			String pphonenum = request.getParameter("pphonenum");
			
			String doctorId = "8"; //医生ID
			String pname = "张三"; //病人姓名	
			String pidcard = "666"; //身份证
			String psex = "男"; //性别
			int page = 21; //年龄
			String pphonenum = "15079076768";  //手机号
			
			Patient patient = new Patient();
			patient.setPidcard(pidcard);
			patient.setPname(pname);
			patient.setPphonenum(pphonenum);
			patient.setPage(page);;
			patient.setPsex(psex);
			// 获取医生id
			try {

				/* 判断病人是否已经预约过 */
				/*if (patientServiceImpl.findAppointment(pidcard) == null) {
					request.setAttribute("message", "抱歉，您已经预约过医生了!");
					request.getRequestDispatcher("page/services.jsp").forward(request, response);
					return;
				}
				*/
				List<Doctor> doctorList = doctorServiceImpl.findDoctor(doctorId);
				
				for (Doctor d : doctorList) {
					patient.setPdoctor(d.getDname());
				}
		
				// 病人预约医生
				Boolean bool = patientServiceImpl.appointmentDoctor(doctorId, patient);
				
				/* 判断是否预约成功 */
				if (bool) {
					request.setAttribute("message", "预约成功!");
				}else {
					request.setAttribute("message", "预约失败!");
				}
				
				request.getRequestDispatcher("page/services.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
//		} else {
//			System.out.println("验证码不匹配");
//		}
		
	}

	/**
	 * 医生确认预约病人已被诊断 参数： 病人id 医生id 返回值
	 */
	public void hasappointmented(HttpServletRequest request, HttpServletResponse response) {
		String pid = request.getParameter("patientid");
		String did = request.getParameter("doctorid");
		Patient p = new Patient();
		p.setPid(Integer.parseInt(pid));
		Doctor d = new Doctor();
		d.setDid(Integer.parseInt(did));
		try {
			doctorServiceImpl.changediagnosis(p, d);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 病人取消预约 参数 病人id 医生id
	 * 
	 */
	public String cancelappointment(HttpServletRequest request, HttpServletResponse response) {
		String patientId = request.getParameter("patientid");
		try {
			Boolean bool = patientServiceImpl.cancelAppointment(patientId);
			
			/* 判断取消预约是否成功 */
			if (bool) {
				request.setAttribute("message", "取消预约成功!");
			}else {
				request.setAttribute("message", "取消预约失败!");
			}
			
			request.getRequestDispatcher("page/services.jsp").forward(request, response);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		// TODO
		return "";
	}

	/**
	 * 返回所有医生类型
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String selectdclassifiction(HttpServletRequest request, HttpServletResponse response) {
		List<Doctor> findAllDoctor;
		try {
			findAllDoctor = doctorServiceImpl.findAllDoctor();
			String fastjsonway = fastjson.fastjsonway(findAllDoctor, new String[] { "dname", "dphonenum", "dtitle",
					"introduce", "dmajor", "degree", "password", "dsex" });
			response.getWriter().write(fastjsonway);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 通过类型查询医生
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String selectdoctorbytype(HttpServletRequest request, HttpServletResponse response) {
		String dclassifiction = request.getParameter("dclassifiction");
		Doctor e = new Doctor();
		
		e.setDclassifiction(dclassifiction);
		
		/* 默认当前页为1 */
		int currentPage = 1;
		
		/*判断当前页是否为空*/
		if (request.getParameter("currentPage") != null){
			/* 若不为空，则将表单传过来的值赋给currentPage */
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		
		try {
			/* 获取医生总数 */
			int count = doctorServiceImpl.doctorAmount(e);
			
			/* 创建page对象 */
			Page page = new Page(count, currentPage, 6);
			
			List<Doctor> findbydclassifiction = doctorServiceImpl.queryByPage(e, page);
			String fastjsonway = fastjson.fastjsonway(findbydclassifiction, new String[] {});
			response.getWriter().write(fastjsonway);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// TODO
		return "";
	}
	/**
	 * 查询所有医生
	 * @param request
	 * @param response
	 */
	public void selectalldoctor(HttpServletRequest request, HttpServletResponse response){
		try {
			List<Doctor> findAllDoctor = doctorServiceImpl.findAllDoctor();
			System.out.println(findAllDoctor);
//			String parseObject = JSON.toJSONString(findAllDoctor);
//			JSONObject parseObject = JSON.parseObject(jsonString);
			request.setAttribute("alldoctor", findAllDoctor);
			request.getRequestDispatcher("page/services.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过病人身份证号码查询预约情况
	 * @param request
	 * @param response
	 */
	public void findAppointment(HttpServletRequest request, HttpServletResponse response) {
		
		/* 获取病人身份证号码 */
		String patientIdCard = request.getParameter("pidcard");
		
		try {
			/* 通过病人身份证查询病人的预约结果 */
			List<Patient> appointmentList = patientServiceImpl.findAppointment(patientIdCard);
			
			/* 判断是否预约过医生 */
			if (appointmentList == null) {
				request.setAttribute("message", "抱歉，您没有预约过医生!");
				
				return;
			}
			
			/* 如果病人预约过，返回病人预约信息 */
			request.setAttribute("appointmentList", appointmentList);
			request.getRequestDispatcher("page/inquire.jsp").forward(request, response);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	/**
	 * 分页查询,首页默认为1
	 * @param request
	 * @param response
	 */
	public void selectByPage(HttpServletRequest request, HttpServletResponse response) {
		
		/* 默认当前页为1 */
		int currentPage = 1;
		
		/*判断当前页是否为空*/
		if (request.getParameter("currentPage") != null){
			/* 若不为空，则将表单传过来的值赋给currentPage */
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		
		try {
			/* 创建一个空的医生对象 */
			Doctor doctor = new Doctor();
			
			/* 获取医生总数 */
			int count = doctorServiceImpl.doctorAmount(doctor);
			
			/* 创建page对象 */
			Page page = new Page(count, currentPage, 6);
			
			/* 获取当前页的医生数据 */
			List<Doctor> doctorList = doctorServiceImpl.queryByPage(doctor, page);
			
			request.setAttribute("alldoctor", doctorList);
			request.setAttribute("page", page);
			
			request.getRequestDispatcher("page/services.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
