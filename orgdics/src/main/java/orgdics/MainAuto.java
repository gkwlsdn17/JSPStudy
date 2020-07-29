package orgdics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import orgdics.conf.MemberConf;
import orgdics.service.MemberService;
import orgdics.service.MemberServiceAuto;

public class MainAuto {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MemberConf.class);
		MemberServiceAuto msa = acac.getBean("memberServiceAuto",MemberServiceAuto.class);
		msa.memberjoin("aaa");
	}
}
