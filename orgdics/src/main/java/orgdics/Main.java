package orgdics;

import orgdics.dao.MemberDAO;
import orgdics.dao.OracleMemberDAO;
import orgdics.service.MemberService;

public class Main {
	
	public static void main(String[] args) throws Exception {
		//MemberService ms = new MemberService(new OracleMemberDAO());
		MemberService ms = new MemberService();
		ms.setDao(new MemberDAO());
		//ms.memberjoin("aaa");
		ms.memberjoin("bbb");
	}
}
