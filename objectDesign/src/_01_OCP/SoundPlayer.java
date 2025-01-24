package _01_OCP;

public class SoundPlayer {
	private PlayInterface playInter;
	
	void setPlayInterface(PlayInterface playInter) {
		this.playInter = playInter;
	}
	
	void play() {
		playInter.player();
	}
}
