package com.naver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test {
	
	public void me6() {
		
		MemberDTO dto = new MemberDTO("m001", "kim", 10);
		
		OutputStream out = null;
		ObjectOutputStream oos = null;
		
		InputStream in = null;
		ObjectInputStream ois = null;
		
		try {
			out = new FileOutputStream("obj.txt");
			oos = new ObjectOutputStream(out);
			
			oos.writeObject(dto);
			System.out.println("::::::::::::::::::::::");
			
			in = new FileInputStream("obj.txt");
			ois = new ObjectInputStream(in);
			
			Object obj = ois.readObject();
			if(obj instanceof MemberDTO) {
				MemberDTO mDto = (MemberDTO)obj;
				System.out.println(mDto.getId());
				System.out.println(mDto.getName());
				System.out.println(mDto.getAge());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) {
					oos.close();
				}
				if(out != null) {
					out.close();
				}
				if(ois != null) {
					ois.close();
				}
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
	public void me5() {
		InputStream in = null;
		OutputStream out = null;
		
		byte[] arr = new byte[1024];
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("."+File.separator+"src"+File.separator+"upload"+File.separator+"test_copy2.jpg");
			while (true) {
				int length = in.read(arr);
				if(length == -1) {
					break;
				}
				out.write(arr, 0, length);
			}
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me4() {
		
		InputStream in = null;
		BufferedInputStream bis = null;
		OutputStream out = null;
		BufferedOutputStream bos= null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("C:"+File.separator+"test.jpg");
			bos = new BufferedOutputStream(out);
			byte[] arr = new byte[1024];
			
			while (true) {
				int length = bis.read(arr);
				if(length == -1) {
					break;
				}
				bos.write(arr, 0, length);
			}
			System.out.println("end");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis != null) {
					bis.close();
				}
				if(in != null) {
					in.close();
				}
				if(bos != null) {
					bos.close();
				}
				if(out != null) {
					bos.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	public void me3() {
		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream("C:" + File.separator + "test.jpg");
			out = new FileOutputStream("C:" + File.separator + "tset_copy.jpg");
			
			byte[] arr = new byte[1024];
					
			while (true) {
				int length = in.read(arr);
				if (length == -1) {
					break;
				}
				out.write(arr, 0, length);
			}
			System.out.println("file copy end");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}
	
	
	public void me2() {
	InputStream in = null;
	BufferedInputStream bis = null;
	OutputStream out = null;
	BufferedOutputStream bos = null;
	
	try {
		in = new FileInputStream("C:"+File.separator+"test.jpg");
		bis = new BufferedInputStream(in);
		out = new FileOutputStream("C:"+File.separator+"test_copy2.jpg");
		bos = new BufferedOutputStream(out);
		
		int what = -1;
				while (true) {
					what = bis.read();
					if(what == -1) {
						break;
					}
					
					bos.write(what);
				}
				
				System.out.println("file copy end");
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {//(순서는 버퍼드인풋스트림)필터부터 사라지게 해야한다. 이유는 필터가 장치에 붙으면 안되기 때문
			if(bis != null) {
				bis.close();
			}
			if(in != null) {
				in.close();
			}
			if(bos != null) {
				bos.close();
			}
			if(out != null) {
				out.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
	
	
	
	public void me1() {
		//byte stream에서 입력과 관련된 최상위 부모클래스는 InputStream
		//byte stream에서 출력과 관련된 최상위 부모클래스는	 OutputStream
		//InputStream, OutputStream 추상클래스입니다.
		//객체 만들지 않는다...
		//I/O 객체는 반드시 개발자가 메모리를 해제시켜야 함.
		//1. Stream을 선언만 합니다.
		//2. try ~ catch ~ finally 구조를 만듦.
		//3. finally 안에 try ~ catch 
		//4. finally 안에 있는 try에 close() 호출, catch에 예외처리를 해 줌.
		//5. 원래 catch에 예외처리 해 줌.
		//6. 원래 try를 코딩함.
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("C:"+File.separator+"test_copy.jpg");
			
			//파일 처음부터 끝까지 데이터를 1바이트씩 읽어 옴.
			//몇 번의 반복문을 사용해야 하나? 모름
			//그래서 for가 아니라 while문을 사용함. (반복 횟수를 모르고 반복 조건만 알고 있어서)
			while (true) {
				int what = in.read();
				if(what == -1) {
					break;
				}
				
				out.write(what);
			}
			
			
			System.out.println("file copy end");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
	}

}
