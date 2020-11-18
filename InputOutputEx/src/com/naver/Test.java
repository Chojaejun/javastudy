package com.naver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {
	
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
		try {//(������ ���۵���ǲ��Ʈ��)���ͺ��� ������� �ؾ��Ѵ�. ������ ���Ͱ� ��ġ�� ������ �ȵǱ� ����
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
		//byte stream���� �Է°� ���õ� �ֻ��� �θ�Ŭ������ InputStream
		//byte stream���� ��°� ���õ� �ֻ��� �θ�Ŭ������	 OutputStream
		//InputStream, OutputStream �߻�Ŭ�����Դϴ�.
		//��ü ������ �ʴ´�...
		//I/O ��ü�� �ݵ�� �����ڰ� �޸𸮸� �������Ѿ� ��.
		//1. Stream�� ���� �մϴ�.
		//2. try ~ catch ~ finally ������ ����.
		//3. finally �ȿ� try ~ catch 
		//4. finally �ȿ� �ִ� try�� close() ȣ��, catch�� ����ó���� �� ��.
		//5. ���� catch�� ����ó�� �� ��.
		//6. ���� try�� �ڵ���.
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("C:"+File.separator+"test_copy.jpg");
			
			//���� ó������ ������ �����͸� 1����Ʈ�� �о� ��.
			//�� ���� �ݺ����� ����ؾ� �ϳ�? ��
			//�׷��� for�� �ƴ϶� while���� �����. (�ݺ� Ƚ���� �𸣰� �ݺ� ���Ǹ� �˰� �־)
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
