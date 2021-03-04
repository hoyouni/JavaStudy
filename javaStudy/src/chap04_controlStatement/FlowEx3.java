package chap04_controlStatement;

import java.util.Scanner;

public class FlowEx3 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하시오. > ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		while(score < 0 || score > 100) {
			System.out.print("점수를 다시 입력하시오. > ");
			score = sc.nextInt();
		}
		
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		System.out.println("당신의 학점은 " + grade + " 입니다.");
	}
}
































