package chap06_ObjectOrientiedProgramming;

class Tv {
	// Tv 속성 (멤버변수)
	String color;
	boolean power;
	int channel;
	
	// Tv 기능 (메소드)
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

public class TvTest {
	public static void main(String[] args) {
		Tv t; // Tv 인스턴스를 참조하기 위한 변수 t 선언
		t = new Tv(); // Tv 인스턴스 생성 후 변수 참조
		t.channel = 7; 
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + " 입니다. ");
	}
}















