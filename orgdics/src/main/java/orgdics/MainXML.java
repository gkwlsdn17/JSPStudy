package orgdics;

import org.springframework.context.support.GenericXmlApplicationContext;

import orgdics.service.MemberService;

public class MainXML {

	public static void main(String[] args)   {
		GenericXmlApplicationContext gxac = new GenericXmlApplicationContext("MemberConf.xml");
		MemberService ms = gxac.getBean("memberService",MemberService.class);
		ms.memberjoin("aaa");
	}
}
