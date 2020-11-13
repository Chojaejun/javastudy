package kr.co.ezen;

import java.util.List;

import com.naver.MemberDTO;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1 = new Test();
		
		t1.me2();
		System.out.println(">>>>>>>>>>>>");
		t1.me3();
		System.out.println(">>>>>>>>>>");
		t1.me4();
		
		System.out.println(t1.me7().get(1).getName());
		
		String msg = t1.me7().get(1).getName();
		System.out.println(msg);
		
		List<MemberDTO> list = t1.me7();
		
		MemberDTO dto = list.get(1);
		String name = dto.getName();
		System.out.println(name);
		
		t1.me8();
		

	}

}
