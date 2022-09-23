package com.Paras;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class addcontroller{

	service s = new service();
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
		
		float i = Float.parseFloat(request.getParameter("t1"));
		float j = Float.parseFloat(request.getParameter("t2"));
		ModelAndView mv = new ModelAndView();
		float k = s.add(i, j);
		mv.setViewName("dis.jsp");
		mv.addObject("result", k);
		return mv;
	}
	@RequestMapping("/sub")
	public ModelAndView sub(HttpServletRequest request, HttpServletResponse response) {
//		if(request.getParameter("t1") == null) return null;
		float i = Float.parseFloat(request.getParameter("t1"));
		float j = Float.parseFloat(request.getParameter("t2"));
		float k = s.sub(i ,j);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dis.jsp");
		mv.addObject("result", k);
		return mv;
	}
	@RequestMapping("/mul")
	public ModelAndView mul(HttpServletRequest request, HttpServletResponse response) {
		float i = Float.parseFloat(request.getParameter("t1"));
		float j = Float.parseFloat(request.getParameter("t2"));
		float k = s.multi(i ,j);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dis.jsp");
		mv.addObject("result", k);
		return mv;
	}
	@RequestMapping("/div")
	public ModelAndView div(HttpServletRequest request, HttpServletResponse response) {
		float i = Float.parseFloat(request.getParameter("t1"));
		float j = Float.parseFloat(request.getParameter("t2"));
		float k = s.divid(i, j);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dis.jsp");
		mv.addObject("result", k);
		return mv;
	}
}
