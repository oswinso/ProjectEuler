package problem3;

public class LargestPrimeFactor {
	public static void main(String[] args) {
		long num = 600851475143L;
		int factor = 2;
		String factors = "";
		while(num != 1) {
			if(num%factor==0) {
				System.out.println(factor);
				num=num/factor;
			}
			else {
				factor++;
			}
		}
	}
}
