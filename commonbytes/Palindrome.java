package commonbytes;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			sc.close();
			System.out.println("The number "+num+(isAPalindrome(num)?" is a Palindrome":" is not a Palindrome"));
		}
		
	}
	 public static boolean isAPalindrome(int number)
	 {
		 if(number<0)
			 number*=-1;
	     int digit=0,temp=number;
	     while(temp>0)
	     {   digit*=10;
	         digit+=temp%10;
	         temp/=10;
	     }
	     return (number==digit)?true:false;
	 }
}
