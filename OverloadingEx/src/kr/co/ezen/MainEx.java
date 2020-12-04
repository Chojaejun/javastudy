package kr.co.ezen;

import com.naver.Cat;
import com.naver.Dog;
import com.naver.Test2;
import com.naver.Test3;

public class MainEx {
	public static void main(String[] args) {
		
		Test2 d1 = new Test2();
		d1.printint(34);
		d1.printBoolean(true);
		d1.printCat(new Cat());
		
		System.out.println(":::::::::::::::::::::");
		
		Test3 t3 = new Test3();
		
		t3.printDa();
		t3.printDa(new Dog());
		t3.printDa(new Cat());
	}

}
