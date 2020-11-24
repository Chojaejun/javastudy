package kr.co.ezen;

import java.util.Calendar;

import com.naver.MemberDAO;
import com.naver.MemberDTO;
import com.naver.Test;

public class MainEx {
	
	public static void main(String[] args) {
		
//		Test dao = new Test();
//		
//		dao.me1();
		
		MemberDAO dao2 = new MemberDAO();
		
//		MemberDTO dto = new MemberDTO("m009", "jin", "a", new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
//		
//		dao2.insert(dto);
		
		dao2.delete(new MemberDTO("m009", null, null, null));
	}

}
