package kr.co.ezen;

import com.naver.Test2;
import com.naver.Test3;

public class MainEx {
	
	public static void main(String[] args) {
		Test2.MemberClass mc = new Test2().new MemberClass();
		
		mc.mc1();
		
		Test3.StaticInnerClass sic1 = new Test3.StaticInnerClass();
		sic1.sic();
		
		
	}
}
