package chap04_controlStatement;

import java.util.Scanner;

// switch 예제
public class FlowEx4 {
	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요. > ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재 계절은 봄 입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재 계절은 여름 입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재 계절은 가을 입니다.");
		default:
			System.out.println("현재 계절은 겨울 입니다.");
			break;
		}
		
	}
}






























