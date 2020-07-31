package mycontext.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import mycontext.dao.MemberDAO;
import mycontext.myan.MyComponent;
import mycontext.service.MemberService;

@Configuration
@ComponentScan(basePackages = {"mycontext"},
		excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = MyComponent.class))
@MyComponent
public class MyConf {

//	@Bean
//	public MemberDAO memberDao() {
//		return new MemberDAO();
//	}
//	@Bean
//	public MemberService memberService() {
//		return new MemberService();
//	}
}
