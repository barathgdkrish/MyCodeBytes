package commonbytes;
import java.util.Scanner;

public class PrintDigitsIntoWords {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			sc.close();
			System.out.println("The number "+getDigitCount(num)+" "+reverse(num));
			numberToWords(num);
			sc.close();
		}
	}
public static void numberToWords(int number) {
		
		int size1,size2;
		int rev,digit;
		if(number<0)
			System.out.println("Invalid Value");
		size1 = getDigitCount(number);
		rev = reverse(number);
		size2 = getDigitCount(rev);
		
		for(int i=0;i<size2;i++)
		{
			digit=rev%10;
			switch(digit)
			{
			case 1: System.out.println("One");
					break;
			case 2: System.out.println("Two");
			break;
			case 3: System.out.println("Three");
			break;
			case 4: System.out.println("Four");
			break;
			case 5: System.out.println("Five");
			break;
			case 6: System.out.println("Six");
			break;
			case 7: System.out.println("Seven");
			break;
			case 8: System.out.println("Eight");
			break;
			case 9: System.out.println("Nine");
			break;
			case 0: System.out.println("Zero");
			break;
			}
			rev/=10;
		}
		for(int i=1;i<=(size1-size2);i++)
			System.out.println("Zero");
		
		
	}
	public static int getDigitCount(int number)
	{
		if(number<0)
			return -1;
		int count=0;
		while(true)
		{
			count++;
			number/=10;
			if(number==0)
			    break;
		}
		return count;
	}
	public static int reverse(int number)
	{
		int temp=number,reverse=0;
		
		if(number<0)
			temp=number*-1;
		
		if(number<10&&number>0)
			return number;
		while(temp>0)
		{
			reverse*=10;
			reverse+=(temp%10);
			temp/=10;
		}

		return (number>0)?reverse:reverse*-1;
	}
}
