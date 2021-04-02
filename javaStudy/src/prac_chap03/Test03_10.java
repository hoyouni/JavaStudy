package prac_chap03;

public class Test03_10 {
	public static void main(String[] args) {
		char ch = 'Z';
		char lowerCase = (char) ((65 <= ch && ch <= 96) ? ch + 32 : ch);
		
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}
}
