package commonbytes;
import java.util.Scanner;

public class DeterminePrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		short count =0;
		while(count <10)
		{
			
			System.out.println("\nEnter the numbers ");
			System.out.println("Enter first Number: ");
			int Num = sc.nextInt();
			System.out.println("Enter second Number: ");
			int Num2 = sc.nextInt();
			System.out.println("The sum of the numbers divisible by 3 and 5 "
					+ "\nwithin the range is: \n"+sumAllNumbersDivisibleByThreeAndFive(Num,Num2));
			count++;
			//isPrime(Num,Num2);
		}	
		sc.close();
	}
	
	public static int sumAllNumbersDivisibleByThreeAndFive(int a, int b)
	{
		if(a<1||b>1000)
			return 0;
		int sum=0;
		for(int i=a;i<=b;i++)
		{
			if(i%15==0)
				sum+=i;
		}
		return sum;
	}
	
	public static void isPrime(int num,int num2)
	{
		if (num>num2)
		{
			int temp = num;
			num = num2;
			num2 = temp;
		}
		int count=0,count2=0;
		for(int i=num;i<=num2;i++)
			{ 
				 
				for(int j=2;j<=Math.sqrt(i);j++)
				{
					
					if((i%j==0&&i!=1))
						{
						  count++;
						  break;
						}
				}
				if((count==0 || i==2) && i!=1)
				{
					if(count2%10==0)
						System.out.print("\n");
					System.out.print("\t"+i);
					count2++;
				}
				count=0;
			}
		System.out.println("\nThere are "+ count2+" primes between "+num+" and "+num2);
	}
}
