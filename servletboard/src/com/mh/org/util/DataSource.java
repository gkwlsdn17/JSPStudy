package com.mh.org.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mh.value.Convalues;

public class DataSource {

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(Convalues.sqlClass);
			conn = DriverManager.getConnection(Convalues.sqlUrl,Convalues.sqlUser,Convalues.sqlPass);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return conn;
		
	}
	public static void doClose(Connection conn, PreparedStatement pstmt, ResultSet rs) {
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
}
