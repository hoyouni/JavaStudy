package chap03_operator;

public class OperatorEx5 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		//byte c = a + b; //convert from int to byte error 출력 -> '+' 연산자는 자료형을 int 형으로 변환한 후 연산을 수행 
		int c = a + b;
		System.out.println(c);
		// 혹은
		byte d = (byte) (a + b);
		System.out.println(d);
	}
}































