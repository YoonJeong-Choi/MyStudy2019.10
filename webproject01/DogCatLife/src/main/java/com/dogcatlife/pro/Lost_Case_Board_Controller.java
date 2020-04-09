package com.dogcatlife.pro;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class Lost_Case_Board_Controller {

	@RequestMapping("/lost_case_board_list.mysql")
	public ModelAndView lost_board_list() {
		System.out.println("lost_case_board_list 컨트롤러 호출");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("lost_case_board/lost_case_board_list");
		return modelAndView;
	}

	@RequestMapping("/lost_case_board_modify.mysql")
	public ModelAndView lost_case_board_modify() {
		System.out.println("lost_case_board_modify 컨트롤러 호출");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("lost_case_board/lost_case_board_modify");
		return modelAndView;
	}

	@RequestMapping("/lost_case_board_modify_ok.mysql")
	public ModelAndView lost_case_board_modify_ok() {
		System.out.println("lost_case_board_modify_ok 컨트롤러 호출");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("lost_case_board/lost_case_board_modify_ok");
		return modelAndView;
	}

	@RequestMapping("/lost_case_board_view.mysql")
	public ModelAndView lost_case_board_view() {
		System.out.println("lost_case_board_view 컨트롤러 호출");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("lost_case_board/lost_case_board_view");
		return modelAndView;
	}

	@RequestMapping("/lost_case_board_write.mysql")
	public ModelAndView lost_case_board_write() {
		System.out.println("lost_case_board_write 컨트롤러 호출");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("lost_case_board/lost_case_board_write");
		return modelAndView;
	}

	@RequestMapping("/lost_case_board_write_ok.mysql")
	public ModelAndView lost_case_board_write_ok() {
		System.out.println("lost_case_board_write_ok 컨트롤러 호출");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("lost_case_board/lost_case_board_write_ok");
		return modelAndView;
	}

	@RequestMapping("/lost_case_board_delete_ok.mysql")
	public ModelAndView lost_case_board_delete_ok() {
		System.out.println("lost_case_board_delete_ok 컨트롤러 호출");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("lost_case_board/lost_case_board_delete_ok");
		return modelAndView;
	}
}