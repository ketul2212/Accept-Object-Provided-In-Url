package com.ketul.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AcceptObject {

	@RequestMapping("obj")
	public ModelAndView getObject(Employee e) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", e);
		mv.setViewName("home.jsp");
		return mv;
	}
}
