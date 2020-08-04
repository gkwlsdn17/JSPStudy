package com.mh.simple01.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mh.simple01.dao.AADao;
import com.mh.simple01.dto.AADto;

import org.springframework.stereotype.Service;

@Service
public class AAService {

	@Autowired
	AADao aaDao;
	
	public void join(AADto dto) {
		aaDao.select();
		aaDao.insert(dto);
	}

	public List<AADto> selectAll() {
		// TODO Auto-generated method stub
		return aaDao.select();
	}

	public void update(AADto dto) {
		// TODO Auto-generated method stub
		aaDao.update(dto);
	}

	public void delete() {
		// TODO Auto-generated method stub
		aaDao.delete();
	}


}
