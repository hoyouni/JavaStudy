package prac_chap05;

// chap 05 배열 3번문제 
public class Test05_03 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int num : arr) 
			sum += num;
		
		System.out.println("sum = " + sum);
	}
}
