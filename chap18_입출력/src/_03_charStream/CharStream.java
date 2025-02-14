package _03_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
문자 기반 스트림
 - 문자 스트림 : 데이터를 2byte단위로 전송하는 통로
 - 기반 스트림 : 외부매체와 직접 연결되는 통로
 
 xxxReader : 입력용 스트림
 xxxWriter : 출력용 스트림
*/
public class CharStream {
	public void fileSave() {
		FileWriter fw = null;
		try {
			// 1. 문자스트림 생성
			fw = new FileWriter("b_char.txt");
			
			// 2. 문자스트림으로 데이터를 출력(메소드 활용)
			fw.write("A");
			fw.write('A');
			fw.write(" ");
			fw.write("아! 섹스하고싶다. Chill~");
			
			char[] arr = {'a','p','p','l','e'};
			fw.write(arr);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
			
			int value = 0;
			
				while((value = fr.read()) != -1) {
					System.out.println((char)value);
				}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
}
	
}
