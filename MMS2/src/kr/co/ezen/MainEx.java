package kr.co.ezen;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import com.naver.Command;
import com.naver.Deletecommand;
import com.naver.Endcommand;
import com.naver.InsertCommand;
import com.naver.MemberDAO;
import com.naver.MemberDTO;
import com.naver.Selectcommand;
import com.naver.Updatecommand;

public class MainEx {
	
	public static void main(String[] args) {
		
		Command[] menus = {new InsertCommand(), new Selectcommand(), new Updatecommand(), new Deletecommand(), new Endcommand()};
		
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		while (isTrue) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("0: 등록, 1: 조회, 2: 수정, 3: 삭제, 4: 종료"); // 여기는 반드시 반복문 돌리기
			int idx = sc.nextInt();
			sc.nextLine();
			menus[idx].execute(sc);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		MemberDAO dao = new MemberDAO();
//		
//		MemberDTO dto = new MemberDTO("m002", "cho", null, null);
//		
//		dao.delete(dto);
//		
//		List<MemberDTO> list = dao.select();
//		System.out.println(list);
		
		
		
//		Calendar cal = Calendar.getInstance();
//		cal.set(2000, 11-1, 26);
//		long date = cal.getTimeInMillis();
//		
//		Date birth = new Date(date);
//		dao.insert(new MemberDTO("m002", "lee", "b",birth));
//		
//		
//		List<MemberDTO> list = dao.select();
		
	}

}
