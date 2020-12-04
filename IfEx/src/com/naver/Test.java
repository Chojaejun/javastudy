package com.naver;

public class Test {
	public void me1() {
		int a = 10;
		
		//a가 5의 배수이면, sysout(5);
		
		if(a % 5 == 0 ) {
			System.out.println(5);
		}
	}
	
	public void me2(int a) {
		//a가 5의 배수이면서 6의 배수이면
		//sysout(30);
		if(a % 5 == 0 && a % 6 == 0) {
			System.out.println(30);
		}
	}
	
	public void me3(int a) {
		//a가 4가 아니면 
		//sysout(true)
		if(a != 4) {
			System.out.println(true);
		}
	}
	
	public String me4(int a) {
		//a가 10보다 작거나 같으면 return "ok";
		//그렇지 않으면 return "no";
		
		if(a <= 10) {
			return "ok";
		}else {
			return "no";
		}
	}
	
	public void me5(int x) {
		//x가 0보다 작으면 y는 3
		//x가 0보다 크거나 같으면 y는 -3
		if(x < 0 ) {
			System.out.println(3);
		}else {
			System.out.println(-3);
		}
	}
	
	public void me6(int a) {
		//a가 2의 배수이면 sysout(2);
		//그렇지 않고 3의 배수이면 sysout(3);
		//그렇지 않고 5의 배수이면 sysout(5);
		//그렇지 않으면 sysout(0);
		
		if(a % 2 == 0) {
			System.out.println(2);
		}else if(a % 3 == 0){
			System.out.println(3);
		}else if(a % 5 == 0) {
				System.out.println(5);
		}else {
				System.out.println(0);
		}
	}
	
	public char me7(int score) {
		//score가 90이상이면 '수'
		//그렇지 않고 80이상이면 '우'
		//그렇지 않고 70이상이면 '미'
		//그렇지 않고 60이상이면 '양'
		//그렇지 않으면 '가'
		//를 반환하여라.
		
		/*좋은 코드 예시
		 char result = '수'
		if(score > 90) {
		    result = '수';
		}else if(score > 80) {
		    result = '우';
		}else if(score > 70) {
		    result = '미';
		}else if(score > 60) {
		    result = '양';
		}else {
		    result = '가';
		return = result
		*/
		
		if(score > 90) {
			return '수';
		}else if(score > 80) {
			return '우';
		}else if(score > 70) {
			return '미';
		}else if(score > 60) {
			return '양';
		}else {
			return '가';
		}
		
	}
		
}


