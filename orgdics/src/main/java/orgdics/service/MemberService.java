package orgdics.service;

import orgdics.dao.MemberDAO;
import orgdics.dto.MemberDTO;

public class MemberService {

	private String version;
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}


	//MemberDAO dao = new MemberDAO(); 이렇게 생성하지 말고 
	MemberDAO dao;
	//1.생성자를 통한 di 의존 주입
	public MemberService(MemberDAO dao) {
		this.dao = dao;
	}

	public MemberService() {}
	
	//2.Setter Getter를 통한 di 의존 주입
	public MemberDAO getDao() {
		return dao;
	}


	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}


	public void memberjoin(String inputid)   {
		boolean test = dao.selectById(inputid);
		if(test) {
			dao.insert(new MemberDTO());
		}
		else {
			System.out.println("id중복");
		}
	}
}
