package com.mg.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DataManager {

	public static List select() {
		
		List<STUDY01> list = new ArrayList();
		
		Connection conn = null; // DB연결을 유지하는 객체
		PreparedStatement psmt = null; //SQL문 작성해서 들고 있는 객체
		ResultSet rs = null;
		try{
			//Class ojdbc6.jar 파일 안에 있는 Driver class를 찾는거
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//DB연결 성공되면 진행, 실패시 catch 예외로 빠짐
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
			
			psmt = conn.prepareStatement("select * from STUDY01 order by B");
			
			//insert update delete할때는 executeUpdate()실행
			//select는 executeQuery() 실행
			rs = psmt.executeQuery();
			while(rs.next()) {
				int A = rs.getInt(1); //1번째 column
				String B = rs.getString(2); //2번째 column
				String C = rs.getString(3); //3번째 column
				String D = rs.getString(4); //4번째 column
				String E = rs.getString(5); //5번째 열
				list.add(new STUDY01(A,B,C,D,E));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(psmt!=null) {
					psmt.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}
			catch(Exception e) {
				
				
			}
			
		}
		return list;
	}
	
	public static void insert() {
		Connection conn = null; // DB연결을 유지하는 객체
		PreparedStatement psmt = null; //SQL문 작성해서 들고 있는 객체
		
		try{
			//Class ojdbc6.jar 파일 안에 있는 Driver class를 찾는거
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//DB연결 성공되면 진행, 실패시 catch 예외로 빠짐
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
			
			psmt = conn.prepareCall("insert into STUDY01 (B,C,D,E) values ((select nvl(MAX(B)+1,1) from STUDY01),'C1','D1','E1')");
			//nvl(MAX(B)+1,1)은 MAX(B)+1이 null일 때는 1을 넣어준다는 함수임
			
			
			psmt.executeUpdate();
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				
				if(psmt!=null) {
					psmt.close();
				}
				if(conn!=null) {
					psmt.close();
				}
			}
			catch(Exception e) {
				
				
			}
			
		}
		
	}
	
	public static void delete() {
		Connection conn = null; // DB연결을 유지하는 객체
		PreparedStatement psmt = null; //SQL문 작성해서 들고 있는 객체
		
		try{
			//Class ojdbc6.jar 파일 안에 있는 Driver class를 찾는거
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//DB연결 성공되면 진행, 실패시 catch 예외로 빠짐
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
			
			psmt = conn.prepareCall("delete from STUDY01");
			//여기서는 자동으로 커밋됨
			psmt.executeUpdate();
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				
				if(psmt!=null) {
					psmt.close();
				}
				if(conn!=null) {
					psmt.close();
				}
			}
			catch(Exception e) {
				
				
			}
			
		}
	}
	public static void update() {
		Connection conn = null; // DB연결을 유지하는 객체
		PreparedStatement psmt = null; //SQL문 작성해서 들고 있는 객체
		
		try{
			//Class ojdbc6.jar 파일 안에 있는 Driver class를 찾는거
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//DB연결 성공되면 진행, 실패시 catch 예외로 빠짐
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
			
			psmt = conn.prepareCall("update STUDY01 set A=20 where B='2'");
			//여기서는 자동으로 커밋됨
			psmt.executeUpdate();
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				
				if(psmt!=null) {
					psmt.close();
				}
				if(conn!=null) {
					psmt.close();
				}
			}
			catch(Exception e) {
				
				
			}
			
		}
	}
}
