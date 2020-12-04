package com.naver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test1 {
	
	public void me5() {
		InputStream in = null;
		OutputStream out = null;
		
		byte[] arr = new byte[1024];
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("."+File.separator+"src"+File.separator+"upload"+File.separator+"test_copy.jpg");
			
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
		BufferedOutputStream bos = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("C:"+File.separator+"test_copy.jpg");
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
					out.close();
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
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("C:"+File.separator+"test.jpg");
			byte[] arr = new byte[1024];
			while(true) {
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
	
	public void me2() {
		
		InputStream in = null;
		BufferedInputStream bis = null;
		OutputStream out = null;
		BufferedOutputStream bos = null;
		
		
		try {
			in = new FileInputStream("C"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("C"+File.separator+"test_copy.jpg");
			bos = new BufferedOutputStream(out);
			
			int what = -1;
			
			while (true) {
				what = bis.read();
				if(what == -1) {
					break;
				}
				bos.write(what);
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
					out.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	
	public void me1() {
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("C:"+File.separator+"test_copy.jpg");
			int what = -1;
			while (true) {
				what = in.read();
				if(what == -1) {
					break;
				}
				out.write(what);
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
					in.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	
	
	
}
