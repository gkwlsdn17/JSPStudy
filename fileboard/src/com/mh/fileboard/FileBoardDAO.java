package com.mh.fileboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FileBoardDAO {

	public void doClose(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(conn!=null) {
				conn.close();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void insertFileBoard(FileBoardDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(CVALUES.sqlClass);
			conn = DriverManager.getConnection(CVALUES.sqlUrl,CVALUES.sqlUser,CVALUES.sqlPass);
			
			
			pstmt = conn.prepareStatement("exec pro_seqs 'FILE_BOARD_SEQ'");
			//프로시저를 실행할때는 아래 구문을 꼭 써준다
			pstmt.setEscapeProcessing(true);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dto.setIdx(rs.getInt("value"));
			}
			System.out.println("dto = "+dto);
			pstmt = conn.prepareStatement("insert into fileboard(title,content,filename,idx) " + 
											"values(?,?,?,?)");
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setString(3, dto.getFilename());
			pstmt.setInt(4, dto.getIdx());
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			doClose(conn,pstmt,rs);
		}
	}
}
