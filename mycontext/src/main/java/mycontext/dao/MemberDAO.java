package mycontext.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	public void select() {
		System.out.println("select...");
	}

	public void insert() {
		System.out.println("insert...");
	}

}
