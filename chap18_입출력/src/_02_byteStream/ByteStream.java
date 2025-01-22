package _02_byteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
	/*
	바이트 기반 스트림
	 - 바이트 스트림 : 데이터를 1바이트 단위로 전송하는 통로
	 - 기반 스트림 : 외부매체와 직접적으로 연결하는 통로
	 
	 xxxInputStream : xxx매체로부터 데이터를 입력받는 통로(외부매체로부터 데이터를 읽어옴)
	 xxxOutputStream : xxx매체로부터 데이터를 출력하는 통로(외부매체로 데이터를 내보내기. 쓰겠다)
	*/
	
	// 외부매체는 file
	public void fileSave() {
		/*
		만드는 순서
		1. 스트림 생성(통로 만들기)
		2. 스트림으로 데이터를 출력(메소드 활용)
		3. 모두 사용 후에는 스트림 반납
		*/
		
		// FileOutputStream : 파일과 직접적으로 연결하여 1바이트 단위로 출력하는 스트림
		
		// 1. 스트림 생성(통로 만들기)
					FileOutputStream fout;
					try {
						fout = new FileOutputStream("a_byte.txt");
					} catch (FileNotFoundException e) {
						e.printStackTrace();
						
						try {
							
							// 해당파일이 없으면 새로 만들어주고 동로 연결. 만약 파일이 있으면 기존파일에 통로 연결
							
							
							try {
								// 2. 스트림으로 데이터를 출력(메소드 활용)
								fout.write(97); // 'a'저장
								fout.write('b');
								fout.write('찬');
								
								int a = 87 / 0;
								
								
							} catch (IOException e) {
								e.printStackTrace();
							}
							
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						}
						// 3. 모두 사용 후에는 스트림 반납
						fout.close();
					}
					}
		
	
}
