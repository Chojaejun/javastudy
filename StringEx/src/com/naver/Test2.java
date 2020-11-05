package com.naver;

import java.util.StringTokenizer;

public class Test2 {
	
	public void me1() {
		String msg = "teacheryo#1234##vip#1000#g#";
		
		StringTokenizer st = new StringTokenizer(msg, "#");
		String[] tArr = new String[st.countTokens()];
		
		int i = 0;
		
		while (st.hasMoreTokens());
		String token = st.nextToken();
		
		tArr[i] = token;
		
		i++;
	}

}
