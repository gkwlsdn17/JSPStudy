package com.hk.todayworkwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.todayworkwork.dao.RecruitDAO;
import com.hk.todayworkwork.dto.RecruitDTO;

@Service
public class RecruitService {

	@Autowired
	RecruitDAO recruitDao;

	public List<RecruitDTO> selectAll() {
		return recruitDao.selectAll();
	}

	public List<RecruitDTO> selectHot_list() {
		return recruitDao.selectHot_list();
	}

	public List<RecruitDTO> selectImminent() {
		return recruitDao.selectImminent_list();
	}
}
