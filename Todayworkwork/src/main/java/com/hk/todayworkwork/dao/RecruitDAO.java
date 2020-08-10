package com.hk.todayworkwork.dao;

import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hk.todayworkwork.dto.RecruitDTO;

@Repository
public class RecruitDAO {

	@Autowired
	BasicDataSource dataSource;
	
	@Autowired
	SqlSession sqlSession;
	
	public List<RecruitDTO> selectAll() {
		List<RecruitDTO> list = sqlSession.selectList("recruit.selectAll");
		return list;
	}

	public List<RecruitDTO> selectHot_list() {
		List<RecruitDTO> hot_list = sqlSession.selectList("recruit.selectHot_list");
		return hot_list;
	}

	public List<RecruitDTO> selectImminent_list() {
		List<RecruitDTO> imminent_list = sqlSession.selectList("recruit.selectImminent_list");
		return imminent_list;
	}

}
