package com.mh.fileboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FileBoardDAO {

	private static FileBoardDAO dao = new FileBoardDAO();
	public static FileBoardDAO getInstance() {
		return dao;
	}
	private FileBoardDAO() {}
	//DB닫기 함수
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
	//DB연결 함수
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(CVALUES.sqlClass);
			conn = DriverManager.getConnection(CVALUES.sqlUrl,CVALUES.sqlUser,CVALUES.sqlPass);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return conn;
		
	}
	public void insertFileBoard(FileBoardDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			
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
	
	public List<FileBoardDTO> selectAllFileBoard(){
		List<FileBoardDTO> list = new ArrayList<FileBoardDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from fileboard order by idx desc");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new FileBoardDTO(rs.getString("title"),rs.getString("content"),rs.getString("filename"),rs.getInt("idx")));
			}
			
		}
		catch(Exception e) {
			
		}
		finally {
			doClose(conn,pstmt,rs);
		}
		
		return list;
	}
	public void deleteFileBoard(String[] cks) {
		String deleteIdxs ="";
		for(int i=0;i<cks.length;i++) {
			if(i!=cks.length-1)
				deleteIdxs = deleteIdxs + " " +cks[i]+",";
			else
				deleteIdxs = deleteIdxs + " " +cks[i];
		}
		System.out.println(deleteIdxs);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("delete from fileboard where idx in("+deleteIdxs+")");
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			doClose(conn,pstmt,null);
		}
	}
}
