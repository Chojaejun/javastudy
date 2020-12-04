package kr.co.ezen;

import java.lang.reflect.Constructor;

import com.naver.Command;

public class MainEx2 {

	public static void main(String[] args) { //일반적으로 메인 메서드는 프로젝트당 하나인데 테스트할려고 하나 더 넣음
		//full package name: 패키지와 클래스를 같이 사용하는 것.
		//com.name.InsertCommand
		try {
			Class<?> testClass = Class.forName("com.naver.InsertCommand");  //<이 안에 값을 넣을 때는 드라이버의 풀패키지명을 넣음.
			Constructor<?> cons = testClass.getConstructor(); // <-- 이곳에 파라미터를 넣고 싶으면 insert.class  
			Command com = (Command)cons.newInstance(); //<-- Instance 는 객체
			//여기까지가 Commad com = new InsertCommad(); 이다.
			
			com.execute(null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
