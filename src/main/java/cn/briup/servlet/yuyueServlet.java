package cn.briup.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.briup.domain.Doctor;
import cn.briup.service.impl.DoctorServiceImpl;
import cn.briup.service.impl.PatientServiceImpl;
import cn.briup.util.Page;

@WebServlet("/yuyueServlet")
public class yuyueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DoctorServiceImpl doctorServiceImpl = new DoctorServiceImpl();
	PatientServiceImpl patientServiceImpl = new PatientServiceImpl();   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* 默认当前页为1 */
		int currentPage = 1;
		
		/*判断当前页是否为空*/
		if (request.getParameter("currentPage") != null){
			/* 若不为空，则将表单传过来的值赋给currentPage */
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		
		try {
			/* 获取医生总数 */
			Doctor d=new Doctor();
			int count = doctorServiceImpl.doctorAmount(d);
			
			/* 创建page对象 */
			Page page = new Page(count, currentPage, 6);
		
			/* 获取当前页的医生数据 */
			List<Doctor> doctorList = doctorServiceImpl.queryByPage(d, page);
			
			request.setAttribute("alldoctor", doctorList);
			request.setAttribute("page", page);
			
			request.getRequestDispatcher("page/services.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
