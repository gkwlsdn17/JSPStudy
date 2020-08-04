package com.mh.simple01;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mh.simple01.dto.AADto;
import com.mh.simple01.service.AAService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	AAService aaService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/aajoin", method = RequestMethod.GET)
	public String aajoinget(Locale locale, Model model) {
		
		return "joinform";
		
	}
	@RequestMapping(value = "/aajoin", method = RequestMethod.POST)
	public String aajoinpost(Locale locale, Model model, 
//			@RequestParam int aa, @RequestParam String bb
			 AADto dto
//			, HttpServletRequest request
			) {
//		System.out.println("aa="+aa);
//		System.out.println("bb="+bb);
//		System.out.println("dto="+dto);
		aaService.join(dto);
		return "home";
	}
	
	@RequestMapping(value = "/aaselectall", method = RequestMethod.GET)
	public String aaselect(Locale locale, Model model) {
		List<AADto> list= aaService.selectAll();
		model.addAttribute("list",list);
		return "aaselect";
	}
	
	@RequestMapping(value = "/aaupdate", method = RequestMethod.GET)
	public String aaupdateget(Locale locale, Model model) {
		
		return "updateform";
		
	}
	@RequestMapping(value = "/aaupdate", method = RequestMethod.POST)
	public String aaupdatepost(Locale locale, Model model,AADto dto) {
		System.out.println("dto = "+dto);
		aaService.update(dto);
		return "redirect:aaselectall";
		
	}
	@RequestMapping(value = "/aadelete", method = RequestMethod.GET)
	public String aadelete(Locale locale, Model model,AADto dto) {
		aaService.delete();
		return "redirect:aaselectall";
		
	}
}
