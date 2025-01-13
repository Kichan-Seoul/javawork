package _07_ex;

public class Tv implements Product {
	private boolean power;
	private int channel;
	private int volume;
	
	Tv() {
		this.power = false;
		this.channel = 1;
		this.volume = 1;
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
	
	public void channelUp(int amount) {
		channel += amount;
		System.out.println("채널 " + channel);
	}
	
	public void channelDown(int amount) {
		channel -= amount;
		if(channel <1) {
			channel = 1;
		}
		System.out.println("채널 " + channel);
	}

	@Override
	public void search(String query) {
		System.out.println("TV에서 \"" + query + "\"을(를) 검색 중입니다.");	
	}
	
}
