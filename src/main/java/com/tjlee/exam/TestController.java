package com.tjlee.exam;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("/index.do")
	public ModelAndView getIndex(HttpServletRequest request) throws Exception{
		
		System.out.println("1");
		return new ModelAndView("websocket-echo");
	}
}
