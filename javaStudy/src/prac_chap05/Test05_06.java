package prac_chap05;

// chap 05 배열 6번문제 
public class Test05_06 {
	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money = " + money);
		
		for(int i = 0; i < coinUnit.length; i++) {
			switch (coinUnit[i]) {
			case 500:
				System.out.println("500원 : " + money / coinUnit[i]);
				money = money % coinUnit[i];
				break;
			case 100:
				System.out.println("100원 : " + money / coinUnit[i]);
				money = money % coinUnit[i];				
				break;
			case 50:
				System.out.println("50원 : " + money / coinUnit[i]);
				money = money % coinUnit[i];
				break;
			case 10:
				System.out.println("10원 : " + money / coinUnit[i]);
				money = money % coinUnit[i];
				break;
			default:
				break;
			}
		}
		
	}
}
