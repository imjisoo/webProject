package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import vo.BookVO;

@Controller
public class MemberController {
	
	@RequestMapping("/joinForm")
	public String joinForm () {
		
		return "join_form";
		
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public ModelAndView join (@RequestParam Map<String, Object> conditions) {
		
		return null;
		
	}
	
	@RequestMapping("/login")
	public ModelAndView login () {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("main_list");
		
		return mv;
		
	}
	
}
