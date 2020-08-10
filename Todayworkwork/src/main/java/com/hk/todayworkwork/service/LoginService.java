package com.hk.todayworkwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.todayworkwork.dao.LoginDAO;
import com.hk.todayworkwork.dto.Com_customerDTO;
import com.hk.todayworkwork.dto.CustomerDTO;

@Service
public class LoginService {

	@Autowired
	LoginDAO loginDao;

	public String checkLoginCustomer(String id, String pw) {
		
		return loginDao.checkLoginCustomer(id,pw);
		
		
	}
	public String checkLoginCom_customer(String id, String pw) {
		
		return loginDao.checkLoginCom_customer(id,pw);
		
	}
	
}
