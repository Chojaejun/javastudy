package kr.co.ezen;

import java.util.Date;

import com.naver.Car;

public class MainEx {
	public static void main(String[] args) {
		Car car1 = new Car("k7", "경기24서 1570", 3000);
		Car car2 = new Car("아반떼", "경기21서 1234", 2400);
		
		Dog dog1 = new Dog("1", "땡구", new Date());
		
		String msg = car1.run(100);
		System.out.println(msg);
	}

}
