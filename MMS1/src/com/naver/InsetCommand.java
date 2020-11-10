package com.naver;

import java.util.Scanner;

public class InsetCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("id를 입력하세요.");
		String id = sc.nextLine();
		
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("age를 입력하세요.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MembetDTO dto = new MembetDTO(id, name, age);
		DB.db.add(dto);
	}

}
