package chap04_controlStatement;

import java.util.Scanner;

// switch 예제
public class FlowEx5 {
	public static void main(String[] args) {
		System.out.print("당신의 주민번호를 입력하시오. > ");
		String regNo = new Scanner(System.in).nextLine();
		
		char gender = regNo.charAt(regNo.indexOf("-") + 1);
		
		switch (gender) {
		case '1': case '3': 
			System.out.println("당신은 남자입니다.");
			break;
		case '2': case '4':
			System.out.println("당신은 여자입니다.");
			break;
		default:
			System.out.println("유효하지 않은 주민번호 입니다.");
			break;
		}
		
	}
}






























