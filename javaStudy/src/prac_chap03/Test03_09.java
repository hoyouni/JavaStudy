package prac_chap03;

public class Test03_09 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || (48 <= ch && ch <= 57) ? true : false;
		
		System.out.println(b);
	}
}
