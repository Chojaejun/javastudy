package com.naver;

import java.util.Scanner;

public class InsetCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub

		System.out.println("id�� �Է��� �ּ���.");
		String id = sc.nextLine();

		System.out.println("name�� �Է��� �ּ���.");
		String name = sc.nextLine();

		System.out.println("age�� �Է��� �ּ���.");
		int age = sc.nextInt();

		MemberDTO dto = new MemberDTO(id, name, age);
		DB.db.add(dto);
	}

}
