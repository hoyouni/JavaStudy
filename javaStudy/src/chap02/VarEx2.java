package chap02;

public class VarEx2 {
	public static void main(String[] args) {
		// 두 변수 값 교환하기
		int x = 10;
		int y = 20;
		int temp = 0;
		
		System.out.println("x : " + x + " y : " + y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x : " + x + " y : " + y);
		
		/*
		 * <변수 명명 규칙>
		 * 1. 클래스 이름의 첫 글자는 항상 대문자
		 * 2. 여러 단어로 이루어진 이름은 단어의 첫 글자를 대문자로
		 * 3. 상수의 이름은 모두 대문자로하며 여러 단어로 이루어진 경우 _ 로 구분한다.
		 */
	}
}

/*
 * <변수의 타입>
 * 1. 기본형과 참조형
 *   1-1) 기본형 변수 : 실제 값을 저장함 -> boolean(1), char(2), byte(1), short(2), int(4), long(8), float(4), double(8byte)
 *   1-2) 참조형 변수 : 값이 저장되어있는 주소를 값으로 가짐.
 *   1-3) 변수의 타입이 기본형이 아닌 것들은 모두 참조변수이다.
 *   1-4) 정수형 중 int형이 가장 많이 사용되는데 이는 CPU가 가장 효율적으로 처리할 수 있는 타입이기 때문.
 *        메모리를 절약하려면 byte 나 short 를 선택해도 범위 내에서는 무방
 *   1-5) int 형 변수는 약 10자리수의 값을 저장할 수 있음
 *   1-6) 실수형은 정밀도가 중요하며 정밀도가 높을수록 오차의 범위가 줄어듦 -> float의 정밀도는 7자리, double의 정밀도는 15자리
 * 
 */




































