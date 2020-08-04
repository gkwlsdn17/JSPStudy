package com.hk.org.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hk.org.dto.AADto;

@Repository
public class AADao {

	@Autowired
	SqlSession sqlSession;
	
	public List<AADto> selectAll() {
		List<AADto> list = sqlSession.selectList("aa.getSelect");
		
		return list;
	}

}
