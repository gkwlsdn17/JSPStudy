package com.mh.org.freeboard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mh.org.util.DataSource;

public class FreeBoardDAO {

	public List<FreeBoardDTO> selectAll(int ipage, int lpage){
		List<FreeBoardDTO> list = new ArrayList<FreeBoardDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DataSource.getConnection();
			pstmt = conn.prepareStatement("select * from (select ROW_NUMBER() over (order by idx desc) as rownum, * from freeboard) a where rownum between ? and ?");
			pstmt.setInt(1, ipage);
			pstmt.setInt(2, lpage);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				FreeBoardDTO dto = new FreeBoardDTO(
						rs.getInt("idx"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("reg_date"),
						rs.getString("mod_date"));
				list.add(dto);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			DataSource.doClose(conn,pstmt,rs);
		}
		return list;
	}
	//thorws Exception을 적음으로써 Controller.java 파일로 에러를 던져준다. 그래서 여기서는 try catch를 안해도 된다.
	public void insertFreeboard(FreeBoardDTO dto) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conn = DataSource.getConnection();
		pstmt = conn.prepareStatement("exec pro_seqs 'FREE_BOARD_SEQ'");
		pstmt.setEscapeProcessing(true);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			dto.setIdx(rs.getInt("value"));
		}
		pstmt = conn.prepareStatement("insert into freeboard(idx,title,content,reg_date,mod_date) values(?,?,?,getdate(),getdate())");
		pstmt.setInt(1, dto.getIdx());
		pstmt.setString(2, dto.getTitle());
		pstmt.setString(3, dto.getContent());
		pstmt.executeUpdate();
		DataSource.doClose(conn,pstmt,rs);
		
	}
	public void deleteAll(String[] idx) throws Exception{
		String idxs="";
		for(int i=0;i<idx.length;i++) {
			if(i!=idx.length-1)
				idxs += idx[i]+",";
			else
				idxs += idx[i];
		}
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = DataSource.getConnection();
		pstmt = conn.prepareStatement("delete from freeboard where idx in("+idxs+")");
		pstmt.executeUpdate();
		DataSource.doClose(conn,pstmt,null);
	}
	public FreeBoardDTO selectOne(String idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FreeBoardDTO dto = null;
		try {
			conn = DataSource.getConnection();
			pstmt = conn.prepareStatement("select * from freeboard where idx = ?");
			pstmt.setInt(1, Integer.parseInt(idx));
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new FreeBoardDTO(
						rs.getInt("idx"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("reg_date"),
						rs.getString("mod_date")
						);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			DataSource.doClose(conn, pstmt, rs);
		}
		
		return dto;
	}
	public void updateFreeBoard(FreeBoardDTO dto){
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DataSource.getConnection();
			pstmt = conn.prepareStatement("update freeboard set title=?, content=?, mod_date=getdate() where idx = ?");
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, dto.getIdx());
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			DataSource.doClose(conn, pstmt, null);
		}
	}
	public int selectPageCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DataSource.getConnection();
			pstmt = conn.prepareStatement("select count(*) from freeboard");
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int rowcount = rs.getInt(1);
				int pagecount = rowcount / 10;
				if(rowcount%10>0) { // 10, 20개처럼 0으로 떨어지는 개수는 pagecount +1을 하면안된다.
					pagecount += 1;
				}
				return pagecount;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			DataSource.doClose(conn, pstmt, rs);
		}
		return 0;
	}
}
