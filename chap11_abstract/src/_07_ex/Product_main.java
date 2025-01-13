package _07_ex;

public class Product_main {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.PowerOn();
		tv.channelUp(3);
		tv.VolumeUp(20);
		tv.VolumeDown(10);
		tv.channelDown(1);
		tv.chatWithAI();
		tv.search("Diseny+");
		tv.PowerOff();
		
		System.out.println();
		
		Game game = new Game();
		game.PowerOn();
		game.VolumeUp(6);
		game.VolumeDown(3);
		game.switchGame("배틀필드3");
		game.switchGame("메이플스토리");
		game.PowerOff();

	}

}
