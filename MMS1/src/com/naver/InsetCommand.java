package com.naver;

import java.util.Scanner;

public class InsetCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("id�� �Է��ϼ���.");
		String id = sc.nextLine();
		
		System.out.println("�̸��� �Է��ϼ���.");
		String name = sc.nextLine();
		
		System.out.println("age�� �Է��ϼ���.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MembetDTO dto = new MembetDTO(id, name, age);
		DB.db.add(dto);
	}

}
