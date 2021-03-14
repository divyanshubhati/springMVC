package com.dbhati;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dbhati.service.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j, HttpServletRequest request, HttpServletResponse response) {
//		make i and j directly bind from the request
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
		AddService addService = new AddService();
		int k = addService.add(i,j);
		ModelAndView mv = new ModelAndView();
		// removing the extension , it will be added in MyConfig.java
//		mv.setViewName("display.jsp");
		mv.setViewName("display");
		mv.addObject("result", k);
		return mv;
	}

}
