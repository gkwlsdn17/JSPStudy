package com.hk.todayworkwork;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hk.todayworkwork.dto.Com_customerDTO;
import com.hk.todayworkwork.dto.CustomerDTO;
import com.hk.todayworkwork.dto.RecruitDTO;
import com.hk.todayworkwork.service.LoginService;
import com.hk.todayworkwork.service.RecruitService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	RecruitService recruitService;
	
	@Autowired
	LoginService loginService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		List<RecruitDTO> list = recruitService.selectAll();
		model.addAttribute("list",list);
		List<RecruitDTO> hot_list = recruitService.selectHot_list();
		model.addAttribute("hot_list",hot_list);
		List<RecruitDTO> imminent_list = recruitService.selectImminent();
		model.addAttribute("imminent_list",imminent_list);
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value = "/loginProc", method = RequestMethod.POST)
	public String loginProc(Locale locale, Model model, HttpServletRequest request) {
		String chk_login = request.getParameter("chk_login");
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		String check="";
		
		if(chk_login.equals("개인")) {
			check = loginService.checkLoginCustomer(id, pw);
			
		}
		else if(chk_login.equals("기업")) {
			check = loginService.checkLoginCom_customer(id, pw);;
		}
		model.addAttribute("login_check",check);
		
		return "loginProc";
	}
}
