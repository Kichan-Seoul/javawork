package _08_interfacePolymorphism;

public class Game implements Product {
	private boolean power;
	private int volume;
	private String currentGame;
	
	
	Game() {
		this.power = false;
		this.volume = 1;
		this.currentGame = "Default Game";
	}
	
	@Override
	public void PowerOn() {
		power = true;
		System.out.println("전원이 켜졌습니다");
		
	}

	@Override
	public void PowerOff() {
		power = false;
		System.out.println("전원이 꺼졌습니다");
		
	}

	@Override
	public void VolumeUp(int amount) {
		volume += amount;
		System.out.println("볼륨 +" + amount);
	}

	@Override
	public void VolumeDown(int amount) {
		volume -= amount;
		if(volume < 0) {
			volume = 0;
		}
		System.out.println("볼륨 -" + amount);
	}
	
	public void switchGame(String newGame) {
		currentGame = newGame;
		System.out.println("현재 게임이 " + newGame + "(으)로 변경되었습니다");
	}

}
