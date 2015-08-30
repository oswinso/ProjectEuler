package problem5;

public class SmallestMultiple {
	public static void main(String args[]) {
		int num = 20;
		long lcmLast = 1;
		for(int i = 2; i<num+1; i++) {
			lcmLast = lcmLast*i/gcd(lcmLast,i);
			System.out.println(lcmLast);
		}
		System.out.println(lcmLast);
	}
	
	public static long gcd(long num1, long num2) {
		long remainder = 0;
		while(num1%num2!=0) {
			remainder = num1%num2;
			num1=num2;
			num2=remainder;
		}
		return num2;
	}
}
