package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;

public class Test {
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	public Test() {
		//full package: 패키지.클래스명
		//kr.co.ezen.Test
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	public void me1() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO member (mid, name, job, birth) VALUES (?, ?, ?, ?)"; //확정된 게 있으면 그 값을 넣어주고 없으면 ? 표를 넣어 줌
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ezen", "ezen");
			System.out.println("커넥션 연결 성공");
			
			pstmt = conn.prepareStatement(sql);
			System.out.println("preparedStatement 생성 성공");
			
			pstmt.setString(1, "m005");
			pstmt.setString(2, "kim");
			pstmt.setString(3, "c");
			pstmt.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));
			
			
			pstmt.execute(); // 넘겨주는 역할인데 아무것도 없으면 에러 java.sql.SQLException: 인덱스에서 누락된 IN 또는 OUT 매개변수:: 1 <1인덱스 값이 없다, 2면 2 인덱스 값이 없다, 3이면 3 인덱스 값이 없다.
			
		} catch (Exception e) {
			System.out.println("preparedStatement 생성 실패");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
	
}
