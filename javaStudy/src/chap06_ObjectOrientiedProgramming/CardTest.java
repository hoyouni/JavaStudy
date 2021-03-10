package chap06_ObjectOrientiedProgramming;

class Card {
	// 클래스 변수
	static int width = 100;
	static int height = 250;
	
	// 인스턴스 변수 
	String kind;
	int number;
	
}

public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width : " + Card.width);
		System.out.println("Card.height : " + Card.height);
		
		// Card 클래스에 대한 인스턴스(객체) 생성 후 c1 변수에 인스턴스 주소값 저장
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + " 이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number + " 이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
		
		System.out.println("c1의 width와 height를 각각 50, 80 으로 변경합니다. ");
		
		c1.width = 50;
		c1.height = 80;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + " 이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number + " 이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
		
		System.out.println("c1의 width 와 height 만 변경되지 않고 c2의 width, height 도 변경됨을 확인하였습니다. ");
	}
}






























