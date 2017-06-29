<<<<<<< HEAD
package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
}
=======
package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import vo.MemberVO;

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
	
}
>>>>>>> 6b1425cbe40c7ebb1a97764a3f41948ae537a574
