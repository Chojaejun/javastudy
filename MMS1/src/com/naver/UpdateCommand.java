package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ id�� �Է��� �ּ���.");
		String id = sc.nextLine();
		
		System.out.println("���ο� name�� �Է��ϼ���.");
		String name = sc.nextLine();
		
		System.out.println("���ο� age�� �Է��ϼ���.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MembetDTO dto = new MembetDTO(id, name, age);
		
		int idx = DB.db.indexOf(new MembetDTO(id, name, age));
		MembetDTO mbt = DB.db.set(idx,dto);
	
		
	}
	
	@Override
	public String toString() {
		return "����";
	}
	
	

}
