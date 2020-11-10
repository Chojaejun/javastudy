package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.InsetCommand;
import com.naver.SelectCommand;
import com.naver.UpdateCommand;

public class MainEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Command[] coms = {new InsetCommand(),
				new SelectCommand(),
				new DeleteCommand(),
				new UpdateCommand()};
		boolean isOk = true;
		
		int idx = -1;
		
		while(isOk) {
			System.out.println("�޴��� �����Ͻÿ�. ");
			System.out.println("0: ȸ�� �Է�, 1: ȸ�� ��ȸ, 2: ����, 3: ����, 4: ����");
			idx = sc.nextInt();
			sc.nextLine();
			
			if(idx == coms.length) {
				break;
			}
			
			coms[idx].execute(sc);
		}
		sc.close();
		
	}

}