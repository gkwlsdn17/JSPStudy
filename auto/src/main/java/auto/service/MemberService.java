package auto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import auto.dao.MemberDao;

public class MemberService {

	
	MemberDao memberDao;
	public MemberService() {
		
	}
	
//	public MemberService(MemberDao memberDao) {
//		super();
//		this.memberDao = memberDao;
//	}
//	
//	public MemberDao getMemberDao() {
//		return memberDao;
//	}
//	@Autowired(required=false)
//	@Qualifier("md")
	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void join() {
		memberDao.select();
		memberDao.insert();
	}
}
