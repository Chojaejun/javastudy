package com.naver;

import java.util.Scanner;

public class InsetCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("���̵� �Է��� �ּ���.");
		String id = sc.nextLine();
		
		System.out.println("�̸��� �Է��� �ּ���.");
		String name = sc.nextLine();
		
		System.out.println("���̸� �Է��� �ּ���.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		DB.db.add(dto);
		
	}

	@Override
	public String toString() {
		return "���";
	}
	
	


}
