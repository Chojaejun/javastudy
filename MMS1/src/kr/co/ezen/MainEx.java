package kr.co.ezen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.EndCommand;
import com.naver.InsetCommand;
import com.naver.SelectCommand;
import com.naver.UpdateCommand;

public class MainEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//list로 변경하시오.
		List<Command> list = new ArrayList<Command>();
		list.add(new InsetCommand());
		list.add(new SelectCommand());
		list.add(new DeleteCommand());
		list.add(new UpdateCommand());
		list.add(new EndCommand());
		
		  boolean isOk = true;
	      int idx = -1;
	      try {
	         while (isOk) {
	            System.out.println("메뉴를 선택하시오.");
	            for (int i = 0; i < list.size(); i++) {
	               Command cms = list.get(i);
	               System.out.print(" "+i+" : ");
	               System.out.print(cms);
	               if(i == list.size()-1) {
	                  break;
	               }
	               System.out.print(" ,");
	            }
	            System.out.println();
	            idx = sc.nextInt();
	            sc.nextLine();

	            if (idx == list.size()) {
	               
	               break;
	            }
	            list.get(idx).execute(sc);
	            //coms[idx].execute(sc);

	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         sc.close();
	      }

	   }

	}