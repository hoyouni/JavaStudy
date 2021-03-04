package chap04_controlStatement;

import java.util.Scanner;

public class FlowEx2 {
	public static void main(String[] args) {
		int input;
		System.out.print("숫자를 하나 입력하세요. > ");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		
		if(num == 0) {
			System.out.println("입력하신 숫자는 0 입니다.");
			return;
		}
		
		if(num != 0)
			System.out.println("입력하신 숫자는 0이 아닙니다. ");
			System.out.printf("입력하신 숫자는 %d 입니다.\n", num);
		
	}
}
































