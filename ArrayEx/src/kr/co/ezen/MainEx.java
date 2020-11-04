package kr.co.ezen;

import com.naver.Dog;
import com.naver.Test;

public class MainEx {
	public static void main(String[] args) {
		/*
		 * 최대 값이 2인데 3을 넣으면 에러가 생긴다는 예시 int[] arrException = {1,2,3};
		 * System.out.println(arrException[3]);
		 */
		Test t1 = new Test();
		t1.me1();
		t1.me11();
		t1.me12(new Dog[5]);

		Dog[] arrDog = new Dog[3];
		t1.me12(arrDog);

		String[] arrStr = { "hello", "world", "good", "morning" };
		t1.me22(arrStr);

		Dog[] dogs = new Dog[] { new Dog(), new Dog(), new Dog(), new Dog() };
		t1.me32(dogs);
		System.out.println(">>>>>>>>>>>>>>>");
		t1.me01();
		System.out.println(":::::::::::::::");
		t1.me13();
		System.out.println(">>>>>>>>>");
		t1.me0();
	}

}
