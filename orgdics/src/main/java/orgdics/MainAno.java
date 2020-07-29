package orgdics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import orgdics.conf.MemberConf;
import orgdics.service.MemberService;

public class MainAno {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MemberConf.class);
		MemberService ms = acac.getBean("memberService",MemberService.class);
		ms.memberjoin("aaa");
	}
}
