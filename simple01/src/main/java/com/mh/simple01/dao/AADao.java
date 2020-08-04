package com.mh.simple01.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mh.simple01.dto.AADto;

@Repository
public class AADao {

	@Autowired
	BasicDataSource dataSource;
	
	@Autowired
	SqlSession sqlSession;
	
	public List<AADto> select() {
		System.out.println("select");
		List<AADto> list = sqlSession.selectList("aa.getaa");
//		for(AADto aaDto : list) {
//			System.out.println("aaDto = "+aaDto.toString());
//		}
		return list;
	}

	public void insert(AADto dto) {
		System.out.println("insert");
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = dataSource.getConnection(); //dataSource 자료형에 커넥션 가져오기
			pstmt = conn.prepareStatement("insert into aa(bb) values (?)");
			
			pstmt.setString(1, dto.getBb());
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				if(pstmt!=null)
				pstmt.close();
				if(conn!=null)
				conn.close(); //dataSource 자료형에 커넥션 반환하기
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void update(AADto dto) {
		sqlSession.update("aa.updateaa",dto);
		System.out.println("수정 됨");
	}

	public void delete() {
		// TODO Auto-generated method stub
		sqlSession.delete("aa.deleteaa");
	}

}
