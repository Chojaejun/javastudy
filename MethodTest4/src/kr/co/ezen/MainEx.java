package kr.co.ezen;

import com.naver.CarRegistManagementService;
import com.naver.DogRegistManagementService;

public class MainEx {
	public static void main(String[] args) {
		CarRegistManagementService crms = new CarRegistManagementService();
		
		
		crms.setCarName("k7");
		
		String carName = crms.getCarName();
		System.out.println(carName);
		
		CarRegistManagementService crms2 = new CarRegistManagementService();
		long result = crms2.add(2100000000, 500000000);
				System.out.println(result);
				
		DogRegistManagementService mt1 = new DogRegistManagementService();
		Dog rm = mt1.makeDog("ȫ�浿", 100);
		System.out.println(rm);
		System.out.println(rm.getName());
		System.out.println(rm.getAge());
		
		Dog d1 = new Dog();
		d1.me1();
		System.out.println();
		d1.me2("cho", 26);
		System.out.println();
		Dog jjj = d1.me3();
		System.out.println(jjj);
		int size = d1.me4("cho");
		System.out.println(size);
		
		
		
	}

}
