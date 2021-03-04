package chap02;

/*
 *  1. 변수
 *   변수 -> 값을 저장할 수 있는 메모리상의 공간
 *  1-1) 변수 선언과 초기화
 *   변수타입 + 변수이름
 *   변수를 선언하면 변수타입에 알맞은 크기의 저장공간이 확보되고 변수이름을 통해 사용 가능
 *   변수를 선언하면 웬만하면 초기화 해야한다. -> 다른 프로그램에 의해 저장된 값이 남아있을 수 있기 때문에
 *   int x = 0, y = 0; 과 같이 한 줄에 선언하기도 함. 
 */
public class VarEx1 {
	public static void main(String[] args) {
		// 변수 선언과 초기화
		int year = 0;
		int age = 21;
		
		// 출력문
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000;
		age = age + 1;
		
		System.out.println(year);
		System.out.println(age);
		
	}
}




















