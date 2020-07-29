package orgdics.dao;

import orgdics.dto.MemberDTO;

public class MemberDAO {

	public boolean selectById(String string) {
		if(string=="aaa") {
			return false;
		}
		else {
			return true;
		}
		
	}

	public void insert(MemberDTO memberDTO) {
		System.out.println("memberDTO생성");
	}

}
