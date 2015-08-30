package problem2;

public class EvenFibonacciNumbers {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		int sum = 0;
		int temp = 0;
		
		while(num1 < 4000000) {
			temp = num1;
			num1+=num2;
			num2 = temp;
			if(num1%2==0) {
				sum+=num1;
			}
		}
		System.out.println(sum);
	}
}
