package _01_OCP;

public class T01_OCP {

	public static void main(String[] args) {
		SoundPlayer sp = new SoundPlayer();
		
		sp.setPlayInterface(new Wav());
		System.out.println("wav 파일 재생 : ");
		sp.play();
		
		sp.setPlayInterface(new Mp3());
		System.out.println("mp3 파일 재생 : ");
		sp.play();
		
		sp.setPlayInterface(new Ogg());
		System.out.println("ogg 파일 재생 : ");
		sp.play();
	}

}
