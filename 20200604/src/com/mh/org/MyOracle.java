package com.mh.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MyOracle {

	public String doUpdate() {
		System.out.println("doUpdate");
		Connection conn = null; // DB연결을 유지하는 객체
		PreparedStatement psmt = null; //SQL문 작성해서 들고 있는 객체
		
		try{
			//Class ojdbc6.jar 파일 안에 있는 Driver class를 찾는거
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//DB연결 성공되면 진행, 실패시 catch 예외로 빠짐
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
			
			psmt = conn.prepareCall("update student set stu_number = 3");
			//여기서는 자동으로 커밋됨
			psmt.executeUpdate();
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return "정상적으로 update 했음";
	}

}
