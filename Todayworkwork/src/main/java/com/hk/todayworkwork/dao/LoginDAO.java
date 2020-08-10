package com.hk.todayworkwork.dao;

import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hk.todayworkwork.dto.Com_customerDTO;
import com.hk.todayworkwork.dto.CustomerDTO;

@Repository
public class LoginDAO {

	@Autowired
	BasicDataSource dataSource;
	
	@Autowired
	SqlSession sqlSession;

	public String checkLoginCustomer(String id, String pw) {
		List<CustomerDTO> list = sqlSession.selectList("login.selectCustomer");
		if(list!=null) {
			if(list.get(0).getPW().equals(pw)) {
				return "success";
			}
			return "pw_fail";
		}
		else{
			return "id_fail";
		}
	}

	public String checkLoginCom_customer(String id, String pw) {
		List<Com_customerDTO> list = sqlSession.selectList("login.selectCustomer");
		if(list!=null) {
			if(list.get(0).getPW().equals(pw)) {
				return "success";
			}
			return "pw_fail";
		}
		else{
			return "id_fail";
		}
	}

	
}
