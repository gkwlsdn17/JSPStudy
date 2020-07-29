package orgdics.service;

import org.springframework.beans.factory.annotation.Autowired;

import orgdics.dao.MemberDAO;
import orgdics.dto.MemberDTO;

public class MemberServiceAuto {

	@Autowired
	MemberDAO memberDao;
	
	public void memberjoin(String inputid)   {
		boolean test = memberDao.selectById(inputid);
		if(test) {
			memberDao.insert(new MemberDTO());
		}
		else {
			System.out.println("id중복");
		}
	}
}
