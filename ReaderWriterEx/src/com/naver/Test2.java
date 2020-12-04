package com.naver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Test2 {
	
	public void me1() {
		
		Reader in = null;
		BufferedReader br = null;
		
		try {
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
