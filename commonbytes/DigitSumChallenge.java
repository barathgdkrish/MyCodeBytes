package commonbytes;
import java.util.Scanner;

public class DigitSumChallenge {

	public static void main(String[] args) {
		System.out.println("Enter a number with more than one digit: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("Sum of Digits of "+num+" is: "+digitSum(num));
		
	}
	public static int digitSum(int num)
	{
		int sum=0;
		if(num<10)
			return -1;
		while(num>0)
		{
			sum+=num%10;
			num/=10;
		}
				
		return sum;
	}
}
