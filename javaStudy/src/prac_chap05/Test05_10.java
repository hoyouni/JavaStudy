package prac_chap05;

// chap 05 배열 10번문제 
public class Test05_10 {
	public static void main(String[] args) {
		// 97~122
		// 49 ~ 58
		char[] abcCode = { 
				'`','~','!','@','#','$','%','^','&','*',
				'(',')','-','_','+','=','|','[',']','{',
				'}',';',':',',','.','/'};
 
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";
		
		for(int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if(97 <= ch && ch <= 122) {
				result += abcCode[ch - 97];
			}
			
			if(48 <= ch && ch <= 57) {
				result += numCode[ch - 48];
			}
			
		}
			
		System.out.println("src : " + src);
		System.out.println("result : " + result);
		
	}
}
