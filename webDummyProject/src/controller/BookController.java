package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import repository.BookDAO;
import vo.BookVO;

@Controller
public class BookController {
	
	@Autowired
	private BookDAO dao;
	
	@RequestMapping("/bookList.do")
	public ModelAndView bookList () {
		
		List<BookVO> bookList = dao.selectAll();
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("bookList", bookList);
		mv.setViewName("book_list");
		
		return mv;
		
	}
	
}
