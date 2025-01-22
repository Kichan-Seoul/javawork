package _05_ObjectStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PhoneStream {
	public void fileSave() {
		Phone p1 = new Phone("12", 200000);
		Phone p2 = new Phone("13", 300000);
		Phone p3 = new Phone("14", 400000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))) {
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}	catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))) {
			while(true) {
				System.out.println(ois.readObject()); // 파일의 끝을 만나면 EOFException 예외 발생
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			System.out.println("파일을 다 읽었습니다");
		} catch(IOException e) {
			e.printStackTrace();
		} 
	}
	
}


