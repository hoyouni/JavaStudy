package prac_chap03;

public class Test03_02 {
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (int)Math.ceil(numOfApples / (float)sizeOfBucket);
		
		System.out.println("필요한 바구니 수 : " + numOfBucket);
	}
}
