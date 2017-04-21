package cn.briup.servlet;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import cn.briup.domain.Health;
import cn.briup.service.impl.HealthServiceImpl; 

public class HealthServlet extends BaseServlet {

	HealthServiceImpl healthService = new HealthServiceImpl();
	
	/**
	 * 添加文章
	 * @param request
	 * @param response
	 */
	public void addArticle(HttpServletRequest request, HttpServletResponse response) {
		
		/* 获取表单数据 */
		String healthTitle = request.getParameter("healthTitle");
		String healthContent = request.getParameter("healthContent");
		String healthImage = request.getParameter("healthImage");
		Date healthReleaseTime = new Date();
		
		/* 创建 Health 对象，并将数据封装进去 */
		Health health = new Health();
		
		health.setH_title(healthTitle);
		health.setH_content(healthContent);
		health.setH_image(healthImage);
		health.setH_releaseTime(healthReleaseTime);
		
		try {
			/* 添加文章 */
			healthService.addArticle(health);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	/**
	 * 更改文章
	 * @param request
	 * @param response
	 */
	public void updateArticle(HttpServletRequest request, HttpServletResponse response) {
		
		/* 获取表单数据 */
		String healthId = request.getParameter("healthId"); //id
		String healthTitle = request.getParameter("healthTitle"); //标题
		String healthContent = request.getParameter("healthContent"); //内容
		String healthImage = request.getParameter("healthImage"); //图片链接
		Date healthReleaseTime = new Date(); //当前时间
		
		/* 创建 Health 对象，并将数据封装进去 */
		Health health = new Health();
		
		health.setH_id(Integer.parseInt(healthId));
		health.setH_title(healthTitle);
		health.setH_content(healthContent);
		health.setH_image(healthImage);
		health.setH_releaseTime(healthReleaseTime);
		
		try {
			/* 更改文章 */
			healthService.updateArticle(health);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	/**
	 * 通过文章的id,删除文章
	 * @param request
	 * @param response
	 */
	public void deleteArticle(HttpServletRequest request, HttpServletResponse response) {
		
		String healthId = request.getParameter("healthId"); //文章id
		
		try {
			/* 删除文章 */
			healthService.deleteArticle(healthId);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 通过文章标题查找文章
	 * @param request
	 * @param response
	 */
	public void findArticle(HttpServletRequest request, HttpServletResponse response) {
		
		Health health = new Health();
	
		String healTitle = request.getParameter("healTitle"); //文章标题
		
		try {
			/* 查找文章 */
			List<Health> healths = healthService.findArticle(healTitle);
			
			for (Health h : healths){
				health = h;
			}
			
			/* 将查询结果封装到request域中 */
			request.setAttribute("health", health);
			
			request.getRequestDispatcher("page/news.jsp").forward(request, response);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void findAllArticles(HttpServletRequest request, HttpServletResponse response) {

		try {
			
			/* 查找所有文章 */
			List<Health> healthList = healthService.findAllArticles();
			
			/* 将查询结果封装到request域中 */
			request.setAttribute("healthList", healthList);
			request.getRequestDispatcher("page/news.jsp").forward(request, response);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
}
