package chap03_operator;

public class OperatorEx6 {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';
		
		int i = c1 + 1;
		
		c3 = (char)(c1 + 1); // + 연산자의 결과는 int형이기 때문에 char에 담으려면 다운캐스팅 해야함
		c2++;
		c2++;
		
		System.out.println("i = " + i);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
	}
}


























