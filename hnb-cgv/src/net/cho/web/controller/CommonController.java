package net.cho.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.cho.web.factory.Command;
import net.cho.web.factory.SimpleCommandFactory;

/**
 * Servlet implementation class CommonController
 */
@Controller
public class CommonController {

	@RequestMapping("/common.do")
	public String about(Model model) {
		model.addAttribute("greeting", "안녕하세요");
		return "views/common/main";
	}
	
}

/*public class CommonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SimpleCommandFactory factory = new SimpleCommandFactory();   
	String  view;
	Command command ;    
   
	public void init(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p0 = request.getServletPath().split("/")[2];
		String p1 = p0.substring(0,p0.indexOf("."));
		String p2 = request.getParameter("command");
		String p3 = request.getParameter("pageNO");
		String p4 = request.getParameter("keyField");
		String p5 = request.getParameter("keyword");
		if(p2 == null){ p2 = "main";}
		if(p3 == null){	p3 = "1"; }
		if(p4 == null){ p4 = "null";}
		if(p5 == null){ p5 = "null";}
		System.out.println("param1 :"+ p2);
		System.out.println("param2 :"+ p3);
		System.out.println("param3 :"+ p4);
		System.out.println("param4 :"+ p5);
		command = factory.createCommand(p1,p2,p3,p4,p5);
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		init(request,response);
		
	}
	private void process(HttpServletRequest request, HttpServletResponse response,String view) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("/views/common/"+view+".jsp");
		dis.forward(request, response);
	}
}
*/