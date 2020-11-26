package com.naver;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class InsertCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� ���� ������ �����մϴ�.");
		
		System.out.println("���̵� �Է��ϼ���.");
		String mid = sc.nextLine();
		
		System.out.println("������ �Է��ϼ���.");
		String name = sc.nextLine();
		
		System.out.println("������ �Է��ϼ���.");
		String job = sc.nextLine();
		
		System.out.println("��������� �Է��ϼ���.");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.println("��� ���� �Է��ϼ���.");
		int month = sc.nextInt()-1;
		sc.nextLine();
		
		System.out.println("��� ���� �Է��ϼ���.");
		int date = sc.nextInt();
		sc.nextLine();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		Date birth = new Date(cal.getTimeInMillis());
		
		MemberDTO dto = new MemberDTO(mid, name, job, birth);
		
		MemberDAO dao = new MemberDAO();
		dao.insert(dto);
	}

}