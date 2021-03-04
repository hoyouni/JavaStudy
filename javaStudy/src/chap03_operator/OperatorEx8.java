package chap03_operator;

public class OperatorEx8 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc"); 
		
		System.out.println("str1 == str2 : " + (str1 == str2)); // 두 변수는 서로 다른 객체이므로 == 연산자는 false를 return
		System.out.println("str1.equals(str2) : " + (str1.equals(str2))); // equals() 함수는 다른 객체더라도 내용이 같으면 true 출력 
		
	}
}































