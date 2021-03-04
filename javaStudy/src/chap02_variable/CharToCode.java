package chap02_variable;

public class CharToCode {
	public static void main(String[] args) {
		char ch  = 'A';
		int code = ch; // 형변환 해줘도 되지만 자동으로 형변환 되므로 생략 가능 
		
		System.out.println(code);
		
		char ch2 = '가';
		int code2 = ch2;
		
		System.out.println(code2);
		
		// 실제로 char 타입의 변수에는 문자가 아닌 문자의 유니코드(정수)가 저장되고 표현형식 역시 정수형과 동일 
	}
}


































