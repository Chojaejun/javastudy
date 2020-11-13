package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("수정할 id를 입력해 주세요.");
		String id = sc.nextLine();
		
		System.out.println("새로운 name을 입력해 주세요.");
		String name = sc.nextLine();
		
		System.out.println("새로운 age를 입력해 주세요.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		
		int idx = DB.db.indexOf(new MemberDTO(id, name, age));
		MemberDTO mbt = DB.db.set(idx, dto);
		
		
		
	}
	@Override
	public String toString() {
		return "수정";
	}

	
}
