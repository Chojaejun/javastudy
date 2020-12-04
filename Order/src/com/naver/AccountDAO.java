package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
	private final String DRIVER = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	public AccountDAO() {
		
		try {
			Class.forName(DRIVER);
			System.out.println("메뉴 주문 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("메뉴 주문 실패");
			e.printStackTrace();
		}
	}
	
	public void order(String oid, String menu, String mid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO order1 VALUES(?,?,?)";
		String sql2 = "UPDATE member11 SET point = point + 10 WHERE mid =?";
		ResultSet rs = null; //원래 넣으면 안되는데 보여줄 게 있어서 넣음.
		
		Boolean isOk = false;
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, oid);
			pstmt.setString(2, menu);
			pstmt.setString(3, mid);
			
			pstmt.executeUpdate();
			
			
			if (pstmt != null) {
				pstmt.close();
			}
			
			pstmt = conn.prepareStatement(sql2);
			
			pstmt.setString(1, mid);
			
			
			pstmt.executeUpdate();
			
			isOk = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if (isOk) {
					conn.commit();
				}else {
					conn.rollback();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
