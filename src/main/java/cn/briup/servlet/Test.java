package cn.briup.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends BaseServlet {
	private static final long serialVersionUID = 1L;
	
	 public String add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
	        System.out.println("add method");  
	        //对于客户端跳转，我们用redirect:标识  
	        return "redirect:https://www.baidu.com";  
	    }  
	    public String update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
	        System.out.println("update method");  
	        //服务器端的跳转  
	        return "redirect:https://www.baidu.com";  
	    }  
	    public String delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
	        System.out.println("delete method");  
	        //服务器端的跳转  
	        return "redirect:https://www.baidu.com";  
	    }
	    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
	        System.out.println("default method");  
	        //服务器端的跳转  
	        return "redirect:https://www.baidu.com";  
	    }
}
