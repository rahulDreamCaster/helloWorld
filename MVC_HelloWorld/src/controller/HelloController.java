package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
	
		Map m=new HashMap();
		m.put("msg","Hello...."+name);
		
		System.out.println("hello friends");
		System.out.println("test1");
		System.out.println("test555555555");
		ModelAndView mav = new ModelAndView("success",m);
		
		
		return mav;
	}

}
