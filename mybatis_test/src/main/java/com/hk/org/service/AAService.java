package com.hk.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.org.dao.AADao;
import com.hk.org.dto.AADto;

@Service
public class AAService {

	@Autowired
	AADao aaDao;
	
	public List<AADto> selectAll() {
		
		
		return aaDao.selectAll();
	}

}
